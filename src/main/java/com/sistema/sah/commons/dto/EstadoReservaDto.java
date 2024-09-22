package com.sistema.sah.commons.dto;

import com.sistema.sah.commons.helper.enums.EstadoReservaEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EstadoReservaDto implements Serializable{
    private Integer id;

    private EstadoReservaEnum nombreEstadoReserva;
}