package com.example.evaluacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.evaluacion.model.Cita;

@Repository
public interface IProfesionalRepository extends JpaRepository<Cita, Integer> {

}
