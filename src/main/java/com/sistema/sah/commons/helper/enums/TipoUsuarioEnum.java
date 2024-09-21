package com.sistema.sah.commons.helper.enums;

import lombok.Getter;

@Getter
public enum TipoUsuarioEnum {

    ADMINISTRADOR("ADMINISTRADOR"),
    USUARIO("USUARIO");
    private final String descripcion;

    TipoUsuarioEnum(String descripcion) {
        this.descripcion = descripcion;
    }

}
