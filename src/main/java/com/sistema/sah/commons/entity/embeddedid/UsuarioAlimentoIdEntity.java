package com.sistema.sah.commons.entity.embeddedid;

import com.sistema.sah.commons.entity.AlimentoEntity;
import com.sistema.sah.commons.entity.UsuarioEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import org.hibernate.Hibernate;

import java.util.Objects;

/**
 * Clase que representa la clave primaria compuesta para la relación entre {@link UsuarioEntity} y {@link AlimentoEntity}.
 * <p>
 * Esta clase se utiliza como un identificador compuesto para la tabla {@code usuario_alimento},
 * donde se relacionan los usuarios con los alimentos, utilizando los campos {@code codigoUsuarioFk} y {@code codigoAlimentoFk}.
 * </p>
 */
@Data
@Embeddable
public class UsuarioAlimentoIdEntity implements java.io.Serializable {

    /**
     * Serialización de la clase {@code UsuarioAlimentoIdEntity}.
     */
    private static final long serialVersionUID = -5044658269293265562L;

    /**
     * Código del usuario asociado a un alimento en la tabla {@code usuario_alimento}.
     * <p>
     * Este campo representa la relación con la entidad {@link UsuarioEntity}, identificando al usuario
     * que ha sido asignado a un alimento específico.
     * </p>
     */
    @Column(name = "codigo_usuario_fk", nullable = false, length = 7)
    private String codigoUsuarioFk;

    /**
     * Código del alimento asociado a un usuario en la tabla {@code usuario_alimento}.
     * <p>
     * Este campo representa la relación con la entidad {@link AlimentoEntity}, identificando el alimento
     * asignado a un usuario.
     * </p>
     */
    @Column(name = "codigo_alimento_fk", nullable = false, length = 7)
    private String codigoAlimentoFk;

    /**
     * Compara esta instancia con otro objeto para determinar si son iguales.
     * <p>
     * La comparación se realiza basándose en los valores de los campos {@code codigoUsuarioFk} y {@code codigoAlimentoFk}.
     * </p>
     *
     * @param o el objeto con el que se va a comparar.
     * @return {@code true} si los objetos son iguales, {@code false} si no lo son.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UsuarioAlimentoIdEntity entity = (UsuarioAlimentoIdEntity) o;
        return Objects.equals(this.codigoAlimentoFk, entity.codigoAlimentoFk) &&
                Objects.equals(this.codigoUsuarioFk, entity.codigoUsuarioFk);
    }

    /**
     * Genera un valor hash único para esta instancia.
     * <p>
     * El valor hash se calcula utilizando los campos {@code codigoUsuarioFk} y {@code codigoAlimentoFk}.
     * </p>
     *
     * @return el valor hash generado.
     */
    @Override
    public int hashCode() {
        return Objects.hash(codigoAlimentoFk, codigoUsuarioFk);
    }

}
