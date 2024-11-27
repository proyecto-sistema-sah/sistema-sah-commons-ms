package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.TipoAlimentoDto;
import com.sistema.sah.commons.dto.TipoCuartoDto;
import com.sistema.sah.commons.entity.TipoAlimentoEntity;
import com.sistema.sah.commons.entity.TipoCuartoEntity;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * Mapper para la conversión entre las entidades {@link TipoCuartoEntity} y los objetos DTO {@link TipoCuartoDto}.
 * <p>
 * Esta interfaz utiliza MapStruct para generar implementaciones automáticas que facilitan la conversión entre las entidades de la base de datos y los objetos de transferencia de datos (DTO).
 * El propósito principal de este mapper es separar la capa de acceso a datos de la lógica de negocio al transformar los datos entre estas capas.
 * </p>
 */
@Mapper(componentModel = "spring")
public interface TipoCuartoMapper {

    /**
     * Convierte una entidad {@link TipoCuartoEntity} en un objeto DTO {@link TipoCuartoDto}.
     * <p>
     * Este método mapea los atributos de la entidad {@link TipoCuartoEntity} a un objeto DTO {@link TipoCuartoDto},
     * lo que permite que los datos sean manipulados en una capa más cercana a la lógica de negocio.
     * </p>
     *
     * @param entity la entidad {@link TipoCuartoEntity} que se va a convertir.
     * @return el objeto DTO {@link TipoCuartoDto} mapeado.
     */
    TipoCuartoDto entityToDto(TipoCuartoEntity entity);

    /**
     * Convierte un objeto DTO {@link TipoCuartoDto} en una entidad {@link TipoCuartoEntity}.
     * <p>
     * Este método mapea los atributos del objeto DTO {@link TipoCuartoDto} a una entidad {@link TipoCuartoEntity},
     * lo que es útil para persistir los datos en la base de datos o enviarlos entre capas del sistema.
     * </p>
     *
     * @param dto el objeto DTO {@link TipoCuartoDto} que se va a convertir.
     * @return la entidad {@link TipoCuartoEntity} mapeada.
     */
    TipoCuartoEntity dtoToEntity(TipoCuartoDto dto);

    /**
     * Convierte una lista de entidades {@link TipoCuartoEntity} en una lista de objetos DTO {@link TipoCuartoDto}.
     * <p>
     * Este método es útil cuando se necesita transformar colecciones de entidades en colecciones de DTOs,
     * por ejemplo, cuando se recuperan múltiples registros de la base de datos y se desean manipular como objetos DTO.
     * </p>
     *
     * @param entity la lista de entidades {@link TipoCuartoEntity} que se van a convertir.
     * @return la lista de objetos DTO {@link TipoCuartoDto}.
     */
    List<TipoCuartoDto> listEntityTolistDto(List<TipoCuartoEntity> entity);

    /**
     * Convierte una lista de objetos DTO {@link TipoCuartoDto} en una lista de entidades {@link TipoCuartoEntity}.
     * <p>
     * Este método es útil cuando se necesita convertir colecciones de DTOs en entidades para persistirlas en la base de datos.
     * </p>
     *
     * @param dto la lista de objetos DTO {@link TipoCuartoDto} que se van a convertir.
     * @return la lista de entidades {@link TipoCuartoEntity}.
     */
    List<TipoCuartoEntity> listDtoToListEntity(List<TipoCuartoDto> dto);
}
