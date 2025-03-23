package com.TallerAudiencias.audiencias.controllers;

import com.TallerAudiencias.audiencias.services.interfaces.AudienciaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/audiencias")
public class AudienciaController {

    @Autowired
    private AudienciaService audienciaService;

}
