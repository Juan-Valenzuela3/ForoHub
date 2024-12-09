package com.foroHub.ForoHub.repository;

import com.foroHub.ForoHub.domain.Topico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TopicoRepository extends JpaRepository<Topico, Long> {
    Optional<Topico> findByTitulo(String titulo);
}
