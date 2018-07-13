/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.project_hakeko.service;

import com.mycompany.project_hakeko.bean.Administrateur;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Owner
 */
@Stateless
public class AdministrateurFacade extends AbstractFacade<Administrateur> {

    @PersistenceContext(unitName = "com.mycompany_project_Hakeko_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AdministrateurFacade() {
        super(Administrateur.class);
    }
    
}
