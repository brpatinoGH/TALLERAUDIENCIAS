package com.TallerAudiencias.audiencias.entities;
import com.TallerAudiencias.audiencias.entities.enums.TipoAudiencia;
import com.TallerAudiencias.audiencias.entities.enums.TipoAutoridad;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Data
@Table(name = "AUDIENCIA_EXT")
public class AudienciaExt {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eau_id")
    private Long eauId;

    @Column(name = "eau_nombre", length = 50)
    private String eauNombre;

    @Column(name = "eau_fecins", nullable = false)
    private LocalDate eauFechaInscripcion;

    @Column(name = "eau_fecmod")
    private LocalDate eauFechaModificacion;

    @Column(name = "eau_estado")
    private Boolean eauEstado;

    @ManyToOne
    @JoinColumn(name = "aud_id", referencedColumnName = "aud_id")
    private Audiencia audId;

    @ManyToOne
    @JoinColumn(name = "aut_id", referencedColumnName = "aut_id")
    private Autoridad autId;



}
