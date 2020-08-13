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
@Table(name = "work_area")
@NamedQueries({
    @NamedQuery(name = "WorkArea.findAll", query = "SELECT w FROM WorkArea w")})
public class WorkArea implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 50)
    @Column(name = "work_area_name")
    private String workAreaName;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_work_area")
    private Long idWorkArea;

    public WorkArea() {
    }

    public WorkArea(Long idWorkArea) {
        this.idWorkArea = idWorkArea;
    }

    public String getWorkAreaName() {
        return workAreaName;
    }

    public void setWorkAreaName(String workAreaName) {
        this.workAreaName = workAreaName;
    }

    public Long getIdWorkArea() {
        return idWorkArea;
    }

    public void setIdWorkArea(Long idWorkArea) {
        this.idWorkArea = idWorkArea;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idWorkArea != null ? idWorkArea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof WorkArea)) {
            return false;
        }
        WorkArea other = (WorkArea) object;
        if ((this.idWorkArea == null && other.idWorkArea != null) || (this.idWorkArea != null && !this.idWorkArea.equals(other.idWorkArea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.WorkArea[ idWorkArea=" + idWorkArea + " ]";
    }
    
}
