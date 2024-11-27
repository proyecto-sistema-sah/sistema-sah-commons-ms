package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.TipoServicioDto;
import com.sistema.sah.commons.dto.TipoUsuarioDto;
import com.sistema.sah.commons.entity.TipoServicioEntity;
import com.sistema.sah.commons.entity.TipoUsuarioEntity;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * Mapper para la conversión entre las entidades {@link TipoUsuarioEntity} y los objetos DTO {@link TipoUsuarioDto}.
 * <p>
 * Esta interfaz utiliza MapStruct para generar implementaciones automáticas que facilitan la conversión entre las entidades de la base de datos y los objetos de transferencia de datos (DTO).
 * El propósito principal de este mapper es separar la capa de acceso a datos de la lógica de negocio al transformar los datos entre estas capas.
 * </p>
 */
@Mapper(componentModel = "spring")
public interface TipoUsuarioMapper {

    /**
     * Convierte una entidad {@link TipoUsuarioEntity} en un objeto DTO {@link TipoUsuarioDto}.
     * <p>
     * Este método mapea los atributos de la entidad {@link TipoUsuarioEntity} a un objeto DTO {@link TipoUsuarioDto},
     * lo que permite que los datos sean manipulados en una capa más cercana a la lógica de negocio.
     * </p>
     *
     * @param entity la entidad {@link TipoUsuarioEntity} que se va a convertir.
     * @return el objeto DTO {@link TipoUsuarioDto} mapeado.
     */
    TipoUsuarioDto entityToDto(TipoUsuarioEntity entity);

    /**
     * Convierte un objeto DTO {@link TipoUsuarioDto} en una entidad {@link TipoUsuarioEntity}.
     * <p>
     * Este método mapea los atributos del objeto DTO {@link TipoUsuarioDto} a una entidad {@link TipoUsuarioEntity},
     * lo que es útil para persistir los datos en la base de datos o enviarlos entre capas del sistema.
     * </p>
     *
     * @param dto el objeto DTO {@link TipoUsuarioDto} que se va a convertir.
     * @return la entidad {@link TipoUsuarioEntity} mapeada.
     */
    TipoUsuarioEntity dtoToEntity(TipoUsuarioDto dto);

    /**
     * Convierte una lista de entidades {@link TipoUsuarioEntity} en una lista de objetos DTO {@link TipoUsuarioDto}.
     * <p>
     * Este método es útil cuando se necesita transformar colecciones de entidades en colecciones de DTOs,
     * por ejemplo, cuando se recuperan múltiples registros de la base de datos y se desean manipular como objetos DTO.
     * </p>
     *
     * @param entity la lista de entidades {@link TipoUsuarioEntity} que se van a convertir.
     * @return la lista de objetos DTO {@link TipoUsuarioDto}.
     */
    List<TipoUsuarioDto> listEntityTolistDto(List<TipoUsuarioEntity> entity);

    /**
     * Convierte una lista de objetos DTO {@link TipoUsuarioDto} en una lista de entidades {@link TipoUsuarioEntity}.
     * <p>
     * Este método es útil cuando se necesita convertir colecciones de DTOs en entidades para persistirlas en la base de datos.
     * </p>
     *
     * @param dto la lista de objetos DTO {@link TipoUsuarioDto} que se van a convertir.
     * @return la lista de entidades {@link TipoUsuarioEntity}.
     */
    List<TipoUsuarioEntity> listDtoToListEntity(List<TipoUsuarioDto> dto);
}
