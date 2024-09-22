package com.sistema.sah.commons.dto;

import com.sistema.sah.commons.helper.enums.EstadoFacturacionEnum;
import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FacturacionDto implements Serializable {
    private String codigoFacturacion;

    private LocalDateTime fechaCreacionFacturacion;

    private ReservaDto codigoReservaDtoFk;

    private UsuarioDto codigoUsuarioDtoFk;

    private EstadoFacturacionEnum estadoFacturacion;
}