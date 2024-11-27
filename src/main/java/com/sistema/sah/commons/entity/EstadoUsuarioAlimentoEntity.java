package com.sistema.sah.commons.entity;

import com.sistema.sah.commons.helper.enums.EstadoUsuarioAlimentoEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

/**
 * Entidad que representa el estado de un alimento asociado a un usuario en el sistema.
 * <p>
 * Esta clase mapea la tabla `estado_usuario_alimento` en la base de datos, que define los diferentes estados en los que
 * puede encontrarse un alimento para un usuario, como "PREPARACION", "LISTO", "ENTREGADO", entre otros.
 * </p>
 */
@Getter
@Setter
@Entity
@Table(name = "estado_usuario_alimento")
public class EstadoUsuarioAlimentoEntity {

    /**
     * Identificador único del estado del alimento para un usuario.
     * Este campo es la clave primaria de la entidad y representa el identificador único del estado de un alimento
     * para un usuario en la tabla `estado_usuario_alimento`. El valor se genera automáticamente mediante una secuencia en la base de datos.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "estado_usuario_alimento_id_gen")
    @SequenceGenerator(name = "estado_usuario_alimento_id_gen", sequenceName = "estado_usuario_alimento_id_estado_usuario_alimento_seq", allocationSize = 1)
    @Column(name = "id_estado_usuario_alimento", nullable = false)
    private Integer id;

    /**
     * Nombre del estado del alimento para un usuario.
     * Este campo almacena el nombre del estado del alimento para un usuario, como "PREPARACION", "LISTO", "ENTREGADO".
     * El valor es almacenado como una cadena de texto en la base de datos utilizando el tipo {@link EnumType#STRING}.
     * El valor predeterminado es "PREPARACION" si no se especifica otro estado.
     */
    @Enumerated(EnumType.STRING) // Almacenar el valor como una cadena de texto en la base de datos
    @ColumnDefault("'PREPARACION'")
    @Column(name = "nombre_estado_usuario_alimento", columnDefinition = "estado_usuario_alimento_enum not null")
    private EstadoUsuarioAlimentoEnum nombreEstadoUsuarioAlimento;
}
