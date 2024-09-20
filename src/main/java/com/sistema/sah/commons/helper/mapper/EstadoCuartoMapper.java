package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.EstadoCuartoDto;
import com.sistema.sah.commons.entity.EstadoCuartoEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EstadoCuartoMapper {

    EstadoCuartoDto entityToDto(EstadoCuartoEntity entity);

    EstadoCuartoEntity dtoToEntity(EstadoCuartoDto dto);

    List<EstadoCuartoDto> listEntityTolistDto(List<EstadoCuartoEntity> entity);

    List<EstadoCuartoEntity> listDtoToListEntity(List<EstadoCuartoDto> dto);


}
