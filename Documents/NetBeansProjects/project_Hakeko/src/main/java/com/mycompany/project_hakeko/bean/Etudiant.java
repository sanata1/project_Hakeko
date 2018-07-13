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
public class Etudiant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String prenom;
    private String dateNaissance;
    @Email 
    private String email;
    private Long tel;
    private String login;
    private String password;
    @ManyToOne
    private Nationalite nationalite;
    @ManyToOne
    private Diplome dernierDiplome;
    @ManyToOne
    private Domaine domaine;
    @OneToMany(mappedBy = "etudiant")
    private List<Inscription> inscriptions;
    @OneToMany(mappedBy = "etudiant")
    private List<EtudiantDevice> etudiantDevices;

    public Etudiant() {
    }

    public Etudiant(Long id, String nom, String prenom, String dateNaissance, String email, Long tel, String login, String password, Nationalite nationalite, Diplome dernierDiplome, Domaine domaine, List<Inscription> inscriptions, List<EtudiantDevice> etudiantDevices) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
        this.email = email;
        this.tel = tel;
        this.login = login;
        this.password = password;
        this.nationalite = nationalite;
        this.dernierDiplome = dernierDiplome;
        this.domaine = domaine;
        this.inscriptions = inscriptions;
        this.etudiantDevices = etudiantDevices;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
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

    public Nationalite getNationalite() {
        return nationalite;
    }

    public void setNationalite(Nationalite nationalite) {
        this.nationalite = nationalite;
    }

    public Diplome getDernierDiplome() {
        return dernierDiplome;
    }

    public void setDernierDiplome(Diplome dernierDiplome) {
        this.dernierDiplome = dernierDiplome;
    }

    public Domaine getDomaine() {
        return domaine;
    }

    public void setDomaine(Domaine domaine) {
        this.domaine = domaine;
    }

    public List<Inscription> getInscriptions() {
        return inscriptions;
    }

    public void setInscriptions(List<Inscription> inscriptions) {
        this.inscriptions = inscriptions;
    }

    public List<EtudiantDevice> getEtudiantDevices() {
        return etudiantDevices;
    }

    public void setEtudiantDevices(List<EtudiantDevice> etudiantDevices) {
        this.etudiantDevices = etudiantDevices;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.nom);
        hash = 97 * hash + Objects.hashCode(this.prenom);
        hash = 97 * hash + Objects.hashCode(this.dateNaissance);
        hash = 97 * hash + Objects.hashCode(this.email);
        hash = 97 * hash + Objects.hashCode(this.tel);
        hash = 97 * hash + Objects.hashCode(this.login);
        hash = 97 * hash + Objects.hashCode(this.password);
        hash = 97 * hash + Objects.hashCode(this.nationalite);
        hash = 97 * hash + Objects.hashCode(this.dernierDiplome);
        hash = 97 * hash + Objects.hashCode(this.domaine);
        hash = 97 * hash + Objects.hashCode(this.inscriptions);
        hash = 97 * hash + Objects.hashCode(this.etudiantDevices);
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
        final Etudiant other = (Etudiant) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        if (!Objects.equals(this.prenom, other.prenom)) {
            return false;
        }
        if (!Objects.equals(this.dateNaissance, other.dateNaissance)) {
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
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.tel, other.tel)) {
            return false;
        }
        if (!Objects.equals(this.nationalite, other.nationalite)) {
            return false;
        }
        if (!Objects.equals(this.dernierDiplome, other.dernierDiplome)) {
            return false;
        }
        if (!Objects.equals(this.domaine, other.domaine)) {
            return false;
        }
        if (!Objects.equals(this.inscriptions, other.inscriptions)) {
            return false;
        }
        if (!Objects.equals(this.etudiantDevices, other.etudiantDevices)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Etudiant{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + ", email=" + email + ", tel=" + tel + ", login=" + login + ", password=" + password + ", nationalite=" + nationalite + ", dernierDiplome=" + dernierDiplome + ", domaine=" + domaine + ", inscriptions=" + inscriptions + ", etudiantDevices=" + etudiantDevices + '}';
    }
    
}
