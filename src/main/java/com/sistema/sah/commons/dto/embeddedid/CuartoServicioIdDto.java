package com.sistema.sah.commons.dto.embeddedid;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CuartoServicioIdDto implements Serializable {
    private String codigoCuartoFk;

    private String codigoServicioFk;
}