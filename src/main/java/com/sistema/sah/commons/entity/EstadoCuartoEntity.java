package com.sistema.sah.commons.entity;

import com.sistema.sah.commons.helper.enums.EstadoCuartoEnum;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

@Data
@Entity
@Table(name = "estado_cuarto")
public class EstadoCuartoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estado_cuarto_id_gen")
    @SequenceGenerator(name = "estado_cuarto_id_gen", sequenceName = "estado_cuarto_id_estado_cuarto_seq", allocationSize = 1)
    @Column(name = "id_estado_cuarto", nullable = false)
    private Integer id;

    @Enumerated(EnumType.STRING) // Almacenar el valor como una cadena de texto en la base de datos
    @ColumnDefault("'LIBRE'")
    @Column(name = "nombre_estado_cuarto", columnDefinition = "estado_cuarto_enum not null")
    private EstadoCuartoEnum nombreEstadoCuarto;
}