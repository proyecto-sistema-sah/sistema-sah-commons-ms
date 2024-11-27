package com.sistema.sah.commons.dto;

import com.sistema.sah.commons.dto.embeddedid.CuartoServicioIdDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO (Data Transfer Object) que representa la relación entre un cuarto y un servicio.
 * <p>
 * Esta clase encapsula la información sobre la relación entre un cuarto específico y
 * los servicios asociados a él, incluyendo los identificadores de los mismos y el estado
 * de dicha relación.
 * </p>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CuartoServicioDto implements Serializable {

    /**
     * Identificador compuesto para la relación entre el cuarto y el servicio.
     * Este campo contiene el objeto {@link CuartoServicioIdDto}, que combina los identificadores
     * del cuarto y el servicio en una clave primaria compuesta.
     */
    private CuartoServicioIdDto id;

    /**
     * Referencia al cuarto asociado.
     * Este campo contiene una referencia al objeto {@link CuartoDto}, que describe el cuarto
     * asociado a este servicio.
     */
    private CuartoDto codigoCuartoDtoFk;

    /**
     * Referencia al servicio asociado.
     * Este campo contiene una referencia al objeto {@link ServicioDto}, que describe el servicio
     * asociado al cuarto.
     */
    private ServicioDto codigoServicioDtoFk;

    /**
     * Estado de la relación entre el cuarto y el servicio.
     * Este campo contiene una referencia al objeto {@link EstadoCuartoServicioDto}, que describe
     * el estado actual de la relación entre el cuarto y el servicio (por ejemplo, activo, inactivo, etc.).
     */
    private EstadoCuartoServicioDto estadoCuartoServicioDtoFk;

}
