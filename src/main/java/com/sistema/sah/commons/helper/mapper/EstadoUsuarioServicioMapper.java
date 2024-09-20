package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.EstadoUsuarioAlimentoDto;
import com.sistema.sah.commons.dto.EstadoUsuarioServicioDto;
import com.sistema.sah.commons.entity.EstadoUsuarioAlimentoEntity;
import com.sistema.sah.commons.entity.EstadoUsuarioServicioEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EstadoUsuarioServicioMapper {

    EstadoUsuarioServicioDto entityToDto(EstadoUsuarioServicioEntity entity);

    EstadoUsuarioServicioEntity dtoToEntity(EstadoUsuarioServicioDto dto);

    List<EstadoUsuarioServicioDto> listEntityTolistDto(List<EstadoUsuarioServicioEntity> entity);

    List<EstadoUsuarioServicioEntity> listDtoToListEntity(List<EstadoUsuarioServicioDto> dto);


}
