package com.TallerAudiencias.audiencias.controllers;

import com.TallerAudiencias.audiencias.services.interfaces.AudienciaExtService;
import com.TallerAudiencias.audiencias.services.interfaces.AudienciaService;
import com.TallerAudiencias.audiencias.services.interfaces.AutoridadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/audiencias_ext")
public class AudienciaExtController {

    @Autowired
    private AudienciaExtService audienciaExtService;

}
