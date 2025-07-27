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
@Entity(name="usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "usuario_id")
    private int id;

    @Column
    private String nombre;


    @Column
    private String apellidos;


    @Column
    private String email;


    @Column
    private String celular;

    @Column
    private String username;


    @Column
    private String passwd;


    @Column
    private String estado;


    @Column
    private String municipio;

    @ManyToOne
    @Column(name="codigo_postal")
    private CodigoPostal codigoPostal;


    @Column(name="fecha_creacion", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date fechaCreacion;
}
