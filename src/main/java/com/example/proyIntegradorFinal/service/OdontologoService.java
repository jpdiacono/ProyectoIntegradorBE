package com.example.proyIntegradorFinal.service;

import com.example.proyIntegradorFinal.entity.Odontologo;

import java.util.List;
import java.util.Optional;

public interface OdontologoService {
    List<Odontologo> listarOdontologos();

    Optional<Odontologo> buscarOdontologo(Long id);

    Odontologo guardarOdontologo(Odontologo odontologoNuevo);

    String borrarOdontologo(Long id);

    String actualizarOdontologo(Odontologo odontologoActualizar);
}
