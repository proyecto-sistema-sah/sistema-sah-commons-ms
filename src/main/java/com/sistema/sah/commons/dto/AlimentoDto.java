package com.sistema.sah.commons.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalTime;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlimentoDto implements Serializable {
    private String codigoAlimento;

    private LocalTime tiempoPreparacionAlimento;

    private String nombreAlimento;

    private String detalleAlimento;

    private TipoAlimentoDto tipoAlimentoDtoFk;

}