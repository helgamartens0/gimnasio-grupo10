/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GimnasioGrupo10.ENTIDADES;


import java.time.LocalDate;

public class Asistencia {
    private int id_asistencia;
    private Socio socio;
    private Clase clase;
    private LocalDate fecha_asistencia;

    public Asistencia() {
    }

    public Asistencia(Socio socio, Clase clase, LocalDate fecha_asistencia) {
        this.socio = socio;
        this.clase = clase;
        this.fecha_asistencia = fecha_asistencia;
    }

    public Asistencia(int id_asistencia, Socio socio, Clase clase, LocalDate fecha_asistencia) {
        this.id_asistencia = id_asistencia;
        this.socio = socio;
        this.clase = clase;
        this.fecha_asistencia = fecha_asistencia;
    }

    public int getId_asistencia() {
        return id_asistencia;
    }

    public void setId_asistencia(int id_asistencia) {
        this.id_asistencia = id_asistencia;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public LocalDate getFecha_asistencia() {
        return fecha_asistencia;
    }

    public void setFecha_asistencia(LocalDate fecha_asistencia) {
        this.fecha_asistencia = fecha_asistencia;
    }
    
}
