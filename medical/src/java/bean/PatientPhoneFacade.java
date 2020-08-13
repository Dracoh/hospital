/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import entities.PatientPhone;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author hectorsantossv
 */
@Stateless
public class PatientPhoneFacade extends AbstractFacade<PatientPhone> {

    @PersistenceContext(unitName = "medicalPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public PatientPhoneFacade() {
        super(PatientPhone.class);
    }
    
}
