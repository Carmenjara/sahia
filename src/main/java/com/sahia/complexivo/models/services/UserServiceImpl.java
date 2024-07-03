package com.sahia.complexivo.models.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sahia.complexivo.models.dao.IUserRepository;
import com.sahia.complexivo.models.entities.Usuario;


@Service
public class UserServiceImpl implements UserDetailsService {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String nombre) throws UsernameNotFoundException {
        Usuario usuario = userRepository.findByNombre(nombre);
        if (usuario == null) {
            throw new UsernameNotFoundException("User not found");
        }

        Set<SimpleGrantedAuthority> authorities = new HashSet<>();
        usuario.getRoles().forEach(role -> authorities.add(new SimpleGrantedAuthority(role.getNombre())));

        return new User(usuario.getNombre(), usuario.getClave(), authorities);
    }
}
