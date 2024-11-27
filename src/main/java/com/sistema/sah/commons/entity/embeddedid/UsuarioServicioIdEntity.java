package com.sistema.sah.commons.entity.embeddedid;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import org.hibernate.Hibernate;

import java.util.Objects;

@Data
@Embeddable
public class UsuarioServicioIdEntity implements java.io.Serializable {
    private static final long serialVersionUID = -2964579532263678203L;
    @Column(name = "codigo_servicio_fk", nullable = false, length = 7)
    private String codigoServicioFk;

    @Column(name = "codigo_usuario_fk", nullable = false, length = 7)
    private String codigoUsuarioFk;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UsuarioServicioIdEntity entity = (UsuarioServicioIdEntity) o;
        return Objects.equals(this.codigoServicioFk, entity.codigoServicioFk) &&
                Objects.equals(this.codigoUsuarioFk, entity.codigoUsuarioFk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoServicioFk, codigoUsuarioFk);
    }

}