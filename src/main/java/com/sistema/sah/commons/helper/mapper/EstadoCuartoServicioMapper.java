package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.EstadoCuartoServicioDto;
import com.sistema.sah.commons.entity.EstadoCuartoServicioEntity;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * Mapper para la conversión entre las entidades {@link EstadoCuartoServicioEntity} y los objetos DTO {@link EstadoCuartoServicioDto}.
 * <p>
 * Esta interfaz utiliza MapStruct para generar implementaciones automáticas que facilitan la conversión entre las entidades de la base de datos y los objetos de transferencia de datos (DTO).
 * El propósito principal de este mapper es simplificar la manipulación de los datos al separar las capas de acceso a datos de la lógica de negocio.
 * </p>
 */
@Mapper(componentModel = "spring")
public interface EstadoCuartoServicioMapper {

    /**
     * Convierte una entidad {@link EstadoCuartoServicioEntity} en un objeto DTO {@link EstadoCuartoServicioDto}.
     * <p>
     * Este método mapea los atributos de la entidad {@link EstadoCuartoServicioEntity} a un objeto DTO {@link EstadoCuartoServicioDto},
     * lo que permite que los datos sean manipulados en una capa más cercana a la lógica de negocio.
     * </p>
     *
     * @param entity la entidad {@link EstadoCuartoServicioEntity} que se va a convertir.
     * @return el objeto DTO {@link EstadoCuartoServicioDto} mapeado.
     */
    EstadoCuartoServicioDto entityToDto(EstadoCuartoServicioEntity entity);

    /**
     * Convierte un objeto DTO {@link EstadoCuartoServicioDto} en una entidad {@link EstadoCuartoServicioEntity}.
     * <p>
     * Este método mapea los atributos del objeto DTO {@link EstadoCuartoServicioDto} a una entidad {@link EstadoCuartoServicioEntity},
     * lo que es útil para persistir los datos en la base de datos o enviarlos entre capas del sistema.
     * </p>
     *
     * @param dto el objeto DTO {@link EstadoCuartoServicioDto} que se va a convertir.
     * @return la entidad {@link EstadoCuartoServicioEntity} mapeada.
     */
    EstadoCuartoServicioEntity dtoToEntity(EstadoCuartoServicioDto dto);

    /**
     * Convierte una lista de entidades {@link EstadoCuartoServicioEntity} en una lista de objetos DTO {@link EstadoCuartoServicioDto}.
     * <p>
     * Este método es útil cuando se necesita transformar colecciones de entidades en colecciones de DTOs,
     * por ejemplo, cuando se recuperan múltiples registros de la base de datos y se desean manipular como objetos DTO.
     * </p>
     *
     * @param entity la lista de entidades {@link EstadoCuartoServicioEntity} que se van a convertir.
     * @return la lista de objetos DTO {@link EstadoCuartoServicioDto}.
     */
    List<EstadoCuartoServicioDto> listEntityTolistDto(List<EstadoCuartoServicioEntity> entity);

    /**
     * Convierte una lista de objetos DTO {@link EstadoCuartoServicioDto} en una lista de entidades {@link EstadoCuartoServicioEntity}.
     * <p>
     * Este método es útil cuando se necesita convertir colecciones de DTOs en entidades para persistirlas en la base de datos.
     * </p>
     *
     * @param dto la lista de objetos DTO {@link EstadoCuartoServicioDto} que se van a convertir.
     * @return la lista de entidades {@link EstadoCuartoServicioEntity}.
     */
    List<EstadoCuartoServicioEntity> listDtoToListEntity(List<EstadoCuartoServicioDto> dto);
}
