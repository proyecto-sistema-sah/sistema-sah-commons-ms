package com.sistema.sah.commons.dto;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class TipoAlimentoDto {
    private Integer id;

    private String nombreTipoAlimento;

}