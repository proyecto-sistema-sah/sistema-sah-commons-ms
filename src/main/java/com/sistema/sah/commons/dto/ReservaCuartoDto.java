package com.sistema.sah.commons.dto;

import com.sistema.sah.commons.dto.embeddedid.ReservaCuartoIdDto;
import com.sistema.sah.commons.entity.embeddedid.ReservaCuartoIdEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO (Data Transfer Object) que representa la relación entre una reserva y un cuarto.
 * <p>
 * Esta clase encapsula la información relacionada con la asignación de un cuarto a una reserva, incluyendo
 * los identificadores de la reserva y del cuarto asociados, mediante claves compuestas representadas por el
 * objeto {@link ReservaCuartoIdDto}.
 * </p>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReservaCuartoDto implements Serializable {

    /**
     * Identificador compuesto de la relación entre la reserva y el cuarto.
     * Este campo representa la clave primaria compuesta que une la reserva y el cuarto, mediante un objeto
     * {@link ReservaCuartoIdDto}.
     */
    private ReservaCuartoIdDto id;

    /**
     * Reserva asociada a este cuarto.
     * Este campo contiene la referencia al objeto {@link ReservaDto}, que describe la reserva relacionada
     * con el cuarto.
     */
    private ReservaDto codigoReservaDtoFk;

    /**
     * Cuarto asociado a esta reserva.
     * Este campo contiene la referencia al objeto {@link CuartoDto}, que describe el cuarto asignado
     * a la reserva.
     */
    private CuartoDto codigoCuartoDtoFk;

}
