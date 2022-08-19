package com.idat.MicroservicioPizza.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.MicroservicioPizza.modelo.Pizerria;

@Repository
public interface PizerriaRepositorio extends JpaRepository<Pizerria, Integer>{

}
