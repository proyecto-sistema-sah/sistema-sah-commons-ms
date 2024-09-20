package com.sistema.sah.commons.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tipo_servicio")
public class TipoServicioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tipo_servicio_id_gen")
    @SequenceGenerator(name = "tipo_servicio_id_gen", sequenceName = "tipo_servicio_id_tipo_servicio_seq", allocationSize = 1)
    @Column(name = "id_tipo_servicio", nullable = false)
    private Integer id;

    @Column(name = "nombre_tipo_servicio", nullable = false, length = 30)
    private String nombreTipoServicio;

}