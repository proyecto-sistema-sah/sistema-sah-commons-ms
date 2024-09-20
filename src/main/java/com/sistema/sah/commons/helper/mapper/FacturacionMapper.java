package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.EstadoUsuarioServicioDto;
import com.sistema.sah.commons.dto.FacturacionDto;
import com.sistema.sah.commons.entity.EstadoUsuarioServicioEntity;
import com.sistema.sah.commons.entity.FacturacionEntity;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface FacturacionMapper {

    FacturacionDto entityToDto(FacturacionEntity entity);

    FacturacionEntity dtoToEntity(FacturacionDto dto);

    List<FacturacionDto> listEntityTolistDto(List<FacturacionEntity> entity);

    List<FacturacionEntity> listDtoToListEntity(List<FacturacionDto> dto);


}
