package com.sistema.sah.commons.helper.enums;

import lombok.Getter;

@Getter
public enum TipoUsuarioEnum {

    ADMINISTRADOR("ADMINISTRADOR", "AD"),
    USUARIO("USUARIO", "US");
    private final String descripcion;
    private final String inicial;

    TipoUsuarioEnum(String descripcion, String inicial) {
        this.descripcion = descripcion;
        this.inicial = inicial;
    }

}
