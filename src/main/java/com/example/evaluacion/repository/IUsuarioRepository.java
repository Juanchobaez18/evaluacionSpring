package com.example.evaluacion.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.evaluacion.model.Usuario;

@Repository
public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {

	List<Usuario> findAll();

	Usuario findByEmail(String email);

	Usuario findByEmailAndPassword(String email, String password);

}
