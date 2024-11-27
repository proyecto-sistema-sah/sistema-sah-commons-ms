package com.sistema.sah.commons.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "servicio")
public class ServicioEntity {
    @Id
    @SequenceGenerator(name = "servicio_id_gen", sequenceName = "estado_usuario_servicio_id_estado_usuario_servicio_seq", allocationSize = 1)
    @Column(name = "codigo_servicio", nullable = false, length = 7)
    private String codigoServicio;

    @Column(name = "nombre_servicio", nullable = false, length = 50)
    private String nombreServicio;

    @Column(name = "valor_servicio", nullable = false, precision = 10, scale = 2)
    private BigDecimal valorServicio;

    @Column(name = "codigo_imagen_servicio", nullable = false, length = Integer.MAX_VALUE)
    private String codigoImagenServicio;

    @Column(name = "detalle_servicio", length = Integer.MAX_VALUE)
    private String detalleServicio;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tipo_servicio_fk", nullable = false)
    private TipoServicioEntity tipoServicioEntityFk;

}