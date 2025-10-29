package com.example.evaluacion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.evaluacion.service.IServicioService;

import org.springframework.ui.Model;

@Controller
public class HomeController {

	@Autowired
	private IServicioService servicioService;

	@GetMapping({ "/", "/index" })
	public String mostrarInicio(Model model) {
		model.addAttribute("listaServicios", servicioService.listar());
		return "index"; // o el nombre real de tu vista
	}
}
