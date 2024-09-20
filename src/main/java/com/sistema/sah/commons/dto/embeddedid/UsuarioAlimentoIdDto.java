package com.sistema.sah.commons.dto.embeddedid;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;
import org.hibernate.Hibernate;

import java.util.Objects;

@Data
public class UsuarioAlimentoIdDto {
    private String codigoUsuarioFk;

    private String codigoAlimentoFk;

}