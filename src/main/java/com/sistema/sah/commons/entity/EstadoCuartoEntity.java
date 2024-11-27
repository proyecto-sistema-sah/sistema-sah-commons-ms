package com.sistema.sah.commons.entity;

import com.sistema.sah.commons.helper.enums.EstadoCuartoEnum;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

/**
 * Entidad que representa el estado de un cuarto en el sistema.
 * <p>
 * Esta clase mapea la tabla `estado_cuarto` en la base de datos, que contiene los diferentes estados posibles de un
 * cuarto, como "LIBRE", "OCUPADO", "EN MANTENIMIENTO", entre otros.
 * </p>
 */
@Data
@Entity
@Table(name = "estado_cuarto")
public class EstadoCuartoEntity {

    /**
     * Identificador único del estado del cuarto.
     * Este campo es la clave primaria y representa el identificador único del estado del cuarto en la tabla `estado_cuarto`.
     * El valor se genera automáticamente mediante una secuencia en la base de datos.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estado_cuarto_id_gen")
    @SequenceGenerator(name = "estado_cuarto_id_gen", sequenceName = "estado_cuarto_id_estado_cuarto_seq", allocationSize = 1)
    @Column(name = "id_estado_cuarto", nullable = false)
    private Integer id;

    /**
     * Nombre del estado del cuarto.
     * Este campo almacena el nombre del estado del cuarto, como "LIBRE", "OCUPADO", "EN MANTENIMIENTO".
     * El valor es almacenado como una cadena de texto en la base de datos utilizando un {@link EnumType#STRING}.
     * El valor predeterminado es "LIBRE" si no se especifica otro estado.
     */
    @Enumerated(EnumType.STRING) // Almacenar el valor como una cadena de texto en la base de datos
    @ColumnDefault("'LIBRE'")
    @Column(name = "nombre_estado_cuarto", columnDefinition = "estado_cuarto_enum not null")
    private EstadoCuartoEnum nombreEstadoCuarto;
}
