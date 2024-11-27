package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.UsuarioServicioDto;
import com.sistema.sah.commons.entity.UsuarioServicioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

/**
 * Mapper para la conversión entre las entidades {@link UsuarioServicioEntity} y los objetos DTO {@link UsuarioServicioDto}.
 * <p>
 * Esta interfaz utiliza MapStruct para generar implementaciones automáticas que facilitan la conversión entre las entidades de la base de datos
 * y los objetos de transferencia de datos (DTO). El propósito principal de este mapper es separar la capa de acceso a datos de la lógica de negocio
 * al transformar los datos entre estas capas.
 * </p>
 */
@Mapper(componentModel = "spring")
public interface UsuarioServicioMapper {

    /**
     * Convierte una entidad {@link UsuarioServicioEntity} en un objeto DTO {@link UsuarioServicioDto}.
     * <p>
     * Este método mapea los atributos de la entidad {@link UsuarioServicioEntity} a un objeto DTO {@link UsuarioServicioDto},
     * lo que permite que los datos sean manipulados en una capa más cercana a la lógica de negocio.
     * </p>
     *
     * @param entity la entidad {@link UsuarioServicioEntity} que se va a convertir.
     * @return el objeto DTO {@link UsuarioServicioDto} mapeado.
     */
    @Mappings({
            @Mapping(source = "codigoServicioEntityFk", target = "codigoServicioDtoFk"),
            @Mapping(source = "codigoUsuarioEntityFk", target = "codigoUsuarioDtoFk"),
            @Mapping(source = "estadoUsuarioServicioEntityFk", target = "estadoUsuarioServicioDtoFk")
    })
    UsuarioServicioDto entityToDto(UsuarioServicioEntity entity);

    /**
     * Convierte un objeto DTO {@link UsuarioServicioDto} en una entidad {@link UsuarioServicioEntity}.
     * @param dto el objeto DTO {@link UsuarioServicioDto} que se va a convertir.
     * @return la entidad {@link UsuarioServicioEntity} mapeada.
     */
    @Mappings({
            @Mapping(source = "codigoServicioDtoFk", target = "codigoServicioEntityFk"),
            @Mapping(source = "codigoUsuarioDtoFk", target = "codigoUsuarioEntityFk"),
            @Mapping(source = "estadoUsuarioServicioDtoFk", target = "estadoUsuarioServicioEntityFk")
    })
    UsuarioServicioEntity dtoToEntity(UsuarioServicioDto dto);

    /**
     * Convierte una lista de entidades {@link UsuarioServicioEntity} en una lista de objetos DTO {@link UsuarioServicioDto}.
     * <p>
     * Este método es útil cuando se necesita transformar colecciones de entidades en colecciones de DTOs,
     * por ejemplo, cuando se recuperan múltiples registros de la base de datos y se desean manipular como objetos DTO.
     * </p>
     *
     * @param entity la lista de entidades {@link UsuarioServicioEntity} que se van a convertir.
     * @return la lista de objetos DTO {@link UsuarioServicioDto}.
     */
    List<UsuarioServicioDto> listEntityTolistDto(List<UsuarioServicioEntity> entity);

    /**
     * Convierte una lista de objetos DTO {@link UsuarioServicioDto} en una lista de entidades {@link UsuarioServicioEntity}.
     * <p>
     * Este método es útil cuando se necesita convertir colecciones de DTOs en entidades para persistirlas en la base de datos.
     * </p>
     *
     * @param dto la lista de objetos DTO {@link UsuarioServicioDto} que se van a convertir.
     * @return la lista de entidades {@link UsuarioServicioEntity}.
     */
    List<UsuarioServicioEntity> listDtoToListEntity(List<UsuarioServicioDto> dto);
}
