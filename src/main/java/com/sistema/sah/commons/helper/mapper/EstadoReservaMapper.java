package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.EstadoReservaDto;
import com.sistema.sah.commons.entity.EstadoReservaEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EstadoReservaMapper {

    EstadoReservaDto entityToDto(EstadoReservaEntity entity);

    EstadoReservaEntity dtoToEntity(EstadoReservaDto dto);

    List<EstadoReservaDto> listEntityTolistDto(List<EstadoReservaEntity> entity);

    List<EstadoReservaEntity> listDtoToListEntity(List<EstadoReservaDto> dto);


}
