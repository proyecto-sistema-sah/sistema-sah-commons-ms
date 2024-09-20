package com.sistema.sah.commons.entity.embeddedid;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import org.hibernate.Hibernate;

import java.util.Objects;

@Data
@Embeddable
public class CuartoServicioIdEntity implements java.io.Serializable {
    private static final long serialVersionUID = -7108195826643245286L;
    @Column(name = "codigo_cuarto_fk", nullable = false, length = 5)
    private String codigoCuartoFk;

    @Column(name = "codigo_servicio_fk", nullable = false, length = 5)
    private String codigoServicioFk;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        CuartoServicioIdEntity entity = (CuartoServicioIdEntity) o;
        return Objects.equals(this.codigoServicioFk, entity.codigoServicioFk) &&
                Objects.equals(this.codigoCuartoFk, entity.codigoCuartoFk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoServicioFk, codigoCuartoFk);
    }

}