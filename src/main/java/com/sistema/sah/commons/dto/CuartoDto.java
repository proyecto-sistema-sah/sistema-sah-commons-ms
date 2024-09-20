package com.sistema.sah.commons.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class CuartoDto {
    private String codigoCuarto;

    private String numeroCuarto;

    private String codigoImagenCuarto;

    private BigDecimal valorNocheCuarto;

    private String detalleCuarto;

    private TipoCuartoDto tipoCuartoDtoFk;

    private EstadoCuartoDto estadoCuartoDtoFk;

}