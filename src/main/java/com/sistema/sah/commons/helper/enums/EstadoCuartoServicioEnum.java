package com.sistema.sah.commons.helper.enums;

import lombok.Getter;

/**
 * Enumeración que representa los posibles estados de un servicio asociado a un cuarto.
 */
@Getter
public enum EstadoCuartoServicioEnum {

    /**
     * Estado que indica que el servicio asociado al cuarto está activo y disponible.
     */
    ACTIVO("ACTIVO"),

    /**
     * Estado que indica que el servicio asociado al cuarto está inactivo y no disponible.
     */
    INACTIVO("INACTIVO");

    /**
     * Descripción asociada a cada estado del servicio del cuarto.
     */
    private final String descripcion;

    /**
     * Constructor de la enumeración {@link EstadoCuartoServicioEnum}.
     * <p>
     * Asigna una descripción al estado del servicio del cuarto.
     * </p>
     *
     * @param descripcion la descripción del estado del servicio del cuarto.
     */
    EstadoCuartoServicioEnum(String descripcion) {
        this.descripcion = descripcion;
    }
}
