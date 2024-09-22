package com.sistema.sah.commons.dto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class UsuarioDto {

    @JsonProperty(access = JsonProperty.Access.READ_ONLY)
    private String codigoUsuario;

    private String nombresUsuario;

    private String apellidosUsuario;

    private String correoUsuario;

    private String codigoImagenUsuario;

    private String contrasena;

    private TipoUsuarioDto tipoUsuarioDtoFk;

}