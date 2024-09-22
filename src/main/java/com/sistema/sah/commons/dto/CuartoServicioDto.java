package com.sistema.sah.commons.dto;

import com.sistema.sah.commons.dto.embeddedid.CuartoServicioIdDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CuartoServicioDto implements Serializable {
    private CuartoServicioIdDto id;

    private CuartoDto codigoCuartoDtoFk;

    private ServicioDto codigoServicioDtoFk;

    private EstadoCuartoServicioDto estadoCuartoServicioDtoFk;

}