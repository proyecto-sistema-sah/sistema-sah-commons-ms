package com.sistema.sah.commons.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;

/**
 * DTO (Data Transfer Object) que representa la información de un usuario en el sistema.
 * <p>
 * Esta clase encapsula la información básica de un usuario, como su código, nombre, correo electrónico, imagen,
 * contraseña y el tipo de usuario. El tipo de usuario está representado por un objeto {@link TipoUsuarioDto}.
 * </p>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDto implements Serializable {

    /**
     * Código único del usuario.
     * Este campo representa el identificador único del usuario en el sistema.
     */
    private String codigoUsuario;

    /**
     * Nombres del usuario.
     * Este campo contiene el nombre(s) del usuario.
     */
    private String nombresUsuario;

    /**
     * Apellidos del usuario.
     * Este campo contiene el apellido(s) del usuario.
     */
    private String apellidosUsuario;

    /**
     * Correo electrónico del usuario.
     * Este campo contiene el correo electrónico asociado al usuario.
     */
    private String correoUsuario;

    /**
     * Código de la imagen del usuario.
     * Este campo contiene el código o la referencia a la imagen de perfil del usuario.
     */
    private String codigoImagenUsuario;

    /**
     * Contraseña del usuario.
     * Este campo contiene la contraseña cifrada del usuario para la autenticación.
     */
    private String contrasena;

    /**
     * Tipo de usuario.
     * Este campo contiene una referencia a un objeto {@link TipoUsuarioDto} que describe el tipo de usuario,
     * como ADMINISTRADOR, CLIENTE, etc.
     */
    private TipoUsuarioDto tipoUsuarioDtoFk;

}
