/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author hectorsantossv
 */
@Entity
@Table(name = "hospitalization")
@NamedQueries({
    @NamedQuery(name = "Hospitalization.findAll", query = "SELECT h FROM Hospitalization h")})
public class Hospitalization implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "id_attemtiom_cemter")
    private Integer idAttemtiomCemter;
    @Column(name = "id_patient")
    private Integer idPatient;
    @Column(name = "id_diagnosis")
    private Integer idDiagnosis;
    @Column(name = "start_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;
    @Column(name = "end_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date endDate;
    @Column(name = "id_work_area")
    private Integer idWorkArea;
    @Column(name = "id_functionary")
    private Integer idFunctionary;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_hospitalization")
    private Long idHospitalization;

    public Hospitalization() {
    }

    public Hospitalization(Long idHospitalization) {
        this.idHospitalization = idHospitalization;
    }

    public Integer getIdAttemtiomCemter() {
        return idAttemtiomCemter;
    }

    public void setIdAttemtiomCemter(Integer idAttemtiomCemter) {
        this.idAttemtiomCemter = idAttemtiomCemter;
    }

    public Integer getIdPatient() {
        return idPatient;
    }

    public void setIdPatient(Integer idPatient) {
        this.idPatient = idPatient;
    }

    public Integer getIdDiagnosis() {
        return idDiagnosis;
    }

    public void setIdDiagnosis(Integer idDiagnosis) {
        this.idDiagnosis = idDiagnosis;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Integer getIdWorkArea() {
        return idWorkArea;
    }

    public void setIdWorkArea(Integer idWorkArea) {
        this.idWorkArea = idWorkArea;
    }

    public Integer getIdFunctionary() {
        return idFunctionary;
    }

    public void setIdFunctionary(Integer idFunctionary) {
        this.idFunctionary = idFunctionary;
    }

    public Long getIdHospitalization() {
        return idHospitalization;
    }

    public void setIdHospitalization(Long idHospitalization) {
        this.idHospitalization = idHospitalization;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHospitalization != null ? idHospitalization.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hospitalization)) {
            return false;
        }
        Hospitalization other = (Hospitalization) object;
        if ((this.idHospitalization == null && other.idHospitalization != null) || (this.idHospitalization != null && !this.idHospitalization.equals(other.idHospitalization))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Hospitalization[ idHospitalization=" + idHospitalization + " ]";
    }
    
}
