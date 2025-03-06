package com.TallerAudiencias.audiencias.services;

import com.TallerAudiencias.audiencias.entities.Usuario;
import com.TallerAudiencias.audiencias.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    private List<Usuario> findAll() {
        return usuarioRepository.findAll();
    }

    private Optional<Usuario> findById(Long usrId) {
        return usuarioRepository.findById(usrId);
    }

    private List<Usuario> findByUserName(String usrName) {
        return usuarioRepository.findByUsrNombre(usrName);
    }

    private  List<Usuario> findByUsrEmail(String usrEmail) {
        return usuarioRepository.findByUsrEmail(usrEmail);
    }
}
