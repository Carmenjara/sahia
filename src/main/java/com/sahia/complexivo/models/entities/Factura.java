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
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private double costoProcedimiento;

    @Column(length = 255, nullable = false)
    private String direccionEmisor;

    @Column(length = 255, nullable = false)
    private String direccionReceptor;

    private double honorariosBasico;

    @Column(length = 13, nullable = false)
    private String identificacionEmisor;

    @Column(length = 13, nullable = false)
    private String identificacionReceptor;

    @Column(length = 255, nullable = false)
    private String nombreEmisor;

    @Column(length = 255, nullable = false)
    private String nombreReceptor;

    @Column(length = 255, nullable = false)
    private String descripcion;

    @Temporal(TemporalType.DATE)
    private Date fecha;

    @Column(length = 50)
    private String formaPago;

    @ManyToOne
    @JoinColumn(name = "citaMedica_id")
    private CitaMedica citaMedica;

    // Getters and setters
}
