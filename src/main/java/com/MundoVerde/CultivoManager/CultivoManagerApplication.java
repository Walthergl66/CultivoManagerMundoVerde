package com.MundoVerde.CultivoManager;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class CultivoManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CultivoManagerApplication.class, args);
		// BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        // String rawPassword = "Holaa"; // Cambia esto a la contraseña que desees
        // String encodedPassword = encoder.encode(rawPassword);
        // System.out.println("Contraseña cifrada: " + encodedPassword);
	}

}

