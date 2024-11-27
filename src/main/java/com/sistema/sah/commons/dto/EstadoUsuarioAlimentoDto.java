package com.sistema.sah.commons.dto;

import com.sistema.sah.commons.helper.enums.EstadoUsuarioAlimentoEnum;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

/**
 * DTO (Data Transfer Object) que representa el estado de un usuario en relación con un alimento.
 * <p>
 * Esta clase encapsula el estado de un usuario respecto a un alimento específico. El estado se
 * define mediante un valor de la enumeración {@link EstadoUsuarioAlimentoEnum}, indicando si el
 * alimento ha sido consumido, solicitado, pendiente, etc.
 * </p>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EstadoUsuarioAlimentoDto implements Serializable {

    /**
     * Identificador único del estado del usuario en relación con el alimento.
     * Este campo es utilizado como identificador único del estado en la base de datos.
     */
    private Integer id;

    /**
     * Nombre del estado del usuario en relación con el alimento.
     * Este campo representa el estado del usuario respecto al alimento mediante un valor de la enumeración
     * {@link EstadoUsuarioAlimentoEnum}, que puede tener valores como PREPARACION, PENDIENTE, etc.
     */
    private EstadoUsuarioAlimentoEnum nombreEstadoUsuarioAlimento;

}
