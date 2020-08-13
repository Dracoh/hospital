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
@Table(name = "center_type")
@NamedQueries({
    @NamedQuery(name = "CenterType.findAll", query = "SELECT c FROM CenterType c")})
public class CenterType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 50)
    @Column(name = "center_type_name")
    private String centerTypeName;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_center_type")
    private Long idCenterType;

    public CenterType() {
    }

    public CenterType(Long idCenterType) {
        this.idCenterType = idCenterType;
    }

    public String getCenterTypeName() {
        return centerTypeName;
    }

    public void setCenterTypeName(String centerTypeName) {
        this.centerTypeName = centerTypeName;
    }

    public Long getIdCenterType() {
        return idCenterType;
    }

    public void setIdCenterType(Long idCenterType) {
        this.idCenterType = idCenterType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCenterType != null ? idCenterType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CenterType)) {
            return false;
        }
        CenterType other = (CenterType) object;
        if ((this.idCenterType == null && other.idCenterType != null) || (this.idCenterType != null && !this.idCenterType.equals(other.idCenterType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.CenterType[ idCenterType=" + idCenterType + " ]";
    }
    
}
