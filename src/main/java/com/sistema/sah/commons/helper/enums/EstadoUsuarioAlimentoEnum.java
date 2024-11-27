package com.sistema.sah.commons.helper.enums;

import lombok.Getter;

/**
 * Enumeración que representa los posibles estados de un alimento asignado a un usuario.
 */
@Getter
public enum EstadoUsuarioAlimentoEnum {

    /**
     * Estado que indica que el alimento está en proceso de preparación.
     */
    PREPARACION("PREPARACION"),

    /**
     * Estado que indica que el alimento ha sido entregado al usuario.
     */
    ENTREGADO("ENTREGADO");

    /**
     * Descripción asociada a cada estado del alimento.
     */
    private final String descripcion;

    /**
     * Constructor de la enumeración {@link EstadoUsuarioAlimentoEnum}.
     * <p>
     * Asigna una descripción al estado del alimento.
     * </p>
     *
     * @param descripcion la descripción del estado del alimento.
     */
    EstadoUsuarioAlimentoEnum(String descripcion) {
        this.descripcion = descripcion;
    }
}
