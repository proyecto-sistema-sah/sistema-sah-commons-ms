package com.sistema.sah.commons.entity;

import com.sistema.sah.commons.helper.enums.EstadoUsuarioServiceEnum;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

/**
 * Entidad que representa el estado de un servicio asociado a un usuario en el sistema.
 * <p>
 * Esta clase mapea la tabla `estado_usuario_servicio` en la base de datos, que define los posibles estados en los que
 * puede encontrarse un servicio asociado a un usuario, como "PENDIENTE", "COMPLETADO", "CANCELADO", etc.
 * </p>
 */
@Data
@Entity
@Table(name = "estado_usuario_servicio")
public class EstadoUsuarioServicioEntity {

    /**
     * Identificador único del estado del servicio para un usuario.
     * Este campo es la clave primaria de la entidad y representa el identificador único del estado de un servicio
     * para un usuario en la tabla `estado_usuario_servicio`. El valor se genera automáticamente mediante una secuencia
     * en la base de datos.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estado_usuario_servicio_id_gen")
    @SequenceGenerator(name = "estado_usuario_servicio_id_gen", sequenceName = "estado_usuario_servicio_id_estado_usuario_servicio_seq", allocationSize = 1)
    @Column(name = "id_estado_usuario_servicio", nullable = false)
    private Integer id;

    /**
     * Nombre del estado del servicio para un usuario.
     * Este campo almacena el nombre del estado del servicio para un usuario, como "PENDIENTE", "COMPLETADO", "CANCELADO".
     * El valor es almacenado como una cadena de texto en la base de datos utilizando el tipo {@link EnumType#STRING}.
     * El valor predeterminado es "PENDIENTE" si no se especifica otro estado.
     */
    @Enumerated(EnumType.STRING) // Almacenar el valor como una cadena de texto en la base de datos
    @ColumnDefault("'PENDIENTE'")
    @Column(name = "nombre_estado_servicio", columnDefinition = "estado_usuario_servicio_enum not null")
    private EstadoUsuarioServiceEnum nombreEstadoServicio;
}
