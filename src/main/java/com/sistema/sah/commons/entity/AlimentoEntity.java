package com.sistema.sah.commons.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;

/**
 * Entidad que representa un alimento en la base de datos.
 * <p>
 * Esta clase mapea la tabla `alimento` en la base de datos y contiene información sobre un alimento, como su código,
 * nombre, tiempo de preparación, detalles, imagen y el tipo de alimento al que pertenece.
 * </p>
 */
@Data
@Entity
@Table(name = "alimento")
public class AlimentoEntity {

    /**
     * Código único del alimento.
     * Este campo representa el identificador único del alimento en el sistema, almacenado en la columna `codigo_alimento`.
     */
    @Id
    @Column(name = "codigo_alimento", nullable = false, length = 7)
    private String codigoAlimento;

    /**
     * Tiempo de preparación del alimento.
     * Este campo representa el tiempo necesario para preparar el alimento, almacenado como un valor de tipo {@link LocalTime}.
     */
    @Column(name = "tiempo_preparacion_alimento", nullable = false)
    private LocalTime tiempoPreparacionAlimento;

    /**
     * Nombre del alimento.
     * Este campo almacena el nombre del alimento, como "Ensalada", "Pizza", etc., con un máximo de 30 caracteres.
     */
    @Column(name = "nombre_alimento", nullable = false, length = 30)
    private String nombreAlimento;

    /**
     * Detalles del alimento.
     * Este campo almacena información adicional sobre el alimento, como ingredientes o preparación especial.
     * El tamaño de la columna es indefinido (hasta el tamaño máximo de un {@link Integer}).
     */
    @Column(name = "detalle_alimento", length = Integer.MAX_VALUE)
    private String detalleAlimento;

    /**
     * Código de la imagen asociada al alimento.
     * Este campo representa el código o referencia a la imagen visual del alimento.
     */
    @Column(name = "codigo_imagen")
    private String codigoImagen;

    /**
     * Tipo de alimento al que pertenece este alimento.
     * Este campo establece una relación de muchos a uno con la entidad {@link TipoAlimentoEntity}, que define el tipo
     * de alimento (por ejemplo, "Fruta", "Bebida", "Postre").
     */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tipo_alimento_fk", nullable = false)
    private TipoAlimentoEntity tipoAlimentoEntityFk;

}
