package com.TallerAudiencias.audiencias.entities;

import com.TallerAudiencias.audiencias.entities.enums.TipoAutoridad;
import jakarta.persistence.*;

@Entity
@Table(name = "AUTORIDAD")
public class Autoridad {
    @Id
    @Column(name = "aut_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long autId;

    @Column(name = "aut_nombre", length = 50)
    private String autNombre;

    @Column(name = "aut_mail", length = 50)
    private String autEmail;

    @Enumerated(EnumType.STRING)
    @Column(name = "aut_tipo", nullable = false)
    private TipoAutoridad autTipo;

    @Column(name = "aut_estado")
    private Boolean autEstado;

    @ManyToOne
    @JoinColumn(name = "dis_id")
    private DistritoJudicial disId;

}
