package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.AlimentoDto;
import com.sistema.sah.commons.entity.AlimentoEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AlimentoMapper {

    AlimentoDto entityToDto(AlimentoEntity entity);

    AlimentoEntity dtoToEntity(AlimentoDto dto);

    List<AlimentoDto> listEntityTolistDto(List<AlimentoEntity> entity);

    List<AlimentoEntity> listDtoToListEntity(List<AlimentoDto> dto);


}
