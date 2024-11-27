package com.sistema.sah.commons.entity;

import com.sistema.sah.commons.helper.enums.EstadoReservaEnum;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

/**
 * Entidad que representa el estado de una reserva en el sistema.
 * <p>
 * Esta clase mapea la tabla `estado_reserva` en la base de datos, que define los diferentes estados en los que
 * puede encontrarse una reserva, como "PENDIENTE", "CONFIRMADA", "CANCELADA", entre otros.
 * </p>
 */
@Data
@Entity
@Table(name = "estado_reserva")
public class EstadoReservaEntity {

    /**
     * Identificador único del estado de la reserva.
     * Este campo es la clave primaria de la entidad y representa el identificador único de un estado de reserva
     * en la tabla `estado_reserva`. El valor se genera automáticamente mediante una secuencia en la base de datos.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estado_reserva_id_gen")
    @SequenceGenerator(name = "estado_reserva_id_gen", sequenceName = "estado_reserva_id_estado_reserva_seq", allocationSize = 1)
    @Column(name = "id_estado_reserva", nullable = false)
    private Integer id;

    /**
     * Nombre del estado de la reserva.
     * Este campo almacena el nombre del estado de la reserva, como "PENDIENTE", "CONFIRMADA", "CANCELADA".
     * El valor es almacenado como una cadena de texto en la base de datos utilizando el tipo {@link EnumType#STRING}.
     * El valor predeterminado es "PENDIENTE" si no se especifica otro estado.
     */
    @Enumerated(EnumType.STRING) // Almacenar el valor como una cadena de texto en la base de datos
    @ColumnDefault("'PENDIENTE'")
    @Column(name = "nombre_estado_reserva", columnDefinition = "estado_reserva_enum not null")
    private EstadoReservaEnum nombreEstadoReserva;
}
