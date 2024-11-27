package com.sistema.sah.commons.helper.enums;

import lombok.Getter;

/**
 * Enumeración que representa los posibles tipos de usuarios dentro del sistema.
 */
@Getter
public enum TipoUsuarioEnum {

    /**
     * Tipo de usuario con privilegios de administrador.
     */
    ADMINISTRADOR("ADMINISTRADOR", "AD"),

    /**
     * Tipo de usuario con privilegios estándar de usuario.
     */
    USUARIO("USUARIO", "US");

    /**
     * Descripción asociada al tipo de usuario (por ejemplo, "ADMINISTRADOR").
     */
    private final String descripcion;

    /**
     * Iniciales que representan al tipo de usuario (por ejemplo, "AD" para Administrador).
     */
    private final String inicial;

    /**
     * Constructor de la enumeración {@link TipoUsuarioEnum}.
     * <p>
     * Asigna una descripción y una inicial a cada tipo de usuario.
     * </p>
     *
     * @param descripcion descripción del tipo de usuario.
     * @param inicial     iniciales que representan al tipo de usuario.
     */
    TipoUsuarioEnum(String descripcion, String inicial) {
        this.descripcion = descripcion;
        this.inicial = inicial;
    }
}
