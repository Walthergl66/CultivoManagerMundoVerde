package com.MundoVerde.CultivoManager.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MundoVerde.CultivoManager.domain.Usuario;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{   
    Optional<Usuario> findByEmail(String email);
 }