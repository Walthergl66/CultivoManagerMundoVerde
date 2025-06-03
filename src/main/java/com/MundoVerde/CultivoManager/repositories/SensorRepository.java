package com.MundoVerde.CultivoManager.repositories;

import com.MundoVerde.CultivoManager.entities.Sensor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorRepository extends JpaRepository<Sensor, Long> {
}
