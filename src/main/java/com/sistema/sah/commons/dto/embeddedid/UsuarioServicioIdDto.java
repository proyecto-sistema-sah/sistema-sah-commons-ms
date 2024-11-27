package com.sistema.sah.commons.dto.embeddedid;

import com.sistema.sah.commons.entity.UsuarioServicioEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Representa la clave primaria compuesta para la entidad {@link UsuarioServicioEntity}.
 * <p>
 * Esta clase encapsula los identificadores de un usuario y un servicio relacionados.
 * Es utilizada como parte de la clave primaria en la entidad {@link UsuarioServicioEntity},
 * permitiendo la relación entre un usuario y los servicios asociados a él.
 * </p>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioServicioIdDto implements Serializable {
    /**
     * Código del servicio asociado en la relación.
     * Este campo representa el identificador del servicio en la relación.
     */
    private String codigoServicioFk;

    /**
     * Código del usuario asociado en la relación.
     * Este campo representa el identificador del usuario en la relación.
     */
    private String codigoUsuarioFk;

}
