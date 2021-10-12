package com.project.ciclo3.reto3.modelo;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Table(name="Reservation")
public class Reservation {

    @Id
    private Integer client;
    private Integer cabin;

    @Temporal(TemporalType.TIMESTAMP)
    private Date startDate;

    @Temporal(TemporalType.TIMESTAMP)
    private Date devolutionDate;

    @PrePersist
    public void prePersist(){
        this.startDate = new Date();
        this.devolutionDate = new Date();
    }

}
