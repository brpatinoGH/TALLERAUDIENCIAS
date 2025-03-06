package com.TallerAudiencias.audiencias.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "Sala")
public class Sala {
    @Id
    @Column(name = "sal_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long salId;

    @Column(name = "sal_nombre")
    private String salNombre;

    @Column(name = "sal_lugar")
    private String salLugar;

    @ManyToOne
    @JoinColumn(name = "dis_id", referencedColumnName = "id")
    private DistritoJudicial disId;

}
