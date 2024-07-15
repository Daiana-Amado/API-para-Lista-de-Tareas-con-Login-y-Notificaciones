
package com.example.demo.entity;

import jakarta.persistence.Entity;
import java.time.LocalDate;
import java.time.LocalTime;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class TareaPrioritaria extends Tarea{
    private LocalDate diaARealizar;
    private LocalTime horarioARealizar;
    private String razonDePrioridad;
    private boolean procrastinacion;

    public TareaPrioritaria() {
    }

    public TareaPrioritaria(LocalDate diaARealizar, LocalTime horarioARealizar, String razonDePrioridad, boolean procrastinacion) {
        this.diaARealizar = diaARealizar;
        this.horarioARealizar = horarioARealizar;
        this.razonDePrioridad = razonDePrioridad;
        this.procrastinacion = procrastinacion;
    }

    @Override
    public void completarTarea() {
        if (this.horarioARealizar.isAfter(horarioARealizar)) {
            this.estadoTarea = true;
            this.procrastinacion = true;
        } else {
            this.estadoTarea = true;
        }
    }

    @Override
    public void setTipoTarea() {
        this.tipoTarea = "Tarea Prioritaria";
    }
}
