package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.BlackListTokenDto;
import com.sistema.sah.commons.entity.BlackListTokenEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

/**
 * Mapper para la conversión entre las entidades {@link BlackListTokenEntity} y los objetos DTO {@link BlackListTokenDto}.
 * <p>
 * Esta interfaz utiliza MapStruct para generar implementaciones automáticas que facilitan la conversión entre las entidades de la base de datos y los objetos de transferencia de datos (DTO).
 * El propósito principal de este mapper es separar la capa de acceso a datos de la lógica de negocio al transformar los datos entre estas capas.
 * </p>
 */
@Mapper(componentModel = "spring")
public interface IBlackListTokenMapper {

    /**
     * Convierte una entidad {@link BlackListTokenEntity} en un objeto DTO {@link BlackListTokenDto}.
     * <p>
     * Este método mapea los atributos de la entidad {@link BlackListTokenEntity} a un objeto DTO {@link BlackListTokenDto},
     * lo que permite que los datos sean manipulados en una capa más cercana a la lógica de negocio.
     * </p>
     *
     * @param entity la entidad {@link BlackListTokenEntity} que se va a convertir.
     * @return el objeto DTO {@link BlackListTokenDto} mapeado.
     */
    @Mappings({
            @Mapping(source = "codigoUsuarioEntityFk", target = "codigoUsuarioDtoFk"),
    })
    BlackListTokenDto entityToDto(BlackListTokenEntity entity);

    /**
     * Convierte un objeto DTO {@link BlackListTokenDto} en una entidad {@link BlackListTokenEntity}.
     * <p>
     * Este método mapea los atributos del objeto DTO {@link BlackListTokenDto} a una entidad {@link BlackListTokenEntity},
     * lo que es útil para persistir los datos en la base de datos o enviarlos entre capas del sistema.
     * </p>
     *
     * @param dto el objeto DTO {@link BlackListTokenDto} que se va a convertir.
     * @return la entidad {@link BlackListTokenEntity} mapeada.
     */
    @Mappings({
            @Mapping(source = "codigoUsuarioDtoFk", target = "codigoUsuarioEntityFk"),
    })
    BlackListTokenEntity dtoToEntity(BlackListTokenDto dto);

    /**
     * Convierte una lista de entidades {@link BlackListTokenEntity} en una lista de objetos DTO {@link BlackListTokenDto}.
     * <p>
     * Este método es útil cuando se necesita transformar colecciones de entidades en colecciones de DTOs,
     * por ejemplo, cuando se recuperan múltiples registros de la base de datos y se desean manipular como objetos DTO.
     * </p>
     *
     * @param entity la lista de entidades {@link BlackListTokenEntity} que se van a convertir.
     * @return la lista de objetos DTO {@link BlackListTokenDto}.
     */
    List<BlackListTokenDto> listEntityTolistDto(List<BlackListTokenEntity> entity);

    /**
     * Convierte una lista de objetos DTO {@link BlackListTokenDto} en una lista de entidades {@link BlackListTokenEntity}.
     * <p>
     * Este método es útil cuando se necesita convertir colecciones de DTOs en entidades para persistirlas en la base de datos.
     * </p>
     *
     * @param dto la lista de objetos DTO {@link BlackListTokenDto} que se van a convertir.
     * @return la lista de entidades {@link BlackListTokenEntity}.
     */
    List<BlackListTokenEntity> listDtoToListEntity(List<BlackListTokenDto> dto);
}
