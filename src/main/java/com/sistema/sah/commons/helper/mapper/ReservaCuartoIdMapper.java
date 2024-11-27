package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.embeddedid.ReservaCuartoIdDto;
import com.sistema.sah.commons.entity.embeddedid.ReservaCuartoIdEntity;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * Mapper para la conversión entre las entidades {@link ReservaCuartoIdEntity} y los objetos DTO {@link ReservaCuartoIdDto}.
 * <p>
 * Esta interfaz utiliza MapStruct para generar implementaciones automáticas que facilitan la conversión entre las entidades de la base de datos y los objetos de transferencia de datos (DTO).
 * El propósito principal de este mapper es separar la capa de acceso a datos de la lógica de negocio al transformar los datos entre estas capas.
 * </p>
 */
@Mapper(componentModel = "spring")
public interface ReservaCuartoIdMapper {

    /**
     * Convierte una entidad {@link ReservaCuartoIdEntity} en un objeto DTO {@link ReservaCuartoIdDto}.
     * <p>
     * Este método mapea los atributos de la entidad {@link ReservaCuartoIdEntity} a un objeto DTO {@link ReservaCuartoIdDto},
     * lo que permite que los datos sean manipulados en una capa más cercana a la lógica de negocio.
     * </p>
     *
     * @param entity la entidad {@link ReservaCuartoIdEntity} que se va a convertir.
     * @return el objeto DTO {@link ReservaCuartoIdDto} mapeado.
     */
    ReservaCuartoIdDto entityToDto(ReservaCuartoIdEntity entity);

    /**
     * Convierte un objeto DTO {@link ReservaCuartoIdDto} en una entidad {@link ReservaCuartoIdEntity}.
     * <p>
     * Este método mapea los atributos del objeto DTO {@link ReservaCuartoIdDto} a una entidad {@link ReservaCuartoIdEntity},
     * lo que es útil para persistir los datos en la base de datos o enviarlos entre capas del sistema.
     * </p>
     *
     * @param dto el objeto DTO {@link ReservaCuartoIdDto} que se va a convertir.
     * @return la entidad {@link ReservaCuartoIdEntity} mapeada.
     */
    ReservaCuartoIdEntity dtoToEntity(ReservaCuartoIdDto dto);

    /**
     * Convierte una lista de entidades {@link ReservaCuartoIdEntity} en una lista de objetos DTO {@link ReservaCuartoIdDto}.
     * <p>
     * Este método es útil cuando se necesita transformar colecciones de entidades en colecciones de DTOs,
     * por ejemplo, cuando se recuperan múltiples registros de la base de datos y se desean manipular como objetos DTO.
     * </p>
     *
     * @param entity la lista de entidades {@link ReservaCuartoIdEntity} que se van a convertir.
     * @return la lista de objetos DTO {@link ReservaCuartoIdDto}.
     */
    List<ReservaCuartoIdDto> listEntityTolistDto(List<ReservaCuartoIdEntity> entity);

    /**
     * Convierte una lista de objetos DTO {@link ReservaCuartoIdDto} en una lista de entidades {@link ReservaCuartoIdEntity}.
     * <p>
     * Este método es útil cuando se necesita convertir colecciones de DTOs en entidades para persistirlas en la base de datos.
     * </p>
     *
     * @param dto la lista de objetos DTO {@link ReservaCuartoIdDto} que se van a convertir.
     * @return la lista de entidades {@link ReservaCuartoIdEntity}.
     */
    List<ReservaCuartoIdEntity> listDtoToListEntity(List<ReservaCuartoIdDto> dto);
}
