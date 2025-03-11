package com.TallerAudiencias.audiencias.dto;

import com.TallerAudiencias.audiencias.entities.Audiencia;
import com.TallerAudiencias.audiencias.entities.Autoridad;
import com.TallerAudiencias.audiencias.entities.Usuario;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AudienciaExtDTO {
    private Long eauId;
    private String eauNombre;
    private LocalDate eauFechaInscripcion;
    private LocalDate eauFechaModificacion;
    private Boolean eauEstado;
    private Long usuarioInsId;
    private Long usuarioModId;
    private Long audienciaId;
    private Long autoridadId;

}

