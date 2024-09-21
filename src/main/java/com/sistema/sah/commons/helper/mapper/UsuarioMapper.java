package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.UsuarioDto;
import com.sistema.sah.commons.dto.embeddedid.UsuarioAlimentoIdDto;
import com.sistema.sah.commons.entity.UsuarioEntity;
import com.sistema.sah.commons.entity.embeddedid.UsuarioAlimentoIdEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    @Mappings({
            @Mapping(source = "tipoUsuarioEntityFk", target = "tipoUsuarioDtoFk")
    })
    UsuarioDto entityToDto(UsuarioEntity entity);

    @Mappings({
            @Mapping(source = "tipoUsuarioDtoFk", target = "tipoUsuarioEntityFk")
    })
    UsuarioEntity dtoToEntity(UsuarioDto dto);

    List<UsuarioDto> listEntityTolistDto(List<UsuarioEntity> entity);

    List<UsuarioEntity> listDtoToListEntity(List<UsuarioDto> dto);


}
