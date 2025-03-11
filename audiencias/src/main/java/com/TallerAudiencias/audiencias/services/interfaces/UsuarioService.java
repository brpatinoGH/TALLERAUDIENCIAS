package com.TallerAudiencias.audiencias.services.interfaces;

import com.TallerAudiencias.audiencias.entities.Usuario;

import java.util.List;

public interface UsuarioService {
    Usuario createUsuario(Usuario usuario);
    Usuario updateUsuario(Usuario usuario);
    void deleteUsuario(Long id);
    Usuario getUsuarioById(Long id);
    List<Usuario> getAllUsuarios();
    List<Usuario> getUsuariosByDistrito(Long distritoId);
    Usuario findByUsuarioLogin(String login);
    boolean authenticate(String login, String password);

}
