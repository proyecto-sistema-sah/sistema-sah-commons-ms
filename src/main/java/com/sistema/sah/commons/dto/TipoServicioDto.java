package com.sistema.sah.commons.dto;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class TipoServicioDto {
    private Integer id;

    private String nombreTipoServicio;

}