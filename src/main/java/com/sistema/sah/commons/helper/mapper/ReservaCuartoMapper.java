package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.ReservaCuartoDto;
import com.sistema.sah.commons.entity.ReservaCuartoEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReservaCuartoMapper {

    ReservaCuartoDto entityToDto(ReservaCuartoEntity entity);

    ReservaCuartoEntity dtoToEntity(ReservaCuartoDto dto);

    List<ReservaCuartoDto> listEntityTolistDto(List<ReservaCuartoEntity> entity);

    List<ReservaCuartoEntity> listDtoToListEntity(List<ReservaCuartoDto> dto);


}
