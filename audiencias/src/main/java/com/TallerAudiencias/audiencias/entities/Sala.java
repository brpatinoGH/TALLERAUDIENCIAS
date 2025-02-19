package com.TallerAudiencias.audiencias.entities;

import jakarta.persistence.*;

@Table(name = "Sala")
public class Sala {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer salId;

    @Column(name = "sal_nombre")
    private String salNombre;

    @Column(name = "sal_lugar")
    private String salLugar;

    @ManyToOne
    @JoinColumn(name = "dis_id", referencedColumnName = "id")
    private DistritoJudicial disId;

    public Integer getSalId() {
        return salId;
    }

    public void setSalId(Integer salId) {
        this.salId = salId;
    }

    public String getSalNombre() {
        return salNombre;
    }

    public void setSalNombre(String salNombre) {
        this.salNombre = salNombre;
    }

    public String getSalLugar() {
        return salLugar;
    }

    public void setSalLugar(String salLugar) {
        this.salLugar = salLugar;
    }

}
