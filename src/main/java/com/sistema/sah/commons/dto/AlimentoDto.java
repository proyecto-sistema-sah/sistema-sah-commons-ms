package com.sistema.sah.commons.dto;

import lombok.Data;

import java.time.LocalTime;

@Data
public class AlimentoDto {
    private String codigoAlimento;

    private LocalTime tiempoPreparacionAlimento;

    private String nombreAlimento;

    private String detalleAlimento;

    private TipoAlimentoDto tipoAlimentoDtoFk;

}