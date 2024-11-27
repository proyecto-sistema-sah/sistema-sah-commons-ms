package com.sistema.sah.commons.entity.embeddedid;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import org.hibernate.Hibernate;

import java.util.Objects;

/**
 * Clase que representa la clave primaria compuesta para la relación entre {@link com.sistema.sah.commons.entity.ReservaCuartoEntity} y {@link com.sistema.sah.commons.entity.CuartoEntity}.
 * <p>
 * Esta clase se utiliza como un identificador compuesto para la tabla {@code reserva_cuarto},
 * donde se relacionan los cuartos con las reservas, utilizando los campos {@code codigoReservaFk} y {@code codigoCuartoFk}.
 * </p>
 */
@Data
@Embeddable
public class ReservaCuartoIdEntity implements java.io.Serializable {

    /**
     * Serialización de la clase {@code ReservaCuartoIdEntity}.
     */
    private static final long serialVersionUID = 8541207239558880479L;

    /**
     * Código de la reserva asociada a un cuarto en la tabla {@code reserva_cuarto}.
     * <p>
     * Este campo representa la relación con la entidad {@link com.sistema.sah.commons.entity.ReservaEntity}, identificando la reserva específica
     * a la que se asigna el cuarto.
     * </p>
     */
    @Column(name = "codigo_reserva_fk", nullable = false, length = 7)
    private String codigoReservaFk;

    /**
     * Código del cuarto asociado a una reserva en la tabla {@code reserva_cuarto}.
     * <p>
     * Este campo representa la relación con la entidad {@link com.sistema.sah.commons.entity.CuartoEntity}, identificando el cuarto
     * que se asigna a la reserva.
     * </p>
     */
    @Column(name = "codigo_cuarto_fk", nullable = false, length = 7)
    private String codigoCuartoFk;

    /**
     * Compara esta instancia con otro objeto para determinar si son iguales.
     * <p>
     * La comparación se realiza basándose en los valores de los campos {@code codigoReservaFk} y {@code codigoCuartoFk}.
     * </p>
     *
     * @param o el objeto con el que se va a comparar.
     * @return {@code true} si los objetos son iguales, {@code false} si no lo son.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ReservaCuartoIdEntity entity = (ReservaCuartoIdEntity) o;
        return Objects.equals(this.codigoReservaFk, entity.codigoReservaFk) &&
                Objects.equals(this.codigoCuartoFk, entity.codigoCuartoFk);
    }

    /**
     * Genera un valor hash único para esta instancia.
     * <p>
     * El valor hash se calcula utilizando los campos {@code codigoReservaFk} y {@code codigoCuartoFk}.
     * </p>
     *
     * @return el valor hash generado.
     */
    @Override
    public int hashCode() {
        return Objects.hash(codigoReservaFk, codigoCuartoFk);
    }

}
