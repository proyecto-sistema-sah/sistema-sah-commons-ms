package com.sistema.sah.commons.entity;

import com.sistema.sah.commons.helper.enums.EstadoUsuarioServiceEnum;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

@Data
@Entity
@Table(name = "estado_usuario_servicio")
public class EstadoUsuarioServicioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estado_usuario_servicio_id_gen")
    @SequenceGenerator(name = "estado_usuario_servicio_id_gen", sequenceName = "estado_usuario_servicio_id_estado_usuario_servicio_seq", allocationSize = 1)
    @Column(name = "id_estado_usuario_servicio", nullable = false)
    private Integer id;


    @Enumerated(EnumType.STRING) // Almacenar el valor como una cadena de texto en la base de datos
    @ColumnDefault("'PENDIENTE'")
    @Column(name = "nombre_estado_servicio", columnDefinition = "estado_usuario_servicio_enum not null")
    private EstadoUsuarioServiceEnum nombreEstadoServicio;
}