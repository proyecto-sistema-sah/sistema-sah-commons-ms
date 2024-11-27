package com.sistema.sah.commons.dto;

import com.sistema.sah.commons.dto.embeddedid.UsuarioServicioIdDto;
import com.sistema.sah.commons.entity.embeddedid.UsuarioServicioIdEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.io.Serializable;

/**
 * DTO (Data Transfer Object) que representa la relación entre un usuario y un servicio.
 * <p>
 * Esta clase encapsula la información sobre la relación entre un usuario y un servicio, incluyendo la clave primaria
 * compuesta, el usuario asociado, el servicio asignado y el estado del usuario respecto a ese servicio.
 * </p>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioServicioDto implements Serializable {

    /**
     * Identificador compuesto de la relación entre el usuario y el servicio.
     * Este campo representa la clave primaria compuesta que une al usuario con el servicio, mediante un objeto
     * {@link UsuarioServicioIdDto}.
     */
    private UsuarioServicioIdDto id;

    /**
     * Servicio asociado al usuario.
     * Este campo contiene una referencia al objeto {@link ServicioDto}, que representa el servicio al que está asociado
     * el usuario.
     */
    private ServicioDto codigoServicioDtoFk;

    /**
     * Usuario asociado al servicio.
     * Este campo contiene una referencia al objeto {@link UsuarioDto}, que representa el usuario que está asociado con
     * el servicio.
     */
    private UsuarioDto codigoUsuarioDtoFk;

    /**
     * Estado del usuario respecto al servicio.
     * Este campo representa el estado del usuario con respecto al servicio, utilizando un objeto
     * {@link EstadoUsuarioServicioDto} que describe el estado (por ejemplo, "pendiente", "activo", "completado").
     */
    private EstadoUsuarioServicioDto estadoUsuarioServicioDtoFk;

}
