package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.EstadoCuartoServicioDto;
import com.sistema.sah.commons.entity.EstadoCuartoServicioEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EstadoCuartoServicioMapper {

    EstadoCuartoServicioDto entityToDto(EstadoCuartoServicioEntity entity);

    EstadoCuartoServicioEntity dtoToEntity(EstadoCuartoServicioDto dto);

    List<EstadoCuartoServicioDto> listEntityTolistDto(List<EstadoCuartoServicioEntity> entity);

    List<EstadoCuartoServicioEntity> listDtoToListEntity(List<EstadoCuartoServicioDto> dto);


}
