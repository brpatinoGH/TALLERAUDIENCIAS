package com.TallerAudiencias.audiencias.entities;
import com.TallerAudiencias.audiencias.entities.enums.TipoAudiencia;
import com.TallerAudiencias.audiencias.entities.enums.TipoAutoridad;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;


@Entity
@Table(name = "AUDIENCIA_EXT")
public class AudienciaExt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eau_id")
    private Integer id;

    @Column(name = "eau_nombre", length = 50)
    private String nombre;

    @Column(name = "eau_fecins", nullable = false)
    private LocalDate fechaInscripcion;

    @Column(name = "eau_fecmod")
    private LocalDate fechaModificacion;

    @Column(name = "eau_estado")
    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "eau_usrins", referencedColumnName = "usr_id")
    private Usuario usuarioInscripcion;

    @ManyToOne
    @JoinColumn(name = "eau_usrmod", referencedColumnName = "usr_id")
    private Usuario usuarioModificacion;

    @ManyToOne
    @JoinColumn(name = "aud_id", referencedColumnName = "aud_id")
    private Audiencia audiencia;

    @ManyToOne
    @JoinColumn(name = "aut_id", referencedColumnName = "aut_id")
    private Autoridad autoridad;

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(LocalDate fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public LocalDate getFechaModificacion() {
        return fechaModificacion;
    }

    public void setFechaModificacion(LocalDate fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Usuario getUsuarioInscripcion() {
        return usuarioInscripcion;
    }

    public void setUsuarioInscripcion(Usuario usuarioInscripcion) {
        this.usuarioInscripcion = usuarioInscripcion;
    }

    public Usuario getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(Usuario usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    public Audiencia getAudiencia() {
        return audiencia;
    }

    public void setAudiencia(Audiencia audiencia) {
        this.audiencia = audiencia;
    }

    public Autoridad getAutoridad() {
        return autoridad;
    }

    public void setAutoridad(Autoridad autoridad) {
        this.autoridad = autoridad;
    }
