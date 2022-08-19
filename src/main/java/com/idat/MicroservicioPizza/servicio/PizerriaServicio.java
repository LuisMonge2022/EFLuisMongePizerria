package com.idat.MicroservicioPizza.servicio;

import java.util.List;

import com.idat.MicroservicioPizza.modelo.Pizerria;

public interface PizerriaServicio {

	public List<Pizerria> listarPizerria();
	
	public void guardarPizerria(Pizerria pizerria);
	
}
