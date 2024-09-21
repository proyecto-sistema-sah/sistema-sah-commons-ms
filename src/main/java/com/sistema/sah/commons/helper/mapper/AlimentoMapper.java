package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.AlimentoDto;
import com.sistema.sah.commons.entity.AlimentoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AlimentoMapper {

    @Mappings({
            @Mapping(source = "tipoAlimentoEntityFk", target = "tipoAlimentoDtoFk")
    })
    AlimentoDto entityToDto(AlimentoEntity entity);

    @Mappings({
            @Mapping(source = "tipoAlimentoDtoFk", target = "tipoAlimentoEntityFk")
    })
    AlimentoEntity dtoToEntity(AlimentoDto dto);

    List<AlimentoDto> listEntityTolistDto(List<AlimentoEntity> entity);

    List<AlimentoEntity> listDtoToListEntity(List<AlimentoDto> dto);


}
