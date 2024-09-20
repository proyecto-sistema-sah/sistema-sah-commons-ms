package com.sistema.sah.commons.entity.embeddedid;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import org.hibernate.Hibernate;

import java.util.Objects;

@Data
@Embeddable
public class ReservaCuartoIdEntity implements java.io.Serializable {
    private static final long serialVersionUID = 8541207239558880479L;
    @Column(name = "codigo_reserva_fk", nullable = false, length = 5)
    private String codigoReservaFk;

    @Column(name = "codigo_cuarto_fk", nullable = false, length = 5)
    private String codigoCuartoFk;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ReservaCuartoIdEntity entity = (ReservaCuartoIdEntity) o;
        return Objects.equals(this.codigoReservaFk, entity.codigoReservaFk) &&
                Objects.equals(this.codigoCuartoFk, entity.codigoCuartoFk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoReservaFk, codigoCuartoFk);
    }

}