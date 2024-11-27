package com.sistema.sah.commons.entity;

import com.sistema.sah.commons.entity.embeddedid.CuartoServicioIdEntity;
import jakarta.persistence.*;
import lombok.Data;

/**
 * Entidad que representa la relación entre un cuarto y un servicio en el sistema.
 * <p>
 * Esta clase mapea la tabla `cuarto_servicio` en la base de datos, que establece una relación entre un cuarto y
 * los servicios que ofrece. Cada relación tiene un estado asociado, lo que permite gestionar los servicios disponibles
 * para cada cuarto.
 * </p>
 */
@Data
@Entity
@Table(name = "cuarto_servicio")
public class CuartoServicioEntity {

    /**
     * Identificador compuesto de la relación entre un cuarto y un servicio.
     * Este campo utiliza la clase {@link CuartoServicioIdEntity} como clave primaria compuesta, que representa la
     * combinación de los identificadores del cuarto y del servicio.
     */
    @EmbeddedId
    private CuartoServicioIdEntity id;

    /**
     * Cuarto asociado al servicio.
     * Este campo establece una relación de muchos a uno con la entidad {@link CuartoEntity}, que representa el cuarto
     * que está asociado a un servicio específico.
     */
    @MapsId("codigoCuartoFk")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "codigo_cuarto_fk", nullable = false)
    private CuartoEntity codigoCuartoEntityFk;

    /**
     * Servicio asociado al cuarto.
     * Este campo establece una relación de muchos a uno con la entidad {@link ServicioEntity}, que representa el
     * servicio que está asociado a un cuarto específico.
     */
    @MapsId("codigoServicioFk")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "codigo_servicio_fk", nullable = false)
    private ServicioEntity codigoServicioEntityFk;

    /**
     * Estado del servicio en el cuarto.
     * Este campo establece una relación de muchos a uno con la entidad {@link EstadoCuartoServicioEntity}, que define
     * el estado del servicio en el cuarto (por ejemplo, "Disponible", "Asignado", "No disponible").
     */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "estado_cuarto_servicio_fk", nullable = false)
    private EstadoCuartoServicioEntity estadoCuartoServicioEntityFk;

}
