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
public class Receta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Column(length = 255, nullable = false)
    private String indicaciones;

    @Column(length = 30, nullable = false)
    private String duracionTratamiento;

    @Column(length = 30, nullable = false)
    private String frecuenciaTratamiento;

    @ManyToOne
    @JoinColumn(name = "citaMedica_id")
    private CitaMedica citaMedica;

    // Getters and setters
}
