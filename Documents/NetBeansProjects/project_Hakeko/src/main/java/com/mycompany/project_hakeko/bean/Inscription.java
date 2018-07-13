/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project_hakeko.bean;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;

/**
 *
 * @author Owner
 */
@Entity
public class Inscription implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
     private String etat;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dateInscription;
    @ManyToOne
    private Etudiant etudiant;
    @ManyToOne
    private Universite universite;
    @OneToOne(mappedBy = "inscription")
    private PieceInscription pieceInscription;
    @ManyToOne
    private ConfirmationUniv confirmationUniv;

    public Inscription() {
    }

    public Inscription(Long id, String etat, Date dateInscription, Etudiant etudiant, Universite universite, PieceInscription pieceInscription, ConfirmationUniv confirmationUniv) {
        this.id = id;
        this.etat = etat;
        this.dateInscription = dateInscription;
        this.etudiant = etudiant;
        this.universite = universite;
        this.pieceInscription = pieceInscription;
        this.confirmationUniv = confirmationUniv;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Date getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    public Universite getUniversite() {
        return universite;
    }

    public void setUniversite(Universite universite) {
        this.universite = universite;
    }

    public PieceInscription getPieceInscription() {
        return pieceInscription;
    }

    public void setPieceInscription(PieceInscription pieceInscription) {
        this.pieceInscription = pieceInscription;
    }

    public ConfirmationUniv getConfirmationUniv() {
        return confirmationUniv;
    }

    public void setConfirmationUniv(ConfirmationUniv confirmationUniv) {
        this.confirmationUniv = confirmationUniv;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + Objects.hashCode(this.etat);
        hash = 83 * hash + Objects.hashCode(this.dateInscription);
        hash = 83 * hash + Objects.hashCode(this.etudiant);
        hash = 83 * hash + Objects.hashCode(this.universite);
        hash = 83 * hash + Objects.hashCode(this.pieceInscription);
        hash = 83 * hash + Objects.hashCode(this.confirmationUniv);
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
        final Inscription other = (Inscription) obj;
        if (!Objects.equals(this.etat, other.etat)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.dateInscription, other.dateInscription)) {
            return false;
        }
        if (!Objects.equals(this.etudiant, other.etudiant)) {
            return false;
        }
        if (!Objects.equals(this.universite, other.universite)) {
            return false;
        }
        if (!Objects.equals(this.pieceInscription, other.pieceInscription)) {
            return false;
        }
        if (!Objects.equals(this.confirmationUniv, other.confirmationUniv)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Inscription{" + "id=" + id + ", etat=" + etat + ", dateInscription=" + dateInscription + ", etudiant=" + etudiant + ", universite=" + universite + ", pieceInscription=" + pieceInscription + ", confirmationUniv=" + confirmationUniv + '}';
    }
   
    

}
