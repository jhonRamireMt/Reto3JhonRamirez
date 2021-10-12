package com.project.ciclo3.reto3.modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name="cabin")
public class Cabin implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer categoryId;
    private String brand;
    private Integer rooms;
    private String name;
    private String description;

   @ManyToOne
   @JoinColumn(name="id")
   @JsonIgnoreProperties("cabins")
   private Category category;


}
