package com.sistema.sah.commons.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CuartoDto implements Serializable {
    private String codigoCuarto;

    private String numeroCuarto;

    private String codigoImagenCuarto;

    private BigDecimal valorNocheCuarto;

    private String detalleCuarto;

    private TipoCuartoDto tipoCuartoDtoFk;

    private EstadoCuartoDto estadoCuartoDtoFk;

}