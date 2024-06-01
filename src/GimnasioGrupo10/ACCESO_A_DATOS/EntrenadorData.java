/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GimnasioGrupo10.ACCESO_A_DATOS;

import GimnasioGrupo10.ENTIDADES.Entrenador;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class EntrenadorData {

    private Connection con;

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

}
