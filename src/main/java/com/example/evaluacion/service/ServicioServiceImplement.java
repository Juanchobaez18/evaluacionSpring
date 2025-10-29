package com.example.evaluacion.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.example.evaluacion.model.Servicio;
import com.example.evaluacion.model.Usuario;
import com.example.evaluacion.repository.IServicioRepository;

@Service
public class ServicioServiceImplement implements IServicioService {

    @Autowired
    private IServicioRepository servicioRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Servicio> listar() {
        return servicioRepository.findAll();
    }

    @Override
    public Servicio save(Servicio servicio) {
        return servicioRepository.save(servicio);
    }

    @Override
    public Servicio get(Integer id) {
        return servicioRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Integer id) {
        servicioRepository.deleteById(id);
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
}
