/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GimnasioGrupo10.ENTIDADES;
import java.time.LocalDate;

public class Membresia {

    private int id_membresia;
    private Socio socio;
    private int cantidad_pases;
    private LocalDate fecha_inicio;
    private LocalDate fecha_fin;
    private double costo_membresia;
    private boolean estado_membresia;

    public Membresia() {
    }

    public Membresia(Socio socio, int cantidad_pases, LocalDate fecha_inicio, LocalDate fecha_fin, double costo_membresia, boolean estado_membresia) {
        this.socio = socio;
        this.cantidad_pases = cantidad_pases;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.costo_membresia = costo_membresia;
        this.estado_membresia = estado_membresia;
    }

    public Membresia(int id_membresia, Socio socio, int cantidad_pases, LocalDate fecha_inicio, LocalDate fecha_fin, double costo_membresia, boolean estado_membresia) {
        this.id_membresia = id_membresia;
        this.socio = socio;
        this.cantidad_pases = cantidad_pases;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
        this.costo_membresia = costo_membresia;
        this.estado_membresia = estado_membresia;
    }

    public int getId_membresia() {
        return id_membresia;
    }

    public void setId_membresia(int id_membresia) {
        this.id_membresia = id_membresia;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public int getCantidad_pases() {
        return cantidad_pases;
    }

    public void setCantidad_pases(int cantidad_pases) {
        this.cantidad_pases = cantidad_pases;
    }

    public LocalDate getFecha_inicio() {
        return fecha_inicio;
    }

    public void setFecha_inicio(LocalDate fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public LocalDate getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(LocalDate fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public double getCosto_membresia() {
        return costo_membresia;
    }

    public void setCosto_membresia(double costo_membresia) {
        this.costo_membresia = costo_membresia;
    }

    public boolean isEstado_membresia() {
        return estado_membresia;
    }

    public void setEstado_membresia(boolean estado_membresia) {
        this.estado_membresia = estado_membresia;
    }

    @Override
    public String toString() {
        return "Membresia{" + "id_membresia=" + id_membresia + ", socio=" + socio.getId_socio() 
                + ", cantidad_pases=" + cantidad_pases + ", fecha_inicio=" + fecha_inicio 
                + ", fecha_fin=" + fecha_fin + ", costo_membresia=" + costo_membresia 
                + ", estado_membresia=" + estado_membresia + '}';
    }
}