/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GimnasioGrupo10.ACCESO_A_DATOS;

import GimnasioGrupo10.ENTIDADES.Clase;
import GimnasioGrupo10.ENTIDADES.Entrenador;
import GimnasioGrupo10.ENTIDADES.Socio;
import java.sql.*;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ClaseData {

    
    private Connection con = null;
    private EntrenadorData entrData = new EntrenadorData();

    public ClaseData() {
        con = Conexion.getConexion();
    }

//    public boolean existeEntrenador(int idEntrenador) {
//        String sql = "SELECT COUNT(*) FROM entrenador WHERE id_entrenador = ?";
//        try {
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setInt(1, idEntrenador);
//            ResultSet rs = ps.executeQuery();
//            if (rs.next()) {
//                return rs.getInt(1) > 0;
//            }
//            
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//        return false;
//    }
    public void cargarClase(Clase clase) {
//        int idEntrenador = clase.getEntrenador().getId_entrenador();
//        if (!existeEntrenador(idEntrenador)) {
//            System.out.println( "El entrenador con ID " + idEntrenador + " no existe.");
//            return;
//        }
        String sql = "INSERT INTO clase (nombre_clase, id_entrenador, horario_clase, capacidad_clase, estado_clase) "
                + " VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, clase.getNombre_clase());
            Entrenador entrenador = clase.getEntrenador();
            ps.setInt(2, entrenador.getId_entrenador());
            ps.setTime(3, Time.valueOf(clase.getHora_clase()));
            ps.setInt(4, clase.getCapacidad_clase());
            ps.setBoolean(5, clase.isEstado_clase());

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                clase.setId_clase(rs.getInt(1));
            }
            ps.close();
//            JOptionPane.showMessageDialog(null, "Clase agregada con exito!!!");
        } catch (SQLException ex) {
            System.out.println("error al acceder a la tabla de Clases");

//            Logger.getLogger(ClaseData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Clase> listarClasesActivas() {
        ArrayList<Clase> clases = new ArrayList<>();
        String sql = "SELECT id_clase, nombre_clase, id_entrenador, horario_clase, capacidad_clase, estado_clase "
                + " FROM clase WHERE estado_clase = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Clase clase = new Clase();
                clase.setId_clase(rs.getInt("id_clase"));
                clase.setNombre_clase(rs.getString("nombre_clase"));
                Entrenador entrenador = entrData.buscarEntrenadorPorId(rs.getInt("id_entrenador"));
                clase.setEntrenador(entrenador);
                clase.setHora_clase((rs.getTime("horario_clase")).toLocalTime());
                clase.setCapacidad_clase(rs.getInt("capacidad_clase"));
                clase.setEstado_clase(true);

                clases.add(clase);
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("error al acceder a la tabla de Clases");
//            Logger.getLogger(ClaseData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return clases;
    }

    public ArrayList<Clase> buscarClaseNombre(String nombre) {
        ArrayList<Clase> clases = new ArrayList<>();

        Clase clase = null;
        String sql = "SELECT id_clase, nombre_clase, id_entrenador, horario_clase, capacidad_clase, estado_clase "
                + " FROM clase "
                + "WHERE nombre_clase LIKE LOWER(?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" + nombre.toLowerCase() + "%");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                clase = new Clase();
                clase.setId_clase(rs.getInt("id_clase"));
                clase.setNombre_clase(rs.getString("nombre_clase"));
                Entrenador entrenador = entrData.buscarEntrenadorPorId(rs.getInt("id_entrenador"));
                clase.setEntrenador(entrenador);
                clase.setHora_clase((rs.getTime("horario_clase")).toLocalTime());
                clase.setCapacidad_clase(rs.getInt("capacidad_clase"));
                clase.setEstado_clase(true);

                clases.add(clase);
            }
        } catch (SQLException ex) {
//            Logger.getLogger(ClaseData.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("error al acceder a la tabla de Clases");
        }
        return clases;
    }

    public ArrayList<Clase> buscarClasesEntrenador(String nombreEntrenador, String apellidoEntrenador) {
        ArrayList<Clase> clases = new ArrayList<>();
        Clase clase = null;
        String sql = "SELECT clase.id_clase, clase.nombre_clase, clase.horario_clase, clase.capacidad_clase, clase.estado_clase, "
                + "entrenador.nombre_entrenador, entrenador.apellido_entrenador "
                + "FROM clase "
                + "JOIN entrenador ON clase.id_entrenador = entrenador.id_entrenador "
                + "WHERE entrenador.nombre_entrenador LIKE LOWER(?) AND entrenador.apellido_entrenador LIKE LOWER(?)";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" + nombreEntrenador + "%");
            ps.setString(2, "%" + apellidoEntrenador + "%");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                clase = new Clase();
                clase.setId_clase(rs.getInt("id_clase"));
                clase.setNombre_clase(rs.getString("nombre_clase"));

                Entrenador entrenador = new Entrenador();
                entrenador.setNombre_entrenador(rs.getString("nombre_entrenador"));
                entrenador.setApellido_entrenador(rs.getString("apellido_entrenador"));
                clase.setEntrenador(entrenador);

                clase.setHora_clase((rs.getTime("horario_clase")).toLocalTime());
                clase.setCapacidad_clase(rs.getInt("capacidad_clase"));
                clase.setEstado_clase(rs.getBoolean("estado_clase"));

                clases.add(clase);
            }

        } catch (SQLException ex) {
//            Logger.getLogger(ClaseData.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("error al acceder a la tabla de Clases");
        }
        return clases;
    }

    public Clase buscarClaseHorario(LocalTime horario) {
        Clase clase = null;
        String sql = "SELECT * FROM `clase` WHERE clase.horario_clase = ?";

        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setTime(1, Time.valueOf(horario));

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {

                clase = new Clase();
                clase.setId_clase(rs.getInt("id_clase"));
                clase.setNombre_clase(rs.getString("nombre_clase"));
                Entrenador entrenador = entrData.buscarEntrenadorPorId(rs.getInt("id_entrenador"));
                clase.setEntrenador(entrenador);
                clase.setHora_clase((rs.getTime("horario_clase")).toLocalTime());
                clase.setCapacidad_clase(rs.getInt("capacidad_clase"));
                clase.setEstado_clase(true);
            }
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
        return clase;
    }
    public Clase buscarClaseId(int id){
        String sql="SELECT *  FROM `clase` WHERE id_clase=? AND estado_clase=1";
        Clase clase =null;
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
                clase= new Clase();
                clase.setId_clase(rs.getInt("id_clase"));
                clase.setNombre_clase(rs.getString("nombre_clase"));
                Entrenador entrenador = entrData.buscarEntrenadorPorId(rs.getInt("id_entrenador"));
                clase.setEntrenador(entrenador);
                clase.setHora_clase((rs.getTime("horario_clase")).toLocalTime());
                clase.setCapacidad_clase(rs.getInt("capacidad_clase"));
                clase.setEstado_clase(true);
              
                
            }else{
                JOptionPane.showMessageDialog(null,"No existe clase con ese id");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla clase");
        }
        return clase;
        
    }   
}
