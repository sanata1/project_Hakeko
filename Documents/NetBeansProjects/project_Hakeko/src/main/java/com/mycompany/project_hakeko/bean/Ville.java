/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project_hakeko.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Owner
 */
@Entity
public class Ville implements Serializable {


    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Pays pays;
    
    @OneToMany(mappedBy = "ville")
    private List<ConfirmationUniv> confirmationUnivs;

    @OneToMany(mappedBy = "ville")
    private List<Universite> universites;

    public Ville() {
    }

    public Ville(Long id, Pays pays, List<ConfirmationUniv> confirmationUnivs, List<Universite> universites) {
        this.id = id;
        this.pays = pays;
        this.confirmationUnivs = confirmationUnivs;
        this.universites = universites;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }

    public List<ConfirmationUniv> getConfirmationUnivs() {
        return confirmationUnivs;
    }

    public void setConfirmationUnivs(List<ConfirmationUniv> confirmationUnivs) {
        this.confirmationUnivs = confirmationUnivs;
    }

    public List<Universite> getUniversites() {
        return universites;
    }

    public void setUniversites(List<Universite> universites) {
        this.universites = universites;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.id);
        hash = 53 * hash + Objects.hashCode(this.pays);
        hash = 53 * hash + Objects.hashCode(this.confirmationUnivs);
        hash = 53 * hash + Objects.hashCode(this.universites);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Ville other = (Ville) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.pays, other.pays)) {
            return false;
        }
        if (!Objects.equals(this.confirmationUnivs, other.confirmationUnivs)) {
            return false;
        }
        if (!Objects.equals(this.universites, other.universites)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Ville{" + "id=" + id + ", pays=" + pays + ", confirmationUnivs=" + confirmationUnivs + ", universites=" + universites + '}';
    }
    
}
