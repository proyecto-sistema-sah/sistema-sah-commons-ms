package com.sistema.sah.commons.dto;

import com.sistema.sah.commons.helper.enums.EstadoReservaEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO (Data Transfer Object) que representa el estado de una reserva.
 * <p>
 * Esta clase encapsula el estado de una reserva en el sistema, indicando si la reserva está
 * confirmada, cancelada, pendiente, etc. El estado se define mediante un valor de la enumeración
 * {@link EstadoReservaEnum}.
 * </p>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EstadoReservaDto implements Serializable {

    /**
     * Identificador único del estado de la reserva.
     * Este campo representa el identificador único del estado en la base de datos.
     */
    private Integer id;

    /**
     * Nombre del estado de la reserva.
     * Este campo representa el estado de la reserva mediante un valor de la enumeración
     * {@link EstadoReservaEnum}, que puede tener valores como CONFIRMADA, CANCELADA, PENDIENTE, etc.
     */
    private EstadoReservaEnum nombreEstadoReserva;
}
