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
import javax.persistence.OneToOne;

/**
 *
 * @author Owner
 */
@Entity
public class Pays implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne(mappedBy = "pays")
    private Indicatif indicatif;
    @OneToMany(mappedBy = "pays")
    private List<Ville> villes;

    public Pays() {
    }

    public Pays(Long id, Indicatif indicatif, List<Ville> villes) {
        this.id = id;
        this.indicatif = indicatif;
        this.villes = villes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Indicatif getIndicatif() {
        return indicatif;
    }

    public void setIndicatif(Indicatif indicatif) {
        this.indicatif = indicatif;
    }

    public List<Ville> getVilles() {
        return villes;
    }

    public void setVilles(List<Ville> villes) {
        this.villes = villes;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 53 * hash + Objects.hashCode(this.id);
        hash = 53 * hash + Objects.hashCode(this.indicatif);
        hash = 53 * hash + Objects.hashCode(this.villes);
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
        final Pays other = (Pays) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.indicatif, other.indicatif)) {
            return false;
        }
        if (!Objects.equals(this.villes, other.villes)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Pays{" + "id=" + id + ", indicatif=" + indicatif + ", villes=" + villes + '}';
    }
    
}
