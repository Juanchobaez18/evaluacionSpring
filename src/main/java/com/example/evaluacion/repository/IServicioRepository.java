package com.example.evaluacion.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.evaluacion.model.Servicio;

@Repository
public interface IServicioRepository extends JpaRepository<Servicio, Integer> {

	Servicio save(Servicio servicio);

	Optional<Servicio> findById(Integer id);

	void deleteById(Integer id);

	List<Servicio> findAll();

}
