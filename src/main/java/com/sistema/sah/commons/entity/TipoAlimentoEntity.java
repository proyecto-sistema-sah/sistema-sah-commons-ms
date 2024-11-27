package com.sistema.sah.commons.entity;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Entidad que representa el tipo de alimento en el sistema.
 * <p>
 * Esta clase mapea la tabla {@code tipo_alimento} en la base de datos, la cual contiene información sobre los distintos
 * tipos de alimentos, como su nombre. Cada tipo de alimento está asociado a un identificador único.
 * </p>
 */
@Data
@Entity
@Table(name = "tipo_alimento")
public class TipoAlimentoEntity {

    /**
     * Identificador único del tipo de alimento.
     * Este campo es la clave primaria de la entidad y representa el identificador único del tipo de alimento en la tabla {@code tipo_alimento}.
     * El valor se genera automáticamente mediante una secuencia en la base de datos.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tipo_alimento_id_gen")
    @SequenceGenerator(name = "tipo_alimento_id_gen", sequenceName = "tipo_alimento_id_tipo_alimento_seq", allocationSize = 1)
    @Column(name = "id_tipo_alimento", nullable = false)
    private Integer id;

    /**
     * Nombre del tipo de alimento.
     * Este campo almacena el nombre del tipo de alimento, como "Carnes", "Verduras", etc. Es un campo obligatorio.
     */
    @Column(name = "nombre_tipo_alimento", nullable = false, length = 30)
    private String nombreTipoAlimento;

}
