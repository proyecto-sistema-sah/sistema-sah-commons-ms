package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.ReservaDto;
import com.sistema.sah.commons.entity.ReservaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReservaMapper {

    @Mappings({
            @Mapping(source = "codigoUsuarioEntityFk", target = "codigoUsuarioDtoFk"),
            @Mapping(source = "estadoReservaEntityFk", target = "estadoReservaDtoFk")
    })
    ReservaDto entityToDto(ReservaEntity entity);

    @Mappings({
            @Mapping(source = "codigoUsuarioDtoFk", target = "codigoUsuarioEntityFk"),
            @Mapping(source = "estadoReservaDtoFk", target = "estadoReservaEntityFk")
    })
    ReservaEntity dtoToEntity(ReservaDto dto);

    List<ReservaDto> listEntityTolistDto(List<ReservaEntity> entity);

    List<ReservaEntity> listDtoToListEntity(List<ReservaDto> dto);


}
