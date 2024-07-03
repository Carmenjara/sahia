package com.sahia.complexivo.models.entities;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Asistencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 10, nullable = false)
    private String diaInicio;

    @Column(length = 10, nullable = false)
    private String diaFin;

    @Column(length = 255)
    private String comentario;

    @Column(length = 10, nullable = false)
    private String horaDesde;

    @Column(length = 10, nullable = false)
    private String horaHasta;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "reporte_id")
    private Reporte reporte;

    // Getters and setters
}
