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
@Table(name = "phones")
@NamedQueries({
    @NamedQuery(name = "Phones.findAll", query = "SELECT p FROM Phones p")})
public class Phones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 12)
    @Column(name = "phone_number")
    private String phoneNumber;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_phone")
    private Long idPhone;

    public Phones() {
    }

    public Phones(Long idPhone) {
        this.idPhone = idPhone;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Long getIdPhone() {
        return idPhone;
    }

    public void setIdPhone(Long idPhone) {
        this.idPhone = idPhone;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPhone != null ? idPhone.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Phones)) {
            return false;
        }
        Phones other = (Phones) object;
        if ((this.idPhone == null && other.idPhone != null) || (this.idPhone != null && !this.idPhone.equals(other.idPhone))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Phones[ idPhone=" + idPhone + " ]";
    }
    
}
