package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.EstadoUsuarioAlimentoDto;
import com.sistema.sah.commons.entity.EstadoUsuarioAlimentoEntity;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * Mapper para la conversión entre las entidades {@link EstadoUsuarioAlimentoEntity} y los objetos DTO {@link EstadoUsuarioAlimentoDto}.
 * <p>
 * Esta interfaz utiliza MapStruct para generar implementaciones automáticas que facilitan la conversión entre las entidades de la base de datos y los objetos de transferencia de datos (DTO).
 * El propósito principal de este mapper es separar la capa de acceso a datos de la lógica de negocio al transformar los datos entre estas capas.
 * </p>
 */
@Mapper(componentModel = "spring")
public interface EstadoUsuarioAlimentoMapper {

    /**
     * Convierte una entidad {@link EstadoUsuarioAlimentoEntity} en un objeto DTO {@link EstadoUsuarioAlimentoDto}.
     * <p>
     * Este método mapea los atributos de la entidad {@link EstadoUsuarioAlimentoEntity} a un objeto DTO {@link EstadoUsuarioAlimentoDto},
     * lo que permite que los datos sean manipulados en una capa más cercana a la lógica de negocio.
     * </p>
     *
     * @param entity la entidad {@link EstadoUsuarioAlimentoEntity} que se va a convertir.
     * @return el objeto DTO {@link EstadoUsuarioAlimentoDto} mapeado.
     */
    EstadoUsuarioAlimentoDto entityToDto(EstadoUsuarioAlimentoEntity entity);

    /**
     * Convierte un objeto DTO {@link EstadoUsuarioAlimentoDto} en una entidad {@link EstadoUsuarioAlimentoEntity}.
     * <p>
     * Este método mapea los atributos del objeto DTO {@link EstadoUsuarioAlimentoDto} a una entidad {@link EstadoUsuarioAlimentoEntity},
     * lo que es útil para persistir los datos en la base de datos o enviarlos entre capas del sistema.
     * </p>
     *
     * @param dto el objeto DTO {@link EstadoUsuarioAlimentoDto} que se va a convertir.
     * @return la entidad {@link EstadoUsuarioAlimentoEntity} mapeada.
     */
    EstadoUsuarioAlimentoEntity dtoToEntity(EstadoUsuarioAlimentoDto dto);

    /**
     * Convierte una lista de entidades {@link EstadoUsuarioAlimentoEntity} en una lista de objetos DTO {@link EstadoUsuarioAlimentoDto}.
     * <p>
     * Este método es útil cuando se necesita transformar colecciones de entidades en colecciones de DTOs,
     * por ejemplo, cuando se recuperan múltiples registros de la base de datos y se desean manipular como objetos DTO.
     * </p>
     *
     * @param entity la lista de entidades {@link EstadoUsuarioAlimentoEntity} que se van a convertir.
     * @return la lista de objetos DTO {@link EstadoUsuarioAlimentoDto}.
     */
    List<EstadoUsuarioAlimentoDto> listEntityTolistDto(List<EstadoUsuarioAlimentoEntity> entity);

    /**
     * Convierte una lista de objetos DTO {@link EstadoUsuarioAlimentoDto} en una lista de entidades {@link EstadoUsuarioAlimentoEntity}.
     * <p>
     * Este método es útil cuando se necesita convertir colecciones de DTOs en entidades para persistirlas en la base de datos.
     * </p>
     *
     * @param dto la lista de objetos DTO {@link EstadoUsuarioAlimentoDto} que se van a convertir.
     * @return la lista de entidades {@link EstadoUsuarioAlimentoEntity}.
     */
    List<EstadoUsuarioAlimentoEntity> listDtoToListEntity(List<EstadoUsuarioAlimentoDto> dto);
}
