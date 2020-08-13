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

/**
 *
 * @author hectorsantossv
 */
@Entity
@Table(name = "log")
@NamedQueries({
    @NamedQuery(name = "Log.findAll", query = "SELECT l FROM Log l")})
public class Log implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "from_status")
    private Integer fromStatus;
    @Column(name = "to_status")
    private Integer toStatus;
    @Column(name = "modify_date")
    @Temporal(TemporalType.TIME)
    private Date modifyDate;
    @Column(name = "id_user")
    private Integer idUser;
    @Column(name = "id_appointment")
    private Integer idAppointment;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_log")
    private Long idLog;

    public Log() {
    }

    public Log(Long idLog) {
        this.idLog = idLog;
    }

    public Integer getFromStatus() {
        return fromStatus;
    }

    public void setFromStatus(Integer fromStatus) {
        this.fromStatus = fromStatus;
    }

    public Integer getToStatus() {
        return toStatus;
    }

    public void setToStatus(Integer toStatus) {
        this.toStatus = toStatus;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getIdAppointment() {
        return idAppointment;
    }

    public void setIdAppointment(Integer idAppointment) {
        this.idAppointment = idAppointment;
    }

    public Long getIdLog() {
        return idLog;
    }

    public void setIdLog(Long idLog) {
        this.idLog = idLog;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLog != null ? idLog.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Log)) {
            return false;
        }
        Log other = (Log) object;
        if ((this.idLog == null && other.idLog != null) || (this.idLog != null && !this.idLog.equals(other.idLog))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Log[ idLog=" + idLog + " ]";
    }
    
}
