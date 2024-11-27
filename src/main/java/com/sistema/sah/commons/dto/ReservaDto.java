package com.sistema.sah.commons.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ReservaDto implements Serializable {
    private String codigoReserva;

    private LocalDate fechaInicioReserva;

    private LocalDate fechaFinReserva;

    private LocalDateTime fechaCreacionReserva;

    private LocalDateTime fechaActualizacionReserva;

    private BigDecimal valorTotalReserva;

    private UsuarioDto codigoUsuarioDtoFk;

    private EstadoReservaDto estadoReservaDtoFk;

}