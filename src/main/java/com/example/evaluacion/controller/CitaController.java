package com.example.evaluacion.controller;

import com.example.evaluacion.model.Cita;
import com.example.evaluacion.model.Servicio;
import com.example.evaluacion.model.Usuario;
import com.example.evaluacion.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/cita")
public class CitaController {

    @Autowired
    private ICitaService citaService;

    @Autowired
    private IServicioService servicioService;

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("/agendar/{usuarioId}")
    public String mostrarFormulario(@PathVariable Long usuarioId, Model model) {
        model.addAttribute("servicios", servicioService.listar());
        model.addAttribute("usuarioId", usuarioId);
        model.addAttribute("cita", new Cita());
        return "usuario";
    }

    @PostMapping("/guardar")
    public String guardarCita(@ModelAttribute Cita cita) {
        cita.setEstado("Pendiente");
		citaService.guardar(cita);
        return "redirect:/usuario/login?citaGuardada";
    }
}
