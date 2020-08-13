
package bean;

import entities.AppointmentDiagnosis;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author hectorsantossv
 */
@Stateless
public class AppointmentDiagnosisFacade extends AbstractFacade<AppointmentDiagnosis> {

    @PersistenceContext(unitName = "medicalPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AppointmentDiagnosisFacade() {
        super(AppointmentDiagnosis.class);
    }
    
}
