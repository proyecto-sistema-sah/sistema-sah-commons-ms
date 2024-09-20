package com.sistema.sah.commons.helper.enums;

import lombok.Getter;

@Getter
public enum EstadoUsuarioAlimentoEnum {

    PREPARACION("PREPARACION"),
    ENTREGADO("ENTREGADO");

    private final String descripcion;

    EstadoUsuarioAlimentoEnum(String descripcion) {
        this.descripcion = descripcion;
    }


}
