package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.CuartoServicioDto;
import com.sistema.sah.commons.entity.CuartoServicioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CuartoServicioMapper {

    @Mappings({
            @Mapping(source = "codigoCuartoEntityFk", target = "codigoCuartoDtoFk"),
            @Mapping(source = "codigoServicioEntityFk", target = "codigoServicioDtoFk"),
            @Mapping(source = "estadoCuartoServicioEntityFk", target = "estadoCuartoServicioDtoFk")
    })
    CuartoServicioDto entityToDto(CuartoServicioEntity entity);

    @Mappings({
            @Mapping(source = "codigoCuartoDtoFk", target = "codigoCuartoEntityFk"),
            @Mapping(source = "codigoServicioDtoFk", target = "codigoServicioEntityFk"),
            @Mapping(source = "estadoCuartoServicioDtoFk", target = "estadoCuartoServicioEntityFk")
    })
    CuartoServicioEntity dtoToEntity(CuartoServicioDto dto);

    List<CuartoServicioDto> listEntityTolistDto(List<CuartoServicioEntity> entity);

    List<CuartoServicioEntity> listDtoToListEntity(List<CuartoServicioDto> dto);


}
