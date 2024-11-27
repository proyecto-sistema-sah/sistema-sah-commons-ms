package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.UsuarioDto;
import com.sistema.sah.commons.entity.UsuarioEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

/**
 * Mapper para la conversión entre las entidades {@link UsuarioEntity} y los objetos DTO {@link UsuarioDto}.
 * <p>
 * Esta interfaz utiliza MapStruct para generar implementaciones automáticas que facilitan la conversión entre las entidades de la base de datos
 * y los objetos de transferencia de datos (DTO).
 * El propósito principal de este mapper es separar la capa de acceso a datos de la lógica de negocio al transformar los datos entre estas capas.
 * </p>
 */
@Mapper(componentModel = "spring")
public interface UsuarioMapper {

    /**
     * Convierte una entidad {@link UsuarioEntity} en un objeto DTO {@link UsuarioDto}.
     * <p>
     * Este método mapea los atributos de la entidad {@link UsuarioEntity} a un objeto DTO {@link UsuarioDto},
     * lo que permite que los datos sean manipulados en una capa más cercana a la lógica de negocio.
     * </p>
     *
     * @param entity la entidad {@link UsuarioEntity} que se va a convertir.
     * @return el objeto DTO {@link UsuarioDto} mapeado.
     */
    @Mappings({
            @Mapping(source = "tipoUsuarioEntityFk", target = "tipoUsuarioDtoFk")
    })
    UsuarioDto entityToDto(UsuarioEntity entity);

    /**
     * Convierte un objeto DTO {@link UsuarioDto} en una entidad {@link UsuarioEntity}.
     * <p>
     * Este método mapea los atributos del objeto DTO {@link UsuarioDto} a una entidad {@link UsuarioEntity},
     * lo que es útil para persistir los datos en la base de datos o enviarlos entre capas del sistema.
     * </p>
     *
     * @param dto el objeto DTO {@link UsuarioDto} que se va a convertir.
     * @return la entidad {@link UsuarioEntity} mapeada.
     */
    @Mappings({
            @Mapping(source = "tipoUsuarioDtoFk", target = "tipoUsuarioEntityFk")
    })
    UsuarioEntity dtoToEntity(UsuarioDto dto);

    /**
     * Convierte una lista de entidades {@link UsuarioEntity} en una lista de objetos DTO {@link UsuarioDto}.
     * <p>
     * Este método es útil cuando se necesita transformar colecciones de entidades en colecciones de DTOs,
     * por ejemplo, cuando se recuperan múltiples registros de la base de datos y se desean manipular como objetos DTO.
     * </p>
     *
     * @param entity la lista de entidades {@link UsuarioEntity} que se van a convertir.
     * @return la lista de objetos DTO {@link UsuarioDto}.
     */
    List<UsuarioDto> listEntityTolistDto(List<UsuarioEntity> entity);

    /**
     * Convierte una lista de objetos DTO {@link UsuarioDto} en una lista de entidades {@link UsuarioEntity}.
     * <p>
     * Este método es útil cuando se necesita convertir colecciones de DTOs en entidades para persistirlas en la base de datos.
     * </p>
     *
     * @param dto la lista de objetos DTO {@link UsuarioDto} que se van a convertir.
     * @return la lista de entidades {@link UsuarioEntity}.
     */
    List<UsuarioEntity> listDtoToListEntity(List<UsuarioDto> dto);
}
