package com.MundoVerde.CultivoManager.Cultivo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.MundoVerde.CultivoManager.Cultivo.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{   
 }