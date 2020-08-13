/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author hectorsantossv
 */
@Entity
@Table(name = "appointment_diagnosis")
@NamedQueries({
    @NamedQuery(name = "AppointmentDiagnosis.findAll", query = "SELECT a FROM AppointmentDiagnosis a")})
public class AppointmentDiagnosis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "id_appointment")
    private Integer idAppointment;
    @Column(name = "id_diagnosis")
    private Integer idDiagnosis;
    @Column(name = "id_level")
    private Integer idLevel;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_appointement_diagnosis")
    private Long idAppointementDiagnosis;

    public AppointmentDiagnosis() {
    }

    public AppointmentDiagnosis(Long idAppointementDiagnosis) {
        this.idAppointementDiagnosis = idAppointementDiagnosis;
    }

    public Integer getIdAppointment() {
        return idAppointment;
    }

    public void setIdAppointment(Integer idAppointment) {
        this.idAppointment = idAppointment;
    }

    public Integer getIdDiagnosis() {
        return idDiagnosis;
    }

    public void setIdDiagnosis(Integer idDiagnosis) {
        this.idDiagnosis = idDiagnosis;
    }

    public Integer getIdLevel() {
        return idLevel;
    }

    public void setIdLevel(Integer idLevel) {
        this.idLevel = idLevel;
    }

    public Long getIdAppointementDiagnosis() {
        return idAppointementDiagnosis;
    }

    public void setIdAppointementDiagnosis(Long idAppointementDiagnosis) {
        this.idAppointementDiagnosis = idAppointementDiagnosis;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAppointementDiagnosis != null ? idAppointementDiagnosis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AppointmentDiagnosis)) {
            return false;
        }
        AppointmentDiagnosis other = (AppointmentDiagnosis) object;
        if ((this.idAppointementDiagnosis == null && other.idAppointementDiagnosis != null) || (this.idAppointementDiagnosis != null && !this.idAppointementDiagnosis.equals(other.idAppointementDiagnosis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.AppointmentDiagnosis[ idAppointementDiagnosis=" + idAppointementDiagnosis + " ]";
    }
    
}
