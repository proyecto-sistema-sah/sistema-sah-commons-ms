package com.sistema.sah.commons.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tipo_cuarto")
public class TipoCuartoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tipo_cuarto_id_gen")
    @SequenceGenerator(name = "tipo_cuarto_id_gen", sequenceName = "tipo_cuarto_id_tipo_cuarto_seq", allocationSize = 1)
    @Column(name = "id_tipo_cuarto", nullable = false)
    private Integer id;

    @Column(name = "nombre_tipo_cuarto", nullable = false, length = 30)
    private String nombreTipoCuarto;

}