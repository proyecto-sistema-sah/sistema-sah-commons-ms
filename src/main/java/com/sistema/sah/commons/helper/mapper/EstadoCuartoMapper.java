package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.EstadoCuartoDto;
import com.sistema.sah.commons.entity.EstadoCuartoEntity;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * Mapper para la conversión entre las entidades {@link EstadoCuartoEntity} y los objetos DTO {@link EstadoCuartoDto}.
 * <p>
 * Esta interfaz utiliza MapStruct para generar implementaciones automáticas para mapear entre las entidades y los objetos de transferencia de datos (DTO).
 * El propósito principal es separar la lógica de acceso a datos y la lógica de negocio en el modelo de datos del sistema.
 * </p>
 */
@Mapper(componentModel = "spring")
public interface EstadoCuartoMapper {

    /**
     * Convierte una entidad {@link EstadoCuartoEntity} en un objeto DTO {@link EstadoCuartoDto}.
     * <p>
     * Realiza el mapeo de los atributos de la entidad {@link EstadoCuartoEntity} a un objeto {@link EstadoCuartoDto}.
     * </p>
     *
     * @param entity la entidad {@link EstadoCuartoEntity} que se va a convertir.
     * @return el objeto DTO {@link EstadoCuartoDto} mapeado.
     */
    EstadoCuartoDto entityToDto(EstadoCuartoEntity entity);

    /**
     * Convierte un objeto DTO {@link EstadoCuartoDto} en una entidad {@link EstadoCuartoEntity}.
     * <p>
     * Realiza el mapeo de los atributos del objeto DTO {@link EstadoCuartoDto} a una entidad {@link EstadoCuartoEntity}.
     * </p>
     *
     * @param dto el objeto DTO {@link EstadoCuartoDto} que se va a convertir.
     * @return la entidad {@link EstadoCuartoEntity} mapeada.
     */
    EstadoCuartoEntity dtoToEntity(EstadoCuartoDto dto);

    /**
     * Convierte una lista de entidades {@link EstadoCuartoEntity} en una lista de objetos DTO {@link EstadoCuartoDto}.
     * <p>
     * Este método mapea cada entidad {@link EstadoCuartoEntity} de la lista a un objeto DTO {@link EstadoCuartoDto}.
     * </p>
     *
     * @param entity la lista de entidades {@link EstadoCuartoEntity} que se van a convertir.
     * @return la lista de objetos DTO {@link EstadoCuartoDto}.
     */
    List<EstadoCuartoDto> listEntityTolistDto(List<EstadoCuartoEntity> entity);

    /**
     * Convierte una lista de objetos DTO {@link EstadoCuartoDto} en una lista de entidades {@link EstadoCuartoEntity}.
     * <p>
     * Este método mapea cada objeto DTO {@link EstadoCuartoDto} de la lista a una entidad {@link EstadoCuartoEntity}.
     * </p>
     *
     * @param dto la lista de objetos DTO {@link EstadoCuartoDto} que se van a convertir.
     * @return la lista de entidades {@link EstadoCuartoEntity}.
     */
    List<EstadoCuartoEntity> listDtoToListEntity(List<EstadoCuartoDto> dto);
}
