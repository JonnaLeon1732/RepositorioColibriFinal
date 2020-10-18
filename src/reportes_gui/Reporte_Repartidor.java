/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportes_gui;

import Base.ConexionRepartidor;
import secundarias_gui.Ingresar_Repartidor;
import clases.Repartidor;
import com.db4o.ObjectContainer;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import secundarias_gui.DatosRepartidor;
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
    
    public String Repartidor(String codigo, String accion) {
        ConexionRepartidor conexion = new ConexionRepartidor();
        String valor = "";
        tablarepartidor.setModel(conexion.Repartidor());
        for (int i = 0; i < tablarepartidor.getRowCount(); i++) {
            if (tablarepartidor.getValueAt(i, 0).equals(codigo)) {
                tablarepartidor.changeSelection(i, 0, false, false);
            }
        }
        switch (accion) {
            case "cedula":
                valor = tablarepartidor.getValueAt(tablarepartidor.getSelectedRow(), 0).toString();
                break;
            case "nombre":
                valor = tablarepartidor.getValueAt(tablarepartidor.getSelectedRow(), 1).toString();
                break;
            case "apellido":
                valor = tablarepartidor.getValueAt(tablarepartidor.getSelectedRow(), 2).toString();
                break;
            case "telefono":
                valor = tablarepartidor.getValueAt(tablarepartidor.getSelectedRow(), 3).toString();
                break;
            case "direccion":
                valor = tablarepartidor.getValueAt(tablarepartidor.getSelectedRow(), 4).toString();
                break;
            case "placa":
                valor = tablarepartidor.getValueAt(tablarepartidor.getSelectedRow(), 5).toString();
                break;
        }
        return valor;
    }

    public void ReporteAleatorio(int posicion) {
        Envios enviar=new Envios();
        enviar.setVisible(true);
        enviar.Recibir(tablarepartidor.getValueAt(posicion, 1).toString(), tablarepartidor.getValueAt(posicion, 5).toString());
    }
    
    private void enviar(String codigo) {
        ConexionRepartidor conexion = new ConexionRepartidor();
        tablarepartidor.setModel(conexion.Repartidor());
        for (int i = 0; i < tablarepartidor.getRowCount(); i++) {
            if (tablarepartidor.getValueAt(i, 0).equals(codigo)) {
                tablarepartidor.changeSelection(i, 0, false, false);
                DatosRepartidor datos = new DatosRepartidor();
                datos.Recibir(tablarepartidor.getValueAt(tablarepartidor.getSelectedRow(), 0).toString(),
                        tablarepartidor.getValueAt(tablarepartidor.getSelectedRow(), 1).toString(),
                        tablarepartidor.getValueAt(tablarepartidor.getSelectedRow(), 2).toString(),
                        tablarepartidor.getValueAt(tablarepartidor.getSelectedRow(), 3).toString(),
                        tablarepartidor.getValueAt(tablarepartidor.getSelectedRow(), 4).toString(),
                        tablarepartidor.getValueAt(tablarepartidor.getSelectedRow(), 5).toString());
                datos.setVisible(true);
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btt_crear = new javax.swing.JButton();
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 719, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(286, 286, 286)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(191, 191, 191)
                                .addComponent(btt_limpiar))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(329, 329, 329)
                                .addComponent(atras))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(btt_consultar)
                                .addGap(29, 29, 29)
                                .addComponent(txt_consul_identificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(btt_crear)
                                .addGap(84, 84, 84)
                                .addComponent(btt_eliminar)))
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

    private void btt_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_eliminarActionPerformed
        ConexionRepartidor conex = new ConexionRepartidor();
        Repartidor prod = new Repartidor();
        ObjectContainer base = conex.BaseRepartidor();
        String codigo=tablarepartidor.getValueAt(tablarepartidor.getSelectedRow(), 0).toString();
        conex.Eliminarrepartidor(base,codigo);
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
        ConexionRepartidor conexion = new ConexionRepartidor();
        Reporte_Repartidor cliente = new Reporte_Repartidor();
        ObjectContainer base = conexion.BaseRepartidor();
        boolean confirmar = conexion.ConsultarRepartidor(base, txt_consul_identificacion.getText());
        conexion.Cerrarbd(base);
        if (confirmar == true) {
            enviar(txt_consul_identificacion.getText());
        } else {
            JOptionPane.showMessageDialog(null, "El producto no se encuentra registrado");
        }
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
