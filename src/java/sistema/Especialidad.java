/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author herma
 */
@Entity
@Table(name = "Especialidad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Especialidad.findAll", query = "SELECT e FROM Especialidad e"),
    @NamedQuery(name = "Especialidad.findByIDEspecialidad", query = "SELECT e FROM Especialidad e WHERE e.iDEspecialidad = :iDEspecialidad"),
    @NamedQuery(name = "Especialidad.findByEspecialidad", query = "SELECT e FROM Especialidad e WHERE e.especialidad = :especialidad")})
public class Especialidad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDEspecialidad")
    private Integer iDEspecialidad;
    @Size(max = 10)
    @Column(name = "Especialidad")
    private String especialidad;

    public Especialidad() {
    }

    public Especialidad(Integer iDEspecialidad) {
        this.iDEspecialidad = iDEspecialidad;
    }

    public Integer getIDEspecialidad() {
        return iDEspecialidad;
    }

    public void setIDEspecialidad(Integer iDEspecialidad) {
        this.iDEspecialidad = iDEspecialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDEspecialidad != null ? iDEspecialidad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Especialidad)) {
            return false;
        }
        Especialidad other = (Especialidad) object;
        if ((this.iDEspecialidad == null && other.iDEspecialidad != null) || (this.iDEspecialidad != null && !this.iDEspecialidad.equals(other.iDEspecialidad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sistema.Especialidad[ iDEspecialidad=" + iDEspecialidad + " ]";
    }
    
}
