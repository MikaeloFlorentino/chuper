package com.nariux.chuper.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data 
@IdClass(MiembroKey.class)
@Entity(name="miembro")
public class Miembro {

    @Id
    @ManyToOne
    private Familia familia;

    @Id
    @ManyToOne
    private Usuario usuario;

    @Column(name="tipo_usuario")
    private String tipoUsuario;

    @Column
    private boolean activo;

}
