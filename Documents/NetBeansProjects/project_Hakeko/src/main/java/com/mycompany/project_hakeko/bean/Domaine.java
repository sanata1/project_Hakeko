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
import javax.persistence.OneToMany;

/**
 *
 * @author Owner
 */
@Entity
public class Domaine implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String intitule;
    @OneToMany(mappedBy = "domaine")
    private List<Etudiant> etudiants;

    public Domaine() {
    }

    public Domaine(Long id, String intitule, List<Etudiant> etudiants) {
        this.id = id;
        this.intitule = intitule;
        this.etudiants = etudiants;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public List<Etudiant> getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(List<Etudiant> etudiants) {
        this.etudiants = etudiants;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.id);
        hash = 11 * hash + Objects.hashCode(this.intitule);
        hash = 11 * hash + Objects.hashCode(this.etudiants);
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
        final Domaine other = (Domaine) obj;
        if (!Objects.equals(this.intitule, other.intitule)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.etudiants, other.etudiants)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Domaine{" + "id=" + id + ", intitule=" + intitule + ", etudiants=" + etudiants + '}';
    }
    
    
}
