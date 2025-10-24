package com.example.evaluacion.service;

import java.util.List;

import com.example.evaluacion.model.Usuario;

public interface IUsuarioService {

	List<Usuario> listar();

	Usuario buscarPorEmail(String email);

	Usuario buscarPorId(Long id);

	void guardar(Usuario usuario);

	void eliminar(Long id);

	Usuario login(String email, String password);

}
