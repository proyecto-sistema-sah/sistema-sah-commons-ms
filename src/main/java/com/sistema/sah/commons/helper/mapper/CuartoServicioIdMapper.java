package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.embeddedid.CuartoServicioIdDto;
import com.sistema.sah.commons.entity.embeddedid.CuartoServicioIdEntity;
import org.mapstruct.Mapper;

import java.util.List;

/**
 * Mapper para la conversión entre las entidades {@link CuartoServicioIdEntity} y los objetos DTO {@link CuartoServicioIdDto}.
 * <p>
 * Esta interfaz utiliza MapStruct para generar implementaciones automáticas para mapear entre las entidades y los objetos de transferencia de datos (DTO).
 * El propósito principal es separar la lógica de acceso a datos y la lógica de negocio en el modelo de datos del sistema.
 * </p>
 */
@Mapper(componentModel = "spring")
public interface CuartoServicioIdMapper {

    /**
     * Convierte una entidad {@link CuartoServicioIdEntity} en un objeto DTO {@link CuartoServicioIdDto}.
     * <p>
     * Realiza el mapeo de los atributos de la entidad {@link CuartoServicioIdEntity} a un objeto {@link CuartoServicioIdDto}.
     * </p>
     *
     * @param entity la entidad {@link CuartoServicioIdEntity} que se va a convertir.
     * @return el objeto DTO {@link CuartoServicioIdDto} mapeado.
     */
    CuartoServicioIdDto entityToDto(CuartoServicioIdEntity entity);

    /**
     * Convierte un objeto DTO {@link CuartoServicioIdDto} en una entidad {@link CuartoServicioIdEntity}.
     * <p>
     * Realiza el mapeo de los atributos del objeto DTO {@link CuartoServicioIdDto} a una entidad {@link CuartoServicioIdEntity}.
     * </p>
     *
     * @param dto el objeto DTO {@link CuartoServicioIdDto} que se va a convertir.
     * @return la entidad {@link CuartoServicioIdEntity} mapeada.
     */
    CuartoServicioIdEntity dtoToEntity(CuartoServicioIdDto dto);

    /**
     * Convierte una lista de entidades {@link CuartoServicioIdEntity} en una lista de objetos DTO {@link CuartoServicioIdDto}.
     * <p>
     * Este método mapea cada entidad {@link CuartoServicioIdEntity} de la lista a un objeto DTO {@link CuartoServicioIdDto}.
     * </p>
     *
     * @param entity la lista de entidades {@link CuartoServicioIdEntity} que se van a convertir.
     * @return la lista de objetos DTO {@link CuartoServicioIdDto}.
     */
    List<CuartoServicioIdDto> listEntityTolistDto(List<CuartoServicioIdEntity> entity);

    /**
     * Convierte una lista de objetos DTO {@link CuartoServicioIdDto} en una lista de entidades {@link CuartoServicioIdEntity}.
     * <p>
     * Este método mapea cada objeto DTO {@link CuartoServicioIdDto} de la lista a una entidad {@link CuartoServicioIdEntity}.
     * </p>
     *
     * @param dto la lista de objetos DTO {@link CuartoServicioIdDto} que se van a convertir.
     * @return la lista de entidades {@link CuartoServicioIdEntity}.
     */
    List<CuartoServicioIdEntity> listDtoToListEntity(List<CuartoServicioIdDto> dto);
}
