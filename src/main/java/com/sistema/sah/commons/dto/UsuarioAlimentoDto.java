package com.sistema.sah.commons.dto;

import com.sistema.sah.commons.dto.embeddedid.UsuarioAlimentoIdDto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioAlimentoDto implements Serializable {
    private UsuarioAlimentoIdDto id;

    private UsuarioDto codigoUsuarioDtoFk;

    private AlimentoDto codigoAlimentoDtoFk;

    private EstadoUsuarioAlimentoDto estadoUsuarioAlimentoDtoFk;

}