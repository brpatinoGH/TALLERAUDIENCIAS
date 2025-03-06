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
    @Column(name = "aud_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long audId;

    @Column(name = "aud_nombre")
    private String audNombre;

    @Column(name = "aud_fecins", nullable = false)
    private LocalDate audFechaInscripcion;

    @Column(name = "aud_fecmod")
    private LocalDate audFechaModificacion;

    @Column(name = "aud_estado")
    private Boolean audEstado;

    @Enumerated(EnumType.STRING)
    @Column(name = "aud_tipo")
    private TipoAudiencia audTipo;

    @Column(name = "aud_fecha")
    private LocalDate audFecha;

    @Column(name = "aud_hora_ini")
    private LocalTime audHoraInicio;

    @Column(name = "aud_duracion")
    private LocalTime audDuracion;

    @Column(name = "aud_cuij")
    private Integer audCuij;

    @Column(name = "aud_caratula")
    private String audCaratula;

    @ManyToMany
    @JoinColumn(name = "aud_usrins")
    private Usuario usuarioIns;

    @ManyToMany
    @JoinColumn(name = "aud_usrmod")
    private Usuario usuarioMod;

    @ManyToMany
    @JoinColumn(name = "sal_id")
    private Sala sala;

}
