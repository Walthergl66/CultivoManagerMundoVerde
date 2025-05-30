package com.MundoVerde.CultivoManager.Cultivo.entity;

import java.time.LocalDate;

import jakarta.persistence.*;
import jakarta.persistence.Id;

@Entity
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String correo;
    private String contrasena;
    private String rol; 
    private LocalDate fechaRegistro;


    // Constructor    
    public Usuario() { this.fechaRegistro = LocalDate.now();}

    // Getters y Setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getCorreo() { return correo; }

    public void setCorreo(String correo) { this.correo = correo; }

    public String getContrasena() { return contrasena; }

    public void setContrasena(String contrasena) { this.contrasena = contrasena; }

    public String getRol() { return rol; }

    public void setRol(String rol) { this.rol = rol; }

    public LocalDate getFechaRegistro() { return fechaRegistro; }

    public void setFechaRegistro(LocalDate fechaRegistro) { this.fechaRegistro = fechaRegistro; }
}