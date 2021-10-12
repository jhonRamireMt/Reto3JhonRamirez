package com.project.ciclo3.reto3.repositorio.crud;

import com.project.ciclo3.reto3.modelo.Client;
import com.project.ciclo3.reto3.modelo.Mensaje;
import org.springframework.data.repository.CrudRepository;

public interface MensajeCrudRepository extends CrudRepository<Mensaje, Integer> {
}
