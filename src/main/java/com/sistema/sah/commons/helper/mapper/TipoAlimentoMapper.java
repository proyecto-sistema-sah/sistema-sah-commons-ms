package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.ServicioDto;
import com.sistema.sah.commons.dto.TipoAlimentoDto;
import com.sistema.sah.commons.entity.ServicioEntity;
import com.sistema.sah.commons.entity.TipoAlimentoEntity;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * Mapper para la conversión entre las entidades {@link TipoAlimentoEntity} y los objetos DTO {@link TipoAlimentoDto}.
 * <p>
 * Esta interfaz utiliza MapStruct para generar implementaciones automáticas que facilitan la conversión entre las entidades de la base de datos y los objetos de transferencia de datos (DTO).
 * El propósito principal de este mapper es separar la capa de acceso a datos de la lógica de negocio al transformar los datos entre estas capas.
 * </p>
 */
@Mapper(componentModel = "spring")
public interface TipoAlimentoMapper {

    /**
     * Convierte una entidad {@link TipoAlimentoEntity} en un objeto DTO {@link TipoAlimentoDto}.
     * <p>
     * Este método mapea los atributos de la entidad {@link TipoAlimentoEntity} a un objeto DTO {@link TipoAlimentoDto},
     * lo que permite que los datos sean manipulados en una capa más cercana a la lógica de negocio.
     * </p>
     *
     * @param entity la entidad {@link TipoAlimentoEntity} que se va a convertir.
     * @return el objeto DTO {@link TipoAlimentoDto} mapeado.
     */
    TipoAlimentoDto entityToDto(TipoAlimentoEntity entity);

    /**
     * Convierte un objeto DTO {@link TipoAlimentoDto} en una entidad {@link TipoAlimentoEntity}.
     * <p>
     * Este método mapea los atributos del objeto DTO {@link TipoAlimentoDto} a una entidad {@link TipoAlimentoEntity},
     * lo que es útil para persistir los datos en la base de datos o enviarlos entre capas del sistema.
     * </p>
     *
     * @param dto el objeto DTO {@link TipoAlimentoDto} que se va a convertir.
     * @return la entidad {@link TipoAlimentoEntity} mapeada.
     */
    TipoAlimentoEntity dtoToEntity(TipoAlimentoDto dto);

    /**
     * Convierte una lista de entidades {@link TipoAlimentoEntity} en una lista de objetos DTO {@link TipoAlimentoDto}.
     * <p>
     * Este método es útil cuando se necesita transformar colecciones de entidades en colecciones de DTOs,
     * por ejemplo, cuando se recuperan múltiples registros de la base de datos y se desean manipular como objetos DTO.
     * </p>
     *
     * @param entity la lista de entidades {@link TipoAlimentoEntity} que se van a convertir.
     * @return la lista de objetos DTO {@link TipoAlimentoDto}.
     */
    List<TipoAlimentoDto> listEntityTolistDto(List<TipoAlimentoEntity> entity);

    /**
     * Convierte una lista de objetos DTO {@link TipoAlimentoDto} en una lista de entidades {@link TipoAlimentoEntity}.
     * <p>
     * Este método es útil cuando se necesita convertir colecciones de DTOs en entidades para persistirlas en la base de datos.
     * </p>
     *
     * @param dto la lista de objetos DTO {@link TipoAlimentoDto} que se van a convertir.
     * @return la lista de entidades {@link TipoAlimentoEntity}.
     */
    List<TipoAlimentoEntity> listDtoToListEntity(List<TipoAlimentoDto> dto);
}
