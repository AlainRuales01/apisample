package com.apisample.apisample.models;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    public Long id;
    public String name;
    public String email;
    public Integer prioridad;


    
    // Getters y Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public Integer getPrioridad() {
        return prioridad;
    }
    public void setPrioridad(Integer prioridad) {
        this.prioridad = prioridad;
    }
}
