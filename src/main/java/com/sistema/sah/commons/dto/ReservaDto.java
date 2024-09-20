package com.sistema.sah.commons.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
public class ReservaDto {
    private String codigoReserva;

    private LocalDateTime fechaInicioReserva;

    private LocalDateTime fechaFinReserva;

    private LocalDateTime fechaCreacionReserva;

    private LocalDateTime fechaActualizacionReserva;

    private BigDecimal valorTotalReserva;

    private UsuarioDto codigoUsuarioDtoFk;

    private EstadoReservaDto estadoReservaDtoFk;

}