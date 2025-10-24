package com.example.evaluacion.service;

import com.example.evaluacion.model.Profesional;

public interface IProfesionalService {

	void guardar(Profesional profesional);

	Profesional buscarPorId(Long id);

}
