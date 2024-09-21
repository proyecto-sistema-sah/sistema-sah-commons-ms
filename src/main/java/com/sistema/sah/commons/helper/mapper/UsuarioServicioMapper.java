package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.UsuarioServicioDto;
import com.sistema.sah.commons.entity.UsuarioServicioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UsuarioServicioMapper {

    @Mappings({
            @Mapping(source = "codigoServicioEntityFk", target = "codigoServicioDtoFk"),
            @Mapping(source = "codigoUsuarioEntityFk", target = "codigoUsuarioDtoFk"),
            @Mapping(source = "estadoUsuarioServicioEntityFk", target = "estadoUsuarioServicioDtoFk")
    })
    UsuarioServicioDto entityToDto(UsuarioServicioEntity entity);

    @Mappings({
            @Mapping(source = "codigoServicioDtoFk", target = "codigoServicioEntityFk"),
            @Mapping(source = "codigoUsuarioDtoFk", target = "codigoUsuarioEntityFk"),
            @Mapping(source = "estadoUsuarioServicioDtoFk", target = "estadoUsuarioServicioEntityFk")
    })
    UsuarioServicioEntity dtoToEntity(UsuarioServicioDto dto);

    List<UsuarioServicioDto> listEntityTolistDto(List<UsuarioServicioEntity> entity);

    List<UsuarioServicioEntity> listDtoToListEntity(List<UsuarioServicioDto> dto);

}
