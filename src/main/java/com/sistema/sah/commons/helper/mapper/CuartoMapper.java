package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.AlimentoDto;
import com.sistema.sah.commons.dto.CuartoDto;
import com.sistema.sah.commons.entity.AlimentoEntity;
import com.sistema.sah.commons.entity.CuartoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CuartoMapper {

    @Mappings({
            @Mapping(source = "tipoCuartoEntityFk", target = "tipoCuartoDtoFk"),
            @Mapping(source = "estadoCuartoEntityFk", target = "estadoCuartoDtoFk")
    })
    CuartoDto entityToDto(CuartoEntity entity);

    @Mappings({
            @Mapping(source = "tipoCuartoDtoFk", target = "tipoCuartoEntityFk"),
            @Mapping(source = "estadoCuartoDtoFk", target = "estadoCuartoEntityFk")
    })
    CuartoEntity dtoToEntity(CuartoDto dto);

    List<CuartoDto> listEntityTolistDto(List<CuartoEntity> entity);

    List<CuartoEntity> listDtoToListEntity(List<CuartoDto> dto);



}
