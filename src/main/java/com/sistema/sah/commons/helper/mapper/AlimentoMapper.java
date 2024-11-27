package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.AlimentoDto;
import com.sistema.sah.commons.entity.AlimentoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

/**
 * Mapper para la conversión entre las entidades {@link AlimentoEntity} y los objetos DTO {@link AlimentoDto}.
 * <p>
 * Esta interfaz utiliza MapStruct para generar implementaciones automáticas para mapear entre las entidades y los objetos de transferencia de datos (DTO).
 * El propósito principal es separar la lógica de acceso a datos y la lógica de negocio en el modelo de datos del sistema.
 * </p>
 */
@Mapper(componentModel = "spring")
public interface AlimentoMapper {

    /**
     * Convierte una entidad {@link AlimentoEntity} en un objeto DTO {@link AlimentoDto}.
     * <p>
     * Realiza el mapeo de los atributos de la entidad {@link AlimentoEntity} a un objeto {@link AlimentoDto}.
     * El campo {@code tipoAlimentoEntityFk} de la entidad se mapea a {@code tipoAlimentoDtoFk} en el DTO.
     * </p>
     *
     * @param entity la entidad {@link AlimentoEntity} que se va a convertir.
     * @return el objeto DTO {@link AlimentoDto} mapeado.
     */
    @Mappings({
            @Mapping(source = "tipoAlimentoEntityFk", target = "tipoAlimentoDtoFk")
    })
    AlimentoDto entityToDto(AlimentoEntity entity);

    /**
     * Convierte un objeto DTO {@link AlimentoDto} en una entidad {@link AlimentoEntity}.
     * <p>
     * Realiza el mapeo de los atributos del objeto DTO {@link AlimentoDto} a una entidad {@link AlimentoEntity}.
     * El campo {@code tipoAlimentoDtoFk} del DTO se mapea a {@code tipoAlimentoEntityFk} en la entidad.
     * </p>
     *
     * @param dto el objeto DTO {@link AlimentoDto} que se va a convertir.
     * @return la entidad {@link AlimentoEntity} mapeada.
     */
    @Mappings({
            @Mapping(source = "tipoAlimentoDtoFk", target = "tipoAlimentoEntityFk")
    })
    AlimentoEntity dtoToEntity(AlimentoDto dto);

    /**
     * Convierte una lista de entidades {@link AlimentoEntity} en una lista de objetos DTO {@link AlimentoDto}.
     * <p>
     * Este método mapea cada entidad {@link AlimentoEntity} de la lista a un objeto DTO {@link AlimentoDto}.
     * </p>
     *
     * @param entity la lista de entidades {@link AlimentoEntity} que se van a convertir.
     * @return la lista de objetos DTO {@link AlimentoDto}.
     */
    List<AlimentoDto> listEntityTolistDto(List<AlimentoEntity> entity);

    /**
     * Convierte una lista de objetos DTO {@link AlimentoDto} en una lista de entidades {@link AlimentoEntity}.
     * <p>
     * Este método mapea cada objeto DTO {@link AlimentoDto} de la lista a una entidad {@link AlimentoEntity}.
     * </p>
     *
     * @param dto la lista de objetos DTO {@link AlimentoDto} que se van a convertir.
     * @return la lista de entidades {@link AlimentoEntity}.
     */
    List<AlimentoEntity> listDtoToListEntity(List<AlimentoDto> dto);
}
