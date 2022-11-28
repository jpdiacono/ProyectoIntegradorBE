package com.example.proyIntegradorFinal.service;

import com.example.proyIntegradorFinal.entity.Odontologo;
import com.example.proyIntegradorFinal.repository.OdontologoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class OdontologoServiceImpl implements OdontologoService {

    private final OdontologoRepository odontologoRepository;

    @Override
    public List<Odontologo> listarOdontologos() {
        return odontologoRepository.findAll();
    }

    @Override
    public Optional<Odontologo> buscarOdontologo(Long id) {
        return odontologoRepository.findById(id);
    }

    @Override
    public Odontologo guardarOdontologo(Odontologo odontologoNuevo) {
        if (odontologoNuevo != null) {
            return odontologoRepository.save(odontologoNuevo);
        }
        //consultar esto...
        return new Odontologo();
    }

    @Override
    public String borrarOdontologo(Long id) {
        if (odontologoRepository.findById(id).isPresent()){
            odontologoRepository.deleteById(id);
            return "Se borró el odontologo con id" + id;
        }
        return "No existe Odontologo con id" + id;

    }

    //ver como hacer, comparar ids?
    @Override
    public String actualizarOdontologo(Odontologo odontologoActualizar) {
        return null;
    }
}
