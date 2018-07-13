package com.mycompany.project_hakeko.controller;

import com.mycompany.project_hakeko.bean.ConfirmationUniv;
import com.mycompany.project_hakeko.controller.util.JsfUtil;
import com.mycompany.project_hakeko.controller.util.JsfUtil.PersistAction;
import com.mycompany.project_hakeko.service.ConfirmationUnivFacade;

import java.io.Serializable;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.ejb.EJBException;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@Named("confirmationUnivController")
@SessionScoped
public class ConfirmationUnivController implements Serializable {

    @EJB
    private com.mycompany.project_hakeko.service.ConfirmationUnivFacade ejbFacade;
    private List<ConfirmationUniv> items = null;
    private ConfirmationUniv selected;

    public ConfirmationUnivController() {
    }

    public ConfirmationUniv getSelected() {
        return selected;
    }

    public void setSelected(ConfirmationUniv selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private ConfirmationUnivFacade getFacade() {
        return ejbFacade;
    }

    public ConfirmationUniv prepareCreate() {
        selected = new ConfirmationUniv();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("ConfirmationUnivCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("ConfirmationUnivUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("ConfirmationUnivDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<ConfirmationUniv> getItems() {
        if (items == null) {
            items = getFacade().findAll();
        }
        return items;
    }

    private void persist(PersistAction persistAction, String successMessage) {
        if (selected != null) {
            setEmbeddableKeys();
            try {
                if (persistAction != PersistAction.DELETE) {
                    getFacade().edit(selected);
                } else {
                    getFacade().remove(selected);
                }
                JsfUtil.addSuccessMessage(successMessage);
            } catch (EJBException ex) {
                String msg = "";
                Throwable cause = ex.getCause();
                if (cause != null) {
                    msg = cause.getLocalizedMessage();
                }
                if (msg.length() > 0) {
                    JsfUtil.addErrorMessage(msg);
                } else {
                    JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
                }
            } catch (Exception ex) {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, null, ex);
                JsfUtil.addErrorMessage(ex, ResourceBundle.getBundle("/Bundle").getString("PersistenceErrorOccured"));
            }
        }
    }

    public ConfirmationUniv getConfirmationUniv(java.lang.Long id) {
        return getFacade().find(id);
    }

    public List<ConfirmationUniv> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<ConfirmationUniv> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = ConfirmationUniv.class)
    public static class ConfirmationUnivControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            ConfirmationUnivController controller = (ConfirmationUnivController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "confirmationUnivController");
            return controller.getConfirmationUniv(getKey(value));
        }

        java.lang.Long getKey(String value) {
            java.lang.Long key;
            key = Long.valueOf(value);
            return key;
        }

        String getStringKey(java.lang.Long value) {
            StringBuilder sb = new StringBuilder();
            sb.append(value);
            return sb.toString();
        }

        @Override
        public String getAsString(FacesContext facesContext, UIComponent component, Object object) {
            if (object == null) {
                return null;
            }
            if (object instanceof ConfirmationUniv) {
                ConfirmationUniv o = (ConfirmationUniv) object;
                return getStringKey(o.getId());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), ConfirmationUniv.class.getName()});
                return null;
            }
        }

    }

}
