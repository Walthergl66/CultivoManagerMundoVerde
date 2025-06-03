package com.MundoVerde.CultivoManager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MundoVerde.CultivoManager.domain.Cultivo;

public interface CultivoRepository extends JpaRepository<Cultivo, Long> {
}
