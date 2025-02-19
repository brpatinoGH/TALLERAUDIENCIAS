package com.TallerAudiencias.audiencias.model;

import jakarta.persistence.*;

@Entity
public class DistritoJudicial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 150)
    private String disNombre;
}
