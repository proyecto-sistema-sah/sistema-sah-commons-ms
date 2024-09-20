package com.sistema.sah.commons.entity;

import com.sistema.sah.commons.helper.enums.EstadoCuartoServicioEnum;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

@Data
@Entity
@Table(name = "estado_cuarto_servicio")
public class EstadoCuartoServicioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estado_cuarto_servicio_id_gen")
    @SequenceGenerator(name = "estado_cuarto_servicio_id_gen", sequenceName = "estado_cuarto_servicio_id_estado_cuarto_servicio_seq", allocationSize = 1)
    @Column(name = "id_estado_cuarto_servicio", nullable = false)
    private Integer id;

    @Enumerated(EnumType.STRING) // Almacenar el valor como una cadena de texto en la base de datos
    @ColumnDefault("'ACTIVO'")
    @Column(name = "nombre_estado_servicio", columnDefinition = "estado_cuarto_servicio_enum not null")
    private EstadoCuartoServicioEnum nombreEstadoServicio;

}