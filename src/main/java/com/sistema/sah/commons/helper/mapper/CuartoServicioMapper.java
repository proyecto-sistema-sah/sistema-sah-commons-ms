package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.CuartoServicioDto;
import com.sistema.sah.commons.entity.CuartoServicioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

/**
 * Mapper para la conversión entre las entidades {@link CuartoServicioEntity} y los objetos DTO {@link CuartoServicioDto}.
 * <p>
 * Esta interfaz utiliza MapStruct para generar implementaciones automáticas para mapear entre las entidades y los objetos de transferencia de datos (DTO).
 * El propósito principal es separar la lógica de acceso a datos y la lógica de negocio en el modelo de datos del sistema.
 * </p>
 */
@Mapper(componentModel = "spring")
public interface CuartoServicioMapper {

    /**
     * Convierte una entidad {@link CuartoServicioEntity} en un objeto DTO {@link CuartoServicioDto}.
     * <p>
     * Realiza el mapeo de los atributos de la entidad {@link CuartoServicioEntity} a un objeto {@link CuartoServicioDto}.
     * </p>
     *
     * @param entity la entidad {@link CuartoServicioEntity} que se va a convertir.
     * @return el objeto DTO {@link CuartoServicioDto} mapeado.
     */
    @Mappings({
            @Mapping(source = "codigoCuartoEntityFk", target = "codigoCuartoDtoFk"),
            @Mapping(source = "codigoServicioEntityFk", target = "codigoServicioDtoFk"),
            @Mapping(source = "estadoCuartoServicioEntityFk", target = "estadoCuartoServicioDtoFk")
    })
    CuartoServicioDto entityToDto(CuartoServicioEntity entity);

    /**
     * Convierte un objeto DTO {@link CuartoServicioDto} en una entidad {@link CuartoServicioEntity}.
     * <p>
     * Realiza el mapeo de los atributos del objeto DTO {@link CuartoServicioDto} a una entidad {@link CuartoServicioEntity}.
     * </p>
     *
     * @param dto el objeto DTO {@link CuartoServicioDto} que se va a convertir.
     * @return la entidad {@link CuartoServicioEntity} mapeada.
     */
    @Mappings({
            @Mapping(source = "codigoCuartoDtoFk", target = "codigoCuartoEntityFk"),
            @Mapping(source = "codigoServicioDtoFk", target = "codigoServicioEntityFk"),
            @Mapping(source = "estadoCuartoServicioDtoFk", target = "estadoCuartoServicioEntityFk")
    })
    CuartoServicioEntity dtoToEntity(CuartoServicioDto dto);

    /**
     * Convierte una lista de entidades {@link CuartoServicioEntity} en una lista de objetos DTO {@link CuartoServicioDto}.
     * <p>
     * Este método mapea cada entidad {@link CuartoServicioEntity} de la lista a un objeto DTO {@link CuartoServicioDto}.
     * </p>
     *
     * @param entity la lista de entidades {@link CuartoServicioEntity} que se van a convertir.
     * @return la lista de objetos DTO {@link CuartoServicioDto}.
     */
    List<CuartoServicioDto> listEntityTolistDto(List<CuartoServicioEntity> entity);

    /**
     * Convierte una lista de objetos DTO {@link CuartoServicioDto} en una lista de entidades {@link CuartoServicioEntity}.
     * <p>
     * Este método mapea cada objeto DTO {@link CuartoServicioDto} de la lista a una entidad {@link CuartoServicioEntity}.
     * </p>
     *
     * @param dto la lista de objetos DTO {@link CuartoServicioDto} que se van a convertir.
     * @return la lista de entidades {@link CuartoServicioEntity}.
     */
    List<CuartoServicioEntity> listDtoToListEntity(List<CuartoServicioDto> dto);
}
