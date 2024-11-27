package com.sistema.sah.commons.dto.embeddedid;

import com.sistema.sah.commons.entity.CuartoServicioEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

/**
 * Representa la clave primaria compuesta para la entidad {@link CuartoServicioEntity}.
 * <p>
 * Esta clase encapsula los identificadores de un cuarto y un servicio relacionados.
 * Es utilizada como parte de la clave primaria en la entidad {@link CuartoServicioEntity},
 * permitiendo la relación entre un cuarto y los servicios asociados a él.
 * </p>
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CuartoServicioIdDto implements Serializable {
    /**
     * Código del cuarto asociado en la relación.
     * Este campo representa el identificador del cuarto en la relación.
     */
    private String codigoCuartoFk;

    /**
     * Código del servicio asociado en la relación.
     * Este campo representa el identificador del servicio en la relación.
     */
    private String codigoServicioFk;

    /**
     * Compara este objeto con otro para verificar si son iguales.
     * <p>
     * La igualdad se determina si ambos objetos tienen el mismo {@link #codigoCuartoFk} y {@link #codigoServicioFk}.
     * </p>
     *
     * @param o el objeto a comparar con este.
     * @return {@code true} si los objetos son iguales, {@code false} en caso contrario.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CuartoServicioIdDto that = (CuartoServicioIdDto) o;
        return Objects.equals(codigoCuartoFk, that.codigoCuartoFk) &&
                Objects.equals(codigoServicioFk, that.codigoServicioFk);
    }

    /**
     * Devuelve un código hash para este objeto.
     * <p>
     * El código hash se calcula utilizando los campos {@link #codigoCuartoFk} y {@link #codigoServicioFk}.
     * </p>
     *
     * @return el código hash calculado para este objeto.
     */
    @Override
    public int hashCode() {
        return Objects.hash(codigoCuartoFk, codigoServicioFk);
    }
}
