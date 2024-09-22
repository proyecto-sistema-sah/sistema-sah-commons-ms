package com.sistema.sah.commons.dto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)  // Añadir esta línea
@NoArgsConstructor  // Añadir si necesitas un constructor sin argumentos explícito
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