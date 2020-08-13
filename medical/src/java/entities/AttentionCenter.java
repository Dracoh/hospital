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
@Table(name = "attention_center")
@NamedQueries({
    @NamedQuery(name = "AttentionCenter.findAll", query = "SELECT a FROM AttentionCenter a")})
public class AttentionCenter implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 50)
    @Column(name = "center_name")
    private String centerName;
    @Size(max = 75)
    @Column(name = "center_location")
    private String centerLocation;
    @Column(name = "center_capacity")
    private Integer centerCapacity;
    @Column(name = "id_center_type")
    private Short idCenterType;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_attention_center")
    private Long idAttentionCenter;

    public AttentionCenter() {
    }

    public AttentionCenter(Long idAttentionCenter) {
        this.idAttentionCenter = idAttentionCenter;
    }

    public String getCenterName() {
        return centerName;
    }

    public void setCenterName(String centerName) {
        this.centerName = centerName;
    }

    public String getCenterLocation() {
        return centerLocation;
    }

    public void setCenterLocation(String centerLocation) {
        this.centerLocation = centerLocation;
    }

    public Integer getCenterCapacity() {
        return centerCapacity;
    }

    public void setCenterCapacity(Integer centerCapacity) {
        this.centerCapacity = centerCapacity;
    }

    public Short getIdCenterType() {
        return idCenterType;
    }

    public void setIdCenterType(Short idCenterType) {
        this.idCenterType = idCenterType;
    }

    public Long getIdAttentionCenter() {
        return idAttentionCenter;
    }

    public void setIdAttentionCenter(Long idAttentionCenter) {
        this.idAttentionCenter = idAttentionCenter;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAttentionCenter != null ? idAttentionCenter.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AttentionCenter)) {
            return false;
        }
        AttentionCenter other = (AttentionCenter) object;
        if ((this.idAttentionCenter == null && other.idAttentionCenter != null) || (this.idAttentionCenter != null && !this.idAttentionCenter.equals(other.idAttentionCenter))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.AttentionCenter[ idAttentionCenter=" + idAttentionCenter + " ]";
    }
    
}
