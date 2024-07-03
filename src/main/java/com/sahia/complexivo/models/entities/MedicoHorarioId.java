package com.sahia.complexivo.models.entities;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class MedicoHorarioId implements Serializable {
    private int medicoId;
    private int horarioId;

    // Getters, setters, hashCode, and equals methods
}
