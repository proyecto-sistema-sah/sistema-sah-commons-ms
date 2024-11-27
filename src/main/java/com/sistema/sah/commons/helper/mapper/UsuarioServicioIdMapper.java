package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.embeddedid.UsuarioServicioIdDto;
import com.sistema.sah.commons.entity.embeddedid.UsuarioServicioIdEntity;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * Mapper para la conversión entre las entidades {@link UsuarioServicioIdEntity} y los objetos DTO {@link UsuarioServicioIdDto}.
 * <p>
 * Esta interfaz utiliza MapStruct para generar implementaciones automáticas que facilitan la conversión entre las entidades de la base de datos
 * y los objetos de transferencia de datos (DTO). El propósito principal de este mapper es separar la capa de acceso a datos de la lógica de negocio
 * al transformar los datos entre estas capas.
 * </p>
 */
@Mapper(componentModel = "spring")
public interface UsuarioServicioIdMapper {

    /**
     * Convierte una entidad {@link UsuarioServicioIdEntity} en un objeto DTO {@link UsuarioServicioIdDto}.
     * <p>
     * Este método mapea los atributos de la entidad {@link UsuarioServicioIdEntity} a un objeto DTO {@link UsuarioServicioIdDto},
     * lo que permite que los datos sean manipulados en una capa más cercana a la lógica de negocio.
     * </p>
     *
     * @param entity la entidad {@link UsuarioServicioIdEntity} que se va a convertir.
     * @return el objeto DTO {@link UsuarioServicioIdDto} mapeado.
     */
    UsuarioServicioIdDto entityToDto(UsuarioServicioIdEntity entity);

    /**
     * Convierte un objeto DTO {@link UsuarioServicioIdDto} en una entidad {@link UsuarioServicioIdEntity}.
     * <p>
     * Este método mapea los atributos del objeto DTO {@link UsuarioServicioIdDto} a una entidad {@link UsuarioServicioIdEntity},
     * lo que es útil para persistir los datos en la base de datos o enviarlos entre capas del sistema.
     * </p>
     *
     * @param dto el objeto DTO {@link UsuarioServicioIdDto} que se va a convertir.
     * @return la entidad {@link UsuarioServicioIdEntity} mapeada.
     */
    UsuarioServicioIdEntity dtoToEntity(UsuarioServicioIdDto dto);

    /**
     * Convierte una lista de entidades {@link UsuarioServicioIdEntity} en una lista de objetos DTO {@link UsuarioServicioIdDto}.
     * <p>
     * Este método es útil cuando se necesita transformar colecciones de entidades en colecciones de DTOs,
     * por ejemplo, cuando se recuperan múltiples registros de la base de datos y se desean manipular como objetos DTO.
     * </p>
     *
     * @param entity la lista de entidades {@link UsuarioServicioIdEntity} que se van a convertir.
     * @return la lista de objetos DTO {@link UsuarioServicioIdDto}.
     */
    List<UsuarioServicioIdDto> listEntityTolistDto(List<UsuarioServicioIdEntity> entity);

    /**
     * Convierte una lista de objetos DTO {@link UsuarioServicioIdDto} en una lista de entidades {@link UsuarioServicioIdEntity}.
     * <p>
     * Este método es útil cuando se necesita convertir colecciones de DTOs en entidades para persistirlas en la base de datos.
     * </p>
     *
     * @param dto la lista de objetos DTO {@link UsuarioServicioIdDto} que se van a convertir.
     * @return la lista de entidades {@link UsuarioServicioIdEntity}.
     */
    List<UsuarioServicioIdEntity> listDtoToListEntity(List<UsuarioServicioIdDto> dto);
}
