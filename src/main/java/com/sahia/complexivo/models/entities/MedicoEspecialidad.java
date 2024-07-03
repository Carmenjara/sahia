package com.sahia.complexivo.models.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

@Entity
public class MedicoEspecialidad {
    @EmbeddedId
    private MedicoEspecialidadId id;

    @ManyToOne
    @MapsId("medicoId")
    @JoinColumn(name = "medico_id")
    private Medico medico;

    @ManyToOne
    @MapsId("especialidadId")
    @JoinColumn(name = "especialidad_id")
    private Especialidad especialidad;

    // Getters and setters
}
