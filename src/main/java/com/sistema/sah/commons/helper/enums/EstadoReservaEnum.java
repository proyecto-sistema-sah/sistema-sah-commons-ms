package com.sistema.sah.commons.helper.enums;

import lombok.Getter;

/**
 * Enumeración que representa los posibles estados de una reserva.
 */
@Getter
public enum EstadoReservaEnum {

    /**
     * Estado que indica que la reserva ha sido completada con éxito.
     */
    COMPLETADO("COMPLETADO"),

    /**
     * Estado que indica que la reserva ha sido cancelada.
     */
    CANCELADO("CANCELADO"),

    /**
     * Estado que indica que la reserva está pendiente de confirmación o acción.
     */
    PENDIENTE("PENDIENTE");

    /**
     * Descripción asociada a cada estado de reserva.
     */
    private final String descripcion;

    /**
     * Constructor de la enumeración {@link EstadoReservaEnum}.
     * <p>
     * Asigna una descripción al estado de la reserva.
     * </p>
     *
     * @param descripcion la descripción del estado de la reserva.
     */
    EstadoReservaEnum(String descripcion) {
        this.descripcion = descripcion;
    }
}
