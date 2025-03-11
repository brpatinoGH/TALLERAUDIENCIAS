package com.TallerAudiencias.audiencias.services.impl;

import com.TallerAudiencias.audiencias.repositories.UsuarioRepository;
import com.TallerAudiencias.audiencias.services.interfaces.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImp implements UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void CrearUsuario() {

    }

}
