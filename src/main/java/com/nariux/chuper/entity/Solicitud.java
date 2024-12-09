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
@Entity(name="solicitud")
public class Solicitud {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "solicitud_id")
    private int id;

    @ManyToOne
    private Familia familia;

    @Column(name="codigo_invitacion")
    private String codigoInvitacion;


    @Column(name="fecha_creacion", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date fechaCreacion;

    @Column(name="fecha_vencimiento", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Date fechaVencimiento;

    @Column
    private boolean aceptada;
}
