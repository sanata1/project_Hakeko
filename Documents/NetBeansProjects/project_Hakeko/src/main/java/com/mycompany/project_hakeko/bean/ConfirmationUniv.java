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
import org.hibernate.validator.constraints.Email;

/**
 *
 * @author Owner
 */
@Entity
public class ConfirmationUniv implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String description;
    @Email
    private String email;
    private Long tel;
    private String login;
    private String password;
    private String numAutorisation;
    private String raisonSocial;
    @ManyToOne
    private Ville ville;
    @OneToMany(mappedBy = "confirmationUniv")
    private List<AnonceUniversite> anonceUniversites;
    @OneToMany(mappedBy = "confirmationUniv")
    private List<UniversiteDevice> universiteDevices;
    @OneToMany(mappedBy = "confirmationUniv")
    private List<Inscription> inscriptions;

    public ConfirmationUniv() {
    }

    public ConfirmationUniv(Long id, String nom, String description, String email, Long tel, String login, String password, String numAutorisation, String raisonSocial, Ville ville, List<AnonceUniversite> anonceUniversites, List<UniversiteDevice> universiteDevices, List<Inscription> inscriptions) {
        this.id = id;
        this.nom = nom;
        this.description = description;
        this.email = email;
        this.tel = tel;
        this.login = login;
        this.password = password;
        this.numAutorisation = numAutorisation;
        this.raisonSocial = raisonSocial;
        this.ville = ville;
        this.anonceUniversites = anonceUniversites;
        this.universiteDevices = universiteDevices;
        this.inscriptions = inscriptions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTel() {
        return tel;
    }

    public void setTel(Long tel) {
        this.tel = tel;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNumAutorisation() {
        return numAutorisation;
    }

    public void setNumAutorisation(String numAutorisation) {
        this.numAutorisation = numAutorisation;
    }

    public String getRaisonSocial() {
        return raisonSocial;
    }

    public void setRaisonSocial(String raisonSocial) {
        this.raisonSocial = raisonSocial;
    }

    public Ville getVille() {
        return ville;
    }

    public void setVille(Ville ville) {
        this.ville = ville;
    }

    public List<AnonceUniversite> getAnonceUniversites() {
        return anonceUniversites;
    }

    public void setAnonceUniversites(List<AnonceUniversite> anonceUniversites) {
        this.anonceUniversites = anonceUniversites;
    }

    public List<UniversiteDevice> getUniversiteDevices() {
        return universiteDevices;
    }

    public void setUniversiteDevices(List<UniversiteDevice> universiteDevices) {
        this.universiteDevices = universiteDevices;
    }

    public List<Inscription> getInscriptions() {
        return inscriptions;
    }

    public void setInscriptions(List<Inscription> inscriptions) {
        this.inscriptions = inscriptions;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.id);
        hash = 67 * hash + Objects.hashCode(this.nom);
        hash = 67 * hash + Objects.hashCode(this.description);
        hash = 67 * hash + Objects.hashCode(this.email);
        hash = 67 * hash + Objects.hashCode(this.tel);
        hash = 67 * hash + Objects.hashCode(this.login);
        hash = 67 * hash + Objects.hashCode(this.password);
        hash = 67 * hash + Objects.hashCode(this.numAutorisation);
        hash = 67 * hash + Objects.hashCode(this.raisonSocial);
        hash = 67 * hash + Objects.hashCode(this.ville);
        hash = 67 * hash + Objects.hashCode(this.anonceUniversites);
        hash = 67 * hash + Objects.hashCode(this.universiteDevices);
        hash = 67 * hash + Objects.hashCode(this.inscriptions);
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
        final ConfirmationUniv other = (ConfirmationUniv) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.login, other.login)) {
            return false;
        }
        if (!Objects.equals(this.password, other.password)) {
            return false;
        }
        if (!Objects.equals(this.numAutorisation, other.numAutorisation)) {
            return false;
        }
        if (!Objects.equals(this.raisonSocial, other.raisonSocial)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.tel, other.tel)) {
            return false;
        }
        if (!Objects.equals(this.ville, other.ville)) {
            return false;
        }
        if (!Objects.equals(this.anonceUniversites, other.anonceUniversites)) {
            return false;
        }
        if (!Objects.equals(this.universiteDevices, other.universiteDevices)) {
            return false;
        }
        if (!Objects.equals(this.inscriptions, other.inscriptions)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ConfirmationUniv{" + "id=" + id + ", nom=" + nom + ", description=" + description + ", email=" + email + ", tel=" + tel + ", login=" + login + ", password=" + password + ", numAutorisation=" + numAutorisation + ", raisonSocial=" + raisonSocial + ", ville=" + ville + ", anonceUniversites=" + anonceUniversites + ", universiteDevices=" + universiteDevices + ", inscriptions=" + inscriptions + '}';
    }
    
}
