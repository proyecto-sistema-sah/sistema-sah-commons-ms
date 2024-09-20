package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.UsuarioAlimentoDto;
import com.sistema.sah.commons.entity.UsuarioAlimentoEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UsuarioAlimentoMapper {

    UsuarioAlimentoDto entityToDto(UsuarioAlimentoEntity entity);

    UsuarioAlimentoEntity dtoToEntity(UsuarioAlimentoDto dto);

    List<UsuarioAlimentoDto> listEntityTolistDto(List<UsuarioAlimentoEntity> entity);

    List<UsuarioAlimentoEntity> listDtoToListEntity(List<UsuarioAlimentoDto> dto);


}
