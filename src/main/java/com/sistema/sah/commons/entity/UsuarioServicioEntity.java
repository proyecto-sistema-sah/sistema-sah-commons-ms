package com.sistema.sah.commons.entity;

import com.sistema.sah.commons.entity.embeddedid.UsuarioServicioIdEntity;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

/**
 * Entidad que representa la relación entre un usuario y un servicio.
 * <p>
 * Esta clase mapea la tabla {@code usuario_servicio} en la base de datos, que almacena las asociaciones entre los usuarios
 * y los servicios que están asignados a ellos. La relación es gestionada mediante una clave primaria compuesta
 * representada por {@link UsuarioServicioIdEntity}.
 * </p>
 */
@Data
@Entity
@Table(name = "usuario_servicio")
public class UsuarioServicioEntity {

    /**
     * Identificador compuesto de la relación entre el usuario y el servicio.
     * <p>
     * La clave primaria compuesta está representada por la clase {@link UsuarioServicioIdEntity},
     * que incluye el código de usuario y el código del servicio.
     * </p>
     */
    @SequenceGenerator(name = "usuario_servicio_id_gen", sequenceName = "tipo_usuario_id_tipo_usuario_seq", allocationSize = 1)
    @EmbeddedId
    private UsuarioServicioIdEntity id;

    /**
     * Relación con la entidad {@link ServicioEntity}.
     * <p>
     * Representa el servicio asociado al usuario. Es una relación de tipo {@code ManyToOne} con la entidad {@code ServicioEntity}.
     * Cada entrada en la tabla {@code usuario_servicio} está asociada a un servicio específico.
     * </p>
     */
    @MapsId("codigoServicioFk")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "codigo_servicio_fk", nullable = false)
    private ServicioEntity codigoServicioEntityFk;

    /**
     * Relación con la entidad {@link UsuarioEntity}.
     * <p>
     * Representa el usuario asociado al servicio. Es una relación de tipo {@code ManyToOne} con la entidad {@code UsuarioEntity}.
     * Cada entrada en la tabla {@code usuario_servicio} está asociada a un usuario específico.
     * </p>
     */
    @MapsId("codigoUsuarioFk")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.CASCADE)  // Elimina los registros relacionados cuando el usuario es eliminado
    @JoinColumn(name = "codigo_usuario_fk", nullable = false)
    private UsuarioEntity codigoUsuarioEntityFk;

    /**
     * Relación con la entidad {@link EstadoUsuarioServicioEntity}.
     * <p>
     * Representa el estado de la relación entre el usuario y el servicio. Es una relación de tipo {@code ManyToOne} con la entidad {@code EstadoUsuarioServicioEntity}.
     * </p>
     */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "estado_usuario_servicio_fk", nullable = false)
    private EstadoUsuarioServicioEntity estadoUsuarioServicioEntityFk;

}
