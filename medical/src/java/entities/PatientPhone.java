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
@Table(name = "patient_phone")
@NamedQueries({
    @NamedQuery(name = "PatientPhone.findAll", query = "SELECT p FROM PatientPhone p")})
public class PatientPhone implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "id_patient")
    private Integer idPatient;
    @Column(name = "id_phone")
    private Integer idPhone;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_patient_phone")
    private Long idPatientPhone;

    public PatientPhone() {
    }

    public PatientPhone(Long idPatientPhone) {
        this.idPatientPhone = idPatientPhone;
    }

    public Integer getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(Integer idPatient) {
        this.idPatient = idPatient;
    }

    public Integer getIdPhone() {
        return idPhone;
    }

    public void setIdPhone(Integer idPhone) {
        this.idPhone = idPhone;
    }

    public Long getIdPatientPhone() {
        return idPatientPhone;
    }

    public void setIdPatientPhone(Long idPatientPhone) {
        this.idPatientPhone = idPatientPhone;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPatientPhone != null ? idPatientPhone.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PatientPhone)) {
            return false;
        }
        PatientPhone other = (PatientPhone) object;
        if ((this.idPatientPhone == null && other.idPatientPhone != null) || (this.idPatientPhone != null && !this.idPatientPhone.equals(other.idPatientPhone))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.PatientPhone[ idPatientPhone=" + idPatientPhone + " ]";
    }
    
}
