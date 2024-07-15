
package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipoTarea", discriminatorType = DiscriminatorType.STRING)
public abstract class Tarea {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    protected Long idTarea;
    protected String tipoTarea;
    protected String descripcionTarea;
    protected Usuario prop;
    protected boolean estadoTarea;

    public Tarea() {
    }

    public Tarea(Long idTarea, String tipoTarea, String descripcionTarea, Usuario prop, boolean estadoTarea) {
        this.idTarea = idTarea;
        this.tipoTarea = tipoTarea;
        this.descripcionTarea = descripcionTarea;
        this.prop = prop;
        this.estadoTarea = estadoTarea;
    }
    
    public abstract void completarTarea();
    
    public abstract void setTipoTarea();
}
