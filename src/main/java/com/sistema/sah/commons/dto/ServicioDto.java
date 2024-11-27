package com.sistema.sah.commons.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * DTO (Data Transfer Object) que representa un servicio disponible en el sistema.
 * <p>
 * Esta clase encapsula la información relacionada con un servicio, incluyendo el código, nombre, valor,
 * imagen, detalles y el tipo de servicio. El tipo de servicio está representado por un objeto {@link TipoServicioDto}.
 * </p>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ServicioDto implements Serializable {

    /**
     * Código único del servicio.
     * Este campo representa el identificador único del servicio en el sistema.
     */
    private String codigoServicio;

    /**
     * Nombre del servicio.
     * Este campo describe el nombre del servicio, como "Spa", "Servicio de limpieza", etc.
     */
    private String nombreServicio;

    /**
     * Valor del servicio.
     * Este campo representa el costo asociado con el servicio, almacenado como un valor de tipo {@link BigDecimal}.
     */
    private BigDecimal valorServicio;

    /**
     * Código de la imagen asociada al servicio.
     * Este campo contiene el código o la referencia a la imagen que representa visualmente el servicio.
     */
    private String codigoImagenServicio;

    /**
     * Descripción detallada del servicio.
     * Este campo proporciona una descripción completa del servicio, detallando lo que incluye el servicio, condiciones, etc.
     */
    private String detalleServicio;

    /**
     * Tipo de servicio al que pertenece este servicio.
     * Este campo contiene una referencia a un objeto {@link TipoServicioDto}, que define el tipo o categoría del servicio
     * (por ejemplo, "Bienestar", "Limpieza", etc.).
     */
    private TipoServicioDto tipoServicioDtoFk;

}
