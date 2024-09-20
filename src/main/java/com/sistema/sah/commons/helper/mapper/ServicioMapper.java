package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.ReservaDto;
import com.sistema.sah.commons.dto.ServicioDto;
import com.sistema.sah.commons.entity.ReservaEntity;
import com.sistema.sah.commons.entity.ServicioEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ServicioMapper {

    ServicioDto entityToDto(ServicioEntity entity);

    ServicioEntity dtoToEntity(ServicioDto dto);

    List<ServicioDto> listEntityTolistDto(List<ServicioEntity> entity);

    List<ServicioEntity> listDtoToListEntity(List<ServicioDto> dto);


}
