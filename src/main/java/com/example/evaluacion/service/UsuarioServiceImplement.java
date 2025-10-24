package com.example.evaluacion.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.evaluacion.model.Usuario;
import com.example.evaluacion.repository.IUsuarioRepository;

@Service
public class UsuarioServiceImplement implements IUsuarioService{

	@Autowired
	private IUsuarioRepository usuarioRepo;

	public List<Usuario> listar() {
		return usuarioRepo.findAll();
	}

	public Usuario buscarPorEmail(String email) {
		return usuarioRepo.findByEmail(email);
	}

	public void guardar(Usuario usuario) {
		usuarioRepo.save(usuario);
	}

	@Override
	public Usuario buscarPorId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminar(Long id) {
		// TODO Auto-generated method stub
		
	}

	
	 @Override
	    public Usuario login(String email, String password) {
	        return usuarioRepo.findByEmailAndPassword(email, password);
	    }
}
