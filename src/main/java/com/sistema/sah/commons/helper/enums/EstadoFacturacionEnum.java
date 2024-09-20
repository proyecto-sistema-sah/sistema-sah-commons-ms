package com.sistema.sah.commons.helper.enums;

import lombok.Getter;

@Getter
public enum EstadoFacturacionEnum {

    PAGADO("PAGADO"),
    PENDIENTE("PENDIENTE"),
    CANCELADO("CANCELADO");

    private final String descripcion;

    EstadoFacturacionEnum(String descripcion) {
        this.descripcion = descripcion;
    }

}
