package com.sistema.sah.commons.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

/**
 * Entidad que representa un servicio en el sistema.
 * <p>
 * Esta clase mapea la tabla `servicio` en la base de datos, que contiene información relacionada con los servicios disponibles
 * en el sistema, como su código, nombre, valor, detalles y tipo.
 * </p>
 */
@Data
@Entity
@Table(name = "servicio")
public class ServicioEntity {

    /**
     * Código único del servicio.
     * Este campo es la clave primaria de la entidad y representa el identificador único del servicio en la tabla `servicio`.
     * El valor se genera automáticamente mediante una secuencia en la base de datos.
     */
    @Id
    @SequenceGenerator(name = "servicio_id_gen", sequenceName = "estado_usuario_servicio_id_estado_usuario_servicio_seq", allocationSize = 1)
    @Column(name = "codigo_servicio", nullable = false, length = 7)
    private String codigoServicio;

    /**
     * Nombre del servicio.
     * Este campo almacena el nombre del servicio, como "Wi-Fi", "Desayuno", etc. Es un campo obligatorio.
     */
    @Column(name = "nombre_servicio", nullable = false, length = 50)
    private String nombreServicio;

    /**
     * Valor del servicio.
     * Este campo almacena el costo asociado con el servicio. Es un campo obligatorio con precisión de 10 y escala de 2.
     */
    @Column(name = "valor_servicio", nullable = false, precision = 10, scale = 2)
    private BigDecimal valorServicio;

    /**
     * Código de la imagen del servicio.
     * Este campo almacena el código de la imagen asociada al servicio, para ser mostrado en la interfaz de usuario. Es un campo obligatorio.
     */
    @Column(name = "codigo_imagen_servicio", nullable = false, length = Integer.MAX_VALUE)
    private String codigoImagenServicio;

    /**
     * Detalles del servicio.
     * Este campo almacena una descripción adicional del servicio. Este campo es opcional.
     */
    @Column(name = "detalle_servicio", length = Integer.MAX_VALUE)
    private String detalleServicio;

    /**
     * Tipo de servicio.
     * Este campo establece una relación de muchos a uno con la entidad {@link TipoServicioEntity}, indicando el tipo de servicio
     * (por ejemplo, "Comida", "Transporte", "Entretenimiento").
     */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "tipo_servicio_fk", nullable = false)
    private TipoServicioEntity tipoServicioEntityFk;
}
