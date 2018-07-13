package com.mycompany.project_hakeko.controller;

import com.mycompany.project_hakeko.bean.AnonceUniversite;
import com.mycompany.project_hakeko.controller.util.JsfUtil;
import com.mycompany.project_hakeko.controller.util.JsfUtil.PersistAction;
import com.mycompany.project_hakeko.service.AnonceUniversiteFacade;

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

@Named("anonceUniversiteController")
@SessionScoped
public class AnonceUniversiteController implements Serializable {

    @EJB
    private com.mycompany.project_hakeko.service.AnonceUniversiteFacade ejbFacade;
    private List<AnonceUniversite> items = null;
    private AnonceUniversite selected;

    public AnonceUniversiteController() {
    }

    public AnonceUniversite getSelected() {
        return selected;
    }

    public void setSelected(AnonceUniversite selected) {
        this.selected = selected;
    }

    protected void setEmbeddableKeys() {
    }

    protected void initializeEmbeddableKey() {
    }

    private AnonceUniversiteFacade getFacade() {
        return ejbFacade;
    }

    public AnonceUniversite prepareCreate() {
        selected = new AnonceUniversite();
        initializeEmbeddableKey();
        return selected;
    }

    public void create() {
        persist(PersistAction.CREATE, ResourceBundle.getBundle("/Bundle").getString("AnonceUniversiteCreated"));
        if (!JsfUtil.isValidationFailed()) {
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public void update() {
        persist(PersistAction.UPDATE, ResourceBundle.getBundle("/Bundle").getString("AnonceUniversiteUpdated"));
    }

    public void destroy() {
        persist(PersistAction.DELETE, ResourceBundle.getBundle("/Bundle").getString("AnonceUniversiteDeleted"));
        if (!JsfUtil.isValidationFailed()) {
            selected = null; // Remove selection
            items = null;    // Invalidate list of items to trigger re-query.
        }
    }

    public List<AnonceUniversite> getItems() {
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

    public AnonceUniversite getAnonceUniversite(java.lang.Long id) {
        return getFacade().find(id);
    }

    public List<AnonceUniversite> getItemsAvailableSelectMany() {
        return getFacade().findAll();
    }

    public List<AnonceUniversite> getItemsAvailableSelectOne() {
        return getFacade().findAll();
    }

    @FacesConverter(forClass = AnonceUniversite.class)
    public static class AnonceUniversiteControllerConverter implements Converter {

        @Override
        public Object getAsObject(FacesContext facesContext, UIComponent component, String value) {
            if (value == null || value.length() == 0) {
                return null;
            }
            AnonceUniversiteController controller = (AnonceUniversiteController) facesContext.getApplication().getELResolver().
                    getValue(facesContext.getELContext(), null, "anonceUniversiteController");
            return controller.getAnonceUniversite(getKey(value));
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
            if (object instanceof AnonceUniversite) {
                AnonceUniversite o = (AnonceUniversite) object;
                return getStringKey(o.getId());
            } else {
                Logger.getLogger(this.getClass().getName()).log(Level.SEVERE, "object {0} is of type {1}; expected type: {2}", new Object[]{object, object.getClass().getName(), AnonceUniversite.class.getName()});
                return null;
            }
        }

    }

}
