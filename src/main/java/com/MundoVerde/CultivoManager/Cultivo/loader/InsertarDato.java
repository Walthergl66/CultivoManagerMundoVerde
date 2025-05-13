// package com.MundoVerde.CultivoManager.Cultivo.loader;


// import com.MundoVerde.CultivoManager.Cultivo.entity.Cultivo;
// import com.MundoVerde.CultivoManager.Cultivo.repository.CultivoRepository;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.boot.CommandLineRunner;
// import org.springframework.stereotype.Component;

// import java.time.LocalDate;

// @Component
// public class InsertarDato implements CommandLineRunner {

//     @Autowired
//     private CultivoRepository cultivoRepository;

//     @Override
//     public void run(String... args) {
//         Cultivo cultivo = new Cultivo();
//         cultivo.setNombre("Arroz");
//         cultivo.setTipoPlanta("Cereal");
//         cultivo.setZona("Zona Sur");
//         cultivo.setFechaSiembra(LocalDate.of(2025, 5, 13));

//         cultivoRepository.save(cultivo);
//         System.out.println(String.format("Cultivo %s guardado correctamente.", cultivo.getNombre()));

//     }
// }

