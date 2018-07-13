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
public class Piece implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private int nombre;
    @OneToOne
    private AnonceUniversite anonceUniv;

    public Piece() {
    }

    public Piece(Long id, int nombre, AnonceUniversite anonceUniv) {
        this.id = id;
        this.nombre = nombre;
        this.anonceUniv = anonceUniv;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }

    public AnonceUniversite getAnonceUniv() {
        return anonceUniv;
    }

    public void setAnonceUniv(AnonceUniversite anonceUniv) {
        this.anonceUniv = anonceUniv;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.id);
        hash = 71 * hash + this.nombre;
        hash = 71 * hash + Objects.hashCode(this.anonceUniv);
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
        final Piece other = (Piece) obj;
        if (this.nombre != other.nombre) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.anonceUniv, other.anonceUniv)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Piece{" + "id=" + id + ", nombre=" + nombre + ", anonceUniv=" + anonceUniv + '}';
    }
    

  
    
}
