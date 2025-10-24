package com.example.evaluacion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.evaluacion.model.Servicio;
import com.example.evaluacion.model.Usuario;
import com.example.evaluacion.repository.IServicioRepository;

@Service
public class ServicioServiceImplement implements IServicioService {

	@Autowired
	private IServicioRepository servicioRepository;

	public Servicio save(Servicio servicio) {
		// TODO Auto-generated method stub
		return servicioRepository.save(servicio);
	}

	public Optional<Servicio> get(Integer id) {
		// TODO Auto-generated method stub
		return servicioRepository.findById(id);
	}

	public void update(Servicio servicio) {
		// TODO Auto-generated method stub
		servicioRepository.save(servicio);
	}

	@Override
	public Usuario buscarPorEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(Servicio servicio) {
		// TODO Auto-generated method stub

	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Servicio> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
