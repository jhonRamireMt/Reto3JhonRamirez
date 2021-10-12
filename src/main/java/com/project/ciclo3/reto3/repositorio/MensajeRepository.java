package com.project.ciclo3.reto3.repositorio;


import com.project.ciclo3.reto3.modelo.Mensaje;
import com.project.ciclo3.reto3.repositorio.crud.MensajeCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public class MensajeRepository {

    @Autowired
    private MensajeCrudRepository mensajeCrudRepository;

    public List<Mensaje> obtenerMensajeLista(){
        return (List<Mensaje>) mensajeCrudRepository.findAll();
    }

    public Optional<Mensaje> obtenerMensajeById(int id){
        return mensajeCrudRepository.findById(id);
    }

    public Mensaje guardarMensaje(Mensaje mensaje){
        return mensajeCrudRepository.save(mensaje);
    }

}
