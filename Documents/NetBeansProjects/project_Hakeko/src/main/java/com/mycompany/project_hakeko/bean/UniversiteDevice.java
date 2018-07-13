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
public class UniversiteDevice implements Serializable {

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
    private Universite universite;
    @ManyToOne
    private ConfirmationUniv confirmationUniv;

    public UniversiteDevice() {
    }

    public UniversiteDevice(Long id, String browser, String operatingSystem, String deviceCategorie, String adressIp, String adressMac, Universite universite, ConfirmationUniv confirmationUniv) {
        this.id = id;
        this.browser = browser;
        this.operatingSystem = operatingSystem;
        this.deviceCategorie = deviceCategorie;
        this.adressIp = adressIp;
        this.adressMac = adressMac;
        this.universite = universite;
        this.confirmationUniv = confirmationUniv;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
        hash = 29 * hash + Objects.hashCode(this.browser);
        hash = 29 * hash + Objects.hashCode(this.operatingSystem);
        hash = 29 * hash + Objects.hashCode(this.deviceCategorie);
        hash = 29 * hash + Objects.hashCode(this.adressIp);
        hash = 29 * hash + Objects.hashCode(this.adressMac);
        hash = 29 * hash + Objects.hashCode(this.universite);
        hash = 29 * hash + Objects.hashCode(this.confirmationUniv);
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
        final UniversiteDevice other = (UniversiteDevice) obj;
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
        if (!Objects.equals(this.universite, other.universite)) {
            return false;
        }
        if (!Objects.equals(this.confirmationUniv, other.confirmationUniv)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UniversiteDevice{" + "id=" + id + ", browser=" + browser + ", operatingSystem=" + operatingSystem + ", deviceCategorie=" + deviceCategorie + ", adressIp=" + adressIp + ", adressMac=" + adressMac + ", universite=" + universite + ", confirmationUniv=" + confirmationUniv + '}';
    }
    

}
