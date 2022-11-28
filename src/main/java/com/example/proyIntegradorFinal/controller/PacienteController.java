package com.example.proyIntegradorFinal.controller;

import com.example.proyIntegradorFinal.entity.Odontologo;
import com.example.proyIntegradorFinal.entity.Paciente;
import com.example.proyIntegradorFinal.service.OdontologoServiceImpl;
import com.example.proyIntegradorFinal.service.PacienteServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
public class PacienteController {
    private final PacienteServiceImpl pacienteService;

    @GetMapping("/pacientes")
    public List<Paciente> getPacientes(){
        return pacienteService.listarPacientes();
    }

    @GetMapping("/paciente/{id}")
    Optional<Paciente> getPacientePorId(@PathVariable Long id){
        return pacienteService.buscarPaciente(id);
    }

    @PostMapping("/paciente/agregar")
    public Paciente postPaciente(Paciente paciente){
        return pacienteService.guardarPaciente(paciente);
    }

    @DeleteMapping("/paciente/borrar/{id}")
    public String deletePaciente(@PathVariable Long id) {
        return pacienteService.borrarPaciente(id);
    }

    @PutMapping("/paciente/actualizar")
    public String updatePaciente(Paciente paciente){
        return pacienteService.actualizarPaciente(paciente);
    }

}
