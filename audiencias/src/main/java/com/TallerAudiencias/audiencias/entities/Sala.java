package com.TallerAudiencias.audiencias.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Data
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
    @JoinColumn(name = "dis_id", referencedColumnName = "dis_id")
    private DistritoJudicial disId;

    // Relación OneToMany: Una sala puede tener muchas audiencias.
    @OneToMany(mappedBy = "salId", cascade = CascadeType.ALL, orphanRemoval = true)  // "sala" hace referencia a la propiedad de Audiencia
    private Set<Audiencia> audiencias;  // Relación OneToMany, una sala tiene muchas audiencias

}
