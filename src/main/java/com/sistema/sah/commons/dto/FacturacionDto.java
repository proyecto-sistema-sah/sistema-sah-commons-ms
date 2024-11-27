package com.sistema.sah.commons.dto;

import com.sistema.sah.commons.helper.enums.EstadoFacturacionEnum;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * DTO (Data Transfer Object) que representa la facturación de una reserva.
 * <p>
 * Esta clase encapsula la información relacionada con la facturación de una reserva, incluyendo el código
 * de facturación, la fecha de creación, la reserva asociada, el usuario que realizó la reserva y el estado
 * actual de la facturación. El estado de la facturación se define mediante la enumeración {@link EstadoFacturacionEnum}.
 * </p>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FacturacionDto implements Serializable {

    /**
     * Código único de la facturación.
     * Este campo representa el identificador único de la facturación en el sistema.
     */
    private String codigoFacturacion;

    /**
     * Fecha y hora de creación de la facturación.
     * Este campo indica la fecha y hora en la que se generó la factura.
     */
    private LocalDateTime fechaCreacionFacturacion;

    private String urlPdf;

    /**
     * Reserva asociada a la facturación.
     * Este campo representa la reserva vinculada a la factura, usando un objeto {@link ReservaDto}.
     */
    private ReservaDto codigoReservaDtoFk;

    /**
     * Usuario asociado a la facturación.
     * Este campo representa el usuario que realizó la reserva, usando un objeto {@link UsuarioDto}.
     */
    private UsuarioDto codigoUsuarioDtoFk;

    /**
     * Estado de la facturación.
     * Este campo indica el estado actual de la facturación, representado por un valor de la enumeración
     * {@link EstadoFacturacionEnum}, que puede tener valores como PENDIENTE, PAGADO, CANCELADO, etc.
     */
    private EstadoFacturacionEnum estadoFacturacion;
}
