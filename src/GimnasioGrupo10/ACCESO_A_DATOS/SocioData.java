/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GimnasioGrupo10.ACCESO_A_DATOS;

import GimnasioGrupo10.ENTIDADES.Socio;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class SocioData {

    private Connection con = null;

    public SocioData() {
        con = Conexion.getConexion();
    }

    public void cargarSocio(Socio socio) {
        String sql = "INSERT INTO socio (dni_socio,nombre_socio,apellido_socio,edad_socio,correo_socio,telefono_socio,estado_socio) "
                + "VALUES (?,?,?,?,?,?,?)";

        try {
            /*Este método de la conexión (con) crea un objeto PreparedStatement para enviar parámetros a la base de datos.*/
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, socio.getDni_socio());
            ps.setString(2, socio.getNombre_socio());
            ps.setString(3, socio.getApellido_socio());
            ps.setInt(4, socio.getEdad_socio());
            ps.setString(5, socio.getCorreo_socio());
            ps.setString(6, socio.getTelefono_socio());
            ps.setBoolean(7, socio.isEstado_socio());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();

            if (rs.next()) {
                socio.setId_socio(rs.getInt(1));
            }
            JOptionPane.showMessageDialog(null, "Socio agregado con exito!!!");
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla Socio");
//            Logger.getLogger(SocioData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<Socio> listarSociosActivos() {
        ArrayList<Socio> socios = new ArrayList<>();
        String sql = "SELECT `id_socio`, `dni_socio`, `nombre_socio`, `apellido_socio`, `edad_socio`, `correo_socio`, `telefono_socio`, `estado_socio`"
                + " FROM `socio` WHERE estado_socio=1";
//        String sql = "SELECT dni_socio,nombre_socio,apellido_socio,edad_socio,correo_socio,telefono_socio,estado_socio "
//                + " FROM socio WHERE estado_socio = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Socio socio = new Socio();

                socio.setId_socio(rs.getInt("id_socio"));
                socio.setDni_socio(rs.getInt("dni_socio"));
                socio.setNombre_socio(rs.getString("nombre_socio"));
                socio.setApellido_socio(rs.getString("apellido_socio"));
                socio.setEdad_socio(rs.getInt("edad_socio"));
                socio.setCorreo_socio(rs.getString("correo_socio"));
                socio.setTelefono_socio(rs.getString("telefono_socio"));
                socio.setEstado_socio(true);

                socios.add(socio);
            }
        } catch (SQLException ex) {
//            Logger.getLogger(SocioData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla Socio");
        }
        return socios;
    }

    public List<Socio> listarSociosInactivos() {
        ArrayList<Socio> socios = new ArrayList<>();
        String sql = "SELECT `id_socio`, `dni_socio`, `nombre_socio`, `apellido_socio`, `edad_socio`, `correo_socio`, `telefono_socio`, `estado_socio`"
                + " FROM `socio` WHERE estado_socio=0";
//        String sql = "SELECT dni_socio,nombre_socio,apellido_socio,edad_socio,correo_socio,telefono_socio,estado_socio "
//                + " FROM socio WHERE estado_socio = 0";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Socio socio = new Socio();

                socio.setId_socio(rs.getInt("id_socio"));
                socio.setDni_socio(rs.getInt("dni_socio"));
                socio.setNombre_socio(rs.getString("nombre_socio"));
                socio.setApellido_socio(rs.getString("apellido_socio"));
                socio.setEdad_socio(rs.getInt("edad_socio"));
                socio.setCorreo_socio(rs.getString("correo_socio"));
                socio.setTelefono_socio(rs.getString("telefono_socio"));
                socio.setEstado_socio(false);
                socios.add(socio);
            }
        } catch (SQLException ex) {
//            Logger.getLogger(SocioData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla Socio");
        }
        return socios;
    }

    public ArrayList<Socio> buscarSocioNombre(String nombre) {
        ArrayList<Socio> socios = new ArrayList<>();
        String sql = "SELECT id_socio,dni_socio,nombre_socio,apellido_socio,edad_socio,correo_socio,telefono_socio,estado_socio FROM socio "
                + "WHERE LOWER(nombre_socio) like LOWER(?)";
        Socio socio = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "%" + nombre.toLowerCase() + "%");
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
//                JOptionPane.showMessageDialog(null, "Socio(s) encontrado(s) con exito!!!");

                do {

                    socio = new Socio();

                    socio.setId_socio(rs.getInt("id_socio"));
                    socio.setDni_socio(rs.getInt("dni_socio"));
                    socio.setNombre_socio(rs.getString("nombre_socio"));
                    socio.setApellido_socio(rs.getString("apellido_socio"));
                    socio.setEdad_socio(rs.getInt("edad_socio"));
                    socio.setCorreo_socio(rs.getString("correo_socio"));
                    socio.setTelefono_socio(rs.getString("telefono_socio"));
                    socio.setEstado_socio(rs.getBoolean("estado_socio"));

                    socios.add(socio);
                } while (rs.next());
            } else {
                JOptionPane.showMessageDialog(null, "No existe ningun socio con ese nombre");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla Socio");
//            Logger.getLogger(SocioData.class.getName()).log(Level.SEVERE, null, ex);
        }
        return socios;
    }

    public Socio buscarSocioId(int id_socio) {
        String sql = "SELECT dni_socio,nombre_socio,apellido_socio,edad_socio,correo_socio,telefono_socio,estado_socio FROM socio "
                + "WHERE id_socio = ? AND estado_socio = 1";
        Socio socio = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            /*en la consulta SQL, reemplaza el primer signo de interrogación (?) con el valor de id_socio*/
            ps.setInt(1, id_socio);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                socio = new Socio();

                socio.setId_socio(id_socio);
                socio.setDni_socio(rs.getInt("dni_socio"));
                socio.setApellido_socio(rs.getString("apellido_socio"));
                socio.setNombre_socio(rs.getString("nombre_socio"));
                socio.setEdad_socio(rs.getInt("edad_socio"));
                socio.setCorreo_socio(rs.getString("correo_socio"));
                socio.setTelefono_socio(rs.getString("telefono_socio"));
                socio.setEstado_socio(rs.getBoolean("estado_socio"));

//                JOptionPane.showMessageDialog(null, "Socio encontrado con exito!!!");
            } else {
                JOptionPane.showMessageDialog(null, "No existe ese socio");
            }
        } catch (SQLException ex) {
//            Logger.getLogger(SocioData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla Socio");

        }
        return socio;
    }

    public Socio buscarSocioDni(int dni_socio) {
        String sql = "SELECT id_socio,dni_socio,nombre_socio,apellido_socio,edad_socio,correo_socio,telefono_socio,estado_socio FROM socio "
                + "WHERE dni_socio = ?";
        Socio socio = null;

        try {
            PreparedStatement ps = con.prepareStatement(sql);

            /*en la consulta SQL, reemplaza el primer signo de interrogación (?) con el valor de id_socio*/
            ps.setInt(1, dni_socio);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                socio = new Socio();
                socio.setId_socio(rs.getInt("id_socio"));
                socio.setDni_socio(rs.getInt("dni_socio"));
                socio.setApellido_socio(rs.getString("apellido_socio"));
                socio.setNombre_socio(rs.getString("nombre_socio"));
                socio.setEdad_socio(rs.getInt("edad_socio"));
                socio.setCorreo_socio(rs.getString("correo_socio"));
                socio.setTelefono_socio(rs.getString("telefono_socio"));
                socio.setEstado_socio(rs.getBoolean("estado_socio"));

//                JOptionPane.showMessageDialog(null, "Socio encontrado con exito!!!");
            } else {
                JOptionPane.showMessageDialog(null, "No existe ese socio");
            }
        } catch (SQLException ex) {
//            Logger.getLogger(SocioData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla Socio");

        }
        return socio;
    }

    public void eliminarSocio(int id) {
        String sql = "UPDATE `socio` SET estado_socio =0 WHERE id_socio=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Socio eliminado ");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla socio");
        }
    }

    public void modificarSocio(Socio socio) {

        String sql = "UPDATE socio SET dni_socio = ?, apellido_socio = ?, nombre_socio = ?,edad_socio = ?,correo_socio= ? ,telefono_socio = ? "
                + "WHERE id_socio = ?";

        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, socio.getDni_socio());
            ps.setString(2, socio.getNombre_socio());
            ps.setString(3, socio.getApellido_socio());
            ps.setInt(4, socio.getEdad_socio());
            ps.setString(5, socio.getCorreo_socio());
            ps.setString(6, socio.getTelefono_socio());
            ps.setInt(7, socio.getId_socio());


            int exito = ps.executeUpdate();
            if (exito > 0) {

                JOptionPane.showMessageDialog(null, "Socio modificado.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla socio. " + e);
        }
    }

    public Socio buscarSocioDNI(int dni_socio) {
        String sql = "SELECT dni_socio, nombre_socio,apellido_socio,edad_socio,correo_socio,telefono_socio,estado_socio FROM socio "
                + "WHERE dni_socio = ?";
        Socio socio = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            /*en la consulta SQL, reemplaza el primer signo de interrogación (?) con el valor de id_socio*/
            ps.setInt(1, dni_socio);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                socio = new Socio();

                socio.setDni_socio(rs.getInt("dni_socio"));
                socio.setApellido_socio(rs.getString("apellido_socio"));
                socio.setNombre_socio(rs.getString("nombre_socio"));
                socio.setEdad_socio(rs.getInt("edad_socio"));
                socio.setCorreo_socio(rs.getString("correo_socio"));
                socio.setTelefono_socio(rs.getString("telefono_socio"));
                socio.setEstado_socio(rs.getBoolean("estado_socio"));
            }
        } catch (SQLException ex) {
//            Logger.getLogger(SocioData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla Socio");

        }
        return socio;
    }
    public void altaSocio(int id){
        String sql="UPDATE `socio` SET estado_socio =1 WHERE id_socio=?";
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito=ps.executeUpdate();
            if(exito == 1){
                JOptionPane.showMessageDialog(null,"Socio dado de alta ");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla socio");
        }
    }
    
    public List<Socio> listarTodosLosSocios() {
        ArrayList<Socio> socios = new ArrayList<>();
        
        String sql = "SELECT `id_socio`, `dni_socio`, `nombre_socio`, `apellido_socio`, `edad_socio`, `correo_socio`, `telefono_socio`, `estado_socio`"
                + " FROM `socio`";
//        String sql = "SELECT dni_socio,nombre_socio,apellido_socio,edad_socio,correo_socio,telefono_socio,estado_socio "
//                + " FROM socio WHERE estado_socio = 1";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Socio socio = new Socio();

                socio.setId_socio(rs.getInt("id_socio"));
                socio.setDni_socio(rs.getInt("dni_socio"));
                socio.setNombre_socio(rs.getString("nombre_socio"));
                socio.setApellido_socio(rs.getString("apellido_socio"));
                socio.setEdad_socio(rs.getInt("edad_socio"));
                socio.setCorreo_socio(rs.getString("correo_socio"));
                socio.setTelefono_socio(rs.getString("telefono_socio"));
                socio.setEstado_socio(true);

                socios.add(socio);
            }
        } catch (SQLException ex) {
//            Logger.getLogger(SocioData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla Socio");
        }
        return socios;
    }
    
     public Socio buscarTodosLosSociosId(int id_socio) {
        String sql = "SELECT dni_socio,nombre_socio,apellido_socio,edad_socio,correo_socio,telefono_socio,estado_socio FROM socio "
                + "WHERE id_socio = ?";
        Socio socio = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);

            /*en la consulta SQL, reemplaza el primer signo de interrogación (?) con el valor de id_socio*/
            ps.setInt(1, id_socio);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {

                socio = new Socio();

                socio.setId_socio(id_socio);
                socio.setDni_socio(rs.getInt("dni_socio"));
                socio.setApellido_socio(rs.getString("apellido_socio"));
                socio.setNombre_socio(rs.getString("nombre_socio"));
                socio.setEdad_socio(rs.getInt("edad_socio"));
                socio.setCorreo_socio(rs.getString("correo_socio"));
                socio.setTelefono_socio(rs.getString("telefono_socio"));
                socio.setEstado_socio(rs.getBoolean("estado_socio"));

//                JOptionPane.showMessageDialog(null, "Socio encontrado con exito!!!");
            } else {
                JOptionPane.showMessageDialog(null, "No existe ese socio");
            }
        } catch (SQLException ex) {
//            Logger.getLogger(SocioData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla Socio");

        }
        return socio;
    } 
     public Socio buscarSocioDNI2(int dni_socio) {
        String sql = "SELECT id_socio, dni_socio, nombre_socio,apellido_socio,edad_socio,correo_socio,telefono_socio,estado_socio FROM socio "
                + "WHERE dni_socio = ?";
        Socio socio = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            
            ps.setInt(1, dni_socio);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                socio = new Socio();
                socio.setId_socio(rs.getInt("id_socio"));
                socio.setDni_socio(Integer.parseInt(rs.getString("dni_socio")));
                socio.setApellido_socio(rs.getString("apellido_socio"));
                socio.setNombre_socio(rs.getString("nombre_socio"));
                socio.setEdad_socio(rs.getInt("edad_socio"));
                socio.setCorreo_socio(rs.getString("correo_socio"));
                socio.setTelefono_socio(rs.getString("telefono_socio"));
                socio.setEstado_socio(rs.getBoolean("estado_socio"));
            }
        } catch (SQLException ex) {
//            Logger.getLogger(SocioData.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "error al acceder a la tabla Socio");

        }
        return socio;
    }
}

            
      


