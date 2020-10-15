/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportes_gui;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import principales_gui.Entrada_Admin;
import principales_gui.Principal;
import secundarias_gui.*;

/**
 *
 * @author Grupo 2
 */
public class Reportes extends javax.swing.JFrame {

    /**
     * Creates new form Reportes
     */
    FondoPanel fondo=new FondoPanel();
    public Reportes() {
        this.setContentPane(fondo);
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("REPORTES");
        setIconImage(new ImageIcon(getClass().getResource("/iconos/colibri2.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnVentas = new javax.swing.JButton();
        btnProductos = new javax.swing.JButton();
        btnProveedores = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnrEPARTIDOR = new javax.swing.JButton();
        btnClientes3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REPORTES");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("REPORTES DE VENTAS");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 60, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("REPORTES DE PRODUCTOS");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("REPORTES DE PROVEEDORES");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        btnVentas.setBackground(new java.awt.Color(0, 0, 0));
        btnVentas.setForeground(new java.awt.Color(255, 255, 0));
        btnVentas.setText("Escojer");
        btnVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasActionPerformed(evt);
            }
        });
        getContentPane().add(btnVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 50, -1, -1));

        btnProductos.setBackground(new java.awt.Color(0, 0, 0));
        btnProductos.setForeground(new java.awt.Color(255, 255, 0));
        btnProductos.setText("Escojer");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        getContentPane().add(btnProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 90, -1, -1));

        btnProveedores.setBackground(new java.awt.Color(0, 0, 0));
        btnProveedores.setForeground(new java.awt.Color(255, 255, 0));
        btnProveedores.setText("Escojer");
        btnProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProveedoresActionPerformed(evt);
            }
        });
        getContentPane().add(btnProveedores, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, -1, -1));

        jButton1.setBackground(new java.awt.Color(0, 0, 0));
        jButton1.setForeground(new java.awt.Color(255, 255, 0));
        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, -1, -1));

        jButton2.setBackground(new java.awt.Color(0, 0, 0));
        jButton2.setForeground(new java.awt.Color(255, 255, 0));
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 280, 62, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("REPORTE DE REPARTIDORES");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("REPORTE DE CLIENTES");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        btnrEPARTIDOR.setBackground(new java.awt.Color(0, 0, 0));
        btnrEPARTIDOR.setForeground(new java.awt.Color(255, 255, 0));
        btnrEPARTIDOR.setText("Escojer");
        btnrEPARTIDOR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrEPARTIDORActionPerformed(evt);
            }
        });
        getContentPane().add(btnrEPARTIDOR, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, -1, -1));

        btnClientes3.setBackground(new java.awt.Color(0, 0, 0));
        btnClientes3.setForeground(new java.awt.Color(255, 255, 0));
        btnClientes3.setText("Escojer");
        btnClientes3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientes3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnClientes3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 170, -1, -1));

        jLabel6.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://i.pinimg.com/564x/96/fb/55/96fb55fb464b64b7e3b7c355d431e86d.jpg")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, -130, 440, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasActionPerformed
        Reporte_Ventas ventas = new Reporte_Ventas();
        ventas.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnVentasActionPerformed

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
        Reporte_Productos productos = new Reporte_Productos();
        
        productos.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProveedoresActionPerformed
        Reporte_Proveedores proveedores = new Reporte_Proveedores();
        
        proveedores.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnProveedoresActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        Entrada_Admin admin = new Entrada_Admin ();
        admin.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Principal principal = new Principal();
        principal.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnrEPARTIDORActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrEPARTIDORActionPerformed
       Reporte_Repartidor repartidro=new Reporte_Repartidor();
       repartidro.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_btnrEPARTIDORActionPerformed

    private void btnClientes3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientes3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClientes3ActionPerformed

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
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reportes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reportes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClientes3;
    private javax.swing.JButton btnProductos;
    private javax.swing.JButton btnProveedores;
    private javax.swing.JButton btnVentas;
    private javax.swing.JButton btnrEPARTIDOR;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
class FondoPanel extends JPanel{
        private Image imagen;
        
        @Override
        public void paint(Graphics g){
       //     imagen = new ImageIcon(getClass().getResource("/imagenes/rayas_azul.jpg")).getImage();
            
            g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }
}
