package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.UsuarioServicioDto;
import com.sistema.sah.commons.dto.embeddedid.UsuarioServicioIdDto;
import com.sistema.sah.commons.entity.UsuarioServicioEntity;
import com.sistema.sah.commons.entity.embeddedid.UsuarioServicioIdEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UsuarioServicioMapper {


    UsuarioServicioDto entityToDto(UsuarioServicioEntity entity);

    UsuarioServicioEntity dtoToEntity(UsuarioServicioDto dto);

    List<UsuarioServicioDto> listEntityTolistDto(List<UsuarioServicioEntity> entity);

    List<UsuarioServicioEntity> listDtoToListEntity(List<UsuarioServicioDto> dto);

}
