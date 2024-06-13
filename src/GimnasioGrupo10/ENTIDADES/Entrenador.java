/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GimnasioGrupo10.ENTIDADES;

public class Entrenador {

    private int id_entrenador;
    private int dni_entrenador;
    private String nombre_entrenador;
    private String apellido_entrenador;
    private String especialidad_entrenador;
    private boolean estado_entrenador;

    public Entrenador() {
    }

    public Entrenador(int id_entrenador, int dni_entrenador, String nombre_entrenador, String apellido_entrenador, String especialidad_entrenador, boolean estado_entrenador) {
        this.id_entrenador = id_entrenador;
        this.dni_entrenador = dni_entrenador;
        this.nombre_entrenador = nombre_entrenador;
        this.apellido_entrenador = apellido_entrenador;
        this.especialidad_entrenador = especialidad_entrenador;
        this.estado_entrenador = estado_entrenador;
    }

    public Entrenador(int dni_entrenador, String nombre_entrenador, String apellido_entrenador, String especialidad_entrenador, boolean estado_entrenador) {
        this.dni_entrenador = dni_entrenador;
        this.nombre_entrenador = nombre_entrenador;
        this.apellido_entrenador = apellido_entrenador;
        this.especialidad_entrenador = especialidad_entrenador;
        this.estado_entrenador = estado_entrenador;
    }

    public int getId_entrenador() {
        return id_entrenador;
    }

    public void setId_entrenador(int id_entrenador) {
        this.id_entrenador = id_entrenador;
    }

    public int getDni_entrenador() {
        return dni_entrenador;
    }

    public void setDni_entrenador(int dni_entrenador) {
        this.dni_entrenador = dni_entrenador;
    }

    public String getNombre_entrenador() {
        return nombre_entrenador;
    }

    public void setNombre_entrenador(String nombre_entrenador) {
        this.nombre_entrenador = nombre_entrenador;
    }

    public String getApellido_entrenador() {
        return apellido_entrenador;
    }

    public void setApellido_entrenador(String apellido_entrenador) {
        this.apellido_entrenador = apellido_entrenador;
    }

    public String getEspecialidad_entrenador() {
        return especialidad_entrenador;
    }

    public void setEspecialidad_entrenador(String especialidad_entrenador) {
        this.especialidad_entrenador = especialidad_entrenador;
    }

    public boolean isEstado_entrenador() {
        return estado_entrenador;
    }

    public void setEstado_entrenador(boolean estado_entrenador) {
        this.estado_entrenador = estado_entrenador;
    }

    @Override
    public String toString() {
        return id_entrenador + " - " + nombre_entrenador + " " + apellido_entrenador;
    }
}
