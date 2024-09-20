package com.sistema.sah.commons.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "estado_reserva")
public class EstadoReservaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estado_reserva_id_gen")
    @SequenceGenerator(name = "estado_reserva_id_gen", sequenceName = "estado_reserva_id_estado_reserva_seq", allocationSize = 1)
    @Column(name = "id_estado_reserva", nullable = false)
    private Integer id;

/*
 TODO [Reverse Engineering] create field to map the 'nombre_estado_reserva' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @ColumnDefault("'PENDIENTE'")
    @Column(name = "nombre_estado_reserva", columnDefinition = "estado_reserva_enum not null")
    private Object nombreEstadoReserva;
*/
}