/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project_hakeko.bean;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 *
 * @author Owner
 */
@Entity
public class Indicatif implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int indicatif;
    @OneToOne
    private Pays pays;

    public Indicatif() {
    }

    public Indicatif(Long id, int indicatif, Pays pays) {
        this.id = id;
        this.indicatif = indicatif;
        this.pays = pays;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getIndicatif() {
        return indicatif;
    }

    public void setIndicatif(int indicatif) {
        this.indicatif = indicatif;
    }

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.id);
        hash = 31 * hash + this.indicatif;
        hash = 31 * hash + Objects.hashCode(this.pays);
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
        final Indicatif other = (Indicatif) obj;
        if (this.indicatif != other.indicatif) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.pays, other.pays)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Indicatif{" + "id=" + id + ", indicatif=" + indicatif + ", pays=" + pays + '}';
    }
    
    
}
