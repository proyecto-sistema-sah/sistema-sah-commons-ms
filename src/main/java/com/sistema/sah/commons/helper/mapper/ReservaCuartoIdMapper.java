package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.embeddedid.CuartoServicioIdDto;
import com.sistema.sah.commons.dto.embeddedid.ReservaCuartoIdDto;
import com.sistema.sah.commons.entity.embeddedid.CuartoServicioIdEntity;
import com.sistema.sah.commons.entity.embeddedid.ReservaCuartoIdEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReservaCuartoIdMapper {

    ReservaCuartoIdDto entityToDto(ReservaCuartoIdEntity entity);

    ReservaCuartoIdEntity dtoToEntity(ReservaCuartoIdDto dto);

    List<ReservaCuartoIdDto> listEntityTolistDto(List<ReservaCuartoIdEntity> entity);

    List<ReservaCuartoIdEntity> listDtoToListEntity(List<ReservaCuartoIdDto> dto);


}
