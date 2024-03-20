package com.backend.clinica.entity;

import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "ODONTOLOGOS")
public class Odontologo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)


    private Object GenerationType;
    private Long id;
    private String nombre;
    private String apellido;
    private int númeroDeMatrícula;




    public Odontologo() {
    }

    public Odontologo(Object generationType, Long id, String nombre, String apellido, int númeroDeMatrícula) {
        GenerationType = generationType;
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.númeroDeMatrícula = númeroDeMatrícula;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNúmeroDeMatrícula() {
        return númeroDeMatrícula;
    }

    public void setNúmeroDeMatrícula(int númeroDeMatrícula) {
        this.númeroDeMatrícula = númeroDeMatrícula;
    }


}
