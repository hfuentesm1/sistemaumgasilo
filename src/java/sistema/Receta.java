/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistema;

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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author herma
 */
@Entity
@Table(name = "Receta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Receta.findAll", query = "SELECT r FROM Receta r"),
    @NamedQuery(name = "Receta.findByIdReceta", query = "SELECT r FROM Receta r WHERE r.idReceta = :idReceta"),
    @NamedQuery(name = "Receta.findByIDMedicina", query = "SELECT r FROM Receta r WHERE r.iDMedicina = :iDMedicina"),
    @NamedQuery(name = "Receta.findByIDCita", query = "SELECT r FROM Receta r WHERE r.iDCita = :iDCita"),
    @NamedQuery(name = "Receta.findByMedicinaDetalles", query = "SELECT r FROM Receta r WHERE r.medicinaDetalles = :medicinaDetalles"),
    @NamedQuery(name = "Receta.findByCantidadTomar", query = "SELECT r FROM Receta r WHERE r.cantidadTomar = :cantidadTomar"),
    @NamedQuery(name = "Receta.findByTiempoDeAplicacion", query = "SELECT r FROM Receta r WHERE r.tiempoDeAplicacion = :tiempoDeAplicacion"),
    @NamedQuery(name = "Receta.findByFrecuencia", query = "SELECT r FROM Receta r WHERE r.frecuencia = :frecuencia"),
    @NamedQuery(name = "Receta.findByObservaciones", query = "SELECT r FROM Receta r WHERE r.observaciones = :observaciones"),
    @NamedQuery(name = "Receta.findByEstadoMedicamentoProporcionado", query = "SELECT r FROM Receta r WHERE r.estadoMedicamentoProporcionado = :estadoMedicamentoProporcionado"),
    @NamedQuery(name = "Receta.findByCantidadDada", query = "SELECT r FROM Receta r WHERE r.cantidadDada = :cantidadDada")})
public class Receta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IdReceta")
    private Integer idReceta;
    @Column(name = "IDMedicina")
    private Integer iDMedicina;
    @Column(name = "IDCita")
    private Integer iDCita;
    @Size(max = 50)
    @Column(name = "MedicinaDetalles")
    private String medicinaDetalles;
    @Size(max = 50)
    @Column(name = "CantidadTomar")
    private String cantidadTomar;
    @Size(max = 50)
    @Column(name = "TiempoDeAplicacion")
    private String tiempoDeAplicacion;
    @Size(max = 50)
    @Column(name = "Frecuencia")
    private String frecuencia;
    @Size(max = 50)
    @Column(name = "Observaciones")
    private String observaciones;
    @Size(max = 50)
    @Column(name = "EstadoMedicamentoProporcionado")
    private String estadoMedicamentoProporcionado;
    @Column(name = "CantidadDada")
    private Integer cantidadDada;

    public Receta() {
    }

    public Receta(Integer idReceta) {
        this.idReceta = idReceta;
    }

    public Integer getIdReceta() {
        return idReceta;
    }

    public void setIdReceta(Integer idReceta) {
        this.idReceta = idReceta;
    }

    public Integer getIDMedicina() {
        return iDMedicina;
    }

    public void setIDMedicina(Integer iDMedicina) {
        this.iDMedicina = iDMedicina;
    }

    public Integer getIDCita() {
        return iDCita;
    }

    public void setIDCita(Integer iDCita) {
        this.iDCita = iDCita;
    }

    public String getMedicinaDetalles() {
        return medicinaDetalles;
    }

    public void setMedicinaDetalles(String medicinaDetalles) {
        this.medicinaDetalles = medicinaDetalles;
    }

    public String getCantidadTomar() {
        return cantidadTomar;
    }

    public void setCantidadTomar(String cantidadTomar) {
        this.cantidadTomar = cantidadTomar;
    }

    public String getTiempoDeAplicacion() {
        return tiempoDeAplicacion;
    }

    public void setTiempoDeAplicacion(String tiempoDeAplicacion) {
        this.tiempoDeAplicacion = tiempoDeAplicacion;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEstadoMedicamentoProporcionado() {
        return estadoMedicamentoProporcionado;
    }

    public void setEstadoMedicamentoProporcionado(String estadoMedicamentoProporcionado) {
        this.estadoMedicamentoProporcionado = estadoMedicamentoProporcionado;
    }

    public Integer getCantidadDada() {
        return cantidadDada;
    }

    public void setCantidadDada(Integer cantidadDada) {
        this.cantidadDada = cantidadDada;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idReceta != null ? idReceta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Receta)) {
            return false;
        }
        Receta other = (Receta) object;
        if ((this.idReceta == null && other.idReceta != null) || (this.idReceta != null && !this.idReceta.equals(other.idReceta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "sistema.Receta[ idReceta=" + idReceta + " ]";
    }
    
}
