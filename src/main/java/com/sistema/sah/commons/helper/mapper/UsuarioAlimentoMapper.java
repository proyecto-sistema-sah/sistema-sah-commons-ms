package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.UsuarioAlimentoDto;
import com.sistema.sah.commons.entity.UsuarioAlimentoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UsuarioAlimentoMapper {

    @Mappings({
            @Mapping(source = "codigoUsuarioEntityFk", target = "codigoUsuarioDtoFk"),
            @Mapping(source = "codigoAlimentoEntityFk", target = "codigoAlimentoDtoFk"),
            @Mapping(source = "estadoUsuarioAlimentoEntityFk", target = "estadoUsuarioAlimentoDtoFk")
    })
    UsuarioAlimentoDto entityToDto(UsuarioAlimentoEntity entity);

    @Mappings({
            @Mapping(source = "codigoUsuarioDtoFk", target = "codigoUsuarioEntityFk"),
            @Mapping(source = "codigoAlimentoDtoFk", target = "codigoAlimentoEntityFk"),
            @Mapping(source = "estadoUsuarioAlimentoDtoFk", target = "estadoUsuarioAlimentoEntityFk")
    })
    UsuarioAlimentoEntity dtoToEntity(UsuarioAlimentoDto dto);

    List<UsuarioAlimentoDto> listEntityTolistDto(List<UsuarioAlimentoEntity> entity);

    List<UsuarioAlimentoEntity> listDtoToListEntity(List<UsuarioAlimentoDto> dto);


}
