package com.sistema.sah.commons.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "estado_usuario_servicio")
public class EstadoUsuarioServicioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estado_usuario_servicio_id_gen")
    @SequenceGenerator(name = "estado_usuario_servicio_id_gen", sequenceName = "estado_usuario_servicio_id_estado_usuario_servicio_seq", allocationSize = 1)
    @Column(name = "id_estado_usuario_servicio", nullable = false)
    private Integer id;

/*
 TODO [Reverse Engineering] create field to map the 'nombre_estado_servicio' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @ColumnDefault("'PENDIENTE'")
    @Column(name = "nombre_estado_servicio", columnDefinition = "estado_usuario_servicio_enum not null")
    private Object nombreEstadoServicio;
*/
}