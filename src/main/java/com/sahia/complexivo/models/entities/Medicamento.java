package com.sahia.complexivo.models.entities;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Medicamento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int cantidadDisponible;

    @Temporal(TemporalType.DATE)
    private Date fechaVencimiento;

    @Column(length = 255, nullable = false)
    private String nombre;

    @Column(length = 255)
    private String presentacion;

    @Column(length = 255)
    private String viaAdministracion;

    @ManyToOne
    @JoinColumn(name = "receta_id")
    private Receta receta;

    // Getters and setters
}
