package com.sistema.sah.commons.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "estado_cuarto")
public class EstadoCuartoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estado_cuarto_id_gen")
    @SequenceGenerator(name = "estado_cuarto_id_gen", sequenceName = "estado_cuarto_id_estado_cuarto_seq", allocationSize = 1)
    @Column(name = "id_estado_cuarto", nullable = false)
    private Integer id;

/*
 TODO [Reverse Engineering] create field to map the 'nombre_estado_cuarto' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @ColumnDefault("'LIBRE'")
    @Column(name = "nombre_estado_cuarto", columnDefinition = "estado_cuarto_enum not null")
    private Object nombreEstadoCuarto;
*/
}