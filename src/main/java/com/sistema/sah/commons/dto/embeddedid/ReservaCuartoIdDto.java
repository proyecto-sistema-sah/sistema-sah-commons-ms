package com.sistema.sah.commons.dto.embeddedid;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReservaCuartoIdDto implements Serializable {
    private String codigoReservaFk;

    private String codigoCuartoFk;
}