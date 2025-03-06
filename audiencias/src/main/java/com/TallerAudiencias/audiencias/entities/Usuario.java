package com.TallerAudiencias.audiencias.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @Column(name = "usr_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usrId;

    @Column(name = "usr_nombre")
    private String usrNombre;

    @Column(name = "usr_username")
    private String usrUsername;

    @Column(name = "usr_mail")
    private String usrMail;

    @Column(name = "usr_estado")
    private Boolean usrEstado;

    @Column(name = "usr_login")
    private String usrLogin; //En el SQL esta puesto como string, pero creo que es un Boolean para saber si el usuario se logeo o está conectado.

    @Column(name = "usr_password")
    private String usrPassword;

    @Column(name = "usr_isadmin")
    private Boolean usrIsAdmin;


}
