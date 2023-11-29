package com.Tienda.domain;

import java.io.Serializable;
import jakarta.persistence.*;
import java.util.List;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data //Para la creacion automatica de los sets y gets de los atributos
@Entity //esta clase se va a manejar como entidad
@Table(name = "usuario")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //ES EL ID y es auto incrmental
    @Column(name = "id_usuario") //cuando se le cambia el nombre al atributo
    private Long idUsuario;

    @NotEmpty
    private String username;

    @NotEmpty
    private String password;

    @NotEmpty
    private String nombre;

    @NotEmpty
    private String apellidos;

    private String correo;
    private String telefono;
    private String rutaImagen;
    private boolean activo;

    @OneToMany
    @JoinColumn(name = "id_usuario")
    private List<Rol> roles;

}
