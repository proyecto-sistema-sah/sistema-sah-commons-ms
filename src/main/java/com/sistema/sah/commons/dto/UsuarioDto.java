package com.sistema.sah.commons.dto;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor  // Añadir si necesitas un constructor sin argumentos explícito
@AllArgsConstructor
public class UsuarioDto implements Serializable {

    private String codigoUsuario;

    private String nombresUsuario;

    private String apellidosUsuario;

    private String correoUsuario;

    private String codigoImagenUsuario;

    private String contrasena;

    private TipoUsuarioDto tipoUsuarioDtoFk;

}