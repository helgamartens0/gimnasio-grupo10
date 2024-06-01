/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GimnasioGrupo10.ENTIDADES;

import java.time.LocalTime;

public class Clase {
    private int id_clase;
    private String nombre_clase;
    private int id_entrenador;
    private LocalTime hora_clase;
    private int capacidad_clase;
    private boolean estado_clase;

    public Clase() {
    }

    public Clase(int id_clase, String nombre_clase, int id_entrenador, LocalTime hora_clase, int capacidad_clase, boolean estado_clase) {
        this.id_clase = id_clase;
        this.nombre_clase = nombre_clase;
        this.id_entrenador = id_entrenador;
        this.hora_clase = hora_clase;
        this.capacidad_clase = capacidad_clase;
        this.estado_clase = estado_clase;
    }

    public Clase(String nombre_clase, int id_entrenador, LocalTime hora_clase, int capacidad_clase, boolean estado_clase) {
        this.nombre_clase = nombre_clase;
        this.id_entrenador = id_entrenador;
        this.hora_clase = hora_clase;
        this.capacidad_clase = capacidad_clase;
        this.estado_clase = estado_clase;
    }

    public int getId_clase() {
        return id_clase;
    }

    public void setId_clase(int id_clase) {
        this.id_clase = id_clase;
    }

    public String getNombre_clase() {
        return nombre_clase;
    }

    public void setNombre_clase(String nombre_clase) {
        this.nombre_clase = nombre_clase;
    }

    public int getId_entrenador() {
        return id_entrenador;
    }

    public void setId_entrenador(int id_entrenador) {
        this.id_entrenador = id_entrenador;
    }

    public LocalTime getHora_clase() {
        return hora_clase;
    }

    public void setHora_clase(LocalTime hora_clase) {
        this.hora_clase = hora_clase;
    }

    public int getCapacidad_clase() {
        return capacidad_clase;
    }

    public void setCapacidad_clase(int capacidad_clase) {
        this.capacidad_clase = capacidad_clase;
    }

    public boolean isEstado_clase() {
        return estado_clase;
    }

    public void setEstado_clase(boolean estado_clase) {
        this.estado_clase = estado_clase;
    }
    
    
    
    
}
