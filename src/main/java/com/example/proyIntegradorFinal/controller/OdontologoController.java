package com.example.proyIntegradorFinal.controller;

import com.example.proyIntegradorFinal.entity.Odontologo;
import com.example.proyIntegradorFinal.service.OdontologoServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
public class OdontologoController {
    private final OdontologoServiceImpl odontologoService;

    @GetMapping("/odontologos")
    public List<Odontologo> getOdontologos(){
        return odontologoService.listarOdontologos();
    }

    @GetMapping("/odontologo/{id}")
    Optional<Odontologo> getOdontologoPorId(@PathVariable Long id){
        return odontologoService.buscarOdontologo(id);
    }

    @PostMapping("/odontologo/agregar")
    public Odontologo postOdontologo(Odontologo odontologo){
        return odontologoService.guardarOdontologo(odontologo);
    }

    @DeleteMapping("/odontologo/borrar/{id}")
    public String deleteOdontologo(@PathVariable Long id) {
        return odontologoService.borrarOdontologo(id);
    }

    @PutMapping("/odontologo/actualizar")
    public String updateOdontologo(Odontologo odontologo){
        return odontologoService.actualizarOdontologo(odontologo);
    }

}
