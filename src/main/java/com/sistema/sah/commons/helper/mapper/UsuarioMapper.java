package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.UsuarioDto;
import com.sistema.sah.commons.dto.embeddedid.UsuarioAlimentoIdDto;
import com.sistema.sah.commons.entity.UsuarioEntity;
import com.sistema.sah.commons.entity.embeddedid.UsuarioAlimentoIdEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    UsuarioDto entityToDto(UsuarioEntity entity);

    UsuarioEntity dtoToEntity(UsuarioDto dto);

    List<UsuarioDto> listEntityTolistDto(List<UsuarioEntity> entity);

    List<UsuarioEntity> listDtoToListEntity(List<UsuarioDto> dto);


}
