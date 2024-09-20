package com.sistema.sah.commons.helper.enums;

import lombok.Getter;

@Getter
public enum EstadoCuartoEnum {

    OCUPADO("OCUPADO"),
    LIBRE("LIBRE"),
    MANTENIMIENTO("MANTENIMIENTO");

    private final String descripcion;

    EstadoCuartoEnum(String descripcion) {
        this.descripcion = descripcion;
    }

}
