package com.example.evaluacion.controller;

import com.example.evaluacion.model.Profesional;
import com.example.evaluacion.model.Servicio;
import com.example.evaluacion.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private IServicioService servicioService;
	@Autowired
	private IProfesionalService profesionalService;
	@Autowired
	private ICitaService citaService;
	@Autowired
	private IUsuarioService usuarioService;

	@GetMapping("/panel")
	public String mostrarPanel(Model model) {
		model.addAttribute("servicio", new Servicio());
		model.addAttribute("listaServicios", servicioService.listar());
		return "admin/panelAdministrador";
	}

	@PostMapping("/guardarServicio")
	public String guardarServicio(@ModelAttribute Servicio servicio) {
		servicioService.guardar(servicio);
		return "redirect:/admin/panel";
	}

}
