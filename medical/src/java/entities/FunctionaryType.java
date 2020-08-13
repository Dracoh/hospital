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
@Table(name = "functionary_type")
@NamedQueries({
    @NamedQuery(name = "FunctionaryType.findAll", query = "SELECT f FROM FunctionaryType f")})
public class FunctionaryType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 50)
    @Column(name = "functionary_type_name")
    private String functionaryTypeName;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_functionary_type")
    private Long idFunctionaryType;

    public FunctionaryType() {
    }

    public FunctionaryType(Long idFunctionaryType) {
        this.idFunctionaryType = idFunctionaryType;
    }

    public String getFunctionaryTypeName() {
        return functionaryTypeName;
    }

    public void setFunctionaryTypeName(String functionaryTypeName) {
        this.functionaryTypeName = functionaryTypeName;
    }

    public Long getIdFunctionaryType() {
        return idFunctionaryType;
    }

    public void setIdFunctionaryType(Long idFunctionaryType) {
        this.idFunctionaryType = idFunctionaryType;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idFunctionaryType != null ? idFunctionaryType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FunctionaryType)) {
            return false;
        }
        FunctionaryType other = (FunctionaryType) object;
        if ((this.idFunctionaryType == null && other.idFunctionaryType != null) || (this.idFunctionaryType != null && !this.idFunctionaryType.equals(other.idFunctionaryType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.FunctionaryType[ idFunctionaryType=" + idFunctionaryType + " ]";
    }
    
}
