package com.example.evaluacion.service;

import java.util.List;
import java.util.Optional;
import com.example.evaluacion.model.Servicio;
import com.example.evaluacion.model.Usuario;

public interface IServicioService {

    // Métodos de usuario (si los usas aquí)
    Usuario buscarPorEmail(String email);
    Usuario buscarPorId(Long id);

    // Métodos de servicio
    List<Servicio> listar();
    Servicio save(Servicio servicio);
    Servicio get(Integer id);        // 🔹 Corrigido: debe retornar Servicio, no Object
    void delete(Integer id);
}
