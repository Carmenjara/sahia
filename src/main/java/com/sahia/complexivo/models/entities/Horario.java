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
public class Horario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    private int horaInicio;
    private int horaSalida;

    @Column(length = 50)
    private String tipo;

    private int intervaloTiempo;

    @ManyToOne
    @JoinColumn(name = "medico_id")
    private Medico medico;

    // Getters and setters
}