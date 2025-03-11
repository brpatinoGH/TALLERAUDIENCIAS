package com.TallerAudiencias.audiencias.dto;

import com.TallerAudiencias.audiencias.entities.enums.TipoAutoridad;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AutoridadDTO {
    private Long autId;
    private String autNombre;
    private String autMail;
    private TipoAutoridad autTipo;
    private Long disId;

}
