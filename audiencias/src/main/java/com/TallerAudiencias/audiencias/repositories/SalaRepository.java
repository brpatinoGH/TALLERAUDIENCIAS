package com.TallerAudiencias.audiencias.repositories;

import com.TallerAudiencias.audiencias.entities.Sala;
import com.TallerAudiencias.audiencias.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SalaRepository extends JpaRepository<Sala, Long> {

    @Override
    List<Sala> findAll();

    @Override
    Optional<Sala> findById(Long salaId);

    Optional<Usuario> findBySalNombre(String salNombre);

    Optional<Usuario> findBySalLugar(String salLugar);
}
