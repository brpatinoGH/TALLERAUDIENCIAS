package com.TallerAudiencias.audiencias.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Sala")
@Data
@NoArgsConstructor
@AllArgsConstructor
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

}
