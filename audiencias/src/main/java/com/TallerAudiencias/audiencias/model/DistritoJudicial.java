package com.TallerAudiencias.audiencias.model;

import jakarta.persistence.*;

@Entity
@Table(name = "DistritoJudicial")
public class DistritoJudicial {
    @Id
    @Column(name = "usr_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "dis_nombre")
    private String disNombre;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDisNombre() {
        return disNombre;
    }

    public void setDisNombre(String disNombre) {
        this.disNombre = disNombre;
    }
}
