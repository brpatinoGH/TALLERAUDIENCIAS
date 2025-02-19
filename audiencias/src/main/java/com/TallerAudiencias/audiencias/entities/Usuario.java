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

    public Long getUsr_id() {
        return usr_id;
    }

    public void setUsr_id(Long usr_id) {
        this.usr_id = usr_id;
    }

    public String getUsr_nombre() {
        return usr_nombre;
    }

    public void setUsr_nombre(String usr_nombre) {
        this.usr_nombre = usr_nombre;
    }

    public String getUsr_username() {
        return usr_username;
    }

    public void setUsr_username(String usr_username) {
        this.usr_username = usr_username;
    }

    public String getUsr_mail() {
        return usr_mail;
    }

    public void setUsr_mail(String usr_mail) {
        this.usr_mail = usr_mail;
    }

    public Boolean getUsr_estado() {
        return usr_estado;
    }

    public void setUsr_estado(Boolean usr_estado) {
        this.usr_estado = usr_estado;
    }

    public String getUsr_login() {
        return usr_login;
    }

    public void setUsr_login(String usr_login) {
        this.usr_login = usr_login;
    }

    public String getUsr_password() {
        return usr_password;
    }

    public void setUsr_password(String usr_password) {
        this.usr_password = usr_password;
    }

    public Boolean getUsr_isadmin() {
        return usr_isadmin;
    }

    public void setUsr_isadmin(Boolean usr_isadmin) {
        this.usr_isadmin = usr_isadmin;
    }
}
