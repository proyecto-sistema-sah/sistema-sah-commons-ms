package com.sistema.sah.commons.entity;

import jakarta.persistence.*;
import lombok.Data;

/**
 * Entidad que representa el tipo de servicio en el sistema.
 * <p>
 * Esta clase mapea la tabla {@code tipo_servicio} en la base de datos, que contiene información sobre los distintos
 * tipos de servicios, como su nombre. Cada tipo de servicio tiene un identificador único.
 * </p>
 */
@Data
@Entity
@Table(name = "tipo_servicio")
public class TipoServicioEntity {

    /**
     * Identificador único del tipo de servicio.
     * Este campo es la clave primaria de la entidad y representa el identificador único del tipo de servicio en la tabla {@code tipo_servicio}.
     * El valor se genera automáticamente mediante una secuencia en la base de datos.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tipo_servicio_id_gen")
    @SequenceGenerator(name = "tipo_servicio_id_gen", sequenceName = "tipo_servicio_id_tipo_servicio_seq", allocationSize = 1)
    @Column(name = "id_tipo_servicio", nullable = false)
    private Integer id;

    /**
     * Nombre del tipo de servicio.
     * Este campo almacena el nombre del tipo de servicio, como "Limpieza", "Mantenimiento", etc. Es un campo obligatorio.
     */
    @Column(name = "nombre_tipo_servicio", nullable = false, length = 30)
    private String nombreTipoServicio;

}
