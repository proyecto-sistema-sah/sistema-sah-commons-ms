package com.sistema.sah.commons.entity;

import com.sistema.sah.commons.entity.embeddedid.ReservaCuartoIdEntity;
import jakarta.persistence.*;
import lombok.Data;

/**
 * Entidad que representa la relación entre una reserva y un cuarto en el sistema.
 * <p>
 * Esta clase mapea la tabla `reserva_cuarto` en la base de datos, que almacena la información sobre los cuartos reservados
 * para una reserva específica. El propósito de esta entidad es establecer la relación entre las reservas y los cuartos
 * que se han asignado en el sistema.
 * </p>
 */
@Data
@Entity
@Table(name = "reserva_cuarto")
public class ReservaCuartoEntity {

    /**
     * Identificador compuesto que combina la clave foránea de la reserva y el cuarto.
     * Este campo es la clave primaria compuesta de la entidad, que se representa mediante un {@link ReservaCuartoIdEntity}.
     * Este identificador compuesto establece la relación entre una reserva y el cuarto correspondiente.
     */
    @SequenceGenerator(name = "reserva_cuarto_id_gen", sequenceName = "estado_usuario_servicio_id_estado_usuario_servicio_seq", allocationSize = 1)
    @EmbeddedId
    private ReservaCuartoIdEntity id;

    /**
     * Reserva asociada a este cuarto.
     * Este campo establece una relación de muchos a uno con la entidad {@link ReservaEntity}, lo que indica que varias
     * entradas en la tabla `reserva_cuarto` pueden estar asociadas con una única reserva.
     */
    @MapsId("codigoReservaFk")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "codigo_reserva_fk", nullable = false)
    private ReservaEntity codigoReservaEntityFk;

    /**
     * Cuarto asociado a esta reserva.
     * Este campo establece una relación de muchos a uno con la entidad {@link CuartoEntity}, lo que indica que varias
     * entradas en la tabla `reserva_cuarto` pueden estar asociadas con un único cuarto.
     */
    @MapsId("codigoCuartoFk")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "codigo_cuarto_fk", nullable = false)
    private CuartoEntity codigoCuartoEntityFk;
}
