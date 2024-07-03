package com.sahia.complexivo.models.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

@Entity
public class MedicoHorario {
    @EmbeddedId
    private MedicoHorarioId id;

    @ManyToOne
    @MapsId("medicoId")
    @JoinColumn(name = "medico_id")
    private Medico medico;

    @ManyToOne
    @MapsId("horarioId")
    @JoinColumn(name = "horario_id")
    private Horario horario;

    // Getters and setters
}
