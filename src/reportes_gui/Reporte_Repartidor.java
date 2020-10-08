/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportes_gui;

import clases.Repartidor;
import secundarias_gui.*;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import reportes_gui.Reportes;
import Base.Conexion;
import com.db4o.ObjectContainer;
import javax.swing.table.TableModel;

public class Reporte_Repartidor extends javax.swing.JFrame {

    public static final ArrayList<Repartidor> lista=new ArrayList<>();
    
     FondoPanel fondo=new FondoPanel();
    public Reporte_Repartidor() {
        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("COLIBRÍ");
        setIconImage(new ImageIcon(getClass().getResource("/iconos/colibri2.png")).getImage());
    }

    public void recibir(String id,String cedula,String nombre,String apellido,String direccion,String telefono, String placa){
        
        Repartidor repartidor = new Repartidor();
        
        repartidor.setID(id);
        repartidor.setCedula_repartidor(cedula);
        repartidor.setNombre(nombre);
        repartidor.setApellido(apellido);
        repartidor.setDireccion(direccion);
        repartidor.setTelefono(telefono);
        repartidor.setNum_placa_moto(placa);
        lista.add(repartidor);
        mostrar();
    }
    
    
    public void mostrar(){

        String matris[][]=new String[lista.size()][7];
        for (int i = 0; i < lista.size(); i++) {
            matris[i][0]=lista.get(i).getID();
            matris[i][1]=lista.get(i).getCedula_repartidor();
            matris[i][2]=lista.get(i).getNombre();
            matris[i][3]=lista.get(i).getApellido();
            matris[i][4]=lista.get(i).getDireccion();
            matris[i][5]=lista.get(i).getTelefono();
            matris[i][6]=lista.get(i).getNum_placa_moto();
        }
        tablapro.setModel(new javax.swing.table.DefaultTableModel(
            matris,
            new String [] {
                 "ID","Cedula", "Nombre", "Apellido", "Dirección", "Telefono", "N° Placa"
            }
        ));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablapro = new javax.swing.JTable();
        atras = new javax.swing.JButton();
        btt_consultar = new javax.swing.JButton();
        btt_crear = new javax.swing.JButton();
        btt_modificar = new javax.swing.JButton();
        btt_eliminar = new javax.swing.JButton();
        txt_consul_identificacion = new javax.swing.JTextField();
        btt_limpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("REPORTE DE REPARTIDOR");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(295, 11, -1, -1));

        tablapro.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Cédula", "Nombre", "Apellido", "Dirección", "Telefono", "N° Placa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablapro);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 719, 242));

        atras.setText("ATRAS");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }
        });
        getContentPane().add(atras, new org.netbeans.lib.awtextra.AbsoluteConstraints(338, 368, -1, -1));

        btt_consultar.setText("CONSULTAR");
        getContentPane().add(btt_consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 48, -1, -1));

        btt_crear.setText("CREAR");
        btt_crear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_crearActionPerformed(evt);
            }
        });
        getContentPane().add(btt_crear, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 43, -1, -1));

        btt_modificar.setText("MODIFICAR");
        btt_modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_modificarActionPerformed(evt);
            }
        });
        getContentPane().add(btt_modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(474, 43, -1, -1));

        btt_eliminar.setText("ELIMINAR");
        btt_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_eliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btt_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(583, 43, -1, -1));
        getContentPane().add(txt_consul_identificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 43, 183, 28));

        btt_limpiar.setText("LIMPIAR");
        btt_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_limpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btt_limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 82, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasActionPerformed
        Reportes reportes = new Reportes();
        reportes.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_atrasActionPerformed

    private void btt_crearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_crearActionPerformed
        Ingresar_Repartidor ingRepa = new Ingresar_Repartidor();
        ingRepa.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btt_crearActionPerformed

    private void btt_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_eliminarActionPerformed
        int FilaSelec = tablapro.getSelectedRowCount();
        if (FilaSelec >= 0) {
            tablapro.remove(FilaSelec);
            lista.remove(FilaSelec);
            
        } else {
            JOptionPane.showMessageDialog(this, "FILA NO SELECIONADA");
            
        }
      
    }//GEN-LAST:event_btt_eliminarActionPerformed

    private void btt_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_limpiarActionPerformed
        txt_consul_identificacion.setText("");
    }//GEN-LAST:event_btt_limpiarActionPerformed

    private void btt_modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_modificarActionPerformed
        // TODO add your handling code here:
        Conexion conexion=new Conexion();
        ObjectContainer basep=conexion.BaseCliente();
        Repartidor cliente=new Repartidor();
        conexion.ModificarRepartidor(basep, null, cliente.getCedula_repartidor(), null, null, null, null, null);
        conexion.Cerrarbd(basep);
        tablapro.setModel((TableModel) conexion.BaseRepartidor());
    }//GEN-LAST:event_btt_modificarActionPerformed

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
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
    private javax.swing.JTable tablapro;
    private javax.swing.JTextField txt_consul_identificacion;
    // End of variables declaration//GEN-END:variables
class FondoPanel extends JPanel{
        private Image imagen;
        
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/imagenes/fondo4.jpg")).getImage();
            
            g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }

}
