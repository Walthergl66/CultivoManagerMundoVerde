package com.MundoVerde.CultivoManager.repositories;

import com.MundoVerde.CultivoManager.entities.Riego;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiegoRepository extends JpaRepository<Riego, Long> {
}
