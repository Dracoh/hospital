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
@Table(name = "functionary")
@NamedQueries({
    @NamedQuery(name = "Functionary.findAll", query = "SELECT f FROM Functionary f")})
public class Functionary implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 20)
    @Column(name = "id_document")
    private String idDocument;
    @Size(max = 25)
    @Column(name = "first_name")
    private String firstName;
    @Size(max = 25)
    @Column(name = "middle_name")
    private String middleName;
    @Size(max = 25)
    @Column(name = "third_name")
    private String thirdName;
    @Size(max = 50)
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "id_functionary_type")
    private Integer idFunctionaryType;
    @Column(name = "admission_date")
    @Temporal(TemporalType.DATE)
    private Date admissionDate;
    @Column(name = "id_work_area")
    private Integer idWorkArea;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_functionary")
    private Long idFunctionary;

    public Functionary() {
    }

    public Functionary(Long idFunctionary) {
        this.idFunctionary = idFunctionary;
    }

    public String getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(String idDocument) {
        this.idDocument = idDocument;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getThirdName() {
        return thirdName;
    }

    public void setThirdName(String thirdName) {
        this.thirdName = thirdName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getIdFunctionaryType() {
        return idFunctionaryType;
    }

    public void setIdFunctionaryType(Integer idFunctionaryType) {
        this.idFunctionaryType = idFunctionaryType;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public Integer getIdWorkArea() {
        return idWorkArea;
    }

    public void setIdWorkArea(Integer idWorkArea) {
        this.idWorkArea = idWorkArea;
    }

    public Long getIdFunctionary() {
        return idFunctionary;
    }

    public void setIdFunctionary(Long idFunctionary) {
        this.idFunctionary = idFunctionary;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFunctionary != null ? idFunctionary.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Functionary)) {
            return false;
        }
        Functionary other = (Functionary) object;
        if ((this.idFunctionary == null && other.idFunctionary != null) || (this.idFunctionary != null && !this.idFunctionary.equals(other.idFunctionary))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Functionary[ idFunctionary=" + idFunctionary + " ]";
    }
    
}
