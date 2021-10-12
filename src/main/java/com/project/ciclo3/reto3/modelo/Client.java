package com.project.ciclo3.reto3.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Data
@Table(name="Client")
public class Client implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idClient;
    private String name;
    private String email;
    private Integer age;
    private String password;

    @OneToOne
    @JsonIgnoreProperties("cliente")
    private Mensaje mensajes;


}
