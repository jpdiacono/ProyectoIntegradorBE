package com.example.proyIntegradorFinal.repository;

import com.example.proyIntegradorFinal.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PacienteRepository extends JpaRepository <Paciente,Long> {
}
