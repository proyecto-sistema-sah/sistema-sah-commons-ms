package com.sistema.sah.commons.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "estado_usuario_alimento")
public class EstadoUsuarioAlimentoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estado_usuario_alimento_id_gen")
    @SequenceGenerator(name = "estado_usuario_alimento_id_gen", sequenceName = "estado_usuario_alimento_id_estado_usuario_alimento_seq", allocationSize = 1)
    @Column(name = "id_estado_usuario_alimento", nullable = false)
    private Integer id;

/*
 TODO [Reverse Engineering] create field to map the 'nombre_estado_usuario_alimento' column
 Available actions: Define target Java type | Uncomment as is | Remove column mapping
    @ColumnDefault("'PREPARACION'")
    @Column(name = "nombre_estado_usuario_alimento", columnDefinition = "estado_usuario_alimento_enum not null")
    private Object nombreEstadoUsuarioAlimento;
*/
}