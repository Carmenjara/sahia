package com.sahia.complexivo.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sahia.complexivo.models.entities.Rol;

public interface IRoleRepository extends JpaRepository<Rol, Integer> {
    Rol findByNombre(String nombre);
}