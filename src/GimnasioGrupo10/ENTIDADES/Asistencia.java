/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GimnasioGrupo10.ENTIDADES;


import java.time.LocalDate;

public class Asistencia {
    private int id_asistencia;
    private int id_socio;
    private int id_clase;
    private LocalDate fecha_asistencia;

    public Asistencia() {
    }

    public Asistencia(int id_socio, int id_clase, LocalDate fecha_asistencia) {
        this.id_socio = id_socio;
        this.id_clase = id_clase;
        this.fecha_asistencia = fecha_asistencia;
    }

    public Asistencia(int id_asistencia, int id_socio, int id_clase, LocalDate fecha_asistencia) {
        this.id_asistencia = id_asistencia;
        this.id_socio = id_socio;
        this.id_clase = id_clase;
        this.fecha_asistencia = fecha_asistencia;
    }

    public int getId_asistencia() {
        return id_asistencia;
    }

    public void setId_asistencia(int id_asistencia) {
        this.id_asistencia = id_asistencia;
    }

    public int getId_socio() {
        return id_socio;
    }

    public void setId_socio(int id_socio) {
        this.id_socio = id_socio;
    }

    public int getId_clase() {
        return id_clase;
    }

    public void setId_clase(int id_clase) {
        this.id_clase = id_clase;
    }

    public LocalDate getFecha_asistencia() {
        return fecha_asistencia;
    }

    public void setFecha_asistencia(LocalDate fecha_asistencia) {
        this.fecha_asistencia = fecha_asistencia;
    }
    
}
