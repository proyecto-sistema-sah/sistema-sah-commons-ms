package com.sistema.sah.commons.entity.embeddedid;

import com.sistema.sah.commons.entity.CuartoEntity;
import com.sistema.sah.commons.entity.ServicioEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import org.hibernate.Hibernate;

import java.util.Objects;

/**
 * Clase que representa la clave primaria compuesta para la relación entre {@link CuartoEntity} y {@link ServicioEntity}.
 * <p>
 * Esta clase se utiliza como un identificador compuesto para la tabla {@code cuarto_servicio},
 * donde se relacionan los servicios con los cuartos, utilizando los campos {@code codigoCuartoFk} y {@code codigoServicioFk}.
 * </p>
 */
@Data
@Embeddable
public class CuartoServicioIdEntity implements java.io.Serializable {

    /**
     * Serialización de la clase {@code CuartoServicioIdEntity}.
     */
    private static final long serialVersionUID = -7108195826643245286L;

    /**
     * Código del cuarto asociado a un servicio en la tabla {@code cuarto_servicio}.
     * <p>
     * Este campo representa la relación con la entidad {@link CuartoEntity}, identificando el cuarto específico
     * al que se le asigna el servicio.
     * </p>
     */
    @Column(name = "codigo_cuarto_fk", nullable = false, length = 7)
    private String codigoCuartoFk;

    /**
     * Código del servicio asociado a un cuarto en la tabla {@code cuarto_servicio}.
     * <p>
     * Este campo representa la relación con la entidad {@link ServicioEntity}, identificando el servicio
     * que se asigna al cuarto.
     * </p>
     */
    @Column(name = "codigo_servicio_fk", nullable = false, length = 7)
    private String codigoServicioFk;

    /**
     * Compara esta instancia con otro objeto para determinar si son iguales.
     * <p>
     * La comparación se realiza basándose en los valores de los campos {@code codigoCuartoFk} y {@code codigoServicioFk}.
     * </p>
     *
     * @param o el objeto con el que se va a comparar.
     * @return {@code true} si los objetos son iguales, {@code false} si no lo son.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CuartoServicioIdEntity entity = (CuartoServicioIdEntity) o;
        return Objects.equals(this.codigoServicioFk, entity.codigoServicioFk) &&
                Objects.equals(this.codigoCuartoFk, entity.codigoCuartoFk);
    }

    /**
     * Genera un valor hash único para esta instancia.
     * <p>
     * El valor hash se calcula utilizando los campos {@code codigoCuartoFk} y {@code codigoServicioFk}.
     * </p>
     *
     * @return el valor hash generado.
     */
    @Override
    public int hashCode() {
        return Objects.hash(codigoServicioFk, codigoCuartoFk);
    }

}
