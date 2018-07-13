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
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 *
 * @author Owner
 */
@Entity
public class AnonceUniversite implements Serializable {

  
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nomAnonce;
    private String description;
    @ManyToOne
    private Universite universite;
    @ManyToOne
    private ConfirmationUniv confirmationUniv;
    @OneToOne(mappedBy = "anonceUniv")
    private Piece piece;

    public AnonceUniversite() {
    }

    public AnonceUniversite(Long id, String nomAnonce, String description, Universite universite, ConfirmationUniv confirmationUniv, Piece piece) {
        this.id = id;
        this.nomAnonce = nomAnonce;
        this.description = description;
        this.universite = universite;
        this.confirmationUniv = confirmationUniv;
        this.piece = piece;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomAnonce() {
        return nomAnonce;
    }

    public void setNomAnonce(String nomAnonce) {
        this.nomAnonce = nomAnonce;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Universite getUniversite() {
        return universite;
    }

    public void setUniversite(Universite universite) {
        this.universite = universite;
    }

    public ConfirmationUniv getConfirmationUniv() {
        return confirmationUniv;
    }

    public void setConfirmationUniv(ConfirmationUniv confirmationUniv) {
        this.confirmationUniv = confirmationUniv;
    }

    public Piece getPiece() {
        return piece;
    }

    public void setPiece(Piece piece) {
        this.piece = piece;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.nomAnonce);
        hash = 79 * hash + Objects.hashCode(this.description);
        hash = 79 * hash + Objects.hashCode(this.universite);
        hash = 79 * hash + Objects.hashCode(this.confirmationUniv);
        hash = 79 * hash + Objects.hashCode(this.piece);
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
        final AnonceUniversite other = (AnonceUniversite) obj;
        if (!Objects.equals(this.nomAnonce, other.nomAnonce)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.universite, other.universite)) {
            return false;
        }
        if (!Objects.equals(this.confirmationUniv, other.confirmationUniv)) {
            return false;
        }
        if (!Objects.equals(this.piece, other.piece)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "AnonceUniversite{" + "id=" + id + ", nomAnonce=" + nomAnonce + ", description=" + description + ", universite=" + universite + ", confirmationUniv=" + confirmationUniv + ", piece=" + piece + '}';
    }

    
}
