package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.ReservaCuartoDto;
import com.sistema.sah.commons.entity.ReservaCuartoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

/**
 * Mapper para la conversión entre las entidades {@link ReservaCuartoEntity} y los objetos DTO {@link ReservaCuartoDto}.
 * <p>
 * Esta interfaz utiliza MapStruct para generar implementaciones automáticas que facilitan la conversión entre las entidades de la base de datos y los objetos de transferencia de datos (DTO).
 * El propósito principal de este mapper es separar la capa de acceso a datos de la lógica de negocio al transformar los datos entre estas capas.
 * </p>
 */
@Mapper(componentModel = "spring")
public interface ReservaCuartoMapper {

    /**
     * Convierte una entidad {@link ReservaCuartoEntity} en un objeto DTO {@link ReservaCuartoDto}.
     * <p>
     * Este método mapea los atributos de la entidad {@link ReservaCuartoEntity} a un objeto DTO {@link ReservaCuartoDto},
     * lo que permite que los datos sean manipulados en una capa más cercana a la lógica de negocio.
     * </p>
     *
     * @param entity la entidad {@link ReservaCuartoEntity} que se va a convertir.
     * @return el objeto DTO {@link ReservaCuartoDto} mapeado.
     */
    @Mappings({
            @Mapping(source = "codigoReservaEntityFk", target = "codigoReservaDtoFk"),
            @Mapping(source = "codigoCuartoEntityFk", target = "codigoCuartoDtoFk")
    })
    ReservaCuartoDto entityToDto(ReservaCuartoEntity entity);

    /**
     * Convierte un objeto DTO {@link ReservaCuartoDto} en una entidad {@link ReservaCuartoEntity}.
     * <p>
     * Este método mapea los atributos del objeto DTO {@link ReservaCuartoDto} a una entidad {@link ReservaCuartoEntity},
     * lo que es útil para persistir los datos en la base de datos o enviarlos entre capas del sistema.
     * </p>
     *
     * @param dto el objeto DTO {@link ReservaCuartoDto} que se va a convertir.
     * @return la entidad {@link ReservaCuartoEntity} mapeada.
     */
    @Mappings({
            @Mapping(source = "codigoReservaDtoFk", target = "codigoReservaEntityFk"),
            @Mapping(source = "codigoCuartoDtoFk", target = "codigoCuartoEntityFk")
    })
    ReservaCuartoEntity dtoToEntity(ReservaCuartoDto dto);

    /**
     * Convierte una lista de entidades {@link ReservaCuartoEntity} en una lista de objetos DTO {@link ReservaCuartoDto}.
     * <p>
     * Este método es útil cuando se necesita transformar colecciones de entidades en colecciones de DTOs,
     * por ejemplo, cuando se recuperan múltiples registros de la base de datos y se desean manipular como objetos DTO.
     * </p>
     *
     * @param entity la lista de entidades {@link ReservaCuartoEntity} que se van a convertir.
     * @return la lista de objetos DTO {@link ReservaCuartoDto}.
     */
    List<ReservaCuartoDto> listEntityTolistDto(List<ReservaCuartoEntity> entity);

    /**
     * Convierte una lista de objetos DTO {@link ReservaCuartoDto} en una lista de entidades {@link ReservaCuartoEntity}.
     * <p>
     * Este método es útil cuando se necesita convertir colecciones de DTOs en entidades para persistirlas en la base de datos.
     * </p>
     *
     * @param dto la lista de objetos DTO {@link ReservaCuartoDto} que se van a convertir.
     * @return la lista de entidades {@link ReservaCuartoEntity}.
     */
    List<ReservaCuartoEntity> listDtoToListEntity(List<ReservaCuartoDto> dto);
}
