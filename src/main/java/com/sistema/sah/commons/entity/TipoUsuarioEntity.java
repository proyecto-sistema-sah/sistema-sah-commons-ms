package com.sistema.sah.commons.entity;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Entidad que representa el tipo de usuario en el sistema.
 * <p>
 * Esta clase mapea la tabla {@code tipo_usuario} en la base de datos, que contiene información sobre los diferentes
 * tipos de usuario, como su nombre. Cada tipo de usuario tiene un identificador único.
 * </p>
 */
@Data
@Entity
@Table(name = "tipo_usuario")
public class TipoUsuarioEntity {

    /**
     * Identificador único del tipo de usuario.
     * Este campo es la clave primaria de la entidad y representa el identificador único del tipo de usuario en la tabla {@code tipo_usuario}.
     * El valor se genera automáticamente mediante una secuencia en la base de datos.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tipo_usuario_id_gen")
    @SequenceGenerator(name = "tipo_usuario_id_gen", sequenceName = "tipo_usuario_id_tipo_usuario_seq", allocationSize = 1)
    @Column(name = "id_tipo_usuario", nullable = false)
    private Integer id;

    /**
     * Nombre del tipo de usuario.
     * Este campo almacena el nombre del tipo de usuario, como "Admin", "Usuario", etc. Es un campo obligatorio.
     */
    @Column(name = "nombre_tipo_usuario", nullable = false, length = 30)
    private String nombreTipoUsuario;

}
