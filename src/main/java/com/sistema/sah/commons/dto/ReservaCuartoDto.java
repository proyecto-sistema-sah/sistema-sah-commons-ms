package com.sistema.sah.commons.dto;

import com.sistema.sah.commons.entity.embeddedid.ReservaCuartoIdEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReservaCuartoDto implements Serializable {
    private ReservaCuartoIdEntity id;

    private ReservaDto codigoReservaDtoFk;

    private CuartoDto codigoCuartoDtoFk;

}