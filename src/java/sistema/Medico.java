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
@Table(name = "Medico")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Medico.findAll", query = "SELECT m FROM Medico m"),
    @NamedQuery(name = "Medico.findByIDMedico", query = "SELECT m FROM Medico m WHERE m.iDMedico = :iDMedico"),
    @NamedQuery(name = "Medico.findByNombres", query = "SELECT m FROM Medico m WHERE m.nombres = :nombres"),
    @NamedQuery(name = "Medico.findByApellidos", query = "SELECT m FROM Medico m WHERE m.apellidos = :apellidos")})
public class Medico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDMedico")
    private Integer iDMedico;
    @Size(max = 10)
    @Column(name = "Nombres")
    private String nombres;
    @Size(max = 10)
    @Column(name = "Apellidos")
    private String apellidos;

    public Medico() {
    }

    public Medico(Integer iDMedico) {
        this.iDMedico = iDMedico;
    }

    public Integer getIDMedico() {
        return iDMedico;
    }

    public void setIDMedico(Integer iDMedico) {
        this.iDMedico = iDMedico;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDMedico != null ? iDMedico.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medico)) {
            return false;
        }
        Medico other = (Medico) object;
        if ((this.iDMedico == null && other.iDMedico != null) || (this.iDMedico != null && !this.iDMedico.equals(other.iDMedico))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sistema.Medico[ iDMedico=" + iDMedico + " ]";
    }
    
}
