/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GimnasioGrupo10.ACCESO_A_DATOS;

import GimnasioGrupo10.ENTIDADES.Entrenador;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EntrenadorData {

    private Connection con = null;

    public EntrenadorData() {
        con = Conexion.getConexion();
    }

    public void cargarEntrenador(Entrenador entrenador) {
        String sql = "INSERT INTO entrenador (dni_entrenador,nombre_entrenador, apellido_entrenador, especialidad_entrenador, estado_entrenador) "
                + "VALUES (?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, entrenador.getDni_entrenador());
            ps.setString(2, entrenador.getApellido_entrenador());
            ps.setString(3, entrenador.getNombre_entrenador());
            ps.setString(4, entrenador.getEspecialidad_entrenador());
            ps.setBoolean(5, entrenador.isEstado_entrenador());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                entrenador.setId_entrenador(rs.getInt(1));
            }
            ps.close();
            JOptionPane.showMessageDialog(null, "Entrenador agregado con exito!!!");

        } catch (SQLException ex) {
//            Logger.getLogger(EntrenadorData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla Entrenador");
        }
    }

    public Entrenador buscarEntrenadorPorId(int id_entrenador) {
        String sql = "SELECT dni_entrenador,nombre_entrenador, apellido_entrenador, especialidad_entrenador, estado_entrenador "
                + " FROM entrenador WHERE id_entrenador = ?";
        Entrenador entren = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id_entrenador);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                entren = new Entrenador();
                entren.setDni_entrenador(rs.getString("dni_entrenador"));
                entren.setNombre_entrenador(rs.getString("nombre_entrenador"));
                entren.setApellido_entrenador(rs.getString("apellido_entrenador"));
                entren.setEspecialidad_entrenador(rs.getString("especialidad_entrenador"));
                entren.setEstado_entrenador(rs.getBoolean("estado_entrenador"));
                JOptionPane.showMessageDialog(null, "Entrenador encontrado con exito!!!");
            }
            else{
                JOptionPane.showMessageDialog(null, "No existe ese entrenador");
            }
        } catch (SQLException ex) {
//            Logger.getLogger(EntrenadorData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla Entrenador");
        }
        return entren;
    }

    public List<Entrenador> listarEntrenadoresActivos() {
        ArrayList<Entrenador> entrenadores = new ArrayList<>();

        String sql = "SELECT id_entrenador, dni_entrenador, nombre_entrenador, apellido_entrenador, especialidad_entrenador, estado_entrenador"
                + " FROM entrenador WHERE estado_entrenador = 1";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Entrenador entrenador = new Entrenador();
                entrenador.setId_entrenador(rs.getInt("id_entrenador"));
                entrenador.setDni_entrenador(rs.getString("dni_entrenador"));
                entrenador.setNombre_entrenador(rs.getString("nombre_entrenador"));
                entrenador.setApellido_entrenador(rs.getString("apellido_entrenador"));
                entrenador.setEspecialidad_entrenador(rs.getString("especialidad_entrenador"));
                entrenador.setEstado_entrenador(rs.getBoolean("estado_entrenador"));

                entrenadores.add(entrenador);
            }
        } catch (SQLException ex) {
//            Logger.getLogger(EntrenadorData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla Entrenador");
        }
        return entrenadores;
    }

    public ArrayList<Entrenador> buscarEntrenadorNombre(String nombre) {
        ArrayList<Entrenador> entrenadores = new ArrayList<>();
        Entrenador entrenador = null;
        String sql = "SELECT id_entrenador, dni_entrenador, nombre_entrenador, apellido_entrenador, especialidad_entrenador, estado_entrenador "
                + " FROM entrenador"
                + " WHERE nombre_entrenador like LOWER(%?%)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre.toLowerCase());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Entrenador(es) encontrado(s) con exito!!!");
                do {
                    entrenador = new Entrenador();

                    entrenador.setId_entrenador(rs.getInt("id_entrenador"));
                    entrenador.setDni_entrenador(rs.getString("dni_entrenador"));
                    entrenador.setNombre_entrenador(rs.getString("nombre_entrenador"));
                    entrenador.setApellido_entrenador(rs.getString("apellido_entrenador"));
                    entrenador.setEspecialidad_entrenador(rs.getString("especialidad_entrenador"));
                    entrenador.setEstado_entrenador(rs.getBoolean("estado_entrenador"));

                    entrenadores.add(entrenador);
                } while (rs.next());
            } else {
                JOptionPane.showMessageDialog(null, "No existe ningun entrenador con ese nombre");
            }
        } catch (SQLException ex) {
//            Logger.getLogger(EntrenadorData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla Entrenador");
        }
        return entrenadores;
    }

    public ArrayList<Entrenador> buscarEntrenadorNombreApellido(String nombre, String apellido) {
        ArrayList<Entrenador> entrenadores = new ArrayList<>();
        Entrenador entrenador = null;
        String sql = "SELECT id_entrenador, dni_entrenador, nombre_entrenador, apellido_entrenador, especialidad_entrenador, estado_entrenador "
                + " FROM entrenador"
                + " WHERE nombre_entrenador like LOWER(%?%) AND  apellido_entrenador like LOWER(%?%)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, nombre.toLowerCase());
            ps.setString(2, apellido.toLowerCase());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Entrenador(es) encontrado(s) con exito!!!");
                do {
                    entrenador = new Entrenador();
                    entrenador.setId_entrenador(rs.getInt("id_entrenador"));
                    entrenador.setDni_entrenador(rs.getString("dni_entrenador"));
                    entrenador.setNombre_entrenador(rs.getString("nombre_entrenador"));
                    entrenador.setApellido_entrenador(rs.getString("apellido_entrenador"));
                    entrenador.setEspecialidad_entrenador(rs.getString("especialidad_entrenador"));
                    entrenador.setEstado_entrenador(rs.getBoolean("estado_entrenador"));

                    entrenadores.add(entrenador);
                } while (rs.next());
            } else {
                JOptionPane.showMessageDialog(null, "No existe ningun entrenador con ese nombre");
            }
        } catch (SQLException ex) {
//            Logger.getLogger(EntrenadorData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla Entrenador");
        }
        return entrenadores;
    }

    public ArrayList<Entrenador> buscarEntrenadorApellido(String apellido) {
        ArrayList<Entrenador> entrenadores = new ArrayList<>();
        Entrenador entrenador = null;
        String sql = "SELECT id_entrenador, dni_entrenador, nombre_entrenador, apellido_entrenador, especialidad_entrenador, estado_entrenador "
                + " FROM entrenador"
                + " WHERE  apellido_entrenador like LOWER(%?%)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, apellido.toLowerCase());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Entrenador(es) encontrado(s) con exito!!!");
                do {
                    entrenador = new Entrenador();
                    entrenador.setId_entrenador(rs.getInt("id_entrenador"));
                    entrenador.setDni_entrenador(rs.getString("dni_entrenador"));
                    entrenador.setNombre_entrenador(rs.getString("nombre_entrenador"));
                    entrenador.setApellido_entrenador(rs.getString("apellido_entrenador"));
                    entrenador.setEspecialidad_entrenador(rs.getString("especialidad_entrenador"));
                    entrenador.setEstado_entrenador(rs.getBoolean("estado_entrenador"));

                    entrenadores.add(entrenador);
                } while (rs.next());
            } else {
                JOptionPane.showMessageDialog(null, "No existe ningun entrenador con ese nombre y apellido");
            }
        } catch (SQLException ex) {
//            Logger.getLogger(EntrenadorData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla Entrenador");
        }
        return entrenadores;
    }

    public ArrayList<Entrenador> buscarEntrenadorEspecialidad(String especialidad) {
        ArrayList<Entrenador> entrenadores = new ArrayList<>();
        Entrenador entrenador = null;
        String sql = "SELECT id_entrenador, dni_entrenador, nombre_entrenador, apellido_entrenador, especialidad_entrenador, estado_entrenador "
                + " FROM entrenador"
                + " WHERE  especialidad_entrenador like LOWER(?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, especialidad.toLowerCase());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Entrenador(es) encontrado(s) con exito!!!");
                do {
                    entrenador = new Entrenador();
                    entrenador.setId_entrenador(rs.getInt("id_entrenador"));
                    entrenador.setDni_entrenador(rs.getString("dni_entrenador"));
                    entrenador.setNombre_entrenador(rs.getString("nombre_entrenador"));
                    entrenador.setApellido_entrenador(rs.getString("apellido_entrenador"));
                    entrenador.setEspecialidad_entrenador(rs.getString("especialidad_entrenador"));
                    entrenador.setEstado_entrenador(rs.getBoolean("estado_entrenador"));

                    entrenadores.add(entrenador);
                } while (rs.next());
            } else {
                JOptionPane.showMessageDialog(null, "No existe ningun entrenador en esa especialidad");
            }
        } catch (SQLException ex) {
//            Logger.getLogger(EntrenadorData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla Entrenador");
        }
        return entrenadores;
    }
}
