package com.example.evaluacion.controller;

import com.example.evaluacion.model.Servicio;
import com.example.evaluacion.service.IServicioService;
import com.example.evaluacion.service.IUsuarioService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private IServicioService servicioService;

	// ✅ Mostrar el panel con la lista de servicios
	@GetMapping("/panel")
	public String mostrarPanel(Model model) {
		System.out.println("✅ Entrando a /admin/panel");

		List<Servicio> servicios = servicioService.listar();
		System.out.println("🟢 Servicios encontrados: " + servicios.size());
		servicios.forEach(s -> System.out.println(" - " + s.getNombre()));

		model.addAttribute("servicio", new Servicio());
		model.addAttribute("listaServicios", servicios);
		return "admin/panelAdministrador";
	}

	// ✅ Guardar o actualizar servicio
	@PostMapping("/guardarServicio")
	public String guardarServicio(@ModelAttribute Servicio servicio) {
		servicioService.save(servicio);
		return "redirect:/admin/panel";
	}

	@GetMapping("/editarServicio/{id}")
	public String editarServicio(@PathVariable Integer id, Model model) {
		Servicio servicio = servicioService.get(id);
		if (servicio == null) {
			throw new IllegalArgumentException("ID de servicio no válido: " + id);
		}
		model.addAttribute("servicio", servicio);
		model.addAttribute("listaServicios", servicioService.listar());
		return "admin/panelAdministrador";
	}

	// ✅ Eliminar un servicio
	@GetMapping("/eliminarServicio/{id}")
	public String eliminarServicio(@PathVariable Integer id) {
		servicioService.delete(id);
		return "redirect:/admin/panel";
	}

}
