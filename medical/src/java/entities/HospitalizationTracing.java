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
import javax.validation.constraints.Size;

/**
 *
 * @author hectorsantossv
 */
@Entity
@Table(name = "hospitalization_tracing")
@NamedQueries({
    @NamedQuery(name = "HospitalizationTracing.findAll", query = "SELECT h FROM HospitalizationTracing h")})
public class HospitalizationTracing implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "date_tracing")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateTracing;
    @Column(name = "id_functionary")
    private Integer idFunctionary;
    @Size(max = 500)
    @Column(name = "comments")
    private String comments;
    @Column(name = "id_treatment")
    private Integer idTreatment;
    @Column(name = "id_hospitalization")
    private Integer idHospitalization;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_hospitalization_tracing")
    private Long idHospitalizationTracing;

    public HospitalizationTracing() {
    }

    public HospitalizationTracing(Long idHospitalizationTracing) {
        this.idHospitalizationTracing = idHospitalizationTracing;
    }

    public Date getDateTracing() {
        return dateTracing;
    }

    public void setDateTracing(Date dateTracing) {
        this.dateTracing = dateTracing;
    }

    public Integer getIdFunctionary() {
        return idFunctionary;
    }

    public void setIdFunctionary(Integer idFunctionary) {
        this.idFunctionary = idFunctionary;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Integer getIdTreatment() {
        return idTreatment;
    }

    public void setIdTreatment(Integer idTreatment) {
        this.idTreatment = idTreatment;
    }

    public Integer getIdHospitalization() {
        return idHospitalization;
    }

    public void setIdHospitalization(Integer idHospitalization) {
        this.idHospitalization = idHospitalization;
    }

    public Long getIdHospitalizationTracing() {
        return idHospitalizationTracing;
    }

    public void setIdHospitalizationTracing(Long idHospitalizationTracing) {
        this.idHospitalizationTracing = idHospitalizationTracing;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idHospitalizationTracing != null ? idHospitalizationTracing.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HospitalizationTracing)) {
            return false;
        }
        HospitalizationTracing other = (HospitalizationTracing) object;
        if ((this.idHospitalizationTracing == null && other.idHospitalizationTracing != null) || (this.idHospitalizationTracing != null && !this.idHospitalizationTracing.equals(other.idHospitalizationTracing))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.HospitalizationTracing[ idHospitalizationTracing=" + idHospitalizationTracing + " ]";
    }
    
}
