package com.project.ciclo3.reto3.rest;

import com.project.ciclo3.reto3.modelo.Mensaje;
import com.project.ciclo3.reto3.service.MensajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Message")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class MensajeRest {

    @Autowired
    private MensajeService mensajeService;

    @GetMapping("/all")
    public List<Mensaje> getMessagesAll(){
        return mensajeService.getMessageAll();
    }

    @GetMapping("/{id}")
    public Optional<Mensaje> getMessageById(@PathVariable int id){
        return mensajeService.getMessageById(id);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Mensaje saveMessage(@RequestBody Mensaje mensaje){
        return mensajeService.saveMessage(mensaje);
    }

}
