package com.sistema.sah.commons.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * Entidad que representa una reserva en el sistema.
 * <p>
 * Esta clase mapea la tabla `reserva` en la base de datos, que contiene la información relacionada con las reservas realizadas
 * en el sistema. Esta tabla incluye el código de la reserva, las fechas de inicio y fin de la reserva, el valor total de la
 * reserva, la relación con el usuario que realizó la reserva y el estado de la reserva.
 * </p>
 */
@Data
@Entity
@Table(name = "reserva")
public class ReservaEntity {

    /**
     * Código único de la reserva.
     * Este campo es la clave primaria de la entidad y representa el identificador único de la reserva en la tabla `reserva`.
     * El valor se genera automáticamente mediante una secuencia en la base de datos.
     */
    @Id
    @SequenceGenerator(name = "reserva_id_gen", sequenceName = "estado_usuario_servicio_id_estado_usuario_servicio_seq", allocationSize = 1)
    @Column(name = "codigo_reserva", nullable = false, length = 7)
    private String codigoReserva;

    /**
     * Fecha de inicio de la reserva.
     * Este campo almacena la fecha en la que la reserva comienza. Es un campo obligatorio.
     */
    @Column(name = "fecha_inicio_reserva", nullable = false)
    private LocalDate fechaInicioReserva;

    /**
     * Fecha de fin de la reserva.
     * Este campo almacena la fecha en la que la reserva finaliza. Es un campo obligatorio.
     */
    @Column(name = "fecha_fin_reserva", nullable = false)
    private LocalDate fechaFinReserva;

    /**
     * Fecha de creación de la reserva.
     * Este campo almacena la fecha y hora en la que se creó la reserva. Es un campo obligatorio.
     */
    @Column(name = "fecha_creacion_reserva", nullable = false)
    private LocalDateTime fechaCreacionReserva;

    /**
     * Fecha de la última actualización de la reserva.
     * Este campo almacena la fecha y hora de la última actualización de la reserva.
     */
    @Column(name = "fecha_actualizacion_reserva", nullable = false)
    private LocalDateTime fechaActualizacionReserva;

    /**
     * Valor total de la reserva.
     * Este campo almacena el valor total de la reserva, calculado en base al valor de las noches y los servicios seleccionados.
     */
    @Column(name = "valor_total_reserva", nullable = false, precision = 10, scale = 2)
    private BigDecimal valorTotalReserva;

    /**
     * Usuario que realizó la reserva.
     * Este campo establece una relación de muchos a uno con la entidad {@link UsuarioEntity}, indicando que cada reserva
     * está asociada a un único usuario.
     */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "codigo_usuario_fk", nullable = false)
    private UsuarioEntity codigoUsuarioEntityFk;

    /**
     * Estado de la reserva.
     * Este campo establece una relación de muchos a uno con la entidad {@link EstadoReservaEntity}, indicando el estado
     * actual de la reserva (ejemplo: "PENDIENTE", "CONFIRMADO", "CANCELADO").
     */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "estado_reserva_fk", nullable = false)
    private EstadoReservaEntity estadoReservaEntityFk;
}
