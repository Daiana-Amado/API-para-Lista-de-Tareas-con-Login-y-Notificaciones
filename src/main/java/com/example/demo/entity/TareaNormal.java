
package com.example.demo.entity;

import jakarta.persistence.Entity;
import java.time.LocalDate;
import java.time.LocalTime;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class TareaNormal extends Tarea{
    private LocalDate diaPreferible;
    private LocalTime franjaHoraria;

    public TareaNormal() {
    }

    public TareaNormal(LocalDate diaPreferible, LocalTime franjaHoraria, Long idTarea, String tipoTarea, String descripcionTarea, Usuario prop, boolean estadoTarea) {
        super(idTarea, tipoTarea, descripcionTarea, prop, estadoTarea);
        this.diaPreferible = diaPreferible;
        this.franjaHoraria = franjaHoraria;
    }
    
    @Override
    public void completarTarea() {
        this.estadoTarea = true;
    }

    @Override
    public void setTipoTarea() {
        this.tipoTarea = "Tarea Normal";
    } 
    
}
