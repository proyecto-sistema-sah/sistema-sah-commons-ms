package com.sistema.sah.commons.entity;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Entidad que representa el tipo de cuarto en el sistema.
 * <p>
 * Esta clase mapea la tabla {@code tipo_cuarto} en la base de datos, que contiene información sobre los distintos
 * tipos de cuartos, como su nombre. Cada tipo de cuarto tiene un identificador único.
 * </p>
 */
@Data
@Entity
@Table(name = "tipo_cuarto")
public class TipoCuartoEntity {

    /**
     * Identificador único del tipo de cuarto.
     * Este campo es la clave primaria de la entidad y representa el identificador único del tipo de cuarto en la tabla {@code tipo_cuarto}.
     * El valor se genera automáticamente mediante una secuencia en la base de datos.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tipo_cuarto_id_gen")
    @SequenceGenerator(name = "tipo_cuarto_id_gen", sequenceName = "tipo_cuarto_id_tipo_cuarto_seq", allocationSize = 1)
    @Column(name = "id_tipo_cuarto", nullable = false)
    private Integer id;

    /**
     * Nombre del tipo de cuarto.
     * Este campo almacena el nombre del tipo de cuarto, como "Simple", "Doble", "Suite", etc. Es un campo obligatorio.
     */
    @Column(name = "nombre_tipo_cuarto", nullable = false, length = 30)
    private String nombreTipoCuarto;

}
