package com.sistema.sah.commons.entity.embeddedid;

import com.sistema.sah.commons.entity.ServicioEntity;
import com.sistema.sah.commons.entity.UsuarioEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import org.hibernate.Hibernate;

import java.util.Objects;

/**
 * Clase que representa la clave primaria compuesta para la relación entre {@link UsuarioEntity} y {@link ServicioEntity}.
 * <p>
 * Esta clase se utiliza como un identificador compuesto para la tabla {@code usuario_servicio},
 * donde se relacionan los usuarios con los servicios, utilizando los campos {@code codigoUsuarioFk} y {@code codigoServicioFk}.
 * </p>
 */
@Data
@Embeddable
public class UsuarioServicioIdEntity implements java.io.Serializable {

    /**
     * Serialización de la clase {@code UsuarioServicioIdEntity}.
     */
    private static final long serialVersionUID = -2964579532263678203L;

    /**
     * Código del servicio asociado a un usuario en la tabla {@code usuario_servicio}.
     * <p>
     * Este campo representa la relación con la entidad {@link ServicioEntity}, identificando el servicio
     * asignado a un usuario específico.
     * </p>
     */
    @Column(name = "codigo_servicio_fk", nullable = false, length = 7)
    private String codigoServicioFk;

    /**
     * Código del usuario asociado a un servicio en la tabla {@code usuario_servicio}.
     * <p>
     * Este campo representa la relación con la entidad {@link UsuarioEntity}, identificando al usuario
     * asignado a un servicio específico.
     * </p>
     */
    @Column(name = "codigo_usuario_fk", nullable = false, length = 7)
    private String codigoUsuarioFk;

    /**
     * Compara esta instancia con otro objeto para determinar si son iguales.
     * <p>
     * La comparación se realiza basándose en los valores de los campos {@code codigoServicioFk} y {@code codigoUsuarioFk}.
     * </p>
     *
     * @param o el objeto con el que se va a comparar.
     * @return {@code true} si los objetos son iguales, {@code false} si no lo son.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UsuarioServicioIdEntity entity = (UsuarioServicioIdEntity) o;
        return Objects.equals(this.codigoServicioFk, entity.codigoServicioFk) &&
                Objects.equals(this.codigoUsuarioFk, entity.codigoUsuarioFk);
    }

    /**
     * Genera un valor hash único para esta instancia.
     * <p>
     * El valor hash se calcula utilizando los campos {@code codigoServicioFk} y {@code codigoUsuarioFk}.
     * </p>
     *
     * @return el valor hash generado.
     */
    @Override
    public int hashCode() {
        return Objects.hash(codigoServicioFk, codigoUsuarioFk);
    }
}
