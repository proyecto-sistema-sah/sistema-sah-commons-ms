package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.ReservaDto;
import com.sistema.sah.commons.entity.ReservaEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

/**
 * Mapper para la conversión entre las entidades {@link ReservaEntity} y los objetos DTO {@link ReservaDto}.
 * <p>
 * Esta interfaz utiliza MapStruct para generar implementaciones automáticas que facilitan la conversión entre las entidades de la base de datos y los objetos de transferencia de datos (DTO).
 * El propósito principal de este mapper es separar la capa de acceso a datos de la lógica de negocio al transformar los datos entre estas capas.
 * </p>
 */
@Mapper(componentModel = "spring")
public interface ReservaMapper {

    /**
     * Convierte una entidad {@link ReservaEntity} en un objeto DTO {@link ReservaDto}.
     * <p>
     * Este método mapea los atributos de la entidad {@link ReservaEntity} a un objeto DTO {@link ReservaDto},
     * lo que permite que los datos sean manipulados en una capa más cercana a la lógica de negocio.
     * </p>
     *
     * @param entity la entidad {@link ReservaEntity} que se va a convertir.
     * @return el objeto DTO {@link ReservaDto} mapeado.
     */
    @Mappings({
            @Mapping(source = "codigoUsuarioEntityFk", target = "codigoUsuarioDtoFk"),
            @Mapping(source = "estadoReservaEntityFk", target = "estadoReservaDtoFk")
    })
    ReservaDto entityToDto(ReservaEntity entity);

    /**
     * Convierte un objeto DTO {@link ReservaDto} en una entidad {@link ReservaEntity}.
     * <p>
     * Este método mapea los atributos del objeto DTO {@link ReservaDto} a una entidad {@link ReservaEntity},
     * lo que es útil para persistir los datos en la base de datos o enviarlos entre capas del sistema.
     * </p>
     *
     * @param dto el objeto DTO {@link ReservaDto} que se va a convertir.
     * @return la entidad {@link ReservaEntity} mapeada.
     */
    @Mappings({
            @Mapping(source = "codigoUsuarioDtoFk", target = "codigoUsuarioEntityFk"),
            @Mapping(source = "estadoReservaDtoFk", target = "estadoReservaEntityFk")
    })
    ReservaEntity dtoToEntity(ReservaDto dto);

    /**
     * Convierte una lista de entidades {@link ReservaEntity} en una lista de objetos DTO {@link ReservaDto}.
     * <p>
     * Este método es útil cuando se necesita transformar colecciones de entidades en colecciones de DTOs,
     * por ejemplo, cuando se recuperan múltiples registros de la base de datos y se desean manipular como objetos DTO.
     * </p>
     *
     * @param entity la lista de entidades {@link ReservaEntity} que se van a convertir.
     * @return la lista de objetos DTO {@link ReservaDto}.
     */
    List<ReservaDto> listEntityTolistDto(List<ReservaEntity> entity);

    /**
     * Convierte una lista de objetos DTO {@link ReservaDto} en una lista de entidades {@link ReservaEntity}.
     * <p>
     * Este método es útil cuando se necesita convertir colecciones de DTOs en entidades para persistirlas en la base de datos.
     * </p>
     *
     * @param dto la lista de objetos DTO {@link ReservaDto} que se van a convertir.
     * @return la lista de entidades {@link ReservaEntity}.
     */
    List<ReservaEntity> listDtoToListEntity(List<ReservaDto> dto);
}
