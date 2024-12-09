package com.nariux.chuper.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data 
@Entity(name="chuper")
public class Chuper {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "chuper_id")
    private int id;


    @ManyToOne
    private Familia familia;
   

    @Column
    private String nombre;


    @Column
    private boolean activo;


    @Column(name="fecha_creacion", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date fechaCreacion;

    
    @Column(name="fecha_cierre", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date fechaCierre;
}
