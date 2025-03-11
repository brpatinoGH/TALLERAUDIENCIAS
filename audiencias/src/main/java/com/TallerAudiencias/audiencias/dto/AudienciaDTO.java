package com.TallerAudiencias.audiencias.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AudienciaDTO {
    private Long audId;
    private String audNombre;
    private LocalDate audFechaInscripcion;
    private LocalDate audFechaModificacion;
    private Boolean audEstado;
    private String audTipo;
    private LocalDate audFecha;
    private LocalTime audHoraInicio;
    private LocalTime audDuracion;
    private Integer audCuij;
    private String audCaratula;
    private List<Long> usuarioInsIds;
    private List<Long> usuarioModIds;
    private List<Long> salaIds;

}
