package com.sistema.sah.commons.dto;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class EstadoReservaDto {
    private Integer id;

/*
 TODO [Reverse Engineering] create field to map the 'nombre_estado_reserva' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @ColumnDefault("'PENDIENTE'")
    @Column(name = "nombre_estado_reserva", columnDefinition = "estado_reserva_enum not null")
    private Object nombreEstadoReserva;
*/
}