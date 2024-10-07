package com.sistema.sah.commons.dto;


import com.sistema.sah.commons.entity.UsuarioEntity;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BlackListTokenDto {

    private Integer id;

    private String token;

    private LocalDateTime fechaExpiracion;

    private UsuarioDto codigoUsuarioDtoFk;


}
