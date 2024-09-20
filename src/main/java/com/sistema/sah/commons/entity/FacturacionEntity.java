package com.sistema.sah.commons.entity;

import com.sistema.sah.commons.helper.enums.EstadoFacturacionEnum;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;
import java.time.OffsetDateTime;

@Data
@Entity
@Table(name = "facturacion")
public class FacturacionEntity {
    @Id
    @SequenceGenerator(name = "facturacion_id_gen", sequenceName = "estado_usuario_servicio_id_estado_usuario_servicio_seq", allocationSize = 1)
    @Column(name = "codigo_facturacion", nullable = false, length = 10)
    private String codigoFacturacion;

    @Column(name = "fecha_creacion_facturacion", nullable = false)
    private LocalDateTime fechaCreacionFacturacion;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "codigo_reserva_fk", nullable = false)
    private ReservaEntity codigoReservaEntityFk;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "codigo_usuario_fk", nullable = false)
    private UsuarioEntity codigoUsuarioEntityFk;

    @Enumerated(EnumType.STRING) // Almacenar el valor como una cadena de texto en la base de datos
    @ColumnDefault("'PENDIENTE'")
    @Column(name = "estado_facturacion", columnDefinition = "estado_facturacion_enum not null")
    private EstadoFacturacionEnum estadoFacturacion;

}