package com.TallerAudiencias.audiencias.entities;

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


}
