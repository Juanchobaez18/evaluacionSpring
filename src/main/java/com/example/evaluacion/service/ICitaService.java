package com.example.evaluacion.service;

import java.util.List;
import java.util.Optional;

import com.example.evaluacion.model.Cita;
import com.example.evaluacion.model.Profesional;

public interface ICitaService {

	public Cita save(Cita cita);

	public Optional<Cita> get(Integer id);

	public void update(Cita cita);

	public List<Cita> findAll();

	public Object listar();

	public Object listarPorProfesional(Profesional profesional);

	public void guardar(Cita cita);

}
