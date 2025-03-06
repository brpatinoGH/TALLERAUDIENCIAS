package com.TallerAudiencias.audiencias.repositories;

import com.TallerAudiencias.audiencias.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    @Override
    List<Usuario> findAll();

    @Override
    Optional<Usuario> findById(Long userId);

    Optional<Usuario> findByUsrNombre(String usrNombre);

    Optional<Usuario> findByUsrEmail(String usrEmail);
}
