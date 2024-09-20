package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.ReservaDto;
import com.sistema.sah.commons.entity.ReservaEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReservaMapper {

    ReservaDto entityToDto(ReservaEntity entity);

    ReservaEntity dtoToEntity(ReservaDto dto);

    List<ReservaDto> listEntityTolistDto(List<ReservaEntity> entity);

    List<ReservaEntity> listDtoToListEntity(List<ReservaDto> dto);


}
