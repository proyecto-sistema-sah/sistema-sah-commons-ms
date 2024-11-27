package com.sistema.sah.commons.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Entidad que representa un cuarto en el sistema.
 * <p>
 * Esta clase mapea la tabla `cuarto` en la base de datos y contiene información sobre un cuarto, como su código,
 * número, imagen, valor por noche, detalles y su tipo y estado correspondientes.
 * </p>
 */
@Data
@Entity
@Table(name = "cuarto")
public class CuartoEntity {

    /**
     * Código único del cuarto.
     * Este campo representa el identificador único del cuarto en el sistema, almacenado en la columna `codigo_cuarto`.
     */
    @Id
    @Column(name = "codigo_cuarto", nullable = false, length = 7)
    private String codigoCuarto;

    /**
     * Número del cuarto.
     * Este campo representa el número del cuarto, como "101", "102", etc., almacenado en la columna `numero_cuarto`.
     */
    @Column(name = "numero_cuarto", nullable = false, length = 7)
    private String numeroCuarto;

    /**
     * Código de la imagen del cuarto.
     * Este campo almacena el código o la referencia a la imagen asociada al cuarto, representando visualmente el cuarto.
     */
    @Column(name = "codigo_imagen_cuarto", nullable = false, length = Integer.MAX_VALUE)
    private String codigoImagenCuarto;

    /**
     * Valor por noche del cuarto.
     * Este campo representa el costo por noche para reservar el cuarto, almacenado como un valor de tipo {@link BigDecimal}.
     */
    @Column(name = "valor_noche_cuarto", nullable = false, precision = 10, scale = 2)
    private BigDecimal valorNocheCuarto;

    /**
     * Detalles del cuarto.
     * Este campo almacena información adicional sobre el cuarto, como características, tamaño, servicios disponibles, etc.
     */
    @Column(name = "detalle_cuarto", length = Integer.MAX_VALUE)
    private String detalleCuarto;

    /**
     * Tipo de cuarto.
     * Este campo establece una relación de muchos a uno con la entidad {@link TipoCuartoEntity}, que define el tipo
     * de cuarto, como "Individual", "Doble", "Suite", etc.
     */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tipo_cuarto_fk", nullable = false)
    private TipoCuartoEntity tipoCuartoEntityFk;

    /**
     * Estado del cuarto.
     * Este campo establece una relación de muchos a uno con la entidad {@link EstadoCuartoEntity}, que describe el
     * estado actual del cuarto (por ejemplo, "Disponible", "Ocupado", "Mantenimiento").
     */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "estado_cuarto_fk", nullable = false)
    private EstadoCuartoEntity estadoCuartoEntityFk;

}
