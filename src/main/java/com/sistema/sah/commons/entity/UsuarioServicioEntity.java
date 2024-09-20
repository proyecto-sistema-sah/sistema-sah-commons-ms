package com.sistema.sah.commons.entity;

import com.sistema.sah.commons.entity.embeddedid.UsuarioServicioIdEntity;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Data
@Entity
@Table(name = "usuario_servicio")
public class UsuarioServicioEntity {
    @SequenceGenerator(name = "usuario_servicio_id_gen", sequenceName = "tipo_usuario_id_tipo_usuario_seq", allocationSize = 1)
    @EmbeddedId
    private UsuarioServicioIdEntity id;

    @MapsId("codigoServicioFk")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "codigo_servicio_fk", nullable = false)
    private ServicioEntity codigoServicioEntityFk;

    @MapsId("codigoUsuarioFk")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "codigo_usuario_fk", nullable = false)
    private UsuarioEntity codigoUsuarioEntityFk;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "estado_usuario_servicio_fk", nullable = false)
    private EstadoUsuarioServicioEntity estadoUsuarioServicioEntityFk;

}