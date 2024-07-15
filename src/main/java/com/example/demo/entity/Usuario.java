
package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long idUsuario;
    private String nombreUsuario;
    private String constraseniaUsuario;
    @OneToMany
    private List<Tarea> listaTareas;

    public Usuario() {
    }

    public Usuario(Long idUsuario, String nombreUsuario, String constraseniaUsuario, List<Tarea> listaTareas) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.constraseniaUsuario = constraseniaUsuario;
        this.listaTareas = listaTareas;
    }
       
}
