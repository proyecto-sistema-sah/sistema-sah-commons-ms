package com.sistema.sah.commons.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;

@Data
@Entity
@Table(name = "alimento")
public class AlimentoEntity {
    @Id
    @Column(name = "codigo_alimento", nullable = false, length = 5)
    private String codigoAlimento;

    @Column(name = "tiempo_preparacion_alimento", nullable = false)
    private LocalTime tiempoPreparacionAlimento;

    @Column(name = "nombre_alimento", nullable = false, length = 30)
    private String nombreAlimento;

    @Column(name = "detalle_alimento", length = Integer.MAX_VALUE)
    private String detalleAlimento;

    @Column(name = "codigo_imagen")
    private String codigoImagen;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tipo_alimento_fk", nullable = false)
    private TipoAlimentoEntity tipoAlimentoEntityFk;

}