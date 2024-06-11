/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GimnasioGrupo10.ENTIDADES;

public class Socio {
    private int id_socio;
    private int dni_socio;
    private String nombre_socio;
    private String apellido_socio;
    private int edad_socio;
    private String correo_socio;
    private String telefono_socio;
    private boolean estado_socio;

    public Socio() {
    }

    public Socio(int dni_socio, String nombre_socio, String apellido_socio, int edad_socio, String correo_socio, String telefono_socio, boolean estado_socio) {
        this.dni_socio = dni_socio;
        this.nombre_socio = nombre_socio;
        this.apellido_socio = apellido_socio;
        this.edad_socio = edad_socio;
        this.correo_socio = correo_socio;
        this.telefono_socio = telefono_socio;
        this.estado_socio = estado_socio;
    }

    public Socio(int id_socio, int dni_socio, String nombre_socio, String apellido_socio, int edad_socio, String correo_socio, String telefono_socio, boolean estado_socio) {
        this.id_socio = id_socio;
        this.dni_socio = dni_socio;
        this.nombre_socio = nombre_socio;
        this.apellido_socio = apellido_socio;
        this.edad_socio = edad_socio;
        this.correo_socio = correo_socio;
        this.telefono_socio = telefono_socio;
        this.estado_socio = estado_socio;
    }

    public int getId_socio() {
        return id_socio;
    }

    public void setId_socio(int id_socio) {
        this.id_socio = id_socio;
    }

    public int getDni_socio() {
        return dni_socio;
    }

    public void setDni_socio(int dni_socio) {
        this.dni_socio = dni_socio;
    }

    public String getNombre_socio() {
        return nombre_socio;
    }

    public void setNombre_socio(String nombre_socio) {
        this.nombre_socio = nombre_socio;
    }

    public String getApellido_socio() {
        return apellido_socio;
    }

    public void setApellido_socio(String apellido_socio) {
        this.apellido_socio = apellido_socio;
    }

    public int getEdad_socio() {
        return edad_socio;
    }

    public void setEdad_socio(int edad_socio) {
        this.edad_socio = edad_socio;
    }

    public String getCorreo_socio() {
        return correo_socio;
    }

    public void setCorreo_socio(String correo_socio) {
        this.correo_socio = correo_socio;
    }

    public String getTelefono_socio() {
        return telefono_socio;
    }

    public void setTelefono_socio(String telefono_socio) {
        this.telefono_socio = telefono_socio;
    }

    public boolean isEstado_socio() {
        return estado_socio;
    }

    public void setEstado_socio(boolean estado_socio) {
        this.estado_socio = estado_socio;
    }

    @Override
    public String toString() {
        return "DATOS - SOCIO:" + "\ndni_socio=" + getDni_socio() + "\nnombre_socio=" + getNombre_socio() + "\napellido_socio=" + getApellido_socio() + "\nedad_socio=" + getEdad_socio() + "\ncorreo_socio=" + getCorreo_socio() + "\ntelefono_socio=" + getTelefono_socio() + "\nestado_socio=" + isEstado_socio();
    }
    
    
}
