package com.sistema.sah.commons.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class FacturacionDto {
    private String codigoFacturacion;

    private LocalDateTime fechaCreacionFacturacion;

    private ReservaDto codigoReservaDtoFk;

    private UsuarioDto codigoUsuarioDtoFk;

/*
 TODO [Reverse Engineering] create field to map the 'estado_facturacion' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @ColumnDefault("'PENDIENTE'")
    @Column(name = "estado_facturacion", columnDefinition = "estado_facturacion_enum not null")
    private Object estadoFacturacion;
*/
}