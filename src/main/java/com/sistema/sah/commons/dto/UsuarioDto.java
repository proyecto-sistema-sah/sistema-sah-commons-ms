package com.sistema.sah.commons.dto;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class UsuarioDto {
    private String codigoUsuario;

    private String nombresUsuario;

    private String apellidosUsuario;

    private String correoUsuario;

    private String codigoImagenUsuario;

    private String contrasena;

    private TipoUsuarioDto tipoUsuarioDtoFk;

}