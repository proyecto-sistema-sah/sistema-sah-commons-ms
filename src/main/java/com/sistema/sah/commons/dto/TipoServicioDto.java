package com.sistema.sah.commons.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO (Data Transfer Object) que representa el tipo de un servicio.
 * <p>
 * Esta clase encapsula la información relacionada con el tipo de servicio, incluyendo el identificador único
 * y el nombre del tipo de servicio. El tipo de servicio puede representar categorías como "Limpieza", "Bienestar", "Transporte", etc.
 * </p>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class TipoServicioDto implements Serializable {

    /**
     * Identificador único del tipo de servicio.
     * Este campo representa el identificador único del tipo de servicio en el sistema.
     */
    private Integer id;

    /**
     * Nombre del tipo de servicio.
     * Este campo describe el nombre del tipo de servicio, como "Limpieza", "Bienestar", "Transporte", etc.
     */
    private String nombreTipoServicio;

}
