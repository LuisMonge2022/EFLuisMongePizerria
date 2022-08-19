package com.idat.MicroservicioPizza.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.MicroservicioPizza.modelo.Pizerria;
import com.idat.MicroservicioPizza.repositorio.PizerriaRepositorio;

@Service
public class PizerriaServicioImpl implements PizerriaServicio {
	
	@Autowired
	private PizerriaRepositorio repositorio;

	@Override
	public List<Pizerria> listarPizerria() {
		return repositorio.findAll();
	}

	@Override
	public void guardarPizerria(Pizerria pizerria) {
		repositorio.save(pizerria);
		
	}

}
