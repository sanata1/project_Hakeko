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
public class Diplome implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String intitulé;
    @OneToMany(mappedBy = "dernierDiplome")
    private List<Etudiant> etudiants;

    public Diplome() {
    }

    public Diplome(Long id, String intitulé, List<Etudiant> etudiants) {
        this.id = id;
        this.intitulé = intitulé;
        this.etudiants = etudiants;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIntitulé() {
        return intitulé;
    }

    public void setIntitulé(String intitulé) {
        this.intitulé = intitulé;
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
        hash = 37 * hash + Objects.hashCode(this.id);
        hash = 37 * hash + Objects.hashCode(this.intitulé);
        hash = 37 * hash + Objects.hashCode(this.etudiants);
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
        final Diplome other = (Diplome) obj;
        if (!Objects.equals(this.intitulé, other.intitulé)) {
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
        return "Diplome{" + "id=" + id + ", intitul\u00e9=" + intitulé + ", etudiants=" + etudiants + '}';
    }
    

}
