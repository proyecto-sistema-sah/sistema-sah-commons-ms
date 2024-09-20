package com.sistema.sah.commons.entity;

import com.sistema.sah.commons.entity.embeddedid.ReservaCuartoIdEntity;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "reserva_cuarto")
public class ReservaCuartoEntity {
    @SequenceGenerator(name = "reserva_cuarto_id_gen", sequenceName = "estado_usuario_servicio_id_estado_usuario_servicio_seq", allocationSize = 1)
    @EmbeddedId
    private ReservaCuartoIdEntity id;

    @MapsId("codigoReservaFk")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "codigo_reserva_fk", nullable = false)
    private ReservaEntity codigoReservaEntityFk;

    @MapsId("codigoCuartoFk")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "codigo_cuarto_fk", nullable = false)
    private CuartoEntity codigoCuartoEntityFk;

}