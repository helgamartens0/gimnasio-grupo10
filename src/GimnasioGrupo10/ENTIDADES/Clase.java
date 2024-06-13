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
    private Entrenador entrenador;
    private LocalTime hora_clase;
    private int capacidad_clase;
    private boolean estado_clase;

    public Clase() {
    }

    public Clase(int id_clase, String nombre_clase, Entrenador entrenador, LocalTime hora_clase, int capacidad_clase, boolean estado_clase) {
        this.id_clase = id_clase;
        this.nombre_clase = nombre_clase;
        this.entrenador = entrenador;
        this.hora_clase = hora_clase;
        this.capacidad_clase = capacidad_clase;
        this.estado_clase = estado_clase;
    }

    public Clase(String nombre_clase, Entrenador entrenador, LocalTime hora_clase, int capacidad_clase, boolean estado_clase) {
        this.nombre_clase = nombre_clase;
        this.entrenador= entrenador;
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

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
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
    
    @Override
    public String toString() {
        return "Clase{" + "id_clase=" + getId_clase() + ", nombre_clase=" + nombre_clase + ", entrenador=" + entrenador.getId_entrenador() + ", hora_clase=" + hora_clase + ", capacidad_clase=" + capacidad_clase + ", estado_clase=" + estado_clase + '}';
    }
    
    public String toString2(){
        return nombre_clase + " con " + entrenador.getNombre_entrenador()+ " ";
    }
    
}