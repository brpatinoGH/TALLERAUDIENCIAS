package com.TallerAudiencias.audiencias.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "DistritoJudicial")
public class DistritoJudicial {
    @Id
    @Column(name = "dis_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long disId;

    @Column(name = "dis_nombre")
    private String disNombre;

}
