package com.TallerAudiencias.audiencias.controllers;

import com.TallerAudiencias.audiencias.entities.DistritoJudicial;
import com.TallerAudiencias.audiencias.services.interfaces.DistritoJudicialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/distritos_judiciales")
public class DistritoJudicialController {

    @Autowired
    private DistritoJudicialService distritoJudicialService;

    public List<DistritoJudicial> getAllDistritos(){
        return distritoJudicialService.getAllDistritos();
    }

    public Optional<DistritoJudicial> getDistritoById(Long id){
        return distritoJudicialService.getDistritoById(id);
    }

    public Optional<DistritoJudicial> findByNombre(String nombre){
        return distritoJudicialService.findByNombre(nombre);
    }

}
