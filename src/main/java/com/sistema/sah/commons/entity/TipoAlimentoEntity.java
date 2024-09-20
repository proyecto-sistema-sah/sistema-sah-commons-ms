package com.sistema.sah.commons.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tipo_alimento")
public class TipoAlimentoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "tipo_alimento_id_gen")
    @SequenceGenerator(name = "tipo_alimento_id_gen", sequenceName = "tipo_alimento_id_tipo_alimento_seq", allocationSize = 1)
    @Column(name = "id_tipo_alimento", nullable = false)
    private Integer id;

    @Column(name = "nombre_tipo_alimento", nullable = false, length = 30)
    private String nombreTipoAlimento;

}