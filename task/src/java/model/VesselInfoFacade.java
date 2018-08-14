/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import entities.VesselInfo;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Karim Muhammad
 */
@Stateless
public class VesselInfoFacade extends AbstractFacade<VesselInfo> {

    @PersistenceContext(unitName = "taskPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public VesselInfoFacade() {
        super(VesselInfo.class);
    }
    
}
