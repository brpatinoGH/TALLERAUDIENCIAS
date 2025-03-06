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
    @JoinColumn(name = "eau_usrins", referencedColumnName = "usr_id")
    private Usuario usuarioInscripcion;

    @ManyToOne
    @JoinColumn(name = "eau_usrmod", referencedColumnName = "usr_id")
    private Usuario usuarioModificacion;

    @ManyToOne
    @JoinColumn(name = "aud_id", referencedColumnName = "aud_id")
    private Audiencia audienciaId;

    @ManyToOne
    @JoinColumn(name = "aut_id", referencedColumnName = "aut_id")
    private Autoridad autoridadId;

}
