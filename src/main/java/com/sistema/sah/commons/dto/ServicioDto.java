package com.sistema.sah.commons.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ServicioDto {
    private String codigoServicio;

    private String nombreServicio;

    private BigDecimal valorServicio;

    private String codigoImagenServicio;

    private String detalleServicio;

    private TipoServicioDto tipoServicioDtoFk;

}