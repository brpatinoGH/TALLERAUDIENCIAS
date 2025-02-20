package com.TallerAudiencias.audiencias.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "DistritoJudicial")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DistritoJudicial {
    @Id
    @Column(name = "usr_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "dis_nombre")
    private String disNombre;

}
