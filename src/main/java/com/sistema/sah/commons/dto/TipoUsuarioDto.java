package com.sistema.sah.commons.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.sistema.sah.commons.helper.enums.TipoUsuarioEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TipoUsuarioDto implements Serializable {

    private Integer id;

    private TipoUsuarioEnum nombreTipoUsuario;

}