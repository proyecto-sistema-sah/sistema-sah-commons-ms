package com.sistema.sah.commons.dto;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class EstadoCuartoDto {
    private Integer id;

/*
 TODO [Reverse Engineering] create field to map the 'nombre_estado_cuarto' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @ColumnDefault("'LIBRE'")
    @Column(name = "nombre_estado_cuarto", columnDefinition = "estado_cuarto_enum not null")
    private Object nombreEstadoCuarto;
*/
}