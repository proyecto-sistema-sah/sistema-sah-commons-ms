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
public class ServicioDto implements Serializable {
    private String codigoServicio;

    private String nombreServicio;

    private BigDecimal valorServicio;

    private String codigoImagenServicio;

    private String detalleServicio;

    private TipoServicioDto tipoServicioDtoFk;

}