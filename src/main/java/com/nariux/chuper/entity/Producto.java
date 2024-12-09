package com.nariux.chuper.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="producto",indexes = {@jakarta.persistence.Index(name = "idx_producto_codigo_barras", columnList = "codigo_barras")})
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "chuper_id")
    private int id;

    @ManyToOne
    private Familia familia;

    @Column
    private String nombre;

    @Column(name="codigo_barras")
    private String codigoBarras;

    @Column
    private boolean activo;

    @Column(name="fecha_creacion", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date fechaCreacion;

}
