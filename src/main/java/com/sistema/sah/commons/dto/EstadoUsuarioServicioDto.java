package com.sistema.sah.commons.dto;

import com.sistema.sah.commons.helper.enums.EstadoUsuarioServiceEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO (Data Transfer Object) que representa el estado de un usuario en relación con un servicio.
 * <p>
 * Esta clase encapsula el estado de un usuario respecto a un servicio específico, definiendo si el
 * servicio está activo, inactivo, completado, pendiente, etc. El estado se determina mediante un valor de
 * la enumeración {@link EstadoUsuarioServiceEnum}.
 * </p>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EstadoUsuarioServicioDto implements Serializable {

    /**
     * Identificador único del estado del servicio para el usuario.
     * Este campo representa el identificador único del estado en la base de datos.
     */
    private Integer id;

    /**
     * Nombre del estado del servicio para el usuario.
     * Este campo representa el estado del servicio, usando un valor de la enumeración
     * {@link EstadoUsuarioServiceEnum}, que puede incluir valores como ACTIVO, INACTIVO, PENDIENTE, etc.
     */
    private EstadoUsuarioServiceEnum nombreEstadoServicio;

}
