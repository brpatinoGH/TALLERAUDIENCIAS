package com.TallerAudiencias.audiencias.entities;

import com.TallerAudiencias.audiencias.entities.enums.TipoAudiencia;
import com.TallerAudiencias.audiencias.entities.enums.TipoAutoridad;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;


@Entity
@Table(name = "AUDIENCIA")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Audiencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aud_id")
    private Integer id;

    @Column(name = "aud_nombre")
    private String nombre;

    @Column(name = "aud_fecins", nullable = false)
    private LocalDate fechaInscripcion;

    @Column(name = "aud_fecmod")
    private LocalDate fechaModificacion;

    @Column(name = "aud_estado")
    private Boolean estado;

    @Enumerated(EnumType.STRING)
    @Column(name = "aud_tipo")
    private TipoAudiencia tipo;

    @Column(name = "aud_fecha")
    private LocalDate fecha;

    @Column(name = "aud_hora_ini")
    private LocalTime horaInicio;

    @Column(name = "aud_duracion")
    private LocalTime duracion;

    @Column(name = "aud_cuij")
    private Integer cuij;

    @Column(name = "aud_caratula")
    private String caratula;

    @ManyToMany
    @JoinColumn(name = "aud_usrins")
    private Usuario usuarioIns;

    @ManyToMany
    @JoinColumn(name = "aud_usrmod")
    private Usuario usuarioMod;

    @ManyToMany
    @JoinColumn(name = "sal_id")
    private Sala sala;

    @Enumerated(EnumType.STRING)
    @Column(name = "aud_tipo", nullable = false)
    private TipoAudiencia aud_tipo;
}
