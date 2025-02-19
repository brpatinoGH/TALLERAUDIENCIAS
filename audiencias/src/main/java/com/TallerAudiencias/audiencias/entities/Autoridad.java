package com.TallerAudiencias.audiencias.entities;

import com.TallerAudiencias.audiencias.entities.enums.TipoAutoridad;
import jakarta.persistence.*;

@Entity
@Table(name = "AUTORIDAD")
public class Autoridad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aut_id")
    private Integer aut_id;

    @Column(name = "aut_nombre", length = 50)
    private String aut_nombre;

    @Column(name = "aut_mail", length = 50)
    private String aut_email;

    @Enumerated(EnumType.STRING)
    @Column(name = "aut_tipo", nullable = false)
    private TipoAutoridad aut_tipo;

    @Column(name = "aut_estado")
    private Boolean aut_estado;

    @ManyToOne
    @JoinColumn(name = "dis_id")
    private com.TallerAudiencias.audiencias.model.DistritoJudicial dis_id;

    public Integer getAut_id() {
        return aut_id;
    }

    public void setAut_id(Integer aut_id) {
        this.aut_id = aut_id;
    }

    public String getAut_nombre() {
        return aut_nombre;
    }

    public void setAut_nombre(String aut_nombre) {
        this.aut_nombre = aut_nombre;
    }

    public String getAut_email() {
        return aut_email;
    }

    public void setAut_email(String aut_email) {
        this.aut_email = aut_email;
    }

    public TipoAutoridad getAut_tipo() {
        return aut_tipo;
    }

    public void setAut_tipo(TipoAutoridad aut_tipo) {
        this.aut_tipo = aut_tipo;
    }

    public Boolean getAut_estado() {
        return aut_estado;
    }

    public void setAut_estado(Boolean aut_estado) {
        this.aut_estado = aut_estado;
    }

    public DistritoJudicial getDis_id() {
        return dis_id;
    }

    public void setDis_id(DistritoJudicial dis_id) {
        this.dis_id = dis_id;
    }
}
