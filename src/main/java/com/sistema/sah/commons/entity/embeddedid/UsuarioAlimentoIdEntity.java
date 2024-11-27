package com.sistema.sah.commons.entity.embeddedid;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import org.hibernate.Hibernate;

import java.util.Objects;

@Data
@Embeddable
public class UsuarioAlimentoIdEntity implements java.io.Serializable {
    private static final long serialVersionUID = -5044658269293265562L;

    @Column(name = "codigo_usuario_fk", nullable = false, length = 7)
    private String codigoUsuarioFk;

    @Column(name = "codigo_alimento_fk", nullable = false, length = 7)
    private String codigoAlimentoFk;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UsuarioAlimentoIdEntity entity = (UsuarioAlimentoIdEntity) o;
        return Objects.equals(this.codigoAlimentoFk, entity.codigoAlimentoFk) &&
                Objects.equals(this.codigoUsuarioFk, entity.codigoUsuarioFk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoAlimentoFk, codigoUsuarioFk);
    }

}