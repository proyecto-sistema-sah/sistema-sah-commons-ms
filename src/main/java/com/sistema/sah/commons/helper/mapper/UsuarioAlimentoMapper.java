package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.UsuarioAlimentoDto;
import com.sistema.sah.commons.entity.UsuarioAlimentoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

/**
 * Mapper para la conversión entre las entidades {@link UsuarioAlimentoEntity} y los objetos DTO {@link UsuarioAlimentoDto}.
 * <p>
 * Esta interfaz utiliza MapStruct para generar implementaciones automáticas que facilitan la conversión entre las entidades de la base de datos
 * y los objetos de transferencia de datos (DTO).
 * El propósito principal de este mapper es separar la capa de acceso a datos de la lógica de negocio al transformar los datos entre estas capas.
 * </p>
 */
@Mapper(componentModel = "spring")
public interface UsuarioAlimentoMapper {

    /**
     * Convierte una entidad {@link UsuarioAlimentoEntity} en un objeto DTO {@link UsuarioAlimentoDto}.
     * <p>
     * Este método mapea los atributos de la entidad {@link UsuarioAlimentoEntity} a un objeto DTO {@link UsuarioAlimentoDto},
     * lo que permite que los datos sean manipulados en una capa más cercana a la lógica de negocio.
     * </p>
     *
     * @param entity la entidad {@link UsuarioAlimentoEntity} que se va a convertir.
     * @return el objeto DTO {@link UsuarioAlimentoDto} mapeado.
     */
    @Mappings({
            @Mapping(source = "codigoUsuarioEntityFk", target = "codigoUsuarioDtoFk"),
            @Mapping(source = "codigoAlimentoEntityFk", target = "codigoAlimentoDtoFk"),
            @Mapping(source = "estadoUsuarioAlimentoEntityFk", target = "estadoUsuarioAlimentoDtoFk")
    })
    UsuarioAlimentoDto entityToDto(UsuarioAlimentoEntity entity);

    /**
     * Convierte un objeto DTO {@link UsuarioAlimentoDto} en una entidad {@link UsuarioAlimentoEntity}.
     * <p>
     * Este método mapea los atributos del objeto DTO {@link UsuarioAlimentoDto} a una entidad {@link UsuarioAlimentoEntity},
     * lo que es útil para persistir los datos en la base de datos o enviarlos entre capas del sistema.
     * </p>
     *
     * @param dto el objeto DTO {@link UsuarioAlimentoDto} que se va a convertir.
     * @return la entidad {@link UsuarioAlimentoEntity} mapeada.
     */
    @Mappings({
            @Mapping(source = "codigoUsuarioDtoFk", target = "codigoUsuarioEntityFk"),
            @Mapping(source = "codigoAlimentoDtoFk", target = "codigoAlimentoEntityFk"),
            @Mapping(source = "estadoUsuarioAlimentoDtoFk", target = "estadoUsuarioAlimentoEntityFk")
    })
    UsuarioAlimentoEntity dtoToEntity(UsuarioAlimentoDto dto);

    /**
     * Convierte una lista de entidades {@link UsuarioAlimentoEntity} en una lista de objetos DTO {@link UsuarioAlimentoDto}.
     * <p>
     * Este método es útil cuando se necesita transformar colecciones de entidades en colecciones de DTOs,
     * por ejemplo, cuando se recuperan múltiples registros de la base de datos y se desean manipular como objetos DTO.
     * </p>
     *
     * @param entity la lista de entidades {@link UsuarioAlimentoEntity} que se van a convertir.
     * @return la lista de objetos DTO {@link UsuarioAlimentoDto}.
     */
    List<UsuarioAlimentoDto> listEntityTolistDto(List<UsuarioAlimentoEntity> entity);

    /**
     * Convierte una lista de objetos DTO {@link UsuarioAlimentoDto} en una lista de entidades {@link UsuarioAlimentoEntity}.
     * <p>
     * Este método es útil cuando se necesita convertir colecciones de DTOs en entidades para persistirlas en la base de datos.
     * </p>
     *
     * @param dto la lista de objetos DTO {@link UsuarioAlimentoDto} que se van a convertir.
     * @return la lista de entidades {@link UsuarioAlimentoEntity}.
     */
    List<UsuarioAlimentoEntity> listDtoToListEntity(List<UsuarioAlimentoDto> dto);
}
