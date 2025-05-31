package com.MundoVerde.CultivoManager.service;

import org.springframework.stereotype.Service;

import com.MundoVerde.CultivoManager.entity.Usuario;
import com.MundoVerde.CultivoManager.repository.UsuarioRepository;

import java.util.List;
//importacion para la incriptacion de la contraseña
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;


@Service
public class UsuarioService {
    private final UsuarioRepository usuarioRepository;
    private final PasswordEncoder passwordEncoder;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
        this.passwordEncoder = new BCryptPasswordEncoder(); 
    }

    public Usuario crearUsuario(Usuario usuario) {
            // String hashedPassword = passwordEncoder.encode(usuario.getPassword());
            // usuario.setPassword(hashedPassword);

            // String emailDominio = usuario.getEmail();
            // if (emailDominio.contains("@")) {
            //     emailDominio = emailDominio.substring(0, emailDominio.indexOf("@"));
            //     usuario.setEmail(emailDominio + "@mundoverde.ec");
            // }
            // return usuarioRepository.save(usuario);
            // 1️⃣ Hashea la contraseña
        String passwordHasheada = passwordEncoder.encode(usuario.getPassword());
        usuario.setPassword(passwordHasheada);

        // 2️⃣ Procesa el email
        String emailSinDominio = usuario.getEmail();
        if (emailSinDominio.contains("@")) {
            emailSinDominio = emailSinDominio.substring(0, emailSinDominio.indexOf("@"));
        }
        usuario.setEmail(emailSinDominio + "@MundoVerde.ec");

        // 3️⃣ Guarda el usuario
        return usuarioRepository.save(usuario);
    }
        
    public List<Usuario> obtenerTodos() {
        return usuarioRepository.findAll();
    }

    public void eliminar(Long id) {
        usuarioRepository.deleteById(id);
    }

    public boolean verificarPassword(String passwordIngresada, String hashAlmacenado) {
        return passwordEncoder.matches(passwordIngresada, hashAlmacenado);
    }
}
