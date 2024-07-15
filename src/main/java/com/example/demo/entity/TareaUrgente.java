/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.entity;

import jakarta.persistence.Entity;
import java.time.LocalDate;
import java.time.LocalTime;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class TareaUrgente extends Tarea{
    private LocalDate diaARealizar;
    private LocalTime horarioARealizar;
    private String razonDeUrgencia;
    private boolean procrastinacion;
    private String incentivo;

    public TareaUrgente() {
    }

    public TareaUrgente(LocalDate diaARealizar, LocalTime horarioARealizar, String razonDeUrgencia, boolean procrastinacion, String incentivo, Long idTarea, String tipoTarea, String descripcionTarea, Usuario prop, boolean estadoTarea) {
        super(idTarea, tipoTarea, descripcionTarea, prop, estadoTarea);
        this.diaARealizar = diaARealizar;
        this.horarioARealizar = horarioARealizar;
        this.razonDeUrgencia = razonDeUrgencia;
        this.procrastinacion = procrastinacion;
        this.incentivo = incentivo;
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
        this.tipoTarea = "Tarea Urgente";
    }
    
}
