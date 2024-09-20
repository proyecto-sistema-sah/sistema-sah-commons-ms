package com.sistema.sah.commons.entity;

import com.sistema.sah.commons.entity.embeddedid.CuartoServicioIdEntity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cuarto_servicio")
public class CuartoServicioEntity {
    @EmbeddedId
    private CuartoServicioIdEntity id;

    @MapsId("codigoCuartoFk")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "codigo_cuarto_fk", nullable = false)
    private CuartoEntity codigoCuartoEntityFk;

    @MapsId("codigoServicioFk")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "codigo_servicio_fk", nullable = false)
    private ServicioEntity codigoServicioEntityFk;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "estado_cuarto_servicio_fk", nullable = false)
    private EstadoCuartoServicioEntity estadoCuartoServicioEntityFk;

}