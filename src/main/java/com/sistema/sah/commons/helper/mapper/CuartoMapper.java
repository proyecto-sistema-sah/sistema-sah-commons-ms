package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.AlimentoDto;
import com.sistema.sah.commons.dto.CuartoDto;
import com.sistema.sah.commons.entity.AlimentoEntity;
import com.sistema.sah.commons.entity.CuartoEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CuartoMapper {

    CuartoDto entityToDto(CuartoEntity entity);

    CuartoEntity dtoToEntity(CuartoDto dto);

    List<CuartoDto> listEntityTolistDto(List<CuartoEntity> entity);

    List<CuartoEntity> listDtoToListEntity(List<CuartoDto> dto);



}
