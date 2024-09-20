package com.sistema.sah.commons.entity;

import com.sistema.sah.commons.entity.embeddedid.UsuarioAlimentoIdEntity;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Data
@Entity
@Table(name = "usuario_alimento")
public class UsuarioAlimentoEntity {
    @SequenceGenerator(name = "usuario_alimento_id_gen", sequenceName = "tipo_usuario_id_tipo_usuario_seq", allocationSize = 1)
    @EmbeddedId
    private UsuarioAlimentoIdEntity id;

    @MapsId("codigoUsuarioFk")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "codigo_usuario_fk", nullable = false)
    private UsuarioEntity codigoUsuarioEntityFk;

    @MapsId("codigoAlimentoFk")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "codigo_alimento_fk", nullable = false)
    private AlimentoEntity codigoAlimentoEntityFk;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "estado_usuario_alimento_fk", nullable = false)
    private EstadoUsuarioAlimentoEntity estadoUsuarioAlimentoEntityFk;

}