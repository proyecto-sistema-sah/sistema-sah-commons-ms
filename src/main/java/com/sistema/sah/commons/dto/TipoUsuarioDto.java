package com.sistema.sah.commons.dto;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class TipoUsuarioDto {
    private Integer id;

    private String nombreTipoUsuario;

}