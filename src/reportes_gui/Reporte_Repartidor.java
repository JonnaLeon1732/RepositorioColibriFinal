/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reportes_gui;

import Base.ConexionRepartidor;
import clases.Envio;
import secundarias_gui.Ingresar_Repartidor;
import clases.Repartidor;
import com.db4o.ObjectContainer;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import secundarias_gui.Envios;

/**
 *
 * @author Usuario
 */
public class Reporte_Repartidor extends javax.swing.JFrame {

    FondoPanel fondo = new FondoPanel();
    public Reporte_Repartidor() {
        this.setContentPane(fondo);
        initComponents();
        ConexionRepartidor conexion = new ConexionRepartidor();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("REPORTE REPARTIDOR");
        setIconImage(new ImageIcon(getClass().getResource("/iconos/colibri2.png")).getImage());
        tablarepartidor.setModel(conexion.Repartidor());
       
    }
    
    
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btt_crear = new javax.swing.JButton();
        btt_modificar = new javax.swing.JButton();
        btt_eliminar = new javax.swing.JButton();
        txt_consul_identificacion = new javax.swing.JTextField();
        btt_limpiar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablarepartidor = new javax.swing.JTable();
        atras = new javax.swing.JButton();
        btt_consultar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        btt_crear.setText("CREAR");
        btt_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_crearActionPerformed(evt);
            }
        });

        btt_modificar.setText("MODIFICAR");
        btt_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_modificarActionPerformed(evt);
            }
        });

        btt_eliminar.setText("ELIMINAR");
        btt_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_eliminarActionPerformed(evt);
            }
        });

        btt_limpiar.setText("LIMPIAR");
        btt_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_limpiarActionPerformed(evt);
            }
        });

        jLabel1.setText("REPORTE DE REPARTIDORES");

        tablarepartidor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane1.setViewportView(tablarepartidor);

        atras.setText("ATRAS");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });

        btt_consultar.setText("CONSULTAR");
        btt_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_consultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(265, 265, 265)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(btt_consultar)
                                .addGap(29, 29, 29)
                                .addComponent(txt_consul_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(btt_crear)
                                .addGap(18, 18, 18)
                                .addComponent(btt_modificar)
                                .addGap(18, 18, 18)
                                .addComponent(btt_eliminar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(170, 170, 170)
                                .addComponent(btt_limpiar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(308, 308, 308)
                                .addComponent(atras)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btt_consultar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_consul_identificacion)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btt_crear)
                                .addComponent(btt_modificar)
                                .addComponent(btt_eliminar)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btt_limpiar)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(atras)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btt_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_crearActionPerformed
        Ingresar_Repartidor ingRep = new Ingresar_Repartidor();
        ingRep.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btt_crearActionPerformed

    private void btt_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_modificarActionPerformed

    }//GEN-LAST:event_btt_modificarActionPerformed

    private void btt_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_eliminarActionPerformed
        ConexionRepartidor conex = new ConexionRepartidor();
        ObjectContainer base = conex.BaseRepartidor();
        Repartidor prov = new Repartidor();
        conex.EliminarRepartidor(base, prov.getCedula());
        conex.Cerrarbd(base);
        tabla();
    }//GEN-LAST:event_btt_eliminarActionPerformed

    private void btt_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_limpiarActionPerformed
        txt_consul_identificacion.setText("");
    }//GEN-LAST:event_btt_limpiarActionPerformed

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        Reportes reportes = new Reportes();
        reportes.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_atrasActionPerformed

    private void btt_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_consultarActionPerformed
        // TODO add your handling code here:
        ConexionRepartidor conexion = new ConexionRepartidor();
        ObjectContainer basep = conexion.BaseRepartidor();
        Repartidor repar = new Repartidor();
        conexion.ConsultarRepartidor(basep, repar.getCedula());
        conexion.Cerrarbd(basep);
        tablarepartidor.setModel(conexion.Repartidor());
    }//GEN-LAST:event_btt_consultarActionPerformed

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
            java.util.logging.Logger.getLogger(Reporte_Repartidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reporte_Repartidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reporte_Repartidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reporte_Repartidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reporte_Repartidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atras;
    private javax.swing.JButton btt_consultar;
    private javax.swing.JButton btt_crear;
    private javax.swing.JButton btt_eliminar;
    private javax.swing.JButton btt_limpiar;
    private javax.swing.JButton btt_modificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablarepartidor;
    private javax.swing.JTextField txt_consul_identificacion;
    // End of variables declaration//GEN-END:variables
public void tabla() {
        tablarepartidor.setModel(new ConexionRepartidor().Repartidor());
    }


    class FondoPanel extends JPanel {

        private Image imagen;

        @Override
        public void paint(Graphics g) {
            imagen = new ImageIcon(getClass().getResource("/imagenes/fondo4.jpg")).getImage();

            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);

            setOpaque(false);

            super.paint(g);
        }
    }
}
