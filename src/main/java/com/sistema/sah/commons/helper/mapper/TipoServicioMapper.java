package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.TipoCuartoDto;
import com.sistema.sah.commons.dto.TipoServicioDto;
import com.sistema.sah.commons.entity.TipoCuartoEntity;
import com.sistema.sah.commons.entity.TipoServicioEntity;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * Mapper para la conversión entre las entidades {@link TipoServicioEntity} y los objetos DTO {@link TipoServicioDto}.
 * <p>
 * Esta interfaz utiliza MapStruct para generar implementaciones automáticas que facilitan la conversión entre las entidades de la base de datos y los objetos de transferencia de datos (DTO).
 * El propósito principal de este mapper es separar la capa de acceso a datos de la lógica de negocio al transformar los datos entre estas capas.
 * </p>
 */
@Mapper(componentModel = "spring")
public interface TipoServicioMapper {

    /**
     * Convierte una entidad {@link TipoServicioEntity} en un objeto DTO {@link TipoServicioDto}.
     * <p>
     * Este método mapea los atributos de la entidad {@link TipoServicioEntity} a un objeto DTO {@link TipoServicioDto},
     * lo que permite que los datos sean manipulados en una capa más cercana a la lógica de negocio.
     * </p>
     *
     * @param entity la entidad {@link TipoServicioEntity} que se va a convertir.
     * @return el objeto DTO {@link TipoServicioDto} mapeado.
     */
    TipoServicioDto entityToDto(TipoServicioEntity entity);

    /**
     * Convierte un objeto DTO {@link TipoServicioDto} en una entidad {@link TipoServicioEntity}.
     * <p>
     * Este método mapea los atributos del objeto DTO {@link TipoServicioDto} a una entidad {@link TipoServicioEntity},
     * lo que es útil para persistir los datos en la base de datos o enviarlos entre capas del sistema.
     * </p>
     *
     * @param dto el objeto DTO {@link TipoServicioDto} que se va a convertir.
     * @return la entidad {@link TipoServicioEntity} mapeada.
     */
    TipoServicioEntity dtoToEntity(TipoServicioDto dto);

    /**
     * Convierte una lista de entidades {@link TipoServicioEntity} en una lista de objetos DTO {@link TipoServicioDto}.
     * <p>
     * Este método es útil cuando se necesita transformar colecciones de entidades en colecciones de DTOs,
     * por ejemplo, cuando se recuperan múltiples registros de la base de datos y se desean manipular como objetos DTO.
     * </p>
     *
     * @param entity la lista de entidades {@link TipoServicioEntity} que se van a convertir.
     * @return la lista de objetos DTO {@link TipoServicioDto}.
     */
    List<TipoServicioDto> listEntityTolistDto(List<TipoServicioEntity> entity);

    /**
     * Convierte una lista de objetos DTO {@link TipoServicioDto} en una lista de entidades {@link TipoServicioEntity}.
     * <p>
     * Este método es útil cuando se necesita convertir colecciones de DTOs en entidades para persistirlas en la base de datos.
     * </p>
     *
     * @param dto la lista de objetos DTO {@link TipoServicioDto} que se van a convertir.
     * @return la lista de entidades {@link TipoServicioEntity}.
     */
    List<TipoServicioEntity> listDtoToListEntity(List<TipoServicioDto> dto);
}
