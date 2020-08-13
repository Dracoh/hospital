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
@Table(name = "diagnosis")
@NamedQueries({
    @NamedQuery(name = "Diagnosis.findAll", query = "SELECT d FROM Diagnosis d")})
public class Diagnosis implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 50)
    @Column(name = "diagnosis_name")
    private String diagnosisName;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "\t\t\t\tid_diagnosis")
    private Long idDiagnosis;

    public Diagnosis() {
    }

    public Diagnosis(Long idDiagnosis) {
        this.idDiagnosis = idDiagnosis;
    }

    public String getDiagnosisName() {
        return diagnosisName;
    }

    public void setDiagnosisName(String diagnosisName) {
        this.diagnosisName = diagnosisName;
    }

    public Long getIdDiagnosis() {
        return idDiagnosis;
    }

    public void setIdDiagnosis(Long idDiagnosis) {
        this.idDiagnosis = idDiagnosis;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idDiagnosis != null ? idDiagnosis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Diagnosis)) {
            return false;
        }
        Diagnosis other = (Diagnosis) object;
        if ((this.idDiagnosis == null && other.idDiagnosis != null) || (this.idDiagnosis != null && !this.idDiagnosis.equals(other.idDiagnosis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Diagnosis[ idDiagnosis=" + idDiagnosis + " ]";
    }
    
}
