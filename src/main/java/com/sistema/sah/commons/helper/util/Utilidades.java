package com.sistema.sah.commons.helper.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sistema.sah.commons.helper.enums.TipoUsuarioEnum;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;

/**
 * Clase utilitaria que contiene métodos estáticos para operaciones comunes de conversión de tipos de datos,
 * generación de códigos, conversiones de fechas y manejo de JSON.
 *
 * Estos métodos proporcionan funcionalidad para la conversión de objetos entre diferentes tipos,
 * la creación de códigos con base en el tipo de usuario, la conversión de fechas, y la lectura de datos
 * en formato JSON.
 */
public class Utilidades {

    /**
     * Convierte un objeto a un tipo específico proporcionado.
     * <p>
     * Este método permite verificar si un objeto se puede convertir al tipo especificado,
     * y devuelve un {@link Optional} que contiene el valor convertido si es posible,
     * o un {@link Optional#empty()} si la conversión falla.
     * </p>
     *
     * @param obj el objeto que se va a convertir.
     * @param clazz la clase que representa el tipo al que se desea convertir el objeto.
     * @param <T> el tipo de retorno.
     * @return un {@link Optional} que contiene el valor convertido o está vacío si la conversión falla.
     * @throws IllegalArgumentException si ocurre un error durante la conversión.
     */
    public static <T> Optional<T> checkType(Object obj, Class<T> clazz) {
        if (Objects.isNull(obj)) {
            return Optional.empty();
        }

        try {
            return switch (clazz.getSimpleName()) {
                case "Long" -> Optional.of(clazz.cast(Long.valueOf(obj.toString())));
                case "String" -> Optional.of(clazz.cast(String.valueOf(obj)));
                case "Integer" -> Optional.of(clazz.cast(Integer.valueOf(obj.toString())));
                case "Double" -> Optional.of(clazz.cast(Double.valueOf(obj.toString())));
                case "BigDecimal" -> Optional.of(clazz.cast(BigDecimal.valueOf(Double.parseDouble(obj.toString()))));
                default -> Optional.empty();
            };
        } catch (Exception e) {
            throw new IllegalArgumentException("Error de conversión de tipos: " + e.getMessage(), e);
        }
    }

    /**
     * Genera un código único basado en el tipo de usuario.
     * <p>
     * Este método genera un código alfanumérico concatenando la inicial del tipo de usuario con un número aleatorio
     * entre 1000 y 9999.
     * </p>
     *
     * @param inicial el tipo de usuario que determina la inicial del código.
     * @return un código generado como una cadena alfanumérica.
     */
    public static String generarCodigo(TipoUsuarioEnum inicial) {
        return new StringBuilder().append(inicial.getInicial()).append(1000 + new Random().nextInt(9000)).toString();
    }

    /**
     * Convierte un objeto {@link Date} a un {@link LocalDateTime}.
     * <p>
     * Este método convierte una instancia de {@link Date} a un objeto {@link LocalDateTime} utilizando
     * el huso horario del sistema.
     * </p>
     *
     * @param date el objeto {@link Date} que se va a convertir.
     * @return el objeto {@link LocalDateTime} resultante.
     */
    public static LocalDateTime convertToLocalDateTime(Date date) {
        return LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
    }

    /**
     * Convierte un archivo JSON a un objeto DTO.
     * <p>
     * Este método lee el contenido de un archivo JSON y lo convierte en un objeto del tipo especificado utilizando
     * la librería {@link ObjectMapper}.
     * </p>
     *
     * @param jsonFile el archivo JSON que contiene los datos.
     * @param dtoClass la clase del DTO al que se convertirá el contenido del archivo JSON.
     * @param <T> el tipo del DTO que se retornará.
     * @return el objeto DTO convertido a partir del archivo JSON.
     * @throws IOException si ocurre un error al leer el archivo JSON.
     */
    public static <T> T convertJsonToDto(File jsonFile, Class<T> dtoClass) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return objectMapper.readValue(jsonFile, dtoClass);
    }

}
