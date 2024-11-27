package com.sistema.sah.commons.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * DTO (Data Transfer Object) que representa la información de un cuarto en el sistema.
 * <p>
 * Este objeto contiene los detalles de un cuarto, como su código, número, imagen, valor por noche,
 * detalle adicional, tipo de cuarto y estado del cuarto.
 * </p>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CuartoDto implements Serializable {

    /**
     * Código único del cuarto.
     * Este campo representa el identificador único del cuarto en el sistema.
     */
    private String codigoCuarto;

    /**
     * Número del cuarto.
     * Este campo contiene el número del cuarto en la instalación, utilizado para identificarlo en el lugar.
     */
    private String numeroCuarto;

    /**
     * Código de la imagen asociada al cuarto.
     * Este campo guarda el código o referencia de la imagen que representa visualmente al cuarto.
     */
    private String codigoImagenCuarto;

    /**
     * Valor por noche del cuarto.
     * Este campo representa el costo por noche de hospedaje en el cuarto.
     */
    private BigDecimal valorNocheCuarto;

    /**
     * Detalles adicionales sobre el cuarto.
     * Este campo puede incluir una descripción más detallada del cuarto, como características, comodidades, etc.
     */
    private String detalleCuarto;

    /**
     * Tipo de cuarto asociado.
     * Este campo contiene una referencia al objeto {@link TipoCuartoDto}, que describe el tipo del cuarto (por ejemplo, estándar, suite, etc.).
     */
    private TipoCuartoDto tipoCuartoDtoFk;

    /**
     * Estado del cuarto.
     * Este campo representa una referencia al objeto {@link EstadoCuartoDto}, que describe el estado actual del cuarto (por ejemplo, disponible, ocupado, etc.).
     */
    private EstadoCuartoDto estadoCuartoDtoFk;

}
