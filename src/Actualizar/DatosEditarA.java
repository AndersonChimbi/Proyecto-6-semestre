/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actualizar;

import Conexion.Conexion;
import Joption.Joption;
import Joption.Joptionx;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author JaviieR
 */
public class DatosEditarA extends javax.swing.JFrame {
    Joption icon = new Joption();
    Joptionx save = new Joptionx(); 

    /**
     * Creates new form DatosEditarA
     */
    public DatosEditarA() {
        initComponents();
        setTitle("Datos Usuarios");
        setResizable(false);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("actualizar.png")).getImage());
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("wall.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nombre = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtficha = new javax.swing.JTextField();
        txtfecha = new javax.swing.JTextField();
        noficha = new javax.swing.JLabel();
        noficha1 = new javax.swing.JLabel();
        comboedificio = new javax.swing.JComboBox();
        txtsesion = new javax.swing.JComboBox();
        sesion = new javax.swing.JLabel();
        contrase??a = new javax.swing.JLabel();
        txtcontrase??a = new javax.swing.JTextField();
        empleado = new javax.swing.JComboBox();
        sesion1 = new javax.swing.JLabel();
        apellido = new javax.swing.JLabel();
        invitado = new javax.swing.JButton();
        admin = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nombre.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        nombre.setForeground(new java.awt.Color(255, 255, 255));
        nombre.setText("Nombre :");

        txtid.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        txtid.setEnabled(false);

        txtnombre.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        txtnombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });

        txtapellido.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        txtapellido.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoActionPerformed(evt);
            }
        });

        txtficha.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        txtficha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtficha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfichaActionPerformed(evt);
            }
        });
        txtficha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfichaKeyTyped(evt);
            }
        });

        txtfecha.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        txtfecha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaActionPerformed(evt);
            }
        });
        txtfecha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtfechaKeyTyped(evt);
            }
        });

        noficha.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        noficha.setForeground(new java.awt.Color(255, 255, 255));
        noficha.setText("No.Ficha :");

        noficha1.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        noficha1.setForeground(new java.awt.Color(255, 255, 255));
        noficha1.setText("Registro :");

        comboedificio.setBackground(new java.awt.Color(0, 102, 255));
        comboedificio.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        comboedificio.setForeground(new java.awt.Color(255, 255, 255));
        comboedificio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Funza", "Bogota", "Manizales" }));
        comboedificio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        comboedificio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboedificioActionPerformed(evt);
            }
        });

        txtsesion.setBackground(new java.awt.Color(0, 102, 255));
        txtsesion.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        txtsesion.setForeground(new java.awt.Color(255, 255, 255));
        txtsesion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tipo de sesion", "ADMINISTRADOR", "INVITADO" }));
        txtsesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsesionActionPerformed(evt);
            }
        });

        sesion.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        sesion.setForeground(new java.awt.Color(255, 255, 255));
        sesion.setText("Sesion :");

        contrase??a.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        contrase??a.setForeground(new java.awt.Color(255, 255, 255));
        contrase??a.setText("Contrase??a :");

        txtcontrase??a.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        txtcontrase??a.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtcontrase??a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontrase??aActionPerformed(evt);
            }
        });

        empleado.setBackground(new java.awt.Color(0, 102, 255));
        empleado.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        empleado.setForeground(new java.awt.Color(255, 255, 255));
        empleado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tipo de Invitado", "Servicio Social", "Directivos", "Empleado" }));
        empleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        empleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empleadoActionPerformed(evt);
            }
        });

        sesion1.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        sesion1.setForeground(new java.awt.Color(255, 255, 255));
        sesion1.setText("Tipo : ");

        apellido.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        apellido.setForeground(new java.awt.Color(255, 255, 255));
        apellido.setText("Apellido :");

        invitado.setBackground(new java.awt.Color(0, 0, 0));
        invitado.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        invitado.setForeground(new java.awt.Color(255, 255, 255));
        invitado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Actualizar/actualizar.png"))); // NOI18N
        invitado.setText("ACTUALIZAR");
        invitado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        invitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invitadoActionPerformed(evt);
            }
        });

        admin.setBackground(new java.awt.Color(0, 0, 0));
        admin.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        admin.setForeground(new java.awt.Color(255, 255, 255));
        admin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Actualizar/actualizar.png"))); // NOI18N
        admin.setText("ACTUALIZAR");
        admin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        admin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adminActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(0, 0, 0));
        jButton3.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Actualizar/salir.png"))); // NOI18N
        jButton3.setText("SALIR");
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sesion)
                                .addGap(18, 18, 18)
                                .addComponent(txtsesion, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nombre)
                                        .addComponent(noficha)
                                        .addComponent(noficha1))
                                    .addComponent(apellido, javax.swing.GroupLayout.Alignment.LEADING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtficha, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtnombre)
                                    .addComponent(txtapellido)
                                    .addComponent(comboedificio, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(contrase??a)
                                    .addComponent(sesion1))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(empleado, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcontrase??a, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(invitado, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(admin, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(noficha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtficha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboedificio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(noficha1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtsesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(contrase??a, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcontrase??a, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(151, 151, 151)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(invitado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(29, 29, 29)
                            .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sesion1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
        txtnombre.transferFocus();
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoActionPerformed

    private void txtfichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfichaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfichaActionPerformed

    private void txtfichaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfichaKeyTyped
        // TODO add your handling code here:
        char C = evt.getKeyChar();
        if(C<'0' || C>'9') evt.consume();
        if(txtficha.getText().length()>=6){
            evt.consume();
        }
    }//GEN-LAST:event_txtfichaKeyTyped

    private void txtfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechaActionPerformed

    private void txtfechaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtfechaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfechaKeyTyped

    private void comboedificioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboedificioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboedificioActionPerformed

    private void txtsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsesionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsesionActionPerformed

    private void txtcontrase??aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontrase??aActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcontrase??aActionPerformed

    private void empleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empleadoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void adminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adminActionPerformed
        // TODO add your handling code here:
        Conexion cc= new Conexion();
        Connection cn = cc.getConnection();
        PreparedStatement pps;
        try {
            pps = cn.prepareStatement("UPDATE administrador SET nom_admi='"+txtnombre.getText()
                +"',tipo_invi ='"+empleado.getSelectedItem().toString()+"',ape_admi='"+txtapellido.getText()+"',no_ficha='"+txtficha.getText()+
                "',contra_usu='"+txtcontrase??a.getText()+"',fecha='"+txtfecha.getText()+"'WHERE id_admi='"+txtid.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Cambios Realizados!","CORRECTO",JOptionPane.PLAIN_MESSAGE,icon);
            this.dispose();
        } catch (SQLException ex) {
            Logger.getLogger(DatosEditarA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_adminActionPerformed

    private void invitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invitadoActionPerformed
        // TODO add your handling code here:
        Conexion cc= new Conexion();
        Connection cn = cc.getConnection();
        PreparedStatement pps;
        try {
            pps = cn.prepareStatement("UPDATE invitado SET nom_invi='"+txtnombre.getText()
                +"',no_ficha='"+txtficha.getText()+"',ape_invi='"+txtapellido.getText()+"',tipo_sesion='"+txtsesion.getSelectedItem()+
                "',lugar_reg='"+comboedificio.getSelectedItem()+"',tipo_invi='"+empleado.getSelectedItem()+"',contra_usu='"+txtcontrase??a.getText()+"',fecha='"+txtfecha.getText()+"'WHERE id_invi='"+txtid.getText()+"'");
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Cambios Realizados","CORRECTO",JOptionPane.PLAIN_MESSAGE,icon);
            this.dispose();

        } catch (SQLException ex) {
            Logger.getLogger(DatosEditarA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_invitadoActionPerformed

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
            java.util.logging.Logger.getLogger(DatosEditarA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosEditarA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosEditarA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosEditarA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosEditarA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton admin;
    private javax.swing.JLabel apellido;
    public static javax.swing.JComboBox comboedificio;
    private javax.swing.JLabel contrase??a;
    public static javax.swing.JComboBox empleado;
    public static javax.swing.JButton invitado;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel noficha;
    private javax.swing.JLabel noficha1;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel sesion;
    private javax.swing.JLabel sesion1;
    public static javax.swing.JTextField txtapellido;
    public static javax.swing.JTextField txtcontrase??a;
    public static javax.swing.JTextField txtfecha;
    public static javax.swing.JTextField txtficha;
    public static javax.swing.JTextField txtid;
    public static javax.swing.JTextField txtnombre;
    public static javax.swing.JComboBox txtsesion;
    // End of variables declaration//GEN-END:variables
}
