package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.ReservaDto;
import com.sistema.sah.commons.dto.ServicioDto;
import com.sistema.sah.commons.entity.ReservaEntity;
import com.sistema.sah.commons.entity.ServicioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

/**
 * Mapper para la conversión entre las entidades {@link ServicioEntity} y los objetos DTO {@link ServicioDto}.
 * <p>
 * Esta interfaz utiliza MapStruct para generar implementaciones automáticas que facilitan la conversión entre las entidades de la base de datos y los objetos de transferencia de datos (DTO).
 * El propósito principal de este mapper es separar la capa de acceso a datos de la lógica de negocio al transformar los datos entre estas capas.
 * </p>
 */
@Mapper(componentModel = "spring")
public interface ServicioMapper {

    /**
     * Convierte una entidad {@link ServicioEntity} en un objeto DTO {@link ServicioDto}.
     * <p>
     * Este método mapea los atributos de la entidad {@link ServicioEntity} a un objeto DTO {@link ServicioDto},
     * lo que permite que los datos sean manipulados en una capa más cercana a la lógica de negocio.
     * </p>
     *
     * @param entity la entidad {@link ServicioEntity} que se va a convertir.
     * @return el objeto DTO {@link ServicioDto} mapeado.
     */
    @Mappings({
            @Mapping(source = "tipoServicioEntityFk", target = "tipoServicioDtoFk")
    })
    ServicioDto entityToDto(ServicioEntity entity);

    /**
     * Convierte un objeto DTO {@link ServicioDto} en una entidad {@link ServicioEntity}.
     * <p>
     * Este método mapea los atributos del objeto DTO {@link ServicioDto} a una entidad {@link ServicioEntity},
     * lo que es útil para persistir los datos en la base de datos o enviarlos entre capas del sistema.
     * </p>
     *
     * @param dto el objeto DTO {@link ServicioDto} que se va a convertir.
     * @return la entidad {@link ServicioEntity} mapeada.
     */
    @Mappings({
            @Mapping(source = "tipoServicioDtoFk", target = "tipoServicioEntityFk")
    })
    ServicioEntity dtoToEntity(ServicioDto dto);

    /**
     * Convierte una lista de entidades {@link ServicioEntity} en una lista de objetos DTO {@link ServicioDto}.
     * <p>
     * Este método es útil cuando se necesita transformar colecciones de entidades en colecciones de DTOs,
     * por ejemplo, cuando se recuperan múltiples registros de la base de datos y se desean manipular como objetos DTO.
     * </p>
     *
     * @param entity la lista de entidades {@link ServicioEntity} que se van a convertir.
     * @return la lista de objetos DTO {@link ServicioDto}.
     */
    List<ServicioDto> listEntityTolistDto(List<ServicioEntity> entity);

    /**
     * Convierte una lista de objetos DTO {@link ServicioDto} en una lista de entidades {@link ServicioEntity}.
     * <p>
     * Este método es útil cuando se necesita convertir colecciones de DTOs en entidades para persistirlas en la base de datos.
     * </p>
     *
     * @param dto la lista de objetos DTO {@link ServicioDto} que se van a convertir.
     * @return la lista de entidades {@link ServicioEntity}.
     */
    List<ServicioEntity> listDtoToListEntity(List<ServicioDto> dto);
}
