package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.embeddedid.UsuarioAlimentoIdDto;
import com.sistema.sah.commons.entity.embeddedid.UsuarioAlimentoIdEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UsuarioAlimentoIdMapper {


    UsuarioAlimentoIdDto entityToDto(UsuarioAlimentoIdEntity entity);

    UsuarioAlimentoIdEntity dtoToEntity(UsuarioAlimentoIdDto dto);

    List<UsuarioAlimentoIdDto> listEntityTolistDto(List<UsuarioAlimentoIdEntity> entity);

    List<UsuarioAlimentoIdEntity> listDtoToListEntity(List<UsuarioAlimentoIdDto> dto);


}
