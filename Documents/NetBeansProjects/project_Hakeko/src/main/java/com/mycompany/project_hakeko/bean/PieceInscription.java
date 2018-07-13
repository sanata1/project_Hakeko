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
public class PieceInscription implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int nombreDemande;
    @OneToOne
    private Inscription inscription;

    public PieceInscription() {
    }

    public PieceInscription(Long id, int nombreDemande, Inscription inscription) {
        this.id = id;
        this.nombreDemande = nombreDemande;
        this.inscription = inscription;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNombreDemande() {
        return nombreDemande;
    }

    public void setNombreDemande(int nombreDemande) {
        this.nombreDemande = nombreDemande;
    }

    public Inscription getInscription() {
        return inscription;
    }

    public void setInscription(Inscription inscription) {
        this.inscription = inscription;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + this.nombreDemande;
        hash = 97 * hash + Objects.hashCode(this.inscription);
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
        final PieceInscription other = (PieceInscription) obj;
        if (this.nombreDemande != other.nombreDemande) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.inscription, other.inscription)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PieceInscription{" + "id=" + id + ", nombreDemande=" + nombreDemande + ", inscription=" + inscription + '}';
    }

    
    
}
