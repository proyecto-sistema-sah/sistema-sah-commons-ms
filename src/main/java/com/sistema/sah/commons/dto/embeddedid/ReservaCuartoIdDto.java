package com.sistema.sah.commons.dto.embeddedid;

import com.sistema.sah.commons.entity.ReservaCuartoEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Representa la clave primaria compuesta para la entidad {@link ReservaCuartoEntity}.
 * <p>
 * Esta clase encapsula los identificadores de una reserva y un cuarto relacionados.
 * Es utilizada como parte de la clave primaria en la entidad {@link ReservaCuartoEntity},
 * permitiendo la relación entre una reserva y el cuarto asociado a ella.
 * </p>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReservaCuartoIdDto implements Serializable {
    /**
     * Código de la reserva asociada en la relación.
     * Este campo representa el identificador de la reserva en la relación.
     */
    private String codigoReservaFk;

    /**
     * Código del cuarto asociado en la relación.
     * Este campo representa el identificador del cuarto en la relación.
     */
    private String codigoCuartoFk;

}
