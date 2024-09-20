package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.CuartoServicioDto;
import com.sistema.sah.commons.entity.CuartoServicioEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CuartoServicioMapper {

    CuartoServicioDto entityToDto(CuartoServicioEntity entity);

    CuartoServicioEntity dtoToEntity(CuartoServicioDto dto);

    List<CuartoServicioDto> listEntityTolistDto(List<CuartoServicioEntity> entity);

    List<CuartoServicioEntity> listDtoToListEntity(List<CuartoServicioDto> dto);


}
