package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.TipoAlimentoDto;
import com.sistema.sah.commons.dto.TipoCuartoDto;
import com.sistema.sah.commons.entity.TipoAlimentoEntity;
import com.sistema.sah.commons.entity.TipoCuartoEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TipoCuartoMapper {

    TipoCuartoDto entityToDto(TipoCuartoEntity entity);

    TipoCuartoEntity dtoToEntity(TipoCuartoDto dto);

    List<TipoCuartoDto> listEntityTolistDto(List<TipoCuartoEntity> entity);

    List<TipoCuartoEntity> listDtoToListEntity(List<TipoCuartoDto> dto);


}
