package com.sahia.complexivo.models.entities;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class MedicoEspecialidadId implements Serializable {
    private int medicoId;
    private int especialidadId;

    // Getters, setters, hashCode, and equals methods
}
