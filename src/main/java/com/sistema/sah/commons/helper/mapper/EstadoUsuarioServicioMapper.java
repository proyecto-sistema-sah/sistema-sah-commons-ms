package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.EstadoUsuarioAlimentoDto;
import com.sistema.sah.commons.dto.EstadoUsuarioServicioDto;
import com.sistema.sah.commons.entity.EstadoUsuarioAlimentoEntity;
import com.sistema.sah.commons.entity.EstadoUsuarioServicioEntity;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * Mapper para la conversión entre las entidades {@link EstadoUsuarioServicioEntity} y los objetos DTO {@link EstadoUsuarioServicioDto}.
 * <p>
 * Esta interfaz utiliza MapStruct para generar implementaciones automáticas que facilitan la conversión entre las entidades de la base de datos y los objetos de transferencia de datos (DTO).
 * El propósito principal de este mapper es separar la capa de acceso a datos de la lógica de negocio al transformar los datos entre estas capas.
 * </p>
 */
@Mapper(componentModel = "spring")
public interface EstadoUsuarioServicioMapper {

    /**
     * Convierte una entidad {@link EstadoUsuarioServicioEntity} en un objeto DTO {@link EstadoUsuarioServicioDto}.
     * <p>
     * Este método mapea los atributos de la entidad {@link EstadoUsuarioServicioEntity} a un objeto DTO {@link EstadoUsuarioServicioDto},
     * lo que permite que los datos sean manipulados en una capa más cercana a la lógica de negocio.
     * </p>
     *
     * @param entity la entidad {@link EstadoUsuarioServicioEntity} que se va a convertir.
     * @return el objeto DTO {@link EstadoUsuarioServicioDto} mapeado.
     */
    EstadoUsuarioServicioDto entityToDto(EstadoUsuarioServicioEntity entity);

    /**
     * Convierte un objeto DTO {@link EstadoUsuarioServicioDto} en una entidad {@link EstadoUsuarioServicioEntity}.
     * <p>
     * Este método mapea los atributos del objeto DTO {@link EstadoUsuarioServicioDto} a una entidad {@link EstadoUsuarioServicioEntity},
     * lo que es útil para persistir los datos en la base de datos o enviarlos entre capas del sistema.
     * </p>
     *
     * @param dto el objeto DTO {@link EstadoUsuarioServicioDto} que se va a convertir.
     * @return la entidad {@link EstadoUsuarioServicioEntity} mapeada.
     */
    EstadoUsuarioServicioEntity dtoToEntity(EstadoUsuarioServicioDto dto);

    /**
     * Convierte una lista de entidades {@link EstadoUsuarioServicioEntity} en una lista de objetos DTO {@link EstadoUsuarioServicioDto}.
     * <p>
     * Este método es útil cuando se necesita transformar colecciones de entidades en colecciones de DTOs,
     * por ejemplo, cuando se recuperan múltiples registros de la base de datos y se desean manipular como objetos DTO.
     * </p>
     *
     * @param entity la lista de entidades {@link EstadoUsuarioServicioEntity} que se van a convertir.
     * @return la lista de objetos DTO {@link EstadoUsuarioServicioDto}.
     */
    List<EstadoUsuarioServicioDto> listEntityTolistDto(List<EstadoUsuarioServicioEntity> entity);

    /**
     * Convierte una lista de objetos DTO {@link EstadoUsuarioServicioDto} en una lista de entidades {@link EstadoUsuarioServicioEntity}.
     * <p>
     * Este método es útil cuando se necesita convertir colecciones de DTOs en entidades para persistirlas en la base de datos.
     * </p>
     *
     * @param dto la lista de objetos DTO {@link EstadoUsuarioServicioDto} que se van a convertir.
     * @return la lista de entidades {@link EstadoUsuarioServicioEntity}.
     */
    List<EstadoUsuarioServicioEntity> listDtoToListEntity(List<EstadoUsuarioServicioDto> dto);
}
