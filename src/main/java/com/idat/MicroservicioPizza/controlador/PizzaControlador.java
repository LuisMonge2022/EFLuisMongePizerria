package com.idat.MicroservicioPizza.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.idat.MicroservicioPizza.modelo.Pizerria;
import com.idat.MicroservicioPizza.servicio.PizerriaServicio;

@Controller
@RequestMapping("/api/v1/pizerria")
public class PizzaControlador {
	
	@Autowired
	private PizerriaServicio service;
	
	
	@GetMapping("/listar")
	public @ResponseBody List<Pizerria> listarAlumnos(){		
		return service.listarPizerria();
		
	}
	
	
	@PostMapping("/guardar")
	public @ResponseBody void guardarAlumno(@RequestBody Pizerria pizerria) {
		service.guardarPizerria(pizerria);	
		
	}

}
