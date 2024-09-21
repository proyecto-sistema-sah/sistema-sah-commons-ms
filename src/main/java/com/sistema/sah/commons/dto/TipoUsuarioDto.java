package com.sistema.sah.commons.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sistema.sah.commons.helper.enums.TipoUsuarioEnum;
import jakarta.persistence.*;
import lombok.Data;

@Data
public class TipoUsuarioDto {

    private Integer id;

    private TipoUsuarioEnum nombreTipoUsuario;

}