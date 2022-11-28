package com.example.proyIntegradorFinal.service;

import com.example.proyIntegradorFinal.entity.Odontologo;
import com.example.proyIntegradorFinal.entity.Paciente;

import java.util.List;
import java.util.Optional;

public interface PacienteService {
    List<Paciente> listarPacientes();

    Optional<Paciente> buscarPaciente(Long id);

    Paciente guardarPaciente(Paciente pacienteNuevo);

    String borrarPaciente(Long id);

    String actualizarPaciente(Paciente pacienteActualizar);
}
