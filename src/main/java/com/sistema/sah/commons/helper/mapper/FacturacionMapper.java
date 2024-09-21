package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.EstadoUsuarioServicioDto;
import com.sistema.sah.commons.dto.FacturacionDto;
import com.sistema.sah.commons.entity.EstadoUsuarioServicioEntity;
import com.sistema.sah.commons.entity.FacturacionEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FacturacionMapper {

    @Mappings({
            @Mapping(source = "codigoReservaEntityFk", target = "codigoReservaDtoFk"),
            @Mapping(source = "codigoUsuarioEntityFk", target = "codigoUsuarioDtoFk")
    })
    FacturacionDto entityToDto(FacturacionEntity entity);

    @Mappings({
            @Mapping(source = "codigoReservaDtoFk", target = "codigoReservaEntityFk"),
            @Mapping(source = "codigoUsuarioDtoFk", target = "codigoUsuarioEntityFk")
    })
    FacturacionEntity dtoToEntity(FacturacionDto dto);

    List<FacturacionDto> listEntityTolistDto(List<FacturacionEntity> entity);

    List<FacturacionEntity> listDtoToListEntity(List<FacturacionDto> dto);


}
