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
@Table(name = "level")
@NamedQueries({
    @NamedQuery(name = "Level.findAll", query = "SELECT l FROM Level l")})
public class Level implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 50)
    @Column(name = "level_name")
    private String levelName;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_level")
    private Long idLevel;

    public Level() {
    }

    public Level(Long idLevel) {
        this.idLevel = idLevel;
    }

    public String getLevelName() {
        return levelName;
    }

    public void setLevelName(String levelName) {
        this.levelName = levelName;
    }

    public Long getIdLevel() {
        return idLevel;
    }

    public void setIdLevel(Long idLevel) {
        this.idLevel = idLevel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idLevel != null ? idLevel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Level)) {
            return false;
        }
        Level other = (Level) object;
        if ((this.idLevel == null && other.idLevel != null) || (this.idLevel != null && !this.idLevel.equals(other.idLevel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Level[ idLevel=" + idLevel + " ]";
    }
    
}
