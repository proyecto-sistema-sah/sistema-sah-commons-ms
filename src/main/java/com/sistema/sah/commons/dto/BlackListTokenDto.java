package com.sistema.sah.commons.dto;

import com.sistema.sah.commons.entity.UsuarioEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

/**
 * DTO (Data Transfer Object) para representar un token en la lista negra.
 * <p>
 * Esta clase es utilizada para transferir los datos relacionados con un token
 * que ha sido marcado como inválido o en la lista negra. Incluye el token, su
 * fecha de expiración y la referencia al usuario asociado.
 * </p>
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BlackListTokenDto {

    /**
     * Identificador único del token en la lista negra.
     * Este campo representa el identificador único del registro del token en la lista negra.
     */
    private Integer id;

    /**
     * El token que ha sido marcado como inválido.
     * Este campo contiene el valor del token JWT que ha sido añadido a la lista negra.
     */
    private String token;

    /**
     * Fecha y hora de expiración del token.
     * Este campo representa la fecha y hora en la que el token expiró.
     */
    private LocalDateTime fechaExpiracion;

    /**
     * Usuario asociado al token en la lista negra.
     * Este campo contiene la información del usuario al que corresponde el token
     * que ha sido marcado como inválido, representado a través de un objeto {@link UsuarioDto}.
     */
    private UsuarioDto codigoUsuarioDtoFk;

}
