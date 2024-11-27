package com.sistema.sah.commons.helper.enums;

import lombok.Getter;

/**
 * Enumeración que representa los posibles estados de un cuarto en el sistema.
 */
@Getter
public enum EstadoCuartoEnum {

    /**
     * Estado que indica que el cuarto está ocupado.
     */
    OCUPADO("OCUPADO"),

    /**
     * Estado que indica que el cuarto está libre y disponible para ser reservado.
     */
    LIBRE("LIBRE"),

    /**
     * Estado que indica que el cuarto está en mantenimiento y no puede ser utilizado.
     */
    MANTENIMIENTO("MANTENIMIENTO");

    /**
     * Descripción asociada a cada estado del cuarto.
     */
    private final String descripcion;

    /**
     * Constructor de la enumeración {@link EstadoCuartoEnum}.
     * <p>
     * Asigna una descripción al estado del cuarto.
     * </p>
     *
     * @param descripcion la descripción del estado del cuarto.
     */
    EstadoCuartoEnum(String descripcion) {
        this.descripcion = descripcion;
    }
}
