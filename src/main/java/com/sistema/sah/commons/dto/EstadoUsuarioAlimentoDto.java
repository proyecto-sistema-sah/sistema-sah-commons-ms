package com.sistema.sah.commons.dto;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class EstadoUsuarioAlimentoDto {
    private Integer id;

/*
 TODO [Reverse Engineering] create field to map the 'nombre_estado_usuario_alimento' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @ColumnDefault("'PREPARACION'")
    @Column(name = "nombre_estado_usuario_alimento", columnDefinition = "estado_usuario_alimento_enum not null")
    private Object nombreEstadoUsuarioAlimento;
*/
}