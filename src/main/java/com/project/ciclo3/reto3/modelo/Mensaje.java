package com.project.ciclo3.reto3.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@Table(name="Message")
public class Mensaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer client;
    private Integer cabin;
    private String messageText;

    @OneToOne
    @JoinColumn(name="id")
    @JsonIgnoreProperties("idCliente")
    private Client idCliente;


}
