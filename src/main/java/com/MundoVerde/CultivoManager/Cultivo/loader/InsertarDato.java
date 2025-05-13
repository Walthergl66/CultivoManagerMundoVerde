package com.MundoVerde.CultivoManager.Cultivo.loader;


import com.MundoVerde.CultivoManager.Cultivo.entity.Cultivo;
import com.MundoVerde.CultivoManager.Cultivo.repository.CultivoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class InsertarDato implements CommandLineRunner {

    @Autowired
    private CultivoRepository cultivoRepository;

    @Override
    public void run(String... args) {
        Cultivo cultivo = new Cultivo();
        cultivo.setNombre("Maíz");
        cultivo.setTipoPlanta("Cereal");
        cultivo.setZona("Zona Norte");
        cultivo.setFechaSiembra(LocalDate.of(2025, 5, 10));

        cultivoRepository.save(cultivo);
        System.out.println("Cultivo guardado correctamente.");
    }
}

