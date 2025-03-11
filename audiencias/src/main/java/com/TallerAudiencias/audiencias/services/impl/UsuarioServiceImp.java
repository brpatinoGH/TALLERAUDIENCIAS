package com.TallerAudiencias.audiencias.services.impl;

import com.TallerAudiencias.audiencias.entities.Usuario;
import com.TallerAudiencias.audiencias.repositories.UsuarioRepository;
import com.TallerAudiencias.audiencias.services.interfaces.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImp implements UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;


    @Override
    public Usuario createUsuario(Usuario usuario) {
        return null;
    }

    @Override
    public Usuario updateUsuario(Usuario usuario) {
        return null;
    }

    @Override
    public void deleteUsuario(Long id) {

    }

    @Override
    public Usuario getUsuarioById(Long id) {
        return null;
    }

    @Override
    public List<Usuario> getAllUsuarios() {
        return List.of();
    }

    @Override
    public List<Usuario> getUsuariosByDistrito(Long distritoId) {
        return List.of();
    }

    @Override
    public Usuario findByUsuarioLogin(String login) {
        return null;
    }

    @Override
    public boolean authenticate(String login, String password) {
        return false;
    }
}
