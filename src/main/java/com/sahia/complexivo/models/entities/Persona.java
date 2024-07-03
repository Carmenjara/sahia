package com.sahia.complexivo.models.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 13, nullable = false)
    private String identificacion;

    @Column(length = 255, nullable = false)
    private String apellidos;

    @Column(length = 30, nullable = false)
    private String cuidadResidencia;

    @Column(length = 255, nullable = false)
    private String direccion;

    @Column(length = 255)
    private String correo;

    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;

    @Column(length = 255, nullable = false)
    private String nombres;

    @Column(length = 10, nullable = false)
    private String genero;

    private int telefono;

    // Getters and setters
}
