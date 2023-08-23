

package com.mycompany.proyectobd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

      
      
   

public class ProyectoBD {
    
    public static void main(String[] args) {
       Formulario1 formulario = new Formulario1();
       formulario.setSize(800, 500);
       formulario.setVisible(true);
        
        String Usuario = "root";
        String clave = "";
        String BD = "planilla";
        String IP = "localhost";
        String Puerto = "3307";
        String cadena = "jdbc:mysql://" + IP + ":" + Puerto + "/" + BD;

        try {
    Connection connection = DriverManager.getConnection(cadena, Usuario, clave);
    System.out.println("Connected to MySQL database!");
    JOptionPane.showMessageDialog(null, "Conexión exitosa");
} catch (SQLException e) {
    System.out.println("Error connecting to MySQL database: " + e.getMessage());
    JOptionPane.showMessageDialog(null, "Error en conexión");
}


}

    Connection connect() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}