
package com.example.demo.service;

import com.example.demo.entity.Tarea;
import java.time.LocalDate;

public interface ITareaService {
    
    public void crearTarea();
    
    public void traerTareas();
    
    public void editarTarea(Tarea tarea);//No va a recibir un objeto entero, mejor
    //voy a hacer un método de edición para cada tipo de tarea así puede recibir distintos
    //parámetros
    
    public void filtroPorDia(LocalDate desde, LocalDate hasta);
    
    public void setTipoTarea(Long idTarea);
    
    public void eliminarTarea(Long idTarea);
    
}
