package com.sistema.sah.commons.dto;

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
public class TipoAlimentoDto implements Serializable {
    private Integer id;

    private String nombreTipoAlimento;

}