package com.sistema.sah.commons.dto;

import com.sistema.sah.commons.entity.embeddedid.ReservaCuartoIdEntity;
import lombok.Data;

@Data
public class ReservaCuartoDto {
    private ReservaCuartoIdEntity id;

    private ReservaDto codigoReservaDtoFk;

    private CuartoDto codigoCuartoDtoFk;

}