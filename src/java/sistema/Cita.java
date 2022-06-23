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
@Table(name = "Cita")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cita.findAll", query = "SELECT c FROM Cita c"),
    @NamedQuery(name = "Cita.findByIDCita", query = "SELECT c FROM Cita c WHERE c.iDCita = :iDCita"),
    @NamedQuery(name = "Cita.findByMotivoVisita", query = "SELECT c FROM Cita c WHERE c.motivoVisita = :motivoVisita"),
    @NamedQuery(name = "Cita.findByHoraAsignada", query = "SELECT c FROM Cita c WHERE c.horaAsignada = :horaAsignada"),
    @NamedQuery(name = "Cita.findByFechaAsignada", query = "SELECT c FROM Cita c WHERE c.fechaAsignada = :fechaAsignada"),
    @NamedQuery(name = "Cita.findByIdMedicoAsignado", query = "SELECT c FROM Cita c WHERE c.idMedicoAsignado = :idMedicoAsignado"),
    @NamedQuery(name = "Cita.findByExamenID", query = "SELECT c FROM Cita c WHERE c.examenID = :examenID"),
    @NamedQuery(name = "Cita.findByDiagnostico", query = "SELECT c FROM Cita c WHERE c.diagnostico = :diagnostico"),
    @NamedQuery(name = "Cita.findByMedicamentoID", query = "SELECT c FROM Cita c WHERE c.medicamentoID = :medicamentoID"),
    @NamedQuery(name = "Cita.findByEstado", query = "SELECT c FROM Cita c WHERE c.estado = :estado"),
    @NamedQuery(name = "Cita.findByObservaciones", query = "SELECT c FROM Cita c WHERE c.observaciones = :observaciones"),
    @NamedQuery(name = "Cita.findByFechaTime", query = "SELECT c FROM Cita c WHERE c.fechaTime = :fechaTime"),
    @NamedQuery(name = "Cita.findByEliminado", query = "SELECT c FROM Cita c WHERE c.eliminado = :eliminado"),
    @NamedQuery(name = "Cita.findByIDPaciente", query = "SELECT c FROM Cita c WHERE c.iDPaciente = :iDPaciente"),
    @NamedQuery(name = "Cita.findByIDCitaInicio", query = "SELECT c FROM Cita c WHERE c.iDCitaInicio = :iDCitaInicio"),
    @NamedQuery(name = "Cita.findByIDCitaPrevia", query = "SELECT c FROM Cita c WHERE c.iDCitaPrevia = :iDCitaPrevia")})
public class Cita implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDCita")
    private Integer iDCita;
    @Size(max = 50)
    @Column(name = "MotivoVisita")
    private String motivoVisita;
    @Column(name = "HoraAsignada")
    @Temporal(TemporalType.TIME)
    private Date horaAsignada;
    @Column(name = "FechaAsignada")
    @Temporal(TemporalType.DATE)
    private Date fechaAsignada;
    @Column(name = "IdMedicoAsignado")
    private Integer idMedicoAsignado;
    @Column(name = "ExamenID")
    private Integer examenID;
    @Size(max = 50)
    @Column(name = "Diagnostico")
    private String diagnostico;
    @Column(name = "MedicamentoID")
    private Integer medicamentoID;
    @Size(max = 50)
    @Column(name = "Estado")
    private String estado;
    @Size(max = 50)
    @Column(name = "Observaciones")
    private String observaciones;
    @Column(name = "FechaTime")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaTime;
    @Column(name = "Eliminado")
    private Boolean eliminado;
    @Column(name = "iDPaciente")
    private Integer iDPaciente;
    @Column(name = "iDCitaInicio")
    private Integer iDCitaInicio;
    @Column(name = "IDCitaPrevia")
    private Integer iDCitaPrevia;

    public Cita() {
    }

    public Cita(Integer iDCita) {
        this.iDCita = iDCita;
    }

    public Integer getIDCita() {
        return iDCita;
    }

    public void setIDCita(Integer iDCita) {
        this.iDCita = iDCita;
    }

    public String getMotivoVisita() {
        return motivoVisita;
    }

    public void setMotivoVisita(String motivoVisita) {
        this.motivoVisita = motivoVisita;
    }

    public Date getHoraAsignada() {
        return horaAsignada;
    }

    public void setHoraAsignada(Date horaAsignada) {
        this.horaAsignada = horaAsignada;
    }

    public Date getFechaAsignada() {
        return fechaAsignada;
    }

    public void setFechaAsignada(Date fechaAsignada) {
        this.fechaAsignada = fechaAsignada;
    }

    public Integer getIdMedicoAsignado() {
        return idMedicoAsignado;
    }

    public void setIdMedicoAsignado(Integer idMedicoAsignado) {
        this.idMedicoAsignado = idMedicoAsignado;
    }

    public Integer getExamenID() {
        return examenID;
    }

    public void setExamenID(Integer examenID) {
        this.examenID = examenID;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public Integer getMedicamentoID() {
        return medicamentoID;
    }

    public void setMedicamentoID(Integer medicamentoID) {
        this.medicamentoID = medicamentoID;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Date getFechaTime() {
        return fechaTime;
    }

    public void setFechaTime(Date fechaTime) {
        this.fechaTime = fechaTime;
    }

    public Boolean getEliminado() {
        return eliminado;
    }

    public void setEliminado(Boolean eliminado) {
        this.eliminado = eliminado;
    }

    public Integer getIDPaciente() {
        return iDPaciente;
    }

    public void setIDPaciente(Integer iDPaciente) {
        this.iDPaciente = iDPaciente;
    }

    public Integer getIDCitaInicio() {
        return iDCitaInicio;
    }

    public void setIDCitaInicio(Integer iDCitaInicio) {
        this.iDCitaInicio = iDCitaInicio;
    }

    public Integer getIDCitaPrevia() {
        return iDCitaPrevia;
    }

    public void setIDCitaPrevia(Integer iDCitaPrevia) {
        this.iDCitaPrevia = iDCitaPrevia;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (iDCita != null ? iDCita.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cita)) {
            return false;
        }
        Cita other = (Cita) object;
        if ((this.iDCita == null && other.iDCita != null) || (this.iDCita != null && !this.iDCita.equals(other.iDCita))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sistema.Cita[ iDCita=" + iDCita + " ]";
    }
    
}
