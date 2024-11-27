package com.sistema.sah.commons.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Data
@Entity
@Table(name = "reserva")
public class ReservaEntity {
    @Id
    @SequenceGenerator(name = "reserva_id_gen", sequenceName = "estado_usuario_servicio_id_estado_usuario_servicio_seq", allocationSize = 1)
    @Column(name = "codigo_reserva", nullable = false, length = 5)
    private String codigoReserva;

    @Column(name = "fecha_inicio_reserva", nullable = false)
    private LocalDate fechaInicioReserva;

    @Column(name = "fecha_fin_reserva", nullable = false)
    private LocalDate fechaFinReserva;

    @Column(name = "fecha_creacion_reserva", nullable = false)
    private LocalDateTime fechaCreacionReserva;

    @Column(name = "fecha_actualizacion_reserva", nullable = false)
    private LocalDateTime fechaActualizacionReserva;

    @Column(name = "valor_total_reserva", nullable = false, precision = 10, scale = 2)
    private BigDecimal valorTotalReserva;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "codigo_usuario_fk", nullable = false)
    private UsuarioEntity codigoUsuarioEntityFk;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "estado_reserva_fk", nullable = false)
    private EstadoReservaEntity estadoReservaEntityFk;

}