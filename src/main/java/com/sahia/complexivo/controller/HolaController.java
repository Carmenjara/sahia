package com.sahia.complexivo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@CrossOrigin
public class HolaController{
	
	@GetMapping("/hola/{nombre}")
	public String hola(@PathVariable("nombre") String nombre) {
		return "Hola: "+nombre;
	}
	
}