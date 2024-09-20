package com.sistema.sah.commons.entity;

import com.sistema.sah.commons.helper.enums.EstadoReservaEnum;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

@Data
@Entity
@Table(name = "estado_reserva")
public class EstadoReservaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estado_reserva_id_gen")
    @SequenceGenerator(name = "estado_reserva_id_gen", sequenceName = "estado_reserva_id_estado_reserva_seq", allocationSize = 1)
    @Column(name = "id_estado_reserva", nullable = false)
    private Integer id;

    @Enumerated(EnumType.STRING) // Almacenar el valor como una cadena de texto en la base de datos
    @ColumnDefault("'PENDIENTE'")
    @Column(name = "nombre_estado_reserva", columnDefinition = "estado_reserva_enum not null")
    private EstadoReservaEnum nombreEstadoReserva;

}