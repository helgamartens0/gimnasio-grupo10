/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GimnasioGrupo10.ACCESO_A_DATOS;


import GimnasioGrupo10.ENTIDADES.Asistencia;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class AsistenciaData {

    private Connection con = null;

    public AsistenciaData() {
        con = helgafinal_prueba.ACCESO_A_DATOS.Conexion.getConexion();
    }

    public void guardarAsistencia(Asistencia asistencia) {
        String sql = "INSERT INTO asistencia (id_socio,id_clase,fecha_asistencia)"
                + " VALUES (?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, asistencia.getId_socio());
            ps.setInt(2, asistencia.getId_clase());
            ps.setDate(3, Date.valueOf(asistencia.getFecha_asistencia()));

            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                asistencia.setId_asistencia(rs.getInt(1));
            }
            ps.close();

        } catch (SQLException ex) {
//            Logger.getLogger(AsistenciaData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla Asistencia");

        }
    }
    
    
}