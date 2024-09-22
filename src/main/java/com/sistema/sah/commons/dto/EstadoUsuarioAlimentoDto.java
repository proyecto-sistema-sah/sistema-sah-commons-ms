package com.sistema.sah.commons.dto;

import com.sistema.sah.commons.helper.enums.EstadoUsuarioAlimentoEnum;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EstadoUsuarioAlimentoDto implements Serializable {
    private Integer id;

    private EstadoUsuarioAlimentoEnum nombreEstadoUsuarioAlimento;

}