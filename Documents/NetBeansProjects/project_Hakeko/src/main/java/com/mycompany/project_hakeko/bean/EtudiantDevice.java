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

/**
 *
 * @author Owner
 */
@Entity
public class EtudiantDevice implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String browser;
    private String operatingSystem;
    private String deviceCategorie;
    private String adressIp;
    private String adressMac;
    @ManyToOne
    private Etudiant etudiant;

    public EtudiantDevice() {
    }

    public EtudiantDevice(Long id, String browser, String operatingSystem, String deviceCategorie, String adressIp, String adressMac, Etudiant etudiant) {
        this.id = id;
        this.browser = browser;
        this.operatingSystem = operatingSystem;
        this.deviceCategorie = deviceCategorie;
        this.adressIp = adressIp;
        this.adressMac = adressMac;
        this.etudiant = etudiant;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getDeviceCategorie() {
        return deviceCategorie;
    }

    public void setDeviceCategorie(String deviceCategorie) {
        this.deviceCategorie = deviceCategorie;
    }

    public String getAdressIp() {
        return adressIp;
    }

    public void setAdressIp(String adressIp) {
        this.adressIp = adressIp;
    }

    public String getAdressMac() {
        return adressMac;
    }

    public void setAdressMac(String adressMac) {
        this.adressMac = adressMac;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id);
        hash = 89 * hash + Objects.hashCode(this.browser);
        hash = 89 * hash + Objects.hashCode(this.operatingSystem);
        hash = 89 * hash + Objects.hashCode(this.deviceCategorie);
        hash = 89 * hash + Objects.hashCode(this.adressIp);
        hash = 89 * hash + Objects.hashCode(this.adressMac);
        hash = 89 * hash + Objects.hashCode(this.etudiant);
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
        final EtudiantDevice other = (EtudiantDevice) obj;
        if (!Objects.equals(this.browser, other.browser)) {
            return false;
        }
        if (!Objects.equals(this.operatingSystem, other.operatingSystem)) {
            return false;
        }
        if (!Objects.equals(this.deviceCategorie, other.deviceCategorie)) {
            return false;
        }
        if (!Objects.equals(this.adressIp, other.adressIp)) {
            return false;
        }
        if (!Objects.equals(this.adressMac, other.adressMac)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.etudiant, other.etudiant)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "EtudiantDevice{" + "id=" + id + ", browser=" + browser + ", operatingSystem=" + operatingSystem + ", deviceCategorie=" + deviceCategorie + ", adressIp=" + adressIp + ", adressMac=" + adressMac + ", etudiant=" + etudiant + '}';
    }
    

}
