/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GimnasioGrupo10.ACCESO_A_DATOS;

import GimnasioGrupo10.ENTIDADES.Asistencia;
import GimnasioGrupo10.ENTIDADES.Clase;
import GimnasioGrupo10.ENTIDADES.Membresia;
import GimnasioGrupo10.ENTIDADES.Socio;

import java.sql.*;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AsistenciaData {

    private Connection con = null;
    private Clase clase;
    private Membresia membresia;
    private Asistencia asistencia;

    public AsistenciaData() {
        con = Conexion.getConexion();
        clase = new Clase();
        membresia = new Membresia();
        asistencia = new Asistencia();
    }

    public void guardarAsistencia(Asistencia asistencia, Socio socio, Date dia, Clase clase) {
        String sqlInsertAsistencia = "INSERT INTO asistencia (id_socio, id_clase, fecha_asistencia) VALUES (?, ?, ?)";
        String sqlUpdateCapacidad = "UPDATE clase SET capacidad_clase = ? WHERE id_clase = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sqlInsertAsistencia, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, socio.getId_socio());
            ps.setInt(2, clase.getId_clase());
            ps.setDate(3, dia);
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                asistencia.setId_asistencia(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "asistencia agregada con exito");

            } else {
                JOptionPane.showMessageDialog(null, "error al guardar la asistencia");
                return;
            }
            // Obtener y actualizar la capacidad de la clase
            PreparedStatement psUpdate = con.prepareStatement(sqlUpdateCapacidad);
            psUpdate.setInt(1, clase.getCapacidad_clase() - 1);
            psUpdate.setInt(2, clase.getId_clase());
            psUpdate.executeUpdate();

            JOptionPane.showMessageDialog(null, "Capacidad de la clase actualizada con éxito");

        } catch (SQLException ex) {
            Logger.getLogger(AsistenciaData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

//    public void guardarAsistencia(Asistencia asistencia,Socio socio) {
//        String sqlInsertAsistencia = "INSERT INTO asistencia (id_socio, id_clase, fecha_asistencia) VALUES (?, ?, ?)";
//        String sqlCheckCapacidad = "SELECT capacidad_clase, (SELECT COUNT(*) FROM asistencia WHERE id_clase=?) AS asistencias_actuales FROM clase WHERE id_clase = ?";
//        String sqlCheckMembresia = "SELECT estado_membresia FROM membresia WHERE id_socio = ?";
//        String sqlUpdatePases = "UPDATE membresia SET cantidad_pases = cantidad_pases - 1 WHERE id_membresia = ?";
//
//        try {
//            PreparedStatement psCapacidad = con.prepareStatement(sqlCheckCapacidad);
//            PreparedStatement psMembresia = con.prepareStatement(sqlCheckMembresia);
//
//            psCapacidad.setInt(1, asistencia.getClase().getId_clase());
//            psCapacidad.setInt(2, asistencia.getClase().getId_clase());
//
//            ResultSet rsCapacidad = psCapacidad.executeQuery();
//
//            if (rsCapacidad.next()) {
//                int capacidadMaxima = rsCapacidad.getInt("capacidad_clase");
//                int asistenciasActuales = rsCapacidad.getInt("asistencias_actuales");
//
//                if (asistenciasActuales >= capacidadMaxima) {
//                    JOptionPane.showMessageDialog(null, "La clase no tiene capacidad disponible.");
//                    return;
//                }
//            } else {
//                JOptionPane.showMessageDialog(null, "Clase no encontrada.");
//                return;
//            }
//
//            // Verificar membresía activa y pases disponibles
//            int idSoc = socio.getId_socio();
//            psMembresia.setInt(1, idSoc);
//            
//            ResultSet rsMembresia = psMembresia.executeQuery();
//            if (rsMembresia.next()) {
//                
//                int cantidadPases = rsMembresia.getInt("cantidad_pases");
//                int idMembresia = rsMembresia.getInt("id_membresia");
//
//                if (cantidadPases <= 0) {
//                    JOptionPane.showMessageDialog(null, "El socio no tiene pases disponibles.");
//                    return;
//                }
//
//                // Registrar la asistencia
//                PreparedStatement psInsert = con.prepareStatement(sqlInsertAsistencia, Statement.RETURN_GENERATED_KEYS);
//                psInsert.setInt(1, asistencia.getSocio().getId_socio());
//                psInsert.setInt(2, asistencia.getClase().getId_clase());
//                psInsert.setDate(3, Date.valueOf(asistencia.getFecha_asistencia()));
//                psInsert.executeUpdate();
//
//                ResultSet rsInsert = psInsert.getGeneratedKeys();
//                if (rsInsert.next()) {
//                    asistencia.setId_asistencia(rsInsert.getInt(1));
//                    JOptionPane.showMessageDialog(null, "asistencia agregada con exito");
//
//                }
//                // Actualizar los pases disponibles
//                PreparedStatement psUpdatePases = con.prepareStatement(sqlUpdatePases);
//                psUpdatePases.setInt(1, idMembresia);
//                psUpdatePases.executeUpdate();
//
//            } else {
//                JOptionPane.showMessageDialog(null, "El socio no tiene una membresía activa \n ERROR ASISTENCIA DATA.");
//            }
//
//        } catch (SQLException ex) {
////            ex.printStackTrace();
//            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Asistencia.");
//        }
//
//    }

