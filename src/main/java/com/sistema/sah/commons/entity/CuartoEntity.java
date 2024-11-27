package com.sistema.sah.commons.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@Table(name = "cuarto")
public class CuartoEntity {
    @Id
    @Column(name = "codigo_cuarto", nullable = false, length = 7)
    private String codigoCuarto;

    @Column(name = "numero_cuarto", nullable = false, length = 7)
    private String numeroCuarto;

    @Column(name = "codigo_imagen_cuarto", nullable = false, length = Integer.MAX_VALUE)
    private String codigoImagenCuarto;

    @Column(name = "valor_noche_cuarto", nullable = false, precision = 10, scale = 2)
    private BigDecimal valorNocheCuarto;

    @Column(name = "detalle_cuarto", length = Integer.MAX_VALUE)
    private String detalleCuarto;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tipo_cuarto_fk", nullable = false)
    private TipoCuartoEntity tipoCuartoEntityFk;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "estado_cuarto_fk", nullable = false)
    private EstadoCuartoEntity estadoCuartoEntityFk;

}