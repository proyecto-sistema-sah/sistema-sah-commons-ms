package com.sistema.sah.commons.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class UsuarioEntity {
    @Id
    @SequenceGenerator(name = "usuario_id_gen", sequenceName = "tipo_usuario_id_tipo_usuario_seq", allocationSize = 1)
    @Column(name = "codigo_usuario", nullable = false, length = 5)
    private String codigoUsuario;

    @Column(name = "nombres_usuario", nullable = false, length = 80)
    private String nombresUsuario;

    @Column(name = "apellidos_usuario", nullable = false, length = 80)
    private String apellidosUsuario;

    @Column(name = "correo_usuario", nullable = false, length = 50)
    private String correoUsuario;

    @Column(name = "codigo_imagen_usuario", length = Integer.MAX_VALUE)
    private String codigoImagenUsuario;

    @Column(name = "contrasena", nullable = false, length = 30)
    private String contrasena;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "tipo_usuario_fk", nullable = false)
    private TipoUsuarioEntity tipoUsuarioEntityFk;

}