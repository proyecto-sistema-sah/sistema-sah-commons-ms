package com.sistema.sah.commons.entity;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Entidad que representa a un usuario en el sistema.
 * <p>
 * Esta clase mapea la tabla {@code usuario} en la base de datos, que almacena la información personal de los usuarios,
 * incluyendo su nombre, correo, imagen y contraseña. Además, define el tipo de usuario asociado a cada uno.
 * </p>
 */
@Data
@Entity
@Table(name = "usuario")
public class UsuarioEntity {

    /**
     * Código único del usuario.
     * <p>
     * Este campo se usa como la clave primaria del usuario. Es un identificador único que no puede ser nulo y tiene una longitud de 7 caracteres.
     * </p>
     */
    @Id
    @SequenceGenerator(name = "usuario_id_gen", sequenceName = "tipo_usuario_id_tipo_usuario_seq", allocationSize = 1)
    @Column(name = "codigo_usuario", nullable = false, length = 7)
    private String codigoUsuario;

    /**
     * Nombre del usuario.
     * <p>
     * Este campo almacena el nombre del usuario, con un máximo de 80 caracteres. No puede ser nulo.
     * </p>
     */
    @Column(name = "nombres_usuario", nullable = false, length = 80)
    private String nombresUsuario;

    /**
     * Apellido del usuario.
     * <p>
     * Este campo almacena el apellido del usuario, con un máximo de 80 caracteres. No puede ser nulo.
     * </p>
     */
    @Column(name = "apellidos_usuario", nullable = false, length = 80)
    private String apellidosUsuario;

    /**
     * Correo electrónico del usuario.
     * <p>
     * Este campo almacena la dirección de correo electrónico del usuario, con un máximo de 50 caracteres. No puede ser nulo.
     * </p>
     */
    @Column(name = "correo_usuario", nullable = false, length = 50)
    private String correoUsuario;

    /**
     * Código de la imagen asociada al usuario.
     * <p>
     * Este campo almacena el código de la imagen del usuario. Es opcional y puede ser nulo.
     * </p>
     */
    @Column(name = "codigo_imagen_usuario", length = Integer.MAX_VALUE)
    private String codigoImagenUsuario;

    /**
     * Contraseña del usuario.
     * <p>
     * Este campo almacena la contraseña del usuario, con un máximo de 30 caracteres. No puede ser nulo.
     * </p>
     */
    @Column(name = "contrasena", nullable = false, length = 30)
    private String contrasena;

    /**
     * Relación con la entidad {@link TipoUsuarioEntity}.
     * <p>
     * Representa el tipo de usuario. Es una relación de tipo {@code ManyToOne} con la entidad {@code TipoUsuarioEntity}.
     * Cada usuario está asociado a un tipo específico (por ejemplo, administrador, cliente, etc.).
     * </p>
     */
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "tipo_usuario_fk", nullable = false)
    private TipoUsuarioEntity tipoUsuarioEntityFk;

}
