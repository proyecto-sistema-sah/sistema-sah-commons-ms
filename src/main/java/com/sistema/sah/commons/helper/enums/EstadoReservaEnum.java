package com.sistema.sah.commons.helper.enums;

import lombok.Getter;

@Getter
public enum EstadoReservaEnum {

    COMPLETADO("COMPLETADO"),
    CANCELADO("CANCELADO"),
    PENDIENTE("PENDIENTE");

    private final String descripcion;

    EstadoReservaEnum(String descripcion) {
        this.descripcion = descripcion;
    }

}
