package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.embeddedid.UsuarioAlimentoIdDto;
import com.sistema.sah.commons.entity.embeddedid.UsuarioAlimentoIdEntity;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * Mapper para la conversión entre las entidades {@link UsuarioAlimentoIdEntity} y los objetos DTO {@link UsuarioAlimentoIdDto}.
 * <p>
 * Esta interfaz utiliza MapStruct para generar implementaciones automáticas que facilitan la conversión entre las entidades de la base de datos
 * y los objetos de transferencia de datos (DTO).
 * El propósito principal de este mapper es separar la capa de acceso a datos de la lógica de negocio al transformar los datos entre estas capas.
 * </p>
 */
@Mapper(componentModel = "spring")
public interface UsuarioAlimentoIdMapper {

    /**
     * Convierte una entidad {@link UsuarioAlimentoIdEntity} en un objeto DTO {@link UsuarioAlimentoIdDto}.
     * <p>
     * Este método mapea los atributos de la entidad {@link UsuarioAlimentoIdEntity} a un objeto DTO {@link UsuarioAlimentoIdDto},
     * lo que permite que los datos sean manipulados en una capa más cercana a la lógica de negocio.
     * </p>
     *
     * @param entity la entidad {@link UsuarioAlimentoIdEntity} que se va a convertir.
     * @return el objeto DTO {@link UsuarioAlimentoIdDto} mapeado.
     */
    UsuarioAlimentoIdDto entityToDto(UsuarioAlimentoIdEntity entity);

    /**
     * Convierte un objeto DTO {@link UsuarioAlimentoIdDto} en una entidad {@link UsuarioAlimentoIdEntity}.
     * <p>
     * Este método mapea los atributos del objeto DTO {@link UsuarioAlimentoIdDto} a una entidad {@link UsuarioAlimentoIdEntity},
     * lo que es útil para persistir los datos en la base de datos o enviarlos entre capas del sistema.
     * </p>
     *
     * @param dto el objeto DTO {@link UsuarioAlimentoIdDto} que se va a convertir.
     * @return la entidad {@link UsuarioAlimentoIdEntity} mapeada.
     */
    UsuarioAlimentoIdEntity dtoToEntity(UsuarioAlimentoIdDto dto);

    /**
     * Convierte una lista de entidades {@link UsuarioAlimentoIdEntity} en una lista de objetos DTO {@link UsuarioAlimentoIdDto}.
     * <p>
     * Este método es útil cuando se necesita transformar colecciones de entidades en colecciones de DTOs,
     * por ejemplo, cuando se recuperan múltiples registros de la base de datos y se desean manipular como objetos DTO.
     * </p>
     *
     * @param entity la lista de entidades {@link UsuarioAlimentoIdEntity} que se van a convertir.
     * @return la lista de objetos DTO {@link UsuarioAlimentoIdDto}.
     */
    List<UsuarioAlimentoIdDto> listEntityTolistDto(List<UsuarioAlimentoIdEntity> entity);

    /**
     * Convierte una lista de objetos DTO {@link UsuarioAlimentoIdDto} en una lista de entidades {@link UsuarioAlimentoIdEntity}.
     * <p>
     * Este método es útil cuando se necesita convertir colecciones de DTOs en entidades para persistirlas en la base de datos.
     * </p>
     *
     * @param dto la lista de objetos DTO {@link UsuarioAlimentoIdDto} que se van a convertir.
     * @return la lista de entidades {@link UsuarioAlimentoIdEntity}.
     */
    List<UsuarioAlimentoIdEntity> listDtoToListEntity(List<UsuarioAlimentoIdDto> dto);
}
