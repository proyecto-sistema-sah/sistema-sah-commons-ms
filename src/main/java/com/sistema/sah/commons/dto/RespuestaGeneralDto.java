package com.sistema.sah.commons.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

/**
 * DTO (Data Transfer Object) que representa una respuesta general del sistema.
 * <p>
 * Esta clase encapsula los detalles de una respuesta que se devuelve desde un servicio o controlador en el sistema,
 * incluyendo el estado HTTP de la respuesta, los datos asociados a la respuesta y un mensaje informativo.
 * </p>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RespuestaGeneralDto implements Serializable {

    /**
     * Estado HTTP de la respuesta.
     * Este campo representa el código de estado HTTP asociado con la respuesta, como {@link HttpStatus#OK},
     * {@link HttpStatus#NOT_FOUND}, {@link HttpStatus#INTERNAL_SERVER_ERROR}, entre otros.
     */
    private HttpStatus status;

    /**
     * Datos asociados a la respuesta.
     * Este campo contiene los datos específicos que se desean retornar al cliente, como un objeto, una lista, etc.
     * Puede ser de cualquier tipo (genérico) que represente la información relevante para la respuesta.
     */
    private Object data;

    /**
     * Mensaje informativo de la respuesta.
     * Este campo contiene un mensaje que describe el resultado de la operación, como "Operación exitosa",
     * "Error en la creación", etc. Este mensaje es útil para brindar detalles sobre el estado de la respuesta.
     */
    private String message;

}
