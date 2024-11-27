package com.sistema.sah.commons.entity;

import com.sistema.sah.commons.entity.embeddedid.UsuarioAlimentoIdEntity;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

/**
 * Entidad que representa la relación entre un usuario y un alimento en el sistema.
 * <p>
 * Esta clase mapea la tabla {@code usuario_alimento} en la base de datos, que almacena información sobre los alimentos
 * asociados a los usuarios, incluyendo el estado de cada alimento para el usuario.
 * </p>
 */
@Data
@Entity
@Table(name = "usuario_alimento")
public class UsuarioAlimentoEntity {

    /**
     * Identificador compuesto que representa la relación entre un usuario y un alimento.
     * Este campo es un {@link EmbeddedId} que se compone de dos claves foráneas: {@code codigo_usuario_fk} y
     * {@code codigo_alimento_fk}, representando el usuario y el alimento asociados.
     */
    @SequenceGenerator(name = "usuario_alimento_id_gen", sequenceName = "tipo_usuario_id_tipo_usuario_seq", allocationSize = 1)
    @EmbeddedId
    private UsuarioAlimentoIdEntity id;

    /**
     * Relación con la entidad {@link UsuarioEntity}.
     * Representa el usuario al que se asocia un alimento. Es una relación {@code ManyToOne} con la entidad {@code UsuarioEntity}.
     * La relación está configurada para eliminar en cascada cuando un usuario es eliminado.
     */
    @MapsId("codigoUsuarioFk")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JoinColumn(name = "codigo_usuario_fk", nullable = false)
    private UsuarioEntity codigoUsuarioEntityFk;

    /**
     * Relación con la entidad {@link AlimentoEntity}.
     * Representa el alimento asociado a un usuario. Es una relación {@code ManyToOne} con la entidad {@code AlimentoEntity}.
     */
    @MapsId("codigoAlimentoFk")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "codigo_alimento_fk", nullable = false)
    private AlimentoEntity codigoAlimentoEntityFk;

    /**
     * Relación con la entidad {@link EstadoUsuarioAlimentoEntity}.
     * Representa el estado del alimento para el usuario. Es una relación {@code ManyToOne} con la entidad {@code EstadoUsuarioAlimentoEntity}.
     */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "estado_usuario_alimento_fk", nullable = false)
    private EstadoUsuarioAlimentoEntity estadoUsuarioAlimentoEntityFk;

}
