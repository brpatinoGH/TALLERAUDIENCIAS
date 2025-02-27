package com.TallerAudiencias.audiencias.entities;

import com.TallerAudiencias.audiencias.entities.enums.TipoAutoridad;
import jakarta.persistence.*;

@Entity
@Table(name = "AUTORIDAD")
public class Autoridad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "aut_id")
    private Integer aut_id;

    @Column(name = "aut_nombre", length = 50)
    private String aut_nombre;

    @Column(name = "aut_mail", length = 50)
    private String aut_email;

    @Enumerated(EnumType.STRING)
    @Column(name = "aut_tipo", nullable = false)
    private TipoAutoridad aut_tipo;

    @Column(name = "aut_estado")
    private Boolean aut_estado;

    @ManyToOne
    @JoinColumn(name = "dis_id")
    private DistritoJudicial dis_id;

}
