package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.BlackListTokenDto;
import com.sistema.sah.commons.dto.FacturacionDto;
import com.sistema.sah.commons.entity.BlackListTokenEntity;
import com.sistema.sah.commons.entity.FacturacionEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IBlackListTokenMapper {

    @Mappings({
            @Mapping(source = "codigoUsuarioEntityFk", target = "codigoUsuarioDtoFk"),
    })
    BlackListTokenDto entityToDto(BlackListTokenEntity entity);

    @Mappings({
            @Mapping(source = "codigoUsuarioDtoFk", target = "codigoUsuarioEntityFk"),
    })
    BlackListTokenEntity dtoToEntity(BlackListTokenDto dto);

    List<BlackListTokenDto> listEntityTolistDto(List<BlackListTokenEntity> entity);

    List<BlackListTokenEntity> listDtoToListEntity(List<BlackListTokenDto> dto);


}
