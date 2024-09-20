package com.sistema.sah.commons.dto;

import lombok.Data;
import org.springframework.http.HttpStatus;

@Data
public class RespuestaGeneralDto {

    private HttpStatus status;

    private Object data;

    private String message;

}
