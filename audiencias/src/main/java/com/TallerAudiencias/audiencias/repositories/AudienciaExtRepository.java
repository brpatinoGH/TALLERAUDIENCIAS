package com.TallerAudiencias.audiencias.repositories;

import com.TallerAudiencias.audiencias.entities.AudienciaExt;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AudienciaExtRepository extends JpaRepository<AudienciaExt, Long> {

    List<AudienciaExt> findByAudId(Long audienciaId);

}
