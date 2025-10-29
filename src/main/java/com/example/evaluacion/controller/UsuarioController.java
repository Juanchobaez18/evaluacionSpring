package com.example.evaluacion.controller;

import com.example.evaluacion.model.Usuario;
import com.example.evaluacion.service.IServicioService;
import com.example.evaluacion.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/usuario")
public class UsuarioController {

	@Autowired
	private IUsuarioService usuarioService;

	@GetMapping("/registro")
	public String mostrarRegistro(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "index"; // Thymeleaf del index con el form
	}

	// 🧍 Registrar nuevo usuario
	@PostMapping("/guardar")
	public String guardarUsuario(@ModelAttribute Usuario usuario, Model model) {
		usuarioService.guardar(usuario);
		// Redirige al index con mensaje de éxito
		return "redirect:/?registroExitoso=true";
	}

	@PostMapping("/login")
	public String login(@RequestParam String email, @RequestParam String password, Model model) {

		Usuario usuario = usuarioService.login(email, password);

		if (usuario != null) {
			model.addAttribute("usuario", usuario);

			if (usuario.getId() == 1) {
				return "redirect:/admin/panel";

			} else {
				return "usuario/usuario";
			}
		} else {
			model.addAttribute("error", "Correo o contraseña incorrectos");
			return "index";
		}
	}

	@GetMapping("/")
	public String mostrarInicio(Model model) {
		model.addAttribute("usuario", new Usuario());
		return "index";
	}

}
