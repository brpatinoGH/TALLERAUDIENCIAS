package com.TallerAudiencias.audiencias.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @Column(name = "usr_id")
    private Long usr_id;

    @Column(name = "usr_nombre")
    private String usr_nombre;

    @Column(name = "usr_username")
    private String usr_username;

    @Column(name = "usr_mail")
    private String usr_mail;

    @Column(name = "usr_estado")
    private Boolean usr_estado;

    @Column(name = "usr_login")
    private String usr_login; //En el SQL esta puesto como string, pero creo que es un Boolean para saber si el usuario se logeo o está conectado.

    @Column(name = "usr_password")
    private String usr_password;

    @Column(name = "usr_isadmin")
    private Boolean usr_isadmin;


}
