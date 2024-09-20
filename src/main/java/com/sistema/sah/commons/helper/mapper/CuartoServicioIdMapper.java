package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.embeddedid.CuartoServicioIdDto;
import com.sistema.sah.commons.entity.embeddedid.CuartoServicioIdEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CuartoServicioIdMapper {

    CuartoServicioIdDto entityToDto(CuartoServicioIdEntity entity);

    CuartoServicioIdEntity dtoToEntity(CuartoServicioIdDto dto);

    List<CuartoServicioIdDto> listEntityTolistDto(List<CuartoServicioIdEntity> entity);

    List<CuartoServicioIdEntity> listDtoToListEntity(List<CuartoServicioIdDto> dto);

}
