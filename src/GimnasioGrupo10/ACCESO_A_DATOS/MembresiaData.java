/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GimnasioGrupo10.ACCESO_A_DATOS;

import GimnasioGrupo10.ENTIDADES.Socio;
import GimnasioGrupo10.ENTIDADES.Membresia;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

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

    public void cargarMembresia(Membresia membresia) {
        String sql = "INSERT INTO membresia (id_socio, cantidad_pases, fecha_inicio, fecha_fin, costo_membresia, estado_membresia) "
                + " VALUES (?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, membresia.getSocio().getId_socio());
            ps.setInt(2, membresia.getCantidad_pases());
            ps.setDate(3, Date.valueOf(membresia.getFecha_inicio()));
            ps.setDate(4, Date.valueOf(membresia.getFecha_fin()));
            ps.setDouble(5, membresia.getCosto_membresia());
            ps.setBoolean(6, membresia.isEstado_membresia());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                membresia.setId_membresia(rs.getInt(1));

            }
            JOptionPane.showMessageDialog(null, "Membresia agregada con exito!!!");
            ps.close();

        } catch (SQLException ex) {
//            Logger.getLogger(MembresiaData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla Membresia");
        }
    }

    public List<Membresia> membresiaPorSocio(int idSocio) {

        List<Membresia> membresias = new ArrayList<>();
        String sql = "SELECT * "
                + "FROM membresia "
                + "JOIN socio ON membresia.id_socio = socio.id_socio "
                + "WHERE socio.id_socio = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idSocio);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Membresia membresia = new Membresia();
                membresia.setId_membresia(rs.getInt("id_membresia"));
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
//            System.out.println("error " + e);
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla Membresia");

        }
        return membresias;
    }

    public void renovarMembresia(int idMembresia, LocalDate nuevaFechaFin, int nuevaCantPases) {
        String sql = "UPDATE membresia SET fecha_fin = ?, cantidad_pases = ?, estado_membresia = 1 WHERE id_membresia = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(nuevaFechaFin));
            ps.setInt(2, nuevaCantPases);
            ps.setInt(3, idMembresia);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Membresia renovada con exito");
        } catch (Exception e) {
//            System.out.println("error " + e);
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla Membresia");

        }
    }
//

    public void cancelarMembresia(int idMembresia) {
        String sql = "UPDATE membresia SET estado_membresia = FALSE WHERE id_membresia = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMembresia);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Membresia cancelada con exito");

        } catch (SQLException e) {
//            System.out.println("error " + e);
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla Membresia");

        }
    }
    
     public List<Membresia> TodasMembresias() {

        List<Membresia> membresias2 = new ArrayList<>();
        String sql = "SELECT * "
                + "FROM membresia "
                + "JOIN socio ON membresia.id_socio = socio.id_socio ";
                
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Membresia membresia = new Membresia();
                membresia.setId_membresia(rs.getInt("id_membresia"));
                Socio socio = socData.buscarTodosLosSociosId(rs.getInt("id_socio"));
                membresia.setSocio(socio);
                membresia.setCantidad_pases(rs.getInt("cantidad_pases"));
                membresia.setFecha_inicio(rs.getDate("fecha_inicio").toLocalDate());
                membresia.setFecha_fin(rs.getDate("fecha_fin").toLocalDate());
                membresia.setCosto_membresia(rs.getDouble("costo_membresia"));
                membresia.setEstado_membresia(rs.getBoolean("estado_membresia"));

                membresias2.add(membresia);
            }
        } catch (SQLException e) {
//            System.out.println("error " + e);
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla Membresia");

        }
        return membresias2;
    }
     
     public List<Membresia> membresiasActivas() {

        List<Membresia> membresias3 = new ArrayList<>();
        String sql = "SELECT * "
                + "FROM membresia "
                + "JOIN socio ON membresia.id_socio = socio.id_socio "
                + "WHERE membresia.estado_membresia = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                Membresia membresia = new Membresia();
                membresia.setId_membresia(rs.getInt("id_membresia"));
                Socio socio = socData.buscarTodosLosSociosId(rs.getInt("id_socio"));
                membresia.setSocio(socio);
                membresia.setCantidad_pases(rs.getInt("cantidad_pases"));
                membresia.setFecha_inicio(rs.getDate("fecha_inicio").toLocalDate());
                membresia.setFecha_fin(rs.getDate("fecha_fin").toLocalDate());
                membresia.setCosto_membresia(rs.getDouble("costo_membresia"));
                membresia.setEstado_membresia(rs.getBoolean("estado_membresia"));

                membresias3.add(membresia);
            }
        } catch (SQLException e) {
//            System.out.println("error " + e);
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla Membresia");
        }
        return membresias3;
    }
}
