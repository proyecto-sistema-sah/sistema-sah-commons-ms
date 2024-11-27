package com.sistema.sah.commons.entity;

import com.sistema.sah.commons.helper.enums.EstadoFacturacionEnum;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;

/**
 * Entidad que representa la facturación de una reserva en el sistema.
 * <p>
 * Esta clase mapea la tabla `facturacion` en la base de datos, que contiene la información relacionada con la facturación
 * de una reserva. Esta tabla gestiona el código de facturación, la fecha de creación de la facturación, la relación con
 * la reserva y el usuario correspondiente, así como el estado de la facturación.
 * </p>
 */
@Data
@Entity
@Table(name = "facturacion")
public class FacturacionEntity {

    /**
     * Código único de la facturación.
     * Este campo es la clave primaria de la entidad y representa el identificador único de la facturación en la tabla `facturacion`.
     * El valor se genera automáticamente mediante una secuencia en la base de datos.
     */
    @Id
    @SequenceGenerator(name = "facturacion_id_gen", sequenceName = "estado_usuario_servicio_id_estado_usuario_servicio_seq", allocationSize = 1)
    @Column(name = "codigo_facturacion", nullable = false, length = 10)
    private String codigoFacturacion;

    /**
     * Fecha de creación de la facturación.
     * Este campo almacena la fecha y hora en la que se creó la facturación. Es un campo obligatorio.
     */
    @Column(name = "fecha_creacion_facturacion", nullable = false)
    private LocalDateTime fechaCreacionFacturacion;

    @Column(name = "url_pdf", nullable = false)
    private String urlPdf;

    /**
     * Reserva asociada a la facturación.
     * Este campo establece una relación de muchos a uno con la entidad `ReservaEntity`. Indica que cada facturación está asociada
     * a una única reserva.
     */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "codigo_reserva_fk", nullable = false)
    private ReservaEntity codigoReservaEntityFk;

    /**
     * Usuario que realiza la facturación.
     * Este campo establece una relación de muchos a uno con la entidad `UsuarioEntity`. Indica que cada facturación está asociada
     * a un único usuario.
     */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "codigo_usuario_fk", nullable = false)
    private UsuarioEntity codigoUsuarioEntityFk;

    /**
     * Estado de la facturación.
     * Este campo almacena el estado de la facturación, como "PENDIENTE", "PAGADO", "CANCELADO". El valor es almacenado como una cadena
     * de texto en la base de datos utilizando el tipo {@link EnumType#STRING}. El valor predeterminado es "PENDIENTE".
     */
    @Enumerated(EnumType.STRING) // Almacenar el valor como una cadena de texto en la base de datos
    @ColumnDefault("'PENDIENTE'")
    @Column(name = "estado_facturacion", columnDefinition = "estado_facturacion_enum not null")
    private EstadoFacturacionEnum estadoFacturacion;
}
