package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.ServicioDto;
import com.sistema.sah.commons.dto.TipoAlimentoDto;
import com.sistema.sah.commons.entity.ServicioEntity;
import com.sistema.sah.commons.entity.TipoAlimentoEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TipoAlimentoMapper {

    TipoAlimentoDto entityToDto(TipoAlimentoEntity entity);

    TipoAlimentoEntity dtoToEntity(TipoAlimentoDto dto);

    List<TipoAlimentoDto> listEntityTolistDto(List<TipoAlimentoEntity> entity);

    List<TipoAlimentoEntity> listDtoToListEntity(List<TipoAlimentoDto> dto);


}
