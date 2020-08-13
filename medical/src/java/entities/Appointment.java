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
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

/**
 *
 * @author hectorsantossv
 */
@Entity
@Table(name = "appointment")
@NamedQueries({
    @NamedQuery(name = "Appointment.findAll", query = "SELECT a FROM Appointment a")})
//@NamedStoredProcedureQuery
public class Appointment implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "id_work_area")
    private Integer idWorkArea;
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Column(name = "time")
    @Temporal(TemporalType.TIME)
    private Date time;
    @Column(name = "id_status")
    private Integer idStatus;
    @Size(max = 500)
    @Column(name = "comments")
    private String comments;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_appointment")
    private Long idAppointment;

    public Appointment() {
    }

    public Appointment(Long idAppointment) {
        this.idAppointment = idAppointment;
    }

    public Integer getIdWorkArea() {
        return idWorkArea;
    }

    public void setIdWorkArea(Integer idWorkArea) {
        this.idWorkArea = idWorkArea;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Integer idStatus) {
        this.idStatus = idStatus;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Long getIdAppointment() {
        return idAppointment;
    }

    public void setIdAppointment(Long idAppointment) {
        this.idAppointment = idAppointment;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAppointment != null ? idAppointment.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Appointment)) {
            return false;
        }
        Appointment other = (Appointment) object;
        if ((this.idAppointment == null && other.idAppointment != null) || (this.idAppointment != null && !this.idAppointment.equals(other.idAppointment))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Appointment[ idAppointment=" + idAppointment + " ]";
    }
    
}
