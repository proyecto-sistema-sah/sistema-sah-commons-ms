package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.embeddedid.UsuarioServicioIdDto;
import com.sistema.sah.commons.entity.embeddedid.UsuarioServicioIdEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UsuarioServicioIdMapper {

    UsuarioServicioIdDto entityToDto(UsuarioServicioIdEntity entity);

    UsuarioServicioIdEntity dtoToEntity(UsuarioServicioIdDto dto);

    List<UsuarioServicioIdDto> listEntityTolistDto(List<UsuarioServicioIdEntity> entity);

    List<UsuarioServicioIdEntity> listDtoToListEntity(List<UsuarioServicioIdDto> dto);


}
