package com.sistema.sah.commons.dto.embeddedid;

import com.sistema.sah.commons.entity.UsuarioAlimentoEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Representa la clave primaria compuesta para la entidad {@link UsuarioAlimentoEntity}.
 * <p>
 * Esta clase encapsula los identificadores de un usuario y un alimento relacionados.
 * Es utilizada como parte de la clave primaria en la entidad {@link UsuarioAlimentoEntity},
 * permitiendo la relación entre un usuario y los alimentos asociados a él.
 * </p>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioAlimentoIdDto implements Serializable {
    /**
     * Código del usuario asociado en la relación.
     * Este campo representa el identificador del usuario en la relación.
     */
    private String codigoUsuarioFk;

    /**
     * Código del alimento asociado en la relación.
     * Este campo representa el identificador del alimento en la relación.
     */
    private String codigoAlimentoFk;

}
