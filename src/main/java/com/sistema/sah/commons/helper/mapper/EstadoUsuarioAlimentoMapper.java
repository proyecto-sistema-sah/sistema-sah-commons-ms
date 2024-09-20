package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.EstadoUsuarioAlimentoDto;
import com.sistema.sah.commons.entity.EstadoUsuarioAlimentoEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EstadoUsuarioAlimentoMapper {

    EstadoUsuarioAlimentoDto entityToDto(EstadoUsuarioAlimentoEntity entity);

    EstadoUsuarioAlimentoEntity dtoToEntity(EstadoUsuarioAlimentoDto dto);

    List<EstadoUsuarioAlimentoDto> listEntityTolistDto(List<EstadoUsuarioAlimentoEntity> entity);

    List<EstadoUsuarioAlimentoEntity> listDtoToListEntity(List<EstadoUsuarioAlimentoDto> dto);


}
