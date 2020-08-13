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
import javax.validation.constraints.Size;

/**
 *
 * @author hectorsantossv
 */
@Entity
@Table(name = "treatment")
@NamedQueries({
    @NamedQuery(name = "Treatment.findAll", query = "SELECT t FROM Treatment t")})
public class Treatment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 50)
    @Column(name = "treatment_name")
    private String treatmentName;
    @Size(max = 50)
    @Column(name = "dose_measure")
    private String doseMeasure;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "dose_quantity")
    private Double doseQuantity;
    @Column(name = "id_treatment_type")
    private Integer idTreatmentType;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_treatment")
    private Long idTreatment;

    public Treatment() {
    }

    public Treatment(Long idTreatment) {
        this.idTreatment = idTreatment;
    }

    public String getTreatmentName() {
        return treatmentName;
    }

    public void setTreatmentName(String treatmentName) {
        this.treatmentName = treatmentName;
    }

    public String getDoseMeasure() {
        return doseMeasure;
    }

    public void setDoseMeasure(String doseMeasure) {
        this.doseMeasure = doseMeasure;
    }

    public Double getDoseQuantity() {
        return doseQuantity;
    }

    public void setDoseQuantity(Double doseQuantity) {
        this.doseQuantity = doseQuantity;
    }

    public Integer getIdTreatmentType() {
        return idTreatmentType;
    }

    public void setIdTreatmentType(Integer idTreatmentType) {
        this.idTreatmentType = idTreatmentType;
    }

    public Long getIdTreatment() {
        return idTreatment;
    }

    public void setIdTreatment(Long idTreatment) {
        this.idTreatment = idTreatment;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTreatment != null ? idTreatment.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Treatment)) {
            return false;
        }
        Treatment other = (Treatment) object;
        if ((this.idTreatment == null && other.idTreatment != null) || (this.idTreatment != null && !this.idTreatment.equals(other.idTreatment))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Treatment[ idTreatment=" + idTreatment + " ]";
    }
    
}
