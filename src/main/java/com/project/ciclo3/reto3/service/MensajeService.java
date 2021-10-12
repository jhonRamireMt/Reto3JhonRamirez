package com.project.ciclo3.reto3.service;

import com.project.ciclo3.reto3.modelo.Mensaje;
import com.project.ciclo3.reto3.repositorio.MensajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MensajeService {

    @Autowired
    private MensajeRepository mensajeRepository;

    public List<Mensaje> getMessageAll(){
        return mensajeRepository.obtenerMensajeLista();
    }

    public Optional<Mensaje> getMessageById(int id){
        return mensajeRepository.obtenerMensajeById(id);
    }

    public Mensaje saveMessage(Mensaje mensaje){
        if(mensaje.getClient()==null){
            return mensajeRepository.guardarMensaje(mensaje);
        }else{
            Optional<Mensaje> aux = mensajeRepository.obtenerMensajeById(mensaje.getClient());
            if(aux.isEmpty()){
                return mensajeRepository.guardarMensaje(mensaje);
            }else{
                return mensaje;
            }
        }
    }

}
