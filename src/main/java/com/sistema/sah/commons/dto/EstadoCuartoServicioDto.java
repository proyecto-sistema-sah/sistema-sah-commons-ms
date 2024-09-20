package com.sistema.sah.commons.dto;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class EstadoCuartoServicioDto {
    private Integer id;

/*
 TODO [Reverse Engineering] create field to map the 'nombre_estado_servicio' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @ColumnDefault("'ACTIVO'")
    @Column(name = "nombre_estado_servicio", columnDefinition = "estado_cuarto_servicio_enum not null")
    private Object nombreEstadoServicio;
*/
}