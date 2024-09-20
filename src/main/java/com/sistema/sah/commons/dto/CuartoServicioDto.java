package com.sistema.sah.commons.dto;

import com.sistema.sah.commons.dto.embeddedid.CuartoServicioIdDto;
import lombok.Data;

@Data
public class CuartoServicioDto {
    private CuartoServicioIdDto id;

    private CuartoDto codigoCuartoDtoFk;

    private ServicioDto codigoServicioDtoFk;

    private EstadoCuartoServicioDto estadoCuartoServicioDtoFk;

}