package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.TipoServicioDto;
import com.sistema.sah.commons.dto.TipoUsuarioDto;
import com.sistema.sah.commons.entity.TipoServicioEntity;
import com.sistema.sah.commons.entity.TipoUsuarioEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TipoUsuarioMapper {

    TipoUsuarioDto entityToDto(TipoUsuarioEntity entity);

    TipoUsuarioEntity dtoToEntity(TipoUsuarioDto dto);

    List<TipoUsuarioDto> listEntityTolistDto(List<TipoUsuarioEntity> entity);

    List<TipoUsuarioEntity> listDtoToListEntity(List<TipoUsuarioDto> dto);


}
