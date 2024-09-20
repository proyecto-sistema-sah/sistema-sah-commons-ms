package com.sistema.sah.commons.dto;

import com.sistema.sah.commons.dto.embeddedid.UsuarioAlimentoIdDto;
import lombok.Data;

@Data
public class UsuarioAlimentoDto {
    private UsuarioAlimentoIdDto id;

    private UsuarioDto codigoUsuarioDtoFk;

    private AlimentoDto codigoAlimentoDtoFk;

    private EstadoUsuarioAlimentoDto estadoUsuarioAlimentoDtoFk;

}