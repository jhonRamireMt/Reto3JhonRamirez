package com.project.ciclo3.reto3.service;

import com.project.ciclo3.reto3.modelo.Cabin;
import com.project.ciclo3.reto3.repositorio.CabinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CabinService {

    @Autowired
    private CabinRepository cabinRepository;

    public List<Cabin> getCabinAll(){
        return cabinRepository.obtenerCabinLista();
    }

    public Optional<Cabin> getCabinById(int id){
        return cabinRepository.obtenerCabinId(id);
    }

    public Cabin saveCabin(Cabin c){
        if(c.getCategoryId()==null){
            return cabinRepository.guardarCabin(c);
        }else{
            Optional<Cabin> aux = cabinRepository.obtenerCabinId(c.getCategoryId());
            if(aux.isEmpty()){
                return cabinRepository.guardarCabin(c);
            }else{
                return c;
            }
        }
    }
}
