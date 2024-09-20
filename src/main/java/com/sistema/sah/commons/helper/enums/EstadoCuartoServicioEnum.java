package com.sistema.sah.commons.helper.enums;

import lombok.Getter;

@Getter
public enum EstadoCuartoServicioEnum {

    ACTIVO("ACTIVO"),
    INACTIVO("INACTIVO");

    private final String descripcion;

    EstadoCuartoServicioEnum(String descripcion) {
        this.descripcion = descripcion;
    }

}
