package com.sistema.sah.commons.dto;

import com.sistema.sah.commons.dto.embeddedid.UsuarioServicioIdDto;
import com.sistema.sah.commons.entity.embeddedid.UsuarioServicioIdEntity;
import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Data
public class UsuarioServicioDto {
    private UsuarioServicioIdDto id;

    private ServicioDto codigoServicioDtoFk;

    private UsuarioDto codigoUsuarioDtoFk;

    private EstadoUsuarioServicioDto estadoUsuarioServicioDtoFk;

}