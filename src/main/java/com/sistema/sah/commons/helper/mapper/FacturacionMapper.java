package com.sistema.sah.commons.helper.mapper;

import com.sistema.sah.commons.dto.EstadoUsuarioServicioDto;
import com.sistema.sah.commons.dto.FacturacionDto;
import com.sistema.sah.commons.entity.EstadoUsuarioServicioEntity;
import com.sistema.sah.commons.entity.FacturacionEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

/**
 * Mapper para la conversión entre las entidades {@link FacturacionEntity} y los objetos DTO {@link FacturacionDto}.
 * <p>
 * Esta interfaz utiliza MapStruct para generar implementaciones automáticas que facilitan la conversión entre las entidades de la base de datos y los objetos de transferencia de datos (DTO).
 * El propósito principal de este mapper es separar la capa de acceso a datos de la lógica de negocio al transformar los datos entre estas capas.
 * </p>
 */
@Mapper(componentModel = "spring")
public interface FacturacionMapper {

    /**
     * Convierte una entidad {@link FacturacionEntity} en un objeto DTO {@link FacturacionDto}.
     * <p>
     * Este método mapea los atributos de la entidad {@link FacturacionEntity} a un objeto DTO {@link FacturacionDto},
     * lo que permite que los datos sean manipulados en una capa más cercana a la lógica de negocio.
     * </p>
     *
     * @param entity la entidad {@link FacturacionEntity} que se va a convertir.
     * @return el objeto DTO {@link FacturacionDto} mapeado.
     */
    @Mappings({
            @Mapping(source = "codigoReservaEntityFk", target = "codigoReservaDtoFk"),
            @Mapping(source = "codigoUsuarioEntityFk", target = "codigoUsuarioDtoFk")
    })
    FacturacionDto entityToDto(FacturacionEntity entity);

    /**
     * Convierte un objeto DTO {@link FacturacionDto} en una entidad {@link FacturacionEntity}.
     * <p>
     * Este método mapea los atributos del objeto DTO {@link FacturacionDto} a una entidad {@link FacturacionEntity},
     * lo que es útil para persistir los datos en la base de datos o enviarlos entre capas del sistema.
     * </p>
     *
     * @param dto el objeto DTO {@link FacturacionDto} que se va a convertir.
     * @return la entidad {@link FacturacionEntity} mapeada.
     */
    @Mappings({
            @Mapping(source = "codigoReservaDtoFk", target = "codigoReservaEntityFk"),
            @Mapping(source = "codigoUsuarioDtoFk", target = "codigoUsuarioEntityFk")
    })
    FacturacionEntity dtoToEntity(FacturacionDto dto);

    /**
     * Convierte una lista de entidades {@link FacturacionEntity} en una lista de objetos DTO {@link FacturacionDto}.
     * <p>
     * Este método es útil cuando se necesita transformar colecciones de entidades en colecciones de DTOs,
     * por ejemplo, cuando se recuperan múltiples registros de la base de datos y se desean manipular como objetos DTO.
     * </p>
     *
     * @param entity la lista de entidades {@link FacturacionEntity} que se van a convertir.
     * @return la lista de objetos DTO {@link FacturacionDto}.
     */
    List<FacturacionDto> listEntityTolistDto(List<FacturacionEntity> entity);

    /**
     * Convierte una lista de objetos DTO {@link FacturacionDto} en una lista de entidades {@link FacturacionEntity}.
     * <p>
     * Este método es útil cuando se necesita convertir colecciones de DTOs en entidades para persistirlas en la base de datos.
     * </p>
     *
     * @param dto la lista de objetos DTO {@link FacturacionDto} que se van a convertir.
     * @return la lista de entidades {@link FacturacionEntity}.
     */
    List<FacturacionEntity> listDtoToListEntity(List<FacturacionDto> dto);
}
