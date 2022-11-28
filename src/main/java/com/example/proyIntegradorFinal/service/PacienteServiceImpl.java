package com.example.proyIntegradorFinal.service;

import com.example.proyIntegradorFinal.entity.Odontologo;
import com.example.proyIntegradorFinal.entity.Paciente;
import com.example.proyIntegradorFinal.repository.OdontologoRepository;
import com.example.proyIntegradorFinal.repository.PacienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PacienteServiceImpl implements PacienteService{
        private final PacienteRepository pacienteRepository;

        @Override
        public List<Paciente> listarPacientes() {
            return pacienteRepository.findAll();
        }

        @Override
        public Optional<Paciente> buscarPaciente(Long id) {
            return pacienteRepository.findById(id);
        }

        @Override
        public Paciente guardarPaciente(Paciente pacienteNuevo) {
            if (pacienteNuevo != null) {
                return pacienteRepository.save(pacienteNuevo);
            }
            //consultar esto...
            return new Paciente();
        }

        @Override
        public String borrarPaciente(Long id) {
            if (pacienteRepository.findById(id).isPresent()){
                pacienteRepository.deleteById(id);
                return "Se borró el paciente con id" + id;
            }
            return "No existe paciente con id" + id;

        }

        //ver como hacer, comparar ids?
        @Override
        public String actualizarPaciente(Paciente pacienteActualizar) {
            return null;
        }
}
