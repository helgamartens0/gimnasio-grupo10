/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GimnasioGrupo10.ACCESO_A_DATOS;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Conexion {

    private static final String URL = "jdbc:mariadb://localhost:3306/gimnasio-grupo10";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static Connection con;
    //necesitamos controlar la cantidad de instancias de conexion, por lo que 
    //tenemos que utilizar un constructor PRIVADO. 
    
    private Conexion(){}
    
    //establecemos el metodo getConexion()
    
    public static Connection getConexion(){
        if (con==null){
            try{
                //cargamos Drivers de conexion
                Class.forName("org.mariadb.jdbc.Driver");
                
                //establecemos la conexion con la base de datos
                con = DriverManager.getConnection(URL,USER,PASSWORD);
            } catch (ClassNotFoundException ex) {
//                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"error al cargar los drivers");
            } catch (SQLException ex) {
//                Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null,"error al conectarse a la base de datos");
            }
        }
        
        return con;
    }

}
