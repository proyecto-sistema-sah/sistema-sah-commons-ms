package com.sistema.sah.commons.helper.enums;

import lombok.Getter;

/**
 * Enumeración que representa los posibles estados de facturación.
 */
@Getter
public enum EstadoFacturacionEnum {

    /**
     * Estado que indica que la factura ha sido pagada.
     */
    PAGADO("PAGADO"),

    /**
     * Estado que indica que la factura está pendiente de pago.
     */
    PENDIENTE("PENDIENTE"),

    /**
     * Estado que indica que la factura ha sido cancelada.
     */
    CANCELADO("CANCELADO");

    /**
     * Descripción asociada a cada estado de facturación.
     */
    private final String descripcion;

    /**
     * Constructor de la enumeración {@link EstadoFacturacionEnum}.
     * <p>
     * Asigna una descripción al estado de la facturación.
     * </p>
     *
     * @param descripcion la descripción del estado de la facturación.
     */
    EstadoFacturacionEnum(String descripcion) {
        this.descripcion = descripcion;
    }
}
