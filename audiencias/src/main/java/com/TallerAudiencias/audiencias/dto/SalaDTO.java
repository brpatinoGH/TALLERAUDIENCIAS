package com.TallerAudiencias.audiencias.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SalaDTO {
    private Long salId;
    private String salNombre;
    private String salLugar;
    private Long disId;

}
