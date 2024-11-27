package com.sistema.sah.commons.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * Entidad que representa un token en la lista negra del sistema.
 * <p>
 * Esta clase mapea la tabla `black_list_token` en la base de datos y contiene información sobre los tokens que han sido
 * agregados a la lista negra. Los tokens en la lista negra son aquellos que se consideran inválidos o que han sido
 * comprometidos, y no deben ser aceptados para futuras autenticaciones.
 * </p>
 */
@Data
@Entity
@Table(name = "black_list_token")
public class BlackListTokenEntity {

    /**
     * Identificador único del registro de token en la lista negra.
     * Este campo representa el identificador único del token en la tabla `black_list_token`.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "black_list_token_id_gen")
    @SequenceGenerator(name = "black_list_token_id_gen", sequenceName = "black_list_token_id_seq", allocationSize = 1)
    @Column(name = "id", nullable = false)
    private Integer id;

    /**
     * Token que ha sido agregado a la lista negra.
     * Este campo contiene el token JWT que ha sido invalidado y se encuentra en la lista negra.
     */
    @Column(name = "token", nullable = false, length = 512)
    private String token;

    /**
     * Fecha de expiración del token en la lista negra.
     * Este campo representa la fecha y hora en que el token expiró, y por lo tanto se considera inválido.
     */
    @Column(name = "fecha_expiracion", nullable = false)
    private LocalDateTime fechaExpiracion;

    /**
     * Usuario al que pertenece el token.
     * Este campo establece una relación de muchos a uno con la entidad {@link UsuarioEntity}, que representa el
     * usuario que originalmente posee el token. Esta relación indica que un usuario puede tener múltiples tokens
     * en la lista negra.
     */
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "codigo_usuario_fk", nullable = false)
    private UsuarioEntity codigoUsuarioEntityFk;

}
