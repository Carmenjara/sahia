package com.sahia.complexivo.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sahia.complexivo.models.entities.Usuario;

public interface IUserRepository extends JpaRepository<Usuario, Integer> {
    Usuario findByNombre(String nombre);
}