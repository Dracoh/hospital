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
@Table(name = "treatment_type")
@NamedQueries({
    @NamedQuery(name = "TreatmentType.findAll", query = "SELECT t FROM TreatmentType t")})
public class TreatmentType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 50)
    @Column(name = "treatment_type_name")
    private String treatmentTypeName;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_treatment_type")
    private Long idTreatmentType;

    public TreatmentType() {
    }

    public TreatmentType(Long idTreatmentType) {
        this.idTreatmentType = idTreatmentType;
    }

    public String getTreatmentTypeName() {
        return treatmentTypeName;
    }

    public void setTreatmentTypeName(String treatmentTypeName) {
        this.treatmentTypeName = treatmentTypeName;
    }

    public Long getIdTreatmentType() {
        return idTreatmentType;
    }

    public void setIdTreatmentType(Long idTreatmentType) {
        this.idTreatmentType = idTreatmentType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTreatmentType != null ? idTreatmentType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TreatmentType)) {
            return false;
        }
        TreatmentType other = (TreatmentType) object;
        if ((this.idTreatmentType == null && other.idTreatmentType != null) || (this.idTreatmentType != null && !this.idTreatmentType.equals(other.idTreatmentType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.TreatmentType[ idTreatmentType=" + idTreatmentType + " ]";
    }
    
}
