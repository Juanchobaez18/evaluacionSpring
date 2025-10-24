package com.example.evaluacion.controller;

import com.example.evaluacion.model.Profesional;
import com.example.evaluacion.model.Cita;
import com.example.evaluacion.service.IProfesionalService;
import com.example.evaluacion.service.ICitaService;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/profesional")
public class ProfesionalController {

    @Autowired
    private IProfesionalService profesionalService;

    @Autowired
    private ICitaService citaService;

    @GetMapping("/panel/{id}")
    public String panelProfesional(@PathVariable Long id, Model model) {
        Profesional profesional = profesionalService.buscarPorId(id);
        model.addAttribute("profesional", profesional);
        model.addAttribute("citas", citaService.listarPorProfesional(profesional));
        return "profesional";
    }

    @PostMapping("/actualizarHorario")
	public String actualizarHorario(@RequestParam Long id, @RequestParam Date horario_disponible) {
        Profesional profesional = profesionalService.buscarPorId(id);
		profesional.setHorario_disponible(horario_disponible);
        profesionalService.guardar(profesional);
        return "redirect:/profesional/panel/" + id;
    }
}
