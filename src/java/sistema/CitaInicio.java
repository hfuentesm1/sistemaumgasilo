/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema;

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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author herma
 */
@Entity
@Table(name = "CitaInicio")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CitaInicio.findAll", query = "SELECT c FROM CitaInicio c"),
    @NamedQuery(name = "CitaInicio.findByIDPaciente", query = "SELECT c FROM CitaInicio c WHERE c.iDPaciente = :iDPaciente"),
    @NamedQuery(name = "CitaInicio.findByIdCitaPreliminar", query = "SELECT c FROM CitaInicio c WHERE c.idCitaPreliminar = :idCitaPreliminar"),
    @NamedQuery(name = "CitaInicio.findByIdMedicoPreliminar", query = "SELECT c FROM CitaInicio c WHERE c.idMedicoPreliminar = :idMedicoPreliminar"),
    @NamedQuery(name = "CitaInicio.findByIdCita", query = "SELECT c FROM CitaInicio c WHERE c.idCita = :idCita"),
    @NamedQuery(name = "CitaInicio.findByIdMedicoAsignado", query = "SELECT c FROM CitaInicio c WHERE c.idMedicoAsignado = :idMedicoAsignado"),
    @NamedQuery(name = "CitaInicio.findByFechaHora", query = "SELECT c FROM CitaInicio c WHERE c.fechaHora = :fechaHora"),
    @NamedQuery(name = "CitaInicio.findByObservaciones", query = "SELECT c FROM CitaInicio c WHERE c.observaciones = :observaciones"),
    @NamedQuery(name = "CitaInicio.findByEstado", query = "SELECT c FROM CitaInicio c WHERE c.estado = :estado"),
    @NamedQuery(name = "CitaInicio.findByEliminado", query = "SELECT c FROM CitaInicio c WHERE c.eliminado = :eliminado")})
public class CitaInicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "IDPaciente")
    private Integer iDPaciente;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdCitaPreliminar")
    private Integer idCitaPreliminar;
    @Column(name = "idMedicoPreliminar")
    private Integer idMedicoPreliminar;
    @Column(name = "IdCita")
    private Integer idCita;
    @Size(max = 50)
    @Column(name = "IdMedicoAsignado")
    private String idMedicoAsignado;
    @Column(name = "FechaHora")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaHora;
    @Size(max = 50)
    @Column(name = "Observaciones")
    private String observaciones;
    @Size(max = 50)
    @Column(name = "Estado")
    private String estado;
    @Column(name = "Eliminado")
    private Boolean eliminado;

    public CitaInicio() {
    }

    public CitaInicio(Integer idCitaPreliminar) {
        this.idCitaPreliminar = idCitaPreliminar;
    }

    public Integer getIDPaciente() {
        return iDPaciente;
    }

    public void setIDPaciente(Integer iDPaciente) {
        this.iDPaciente = iDPaciente;
    }

    public Integer getIdCitaPreliminar() {
        return idCitaPreliminar;
    }

    public void setIdCitaPreliminar(Integer idCitaPreliminar) {
        this.idCitaPreliminar = idCitaPreliminar;
    }

    public Integer getIdMedicoPreliminar() {
        return idMedicoPreliminar;
    }

    public void setIdMedicoPreliminar(Integer idMedicoPreliminar) {
        this.idMedicoPreliminar = idMedicoPreliminar;
    }

    public Integer getIdCita() {
        return idCita;
    }

    public void setIdCita(Integer idCita) {
        this.idCita = idCita;
    }

    public String getIdMedicoAsignado() {
        return idMedicoAsignado;
    }

    public void setIdMedicoAsignado(String idMedicoAsignado) {
        this.idMedicoAsignado = idMedicoAsignado;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Boolean getEliminado() {
        return eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCitaPreliminar != null ? idCitaPreliminar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CitaInicio)) {
            return false;
        }
        CitaInicio other = (CitaInicio) object;
        if ((this.idCitaPreliminar == null && other.idCitaPreliminar != null) || (this.idCitaPreliminar != null && !this.idCitaPreliminar.equals(other.idCitaPreliminar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sistema.CitaInicio[ idCitaPreliminar=" + idCitaPreliminar + " ]";
    }
    
}
