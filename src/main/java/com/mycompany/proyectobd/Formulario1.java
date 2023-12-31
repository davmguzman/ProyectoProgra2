
package com.mycompany.proyectobd;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author monto
 */
public class Formulario1 extends javax.swing.JFrame {

    /**
     * Creates new form Formulario1
     */
    public Formulario1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Bconectar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        Text_Nombre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Text_Apellido = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Text_Cedula = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Txt_Rol = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Text_carro = new javax.swing.JTextField();
        jButtonREgistrar = new javax.swing.JButton();
        jButtonEliminar = new javax.swing.JButton();
        Btn_Actualizar = new javax.swing.JButton();
        Bbuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Text_Apellido_2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Txt_Nacionalidad = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Txt_sexo = new javax.swing.JTextField();

        jTextField2.setText("jTextField2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(null);

        jLabel3.setFont(new java.awt.Font("Wide Latin", 3, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 204));
        jLabel3.setText("Bienvenidos");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 10, 240, 30);

        Bconectar.setText("Conectar");
        Bconectar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BconectarActionPerformed(evt);
            }
        });
        jPanel1.add(Bconectar);
        Bconectar.setBounds(30, 70, 100, 50);

        jLabel4.setText("Nombre");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(150, 70, 50, 20);

        Text_Nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_NombreActionPerformed(evt);
            }
        });
        jPanel1.add(Text_Nombre);
        Text_Nombre.setBounds(200, 70, 180, 30);

        jLabel5.setText("Apellido");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(140, 110, 50, 20);

        Text_Apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_ApellidoActionPerformed(evt);
            }
        });
        jPanel1.add(Text_Apellido);
        Text_Apellido.setBounds(200, 110, 180, 30);

        jLabel6.setText("Cedula");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(160, 250, 50, 16);

        Text_Cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_CedulaActionPerformed(evt);
            }
        });
        jPanel1.add(Text_Cedula);
        Text_Cedula.setBounds(210, 250, 110, 22);

        jLabel7.setText("Rol");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(20, 276, 40, 20);

        Txt_Rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_RolActionPerformed(evt);
            }
        });
        jPanel1.add(Txt_Rol);
        Txt_Rol.setBounds(10, 310, 120, 30);

        jLabel8.setText("Tipo de Carro");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(200, 280, 100, 16);

        Text_carro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_carroActionPerformed(evt);
            }
        });
        jPanel1.add(Text_carro);
        Text_carro.setBounds(200, 310, 100, 30);

        jButtonREgistrar.setText("Registrar");
        jButtonREgistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonREgistrarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonREgistrar);
        jButtonREgistrar.setBounds(450, 250, 100, 40);

        jButtonEliminar.setText("Eliminar");
        jButtonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(jButtonEliminar);
        jButtonEliminar.setBounds(450, 310, 100, 40);

        Btn_Actualizar.setText("Actualizar");
        Btn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ActualizarActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Actualizar);
        Btn_Actualizar.setBounds(450, 190, 100, 40);

        Bbuscar.setText("Buscar");
        Bbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscarActionPerformed(evt);
            }
        });
        jPanel1.add(Bbuscar);
        Bbuscar.setBounds(450, 120, 100, 40);

        jLabel1.setText("Apellido 2");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(130, 150, 60, 16);
        jPanel1.add(Text_Apellido_2);
        Text_Apellido_2.setBounds(200, 150, 180, 30);

        jLabel2.setText("Nacionalidad");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(120, 190, 70, 16);
        jPanel1.add(Txt_Nacionalidad);
        Txt_Nacionalidad.setBounds(200, 190, 180, 30);

        jLabel9.setText("Sexo");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 230, 30, 16);
        jPanel1.add(Txt_sexo);
        Txt_sexo.setBounds(50, 230, 80, 22);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 30, 590, 390);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BconectarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BconectarActionPerformed
        ProyectoBD connector = new ProyectoBD();
    Connection connection = connector.connect();

    if (connection != null) {
        
    } else {
        
    }
    }//GEN-LAST:event_BconectarActionPerformed

    private void Text_NombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_NombreActionPerformed
        
    }//GEN-LAST:event_Text_NombreActionPerformed

    private void Text_ApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_ApellidoActionPerformed
        
    }//GEN-LAST:event_Text_ApellidoActionPerformed

    private void Text_CedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_CedulaActionPerformed
      
    }//GEN-LAST:event_Text_CedulaActionPerformed

    private void Txt_RolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_RolActionPerformed
        
    }//GEN-LAST:event_Txt_RolActionPerformed

    private void Text_carroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_carroActionPerformed
        
    }//GEN-LAST:event_Text_carroActionPerformed

    private void Btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ActualizarActionPerformed
        try {
        String usuario = "root";
        String clave = "";
        String BD = "planilla";      
        String IP = "localhost";
        String Puerto = "3307";
        String Cadena = "jdbc:mysql://" + IP + ":" + Puerto + "/" + BD;

        Connection cn = DriverManager.getConnection(Cadena, usuario, clave);

        PreparedStatement pst = cn.prepareStatement("UPDATE personas SET nombre_1 = ?, Apellido_1 = ?, Apellido_2 = ?, Nacionalidad = ?, sexo = ?, Carro = ?, Roles = ? WHERE Cedula = ?");
        pst.setString(1, Text_Nombre.getText().trim());
        pst.setString(2, Text_Apellido.getText().trim());
        pst.setString(3, Text_Apellido_2.getText().trim());
        pst.setString(4, Txt_Nacionalidad.getText().trim());
        pst.setString(5, Txt_sexo.getText().trim());
        pst.setString(6, Text_carro.getText().trim());
        pst.setString(7, Txt_Rol.getText().trim());
        pst.setString(8, Text_Cedula.getText().trim());

        int rowsAffected = pst.executeUpdate();
        
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Datos actualizados correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró registro para actualizar");
        }

        
        pst.close();
        cn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
    }//GEN-LAST:event_Btn_ActualizarActionPerformed

    private void jButtonREgistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonREgistrarActionPerformed
    try {
        String usuario = "root";
        String clave = "";
        String BD = "planilla";      
        String IP = "localhost";
        String Puerto = "3307";
        String Cadena = "jdbc:mysql://" + IP + ":" + Puerto + "/" + BD;

        Connection cn = DriverManager.getConnection(Cadena, usuario, clave);

        PreparedStatement pst = cn.prepareStatement("INSERT INTO personas (ID, username, password) VALUES (?, ?, ?,?,?,?,?,?)");
        pst.setInt(1, 0);
        pst.setString(2, Text_Nombre.getText().trim());
        pst.setString(3, Text_Apellido.getText().trim());
        pst.setString(3, Text_Apellido_2.getText().trim());
        pst.setString(4, Txt_Nacionalidad.getText().trim());
        pst.setString(5, Txt_sexo.getText().trim());
        pst.setString(6, Text_carro.getText().trim());
        pst.setString(7, Txt_Rol.getText().trim());
        pst.setString(8, Text_Cedula.getText().trim());
        pst.executeUpdate();

        
        pst.close();
        cn.close();
    } catch (SQLException e) {
        e.printStackTrace();
        System.out.println(""+e);
    }
           
           
    }//GEN-LAST:event_jButtonREgistrarActionPerformed

    private void jButtonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEliminarActionPerformed
        try {
        String usuario = "root";
        String clave = "";
        String BD = "planilla";      
        String IP = "localhost";
        String Puerto = "3307";
        String Cadena = "jdbc:mysql://" + IP + ":" + Puerto + "/" + BD;

        Connection cn = DriverManager.getConnection(Cadena, usuario, clave);

        PreparedStatement pst = cn.prepareStatement("DELETE FROM personas WHERE Cedula = ?");
        pst.setString(1, Text_Cedula.getText().trim());

        int rowsAffected = pst.executeUpdate();
        
        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Registro eliminado correctamente");
        } else {
            JOptionPane.showMessageDialog(null, "No se encontró registro para eliminar");
        }

       
        pst.close();
        cn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }

    
    }//GEN-LAST:event_jButtonEliminarActionPerformed

    private void BbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbuscarActionPerformed
        
      try {
        String usuario = "root";
        String clave = "";
        String BD = "planilla";      
        String IP = "localhost";
        String Puerto = "3307";
        String Cadena = "jdbc:mysql://" + IP + ":" + Puerto + "/" + BD;

        Connection cn = DriverManager.getConnection(Cadena, usuario, clave);

        PreparedStatement pst = cn.prepareStatement("select * from personas where Cedula = ?");
        pst.setString(1, Text_Cedula.getText().trim());
        ResultSet rs = pst.executeQuery();
        //Text_Nombre.setText(rs.getString("nombre_1"));
        if(rs.next())
        {
        Text_Nombre.setText(rs.getString("nombre_1"));
        Text_Apellido.setText(rs.getString("Apellido_1"));
        Text_Apellido_2.setText(rs.getString("Apellido_2"));
        Txt_Nacionalidad.setText(rs.getString("Nacionalidad"));
        Txt_sexo.setText(rs.getString("sexo"));
        Text_carro.setText(rs.getString("Carro"));
        Txt_Rol.setText(rs.getString("Roles"));
        
        }else {
        JOptionPane.showMessageDialog(null, "No se encuentra Registro");
        }
            
        
        
        pst.close();
        cn.close();
    } catch (SQLException e) {
        e.printStackTrace();
        
    }  
        
        
        
        
        
        
    }//GEN-LAST:event_BbuscarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Formulario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Formulario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Formulario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Formulario1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Formulario1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Bbuscar;
    private javax.swing.JButton Bconectar;
    private javax.swing.JButton Btn_Actualizar;
    private javax.swing.JTextField Text_Apellido;
    private javax.swing.JTextField Text_Apellido_2;
    private javax.swing.JTextField Text_Cedula;
    private javax.swing.JTextField Text_Nombre;
    private javax.swing.JTextField Text_carro;
    private javax.swing.JTextField Txt_Nacionalidad;
    private javax.swing.JTextField Txt_Rol;
    private javax.swing.JTextField Txt_sexo;
    private javax.swing.JButton jButtonEliminar;
    private javax.swing.JButton jButtonREgistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
