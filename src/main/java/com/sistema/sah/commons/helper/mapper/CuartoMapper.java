package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.AlimentoDto;
import com.sistema.sah.commons.dto.CuartoDto;
import com.sistema.sah.commons.entity.AlimentoEntity;
import com.sistema.sah.commons.entity.CuartoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

/**
 * Mapper para la conversión entre las entidades {@link CuartoEntity} y los objetos DTO {@link CuartoDto}.
 * <p>
 * Esta interfaz utiliza MapStruct para generar implementaciones automáticas para mapear entre las entidades y los objetos de transferencia de datos (DTO).
 * El propósito principal es separar la lógica de acceso a datos y la lógica de negocio en el modelo de datos del sistema.
 * </p>
 */
@Mapper(componentModel = "spring")
public interface CuartoMapper {

    /**
     * Convierte una entidad {@link CuartoEntity} en un objeto DTO {@link CuartoDto}.
     * <p>
     * Realiza el mapeo de los atributos de la entidad {@link CuartoEntity} a un objeto {@link CuartoDto}.
     * El campo {@code tipoCuartoEntityFk} de la entidad se mapea a {@code tipoCuartoDtoFk} en el DTO.
     * El campo {@code estadoCuartoEntityFk} de la entidad se mapea a {@code estadoCuartoDtoFk} en el DTO.
     * </p>
     *
     * @param entity la entidad {@link CuartoEntity} que se va a convertir.
     * @return el objeto DTO {@link CuartoDto} mapeado.
     */
    @Mappings({
            @Mapping(source = "tipoCuartoEntityFk", target = "tipoCuartoDtoFk"),
            @Mapping(source = "estadoCuartoEntityFk", target = "estadoCuartoDtoFk")
    })
    CuartoDto entityToDto(CuartoEntity entity);

    /**
     * Convierte un objeto DTO {@link CuartoDto} en una entidad {@link CuartoEntity}.
     * <p>
     * Realiza el mapeo de los atributos del objeto DTO {@link CuartoDto} a una entidad {@link CuartoEntity}.
     * El campo {@code tipoCuartoDtoFk} del DTO se mapea a {@code tipoCuartoEntityFk} en la entidad.
     * El campo {@code estadoCuartoDtoFk} del DTO se mapea a {@code estadoCuartoEntityFk} en la entidad.
     * </p>
     *
     * @param dto el objeto DTO {@link CuartoDto} que se va a convertir.
     * @return la entidad {@link CuartoEntity} mapeada.
     */
    @Mappings({
            @Mapping(source = "tipoCuartoDtoFk", target = "tipoCuartoEntityFk"),
            @Mapping(source = "estadoCuartoDtoFk", target = "estadoCuartoEntityFk")
    })
    CuartoEntity dtoToEntity(CuartoDto dto);

    /**
     * Convierte una lista de entidades {@link CuartoEntity} en una lista de objetos DTO {@link CuartoDto}.
     * <p>
     * Este método mapea cada entidad {@link CuartoEntity} de la lista a un objeto DTO {@link CuartoDto}.
     * </p>
     *
     * @param entity la lista de entidades {@link CuartoEntity} que se van a convertir.
     * @return la lista de objetos DTO {@link CuartoDto}.
     */
    List<CuartoDto> listEntityTolistDto(List<CuartoEntity> entity);

    /**
     * Convierte una lista de objetos DTO {@link CuartoDto} en una lista de entidades {@link CuartoEntity}.
     * <p>
     * Este método mapea cada objeto DTO {@link CuartoDto} de la lista a una entidad {@link CuartoEntity}.
     * </p>
     *
     * @param dto la lista de objetos DTO {@link CuartoDto} que se van a convertir.
     * @return la lista de entidades {@link CuartoEntity}.
     */
    List<CuartoEntity> listDtoToListEntity(List<CuartoDto> dto);
}
