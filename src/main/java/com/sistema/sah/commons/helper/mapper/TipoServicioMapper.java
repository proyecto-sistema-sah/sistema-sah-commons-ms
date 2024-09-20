package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.TipoCuartoDto;
import com.sistema.sah.commons.dto.TipoServicioDto;
import com.sistema.sah.commons.entity.TipoCuartoEntity;
import com.sistema.sah.commons.entity.TipoServicioEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TipoServicioMapper {

    TipoServicioDto entityToDto(TipoServicioEntity entity);

    TipoServicioEntity dtoToEntity(TipoServicioDto dto);

    List<TipoServicioDto> listEntityTolistDto(List<TipoServicioEntity> entity);

    List<TipoServicioEntity> listDtoToListEntity(List<TipoServicioDto> dto);


}
