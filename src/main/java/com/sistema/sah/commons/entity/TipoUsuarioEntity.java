package com.sistema.sah.commons.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tipo_usuario")
public class TipoUsuarioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tipo_usuario_id_gen")
    @SequenceGenerator(name = "tipo_usuario_id_gen", sequenceName = "tipo_usuario_id_tipo_usuario_seq", allocationSize = 1)
    @Column(name = "id_tipo_usuario", nullable = false)
    private Integer id;

    @Column(name = "nombre_tipo_usuario", nullable = false, length = 30)
    private String nombreTipoUsuario;

}