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

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioServicioDto implements Serializable {
    private UsuarioServicioIdDto id;

    private ServicioDto codigoServicioDtoFk;

    private UsuarioDto codigoUsuarioDtoFk;

    private EstadoUsuarioServicioDto estadoUsuarioServicioDtoFk;

}