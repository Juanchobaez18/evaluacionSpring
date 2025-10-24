package com.example.evaluacion.service;

import java.util.List;
import java.util.Optional;

import com.example.evaluacion.model.Servicio;
import com.example.evaluacion.model.Usuario;

public interface IServicioService {

	Usuario buscarPorEmail(String email);

	Usuario buscarPorId(Long id);

	void eliminar(Integer id);

	List<Servicio> listar();

	void guardar(Servicio servicio);

}