package com.TallerAudiencias.audiencias.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {

    private Long usrId;
    private String usrNombre;
    private String usrUsername;
    private String usrMail;
    private Boolean usrEstado;
    private String usrLogin;
    private Boolean usrIsAdmin;

}
