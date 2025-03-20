package com.TallerAudiencias.audiencias.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "DistritoJudicial")
public class DistritoJudicial {
    @Id
    @Column(name = "dis_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long disId;

    @Column(name = "dis_nombre")
    private String disNombre;

    @OneToMany(mappedBy = "disId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Sala> salas;

    @OneToMany(mappedBy = "disId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Autoridad> autoridades;

    @OneToMany(mappedBy = "disId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Usuario> usuarios;


}