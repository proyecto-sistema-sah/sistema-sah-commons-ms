package com.sistema.sah.commons.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sistema.sah.commons.helper.enums.TipoUsuarioEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO (Data Transfer Object) que representa el tipo de usuario en el sistema.
 * <p>
 * Esta clase encapsula la información relacionada con el tipo de usuario, incluyendo el identificador único
 * y el tipo de usuario, representado por un valor de la enumeración {@link TipoUsuarioEnum}.
 * </p>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TipoUsuarioDto implements Serializable {

    /**
     * Identificador único del tipo de usuario.
     * Este campo representa el identificador único del tipo de usuario en el sistema.
     */
    private Integer id;

    /**
     * Nombre del tipo de usuario.
     * Este campo representa el tipo de usuario, que se define mediante la enumeración {@link TipoUsuarioEnum}.
     * Los valores posibles pueden incluir tipos como ADMINISTRADOR, CLIENTE, etc.
     */
    private TipoUsuarioEnum nombreTipoUsuario;

}
