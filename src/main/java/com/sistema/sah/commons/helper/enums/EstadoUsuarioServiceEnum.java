package com.sistema.sah.commons.helper.enums;

import lombok.Getter;

@Getter
public enum EstadoUsuarioServiceEnum {

    PENDIENTE("PENDIENTE"),
    REALIZADO("REALIZADO"),
    CANCELADO("CANCELADO");

    private final String descripcion;

    EstadoUsuarioServiceEnum(String descripcion) {
        this.descripcion = descripcion;
    }


}
