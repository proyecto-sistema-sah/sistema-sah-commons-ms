package com.sistema.sah.commons.dto;

import com.sistema.sah.commons.dto.embeddedid.UsuarioAlimentoIdDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * DTO (Data Transfer Object) que representa la relación entre un usuario y un alimento.
 * <p>
 * Esta clase encapsula la información sobre la relación entre un usuario y un alimento, incluyendo la clave
 * primaria compuesta, el usuario asociado, el alimento asignado y el estado del usuario respecto a ese alimento.
 * </p>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioAlimentoDto implements Serializable {

    /**
     * Identificador compuesto de la relación entre el usuario y el alimento.
     * Este campo representa la clave primaria compuesta que une al usuario con el alimento, mediante un objeto
     * {@link UsuarioAlimentoIdDto}.
     */
    private UsuarioAlimentoIdDto id;

    /**
     * Usuario asociado al alimento.
     * Este campo contiene una referencia al objeto {@link UsuarioDto}, que representa el usuario que está
     * asociado con el alimento.
     */
    private UsuarioDto codigoUsuarioDtoFk;

    /**
     * Alimento asociado al usuario.
     * Este campo contiene una referencia al objeto {@link AlimentoDto}, que representa el alimento al que
     * está asociado el usuario.
     */
    private AlimentoDto codigoAlimentoDtoFk;

    /**
     * Estado del usuario respecto al alimento.
     * Este campo representa el estado del usuario con respecto al alimento, utilizando un objeto
     * {@link EstadoUsuarioAlimentoDto} que describe el estado (por ejemplo, "pendiente", "consumido", etc.).
     */
    private EstadoUsuarioAlimentoDto estadoUsuarioAlimentoDtoFk;
}
