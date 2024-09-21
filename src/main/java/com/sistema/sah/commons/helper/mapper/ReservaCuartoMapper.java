package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.ReservaCuartoDto;
import com.sistema.sah.commons.entity.ReservaCuartoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReservaCuartoMapper {

    @Mappings({
            @Mapping(source = "codigoReservaEntityFk", target = "codigoReservaDtoFk"),
            @Mapping(source = "codigoCuartoEntityFk", target = "codigoCuartoDtoFk")
    })
    ReservaCuartoDto entityToDto(ReservaCuartoEntity entity);

    @Mappings({
            @Mapping(source = "codigoReservaDtoFk", target = "codigoReservaEntityFk"),
            @Mapping(source = "codigoCuartoDtoFk", target = "codigoCuartoEntityFk")
    })
    ReservaCuartoEntity dtoToEntity(ReservaCuartoDto dto);

    List<ReservaCuartoDto> listEntityTolistDto(List<ReservaCuartoEntity> entity);

    List<ReservaCuartoEntity> listDtoToListEntity(List<ReservaCuartoDto> dto);


}
