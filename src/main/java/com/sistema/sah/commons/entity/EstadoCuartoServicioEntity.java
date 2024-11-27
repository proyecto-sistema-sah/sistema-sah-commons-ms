package com.sistema.sah.commons.entity;

import com.sistema.sah.commons.helper.enums.EstadoCuartoServicioEnum;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

/**
 * Entidad que representa el estado de un servicio en un cuarto en el sistema.
 * <p>
 * Esta clase mapea la tabla `estado_cuarto_servicio` en la base de datos, que define los posibles estados de los
 * servicios disponibles en un cuarto, como "ACTIVO", "INACTIVO", etc.
 * </p>
 */
@Data
@Entity
@Table(name = "estado_cuarto_servicio")
public class EstadoCuartoServicioEntity {

    /**
     * Identificador único del estado del servicio en el cuarto.
     * Este campo es la clave primaria de la entidad y representa el identificador único del estado del servicio en la tabla `estado_cuarto_servicio`.
     * El valor se genera automáticamente mediante una secuencia en la base de datos.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estado_cuarto_servicio_id_gen")
    @SequenceGenerator(name = "estado_cuarto_servicio_id_gen", sequenceName = "estado_cuarto_servicio_id_estado_cuarto_servicio_seq", allocationSize = 1)
    @Column(name = "id_estado_cuarto_servicio", nullable = false)
    private Integer id;

    /**
     * Nombre del estado del servicio en el cuarto.
     * Este campo almacena el nombre del estado del servicio en el cuarto, como "ACTIVO", "INACTIVO".
     * El valor es almacenado como una cadena de texto en la base de datos utilizando un {@link EnumType#STRING}.
     * El valor predeterminado es "ACTIVO" si no se especifica otro estado.
     */
    @Enumerated(EnumType.STRING) // Almacenar el valor como una cadena de texto en la base de datos
    @ColumnDefault("'ACTIVO'")
    @Column(name = "nombre_estado_servicio", columnDefinition = "estado_cuarto_servicio_enum not null")
    private EstadoCuartoServicioEnum nombreEstadoServicio;
}
