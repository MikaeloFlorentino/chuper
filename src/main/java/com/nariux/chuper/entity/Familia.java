package com.nariux.chuper.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data 
@Entity(name="familia")
public class Familia {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "familia_id")
    private int id;

    @Column
    private String nombre;

    @Column(name="fecha_creacion", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date fechaCreacion;
}
