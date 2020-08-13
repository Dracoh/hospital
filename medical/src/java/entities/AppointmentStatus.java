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
@Table(name = "appointment_status")
@NamedQueries({
    @NamedQuery(name = "AppointmentStatus.findAll", query = "SELECT a FROM AppointmentStatus a")})
public class AppointmentStatus implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 50)
    @Column(name = "status_name")
    private String statusName;
    @Size(max = 100)
    @Column(name = "status_description")
    private String statusDescription;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_appointment_status")
    private Long idAppointmentStatus;

    public AppointmentStatus() {
    }

    public AppointmentStatus(Long idAppointmentStatus) {
        this.idAppointmentStatus = idAppointmentStatus;
    }

    public String getStatusName() {
        return statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public Long getIdAppointmentStatus() {
        return idAppointmentStatus;
    }

    public void setIdAppointmentStatus(Long idAppointmentStatus) {
        this.idAppointmentStatus = idAppointmentStatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAppointmentStatus != null ? idAppointmentStatus.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AppointmentStatus)) {
            return false;
        }
        AppointmentStatus other = (AppointmentStatus) object;
        if ((this.idAppointmentStatus == null && other.idAppointmentStatus != null) || (this.idAppointmentStatus != null && !this.idAppointmentStatus.equals(other.idAppointmentStatus))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.AppointmentStatus[ idAppointmentStatus=" + idAppointmentStatus + " ]";
    }
    
}
