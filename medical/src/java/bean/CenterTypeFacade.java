/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import entities.CenterType;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author hectorsantossv
 */
@Stateless
public class CenterTypeFacade extends AbstractFacade<CenterType> {

    @PersistenceContext(unitName = "medicalPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CenterTypeFacade() {
        super(CenterType.class);
    }
    
}
