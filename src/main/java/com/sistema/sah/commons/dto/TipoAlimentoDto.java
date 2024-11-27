package com.sistema.sah.commons.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO (Data Transfer Object) que representa el tipo de un alimento.
 * <p>
 * Esta clase encapsula la información relacionada con el tipo de un alimento, incluyendo el identificador único
 * y el nombre del tipo de alimento. El tipo de alimento podría representar categorías como "Fruta", "Bebida", "Postre", etc.
 * </p>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TipoAlimentoDto implements Serializable {

    /**
     * Identificador único del tipo de alimento.
     * Este campo representa el identificador único del tipo de alimento en el sistema.
     */
    private Integer id;

    /**
     * Nombre del tipo de alimento.
     * Este campo describe el nombre del tipo de alimento, como "Fruta", "Bebida", "Postre", etc.
     */
    private String nombreTipoAlimento;

}
