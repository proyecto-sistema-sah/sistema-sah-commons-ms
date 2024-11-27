package com.sistema.sah.commons.dto;

import com.sistema.sah.commons.helper.enums.EstadoCuartoServicioEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO (Data Transfer Object) que representa el estado de un servicio asociado a un cuarto.
 * <p>
 * Esta clase encapsula el estado actual de un servicio asignado a un cuarto, el cual puede ser utilizado
 * para determinar si el servicio está disponible, en proceso, finalizado, etc. El estado se define mediante
 * un valor de la enumeración {@link EstadoCuartoServicioEnum}.
 * </p>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EstadoCuartoServicioDto implements Serializable {

    /**
     * Identificador único del estado del servicio en relación con un cuarto.
     * Este campo es utilizado como identificador del estado en la base de datos.
     */
    private Integer id;

    /**
     * Nombre del estado del servicio asignado a un cuarto.
     * Este campo representa el estado del servicio mediante un valor de la enumeración
     * {@link EstadoCuartoServicioEnum} (por ejemplo, ACTIVO, INACTIVO, COMPLETADO).
     */
    private EstadoCuartoServicioEnum nombreEstadoServicio;
}
