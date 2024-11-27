package com.sistema.sah.commons.helper.enums;

import lombok.Getter;

/**
 * Enumeración que representa los posibles estados de un servicio asignado a un usuario.
 */
@Getter
public enum EstadoUsuarioServiceEnum {

    /**
     * Estado que indica que el servicio está pendiente de realización.
     */
    PENDIENTE("PENDIENTE"),

    /**
     * Estado que indica que el servicio ha sido completado y realizado.
     */
    REALIZADO("REALIZADO"),

    /**
     * Estado que indica que el servicio ha sido cancelado.
     */
    CANCELADO("CANCELADO");

    /**
     * Descripción asociada a cada estado del servicio.
     */
    private final String descripcion;

    /**
     * Constructor de la enumeración {@link EstadoUsuarioServiceEnum}.
     * <p>
     * Asigna una descripción al estado del servicio.
     * </p>
     *
     * @param descripcion la descripción del estado del servicio.
     */
    EstadoUsuarioServiceEnum(String descripcion) {
        this.descripcion = descripcion;
    }
}
