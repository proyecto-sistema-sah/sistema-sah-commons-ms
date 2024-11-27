package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.EstadoReservaDto;
import com.sistema.sah.commons.entity.EstadoReservaEntity;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * Mapper para la conversión entre las entidades {@link EstadoReservaEntity} y los objetos DTO {@link EstadoReservaDto}.
 * <p>
 * Esta interfaz utiliza MapStruct para generar implementaciones automáticas que facilitan la conversión entre las entidades de la base de datos y los objetos de transferencia de datos (DTO).
 * El propósito principal de este mapper es separar la capa de acceso a datos de la lógica de negocio al transformar los datos entre estas capas.
 * </p>
 */
@Mapper(componentModel = "spring")
public interface EstadoReservaMapper {

    /**
     * Convierte una entidad {@link EstadoReservaEntity} en un objeto DTO {@link EstadoReservaDto}.
     * <p>
     * Este método mapea los atributos de la entidad {@link EstadoReservaEntity} a un objeto DTO {@link EstadoReservaDto},
     * lo que permite que los datos sean manipulados en una capa más cercana a la lógica de negocio.
     * </p>
     *
     * @param entity la entidad {@link EstadoReservaEntity} que se va a convertir.
     * @return el objeto DTO {@link EstadoReservaDto} mapeado.
     */
    EstadoReservaDto entityToDto(EstadoReservaEntity entity);

    /**
     * Convierte un objeto DTO {@link EstadoReservaDto} en una entidad {@link EstadoReservaEntity}.
     * <p>
     * Este método mapea los atributos del objeto DTO {@link EstadoReservaDto} a una entidad {@link EstadoReservaEntity},
     * lo que es útil para persistir los datos en la base de datos o enviarlos entre capas del sistema.
     * </p>
     *
     * @param dto el objeto DTO {@link EstadoReservaDto} que se va a convertir.
     * @return la entidad {@link EstadoReservaEntity} mapeada.
     */
    EstadoReservaEntity dtoToEntity(EstadoReservaDto dto);

    /**
     * Convierte una lista de entidades {@link EstadoReservaEntity} en una lista de objetos DTO {@link EstadoReservaDto}.
     * <p>
     * Este método es útil cuando se necesita transformar colecciones de entidades en colecciones de DTOs,
     * por ejemplo, cuando se recuperan múltiples registros de la base de datos y se desean manipular como objetos DTO.
     * </p>
     *
     * @param entity la lista de entidades {@link EstadoReservaEntity} que se van a convertir.
     * @return la lista de objetos DTO {@link EstadoReservaDto}.
     */
    List<EstadoReservaDto> listEntityTolistDto(List<EstadoReservaEntity> entity);

    /**
     * Convierte una lista de objetos DTO {@link EstadoReservaDto} en una lista de entidades {@link EstadoReservaEntity}.
     * <p>
     * Este método es útil cuando se necesita convertir colecciones de DTOs en entidades para persistirlas en la base de datos.
     * </p>
     *
     * @param dto la lista de objetos DTO {@link EstadoReservaDto} que se van a convertir.
     * @return la lista de entidades {@link EstadoReservaEntity}.
     */
    List<EstadoReservaEntity> listDtoToListEntity(List<EstadoReservaDto> dto);
}
