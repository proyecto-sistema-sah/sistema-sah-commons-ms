package com.sistema.sah.commons.dto;

import com.sistema.sah.commons.helper.enums.EstadoFacturacionEnum;
import jakarta.persistence.Column;
import lombok.Data;
import org.hibernate.annotations.ColumnDefault;

import java.time.LocalDateTime;

@Data
public class FacturacionDto {
    private String codigoFacturacion;

    private LocalDateTime fechaCreacionFacturacion;

    private ReservaDto codigoReservaDtoFk;

    private UsuarioDto codigoUsuarioDtoFk;

    private EstadoFacturacionEnum estadoFacturacion;
}