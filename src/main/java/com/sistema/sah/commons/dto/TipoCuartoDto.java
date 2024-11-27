package com.sistema.sah.commons.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO (Data Transfer Object) que representa el tipo de un cuarto.
 * <p>
 * Esta clase encapsula la información relacionada con el tipo de cuarto, incluyendo el identificador único
 * y el nombre del tipo de cuarto. El tipo de cuarto podría representar categorías como "Individual", "Doble", "Suite", etc.
 * </p>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TipoCuartoDto implements Serializable {

    /**
     * Identificador único del tipo de cuarto.
     * Este campo representa el identificador único del tipo de cuarto en el sistema.
     */
    private Integer id;

    /**
     * Nombre del tipo de cuarto.
     * Este campo describe el nombre del tipo de cuarto, como "Individual", "Doble", "Suite", etc.
     */
    private String nombreTipoCuarto;

}
