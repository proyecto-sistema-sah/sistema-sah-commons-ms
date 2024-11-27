package com.sistema.sah.commons.dto;

import com.sistema.sah.commons.entity.AlimentoEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalTime;

/**
 * Representa un DTO (Data Transfer Object) para la entidad {@link AlimentoEntity}.
 * <p>
 * Este objeto contiene la información sobre un alimento, incluyendo su código, tiempo de preparación,
 * nombre, detalles adicionales, imagen asociada y tipo de alimento.
 * </p>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlimentoDto implements Serializable {

    /**
     * Código único del alimento.
     * Este campo es utilizado como identificador único para el alimento en el sistema.
     */
    private String codigoAlimento;

    /**
     * Tiempo de preparación del alimento.
     * Este campo representa el tiempo necesario para preparar el alimento, en formato {@link LocalTime}.
     */
    private LocalTime tiempoPreparacionAlimento;

    /**
     * Nombre del alimento.
     * Este campo contiene el nombre descriptivo del alimento.
     */
    private String nombreAlimento;

    /**
     * Detalles adicionales sobre el alimento.
     * Este campo puede incluir una descripción más extensa sobre el alimento.
     */
    private String detalleAlimento;

    /**
     * Código de la imagen asociada al alimento.
     * Este campo guarda el código o referencia de la imagen que representa el alimento.
     */
    private String codigoImagen;

    /**
     * Tipo de alimento al que pertenece este alimento.
     * Este campo es una referencia a un objeto {@link TipoAlimentoDto} que describe el tipo de alimento (por ejemplo, vegetal, proteína, etc.).
     */
    private TipoAlimentoDto tipoAlimentoDtoFk;

}
