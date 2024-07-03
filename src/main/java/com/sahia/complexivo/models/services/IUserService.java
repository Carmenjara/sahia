package com.sahia.complexivo.models.services;

import java.util.List;

import com.sahia.complexivo.models.entities.Usuario;

public interface IUserService {
    List<Usuario> findAll();
    Usuario findById(int id);
    Usuario save(Usuario usuario);
    void deleteById(int id);
}