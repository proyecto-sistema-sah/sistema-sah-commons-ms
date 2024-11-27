package com.sistema.sah.commons.dto;

import com.sistema.sah.commons.helper.enums.EstadoCuartoEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO (Data Transfer Object) que representa el estado de un cuarto.
 * <p>
 * Esta clase encapsula el estado actual de un cuarto, que se puede utilizar para
 * determinar si el cuarto está disponible, ocupado, en mantenimiento, etc. El estado
 * se define mediante un valor de la enumeración {@link EstadoCuartoEnum}.
 * </p>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EstadoCuartoDto implements Serializable {

    /**
     * Identificador único del estado del cuarto.
     * Este campo es utilizado como identificador del estado en la base de datos.
     */
    private Integer id;

    /**
     * Nombre del estado del cuarto.
     * Este campo representa el estado del cuarto mediante un valor de la enumeración
     * {@link EstadoCuartoEnum} (por ejemplo, DISPONIBLE, OCUPADO, MANTENIMIENTO).
     */
    private EstadoCuartoEnum nombreEstadoCuarto;
}
