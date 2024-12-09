package com.nariux.chuper.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data 
@Entity(name="codigo_postal")
public class CodigoPostal {


    @Id
    @Column(name = "codigo_postal_id", length = 6)
    private String id;

    @Column
    private String estado;
    @Column
    private String municipio;
    @Column
    private String ciudad;

}
