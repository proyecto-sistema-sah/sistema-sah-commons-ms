package com.sistema.sah.commons.entity;

import com.sistema.sah.commons.helper.enums.EstadoUsuarioAlimentoEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

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


    @Enumerated(EnumType.STRING) // Almacenar el valor como una cadena de texto en la base de datos
    @ColumnDefault("'PREPARACION'")
    @Column(name = "nombre_estado_usuario_alimento", columnDefinition = "estado_usuario_alimento_enum not null")
    private EstadoUsuarioAlimentoEnum nombreEstadoUsuarioAlimento;

}