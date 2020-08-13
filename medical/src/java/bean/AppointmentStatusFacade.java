/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import entities.AppointmentStatus;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author hectorsantossv
 */
@Stateless
public class AppointmentStatusFacade extends AbstractFacade<AppointmentStatus> {

    @PersistenceContext(unitName = "medicalPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AppointmentStatusFacade() {
        super(AppointmentStatus.class);
    }
    
}
