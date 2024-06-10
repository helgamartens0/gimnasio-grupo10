/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GimnasioGrupo10.ACCESO_A_DATOS;

import GimnasioGrupo10.ENTIDADES.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author helma
 */
public class MembresiaData {

    private Connection con;
    private SocioData socData = new SocioData();

    public MembresiaData() {
        con = Conexion.getConexion();
    }

    public void agregarMembresia(Membresia membresia) {
        String sql = "INSERT INTO membresia (id_membresia, id_socio, cantidad_pases,"
                + " fecha_inicio, fecha_fin, costo_membresia, estado_membresia)"
                + " VALUES (?,?,?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, membresia.getId_membresia());
            
            Socio socio = new Socio();
            ps.setInt(2, socio.getId_socio());
            ps.setInt(3, membresia.getCantidad_pases());
            ps.setDate(3, java.sql.Date.valueOf(membresia.getFecha_inicio()));
            ps.setDate(4, java.sql.Date.valueOf(membresia.getFecha_fin()));
            ps.setDouble(6, membresia.getCosto_membresia());
            ps.setBoolean(7, membresia.isEstado_membresia());
            ps.executeQuery();

        } catch (Exception e) {
            System.out.println("error " + e);
        }
    }

    public List<Membresia> membresiaPorSocio(int idSocio) {

        List<Membresia> membresias = new ArrayList<>();
        String sql = "SELECT * FROM Membresía WHERE id_socio = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idSocio);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                
                Membresia membresia = new Membresia();
                Socio socio = socData.buscarSocioId(rs.getInt("id_socio"));
                        membresia.setSocio(socio);
                        membresia.setCantidad_pases(rs.getInt("cantidad_pases"));
                        membresia.setFecha_inicio(rs.getDate("fecha_inicio").toLocalDate());
                        membresia.setFecha_fin(rs.getDate("fecha_fin").toLocalDate());
                        membresia.setCosto_membresia(rs.getDouble("costo_membresia"));
                        membresia.setEstado_membresia(rs.getBoolean("estado_membresia"));
                
                membresias.add(membresia);
            }
        } catch (SQLException e) {
            System.out.println("error " + e);
        }
        return membresias;
    }

    public void renovarMembresia(int idMembresia, Date nuevaFechaFin, int nuevaCantPases) {
        String sql = "UPDATE membresia SET fecha_fin = ?, cantidad_pases = ? WHERE id_membresia = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, new java.sql.Date(nuevaFechaFin.getTime()));
            ps.setInt(2, nuevaCantPases);
            ps.setInt(3, idMembresia);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("error " + e);
        }
    }
    
    public void cancelarMembresia(int idMembresia){
        String sql = "UPDATE membresia SET estado_membresia = FALSE WHERE id_membresia = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMembresia);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("error " + e);
        }
    }
}
