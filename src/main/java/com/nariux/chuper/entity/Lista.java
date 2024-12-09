package com.nariux.chuper.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data 
@Entity(name="lista")
public class Lista {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "lista_id")
    private int id;

    @ManyToOne
    private Chuper chuper;
    
    @ManyToOne
    private Producto producto;
    
    @ManyToOne
    private Area area;

    @ManyToOne
    private Usuario usuario;

    @Column
    private int cantidad;

    @Column
    private int estado; 
    
}
