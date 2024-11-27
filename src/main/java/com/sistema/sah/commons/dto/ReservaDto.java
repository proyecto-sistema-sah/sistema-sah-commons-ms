package com.sistema.sah.commons.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * DTO (Data Transfer Object) que representa una reserva en el sistema.
 * <p>
 * Esta clase encapsula la información relacionada con una reserva, incluyendo el código de reserva, las fechas
 * de inicio y fin, los valores asociados, y el usuario y el estado relacionados con la reserva.
 * </p>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReservaDto implements Serializable {

    /**
     * Código único de la reserva.
     * Este campo representa el identificador único de la reserva en el sistema.
     */
    private String codigoReserva;

    /**
     * Fecha de inicio de la reserva.
     * Este campo indica la fecha en la que comienza la reserva.
     */
    private LocalDate fechaInicioReserva;

    /**
     * Fecha de fin de la reserva.
     * Este campo indica la fecha en la que termina la reserva.
     */
    private LocalDate fechaFinReserva;

    /**
     * Fecha de creación de la reserva.
     * Este campo indica la fecha y hora en que se creó la reserva en el sistema.
     */
    private LocalDateTime fechaCreacionReserva;

    /**
     * Fecha de la última actualización de la reserva.
     * Este campo indica la fecha y hora en que se actualizó la reserva por última vez.
     */
    private LocalDateTime fechaActualizacionReserva;

    /**
     * Valor total de la reserva.
     * Este campo representa el costo total de la reserva, calculado con base en las noches y servicios asociados.
     */
    private BigDecimal valorTotalReserva;

    /**
     * Usuario asociado a la reserva.
     * Este campo contiene una referencia al objeto {@link UsuarioDto}, que representa el usuario que realizó la reserva.
     */
    private UsuarioDto codigoUsuarioDtoFk;

    /**
     * Estado de la reserva.
     * Este campo representa el estado actual de la reserva, utilizando un objeto {@link EstadoReservaDto} que
     * describe el estado, como PENDIENTE, CONFIRMADA, CANCELADA, etc.
     */
    private EstadoReservaDto estadoReservaDtoFk;

}
