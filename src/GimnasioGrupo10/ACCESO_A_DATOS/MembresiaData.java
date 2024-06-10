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
            ps.setInt(2, membresia.getIdSocio());
            ps.setInt(3, membresia.getCantidad_pases());
            ps.setDate(3, new java.sql.Date(membresia.getFecha_inicio().getTime()));
            ps.setDate(4, new java.sql.Date(membresia.getFecha_fin().getTime()));
            ps.setDouble(6, membresia.getCosto_membresia());
            ps.setBoolean(7, membresia.isEstado_membresia());
            ps.executeQuery();

        } catch (Exception e) {
            System.out.println("error " + e);
        }
    }

    public List<Membresia> membresiaPorSocio(int idSocio) {

        List<Membresia> membresias = new ArrayList<>();
        String sql = "SELECT * FROM Membresía WHERE ID_Socio = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idSocio);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Membresia membresia = new Membresia(
                        rs.getInt("ID_Membresía"),
                        rs.getInt("ID_Socio"),
                        rs.getInt("CantidadPases"),
                        rs.getDate("Fecha_Inicio"),
                        rs.getDate("Fecha_Fin"),
                        rs.getBigDecimal("Costo"),
                        rs.getBoolean("Estado")
                );
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
