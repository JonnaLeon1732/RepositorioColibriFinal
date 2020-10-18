/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secundarias_gui;

import Base.ConexionProducto;
import com.db4o.ObjectContainer;
import javax.swing.ImageIcon;
import reportes_gui.Reporte_Productos;

/**
 *
 * @author Productos
 */
public class DatosProducto extends javax.swing.JFrame {

    /**
     * Creates new form Ingresar_Producto
     */
    public static int valor=1;
    public DatosProducto() {
        initComponents();
        setResizable(false);
        setTitle("COLIBRÍ");
        setIconImage(new ImageIcon(getClass().getResource("/iconos/colibri2.png")).getImage());
        
    }


    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_OBcedula = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btncerrar = new javax.swing.JButton();
        txtnombre = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();
        txtid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lb_OBcedula1 = new javax.swing.JLabel();
        lb_OBcedula2 = new javax.swing.JLabel();
        lb_OBcedula3 = new javax.swing.JLabel();
        lb_OBcedula5 = new javax.swing.JLabel();
        lb_OBcedula4 = new javax.swing.JLabel();
        txtprecio = new javax.swing.JTextField();
        txtexistencia = new javax.swing.JTextField();

        lb_OBcedula.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_OBcedula.setForeground(new java.awt.Color(204, 0, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("DATOS  PRODUCTOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 96, -1, -1));

        jLabel3.setText("Descripcion:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 142, -1, -1));

        jLabel4.setText("Existencia:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel6.setText("ID_Proveedor");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        btncerrar.setText("Cerrar");
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });
        getContentPane().add(btncerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, -1, -1));

        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 93, 204, -1));

        txtdescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdescripcionKeyTyped(evt);
            }
        });
        getContentPane().add(txtdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 140, 200, -1));

        txtid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidKeyTyped(evt);
            }
        });
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 200, -1));

        jLabel7.setText("Precio");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        lb_OBcedula1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_OBcedula1.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lb_OBcedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 131, 20));

        lb_OBcedula2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_OBcedula2.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lb_OBcedula2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 131, 20));

        lb_OBcedula3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_OBcedula3.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lb_OBcedula3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 131, 20));

        lb_OBcedula5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_OBcedula5.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lb_OBcedula5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 131, 20));

        lb_OBcedula4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_OBcedula4.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lb_OBcedula4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 131, 20));

        txtprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprecioKeyTyped(evt);
            }
        });
        getContentPane().add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 200, -1));

        txtexistencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtexistenciaKeyTyped(evt);
            }
        });
        getContentPane().add(txtexistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 200, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed

        this.setVisible(false);
    }//GEN-LAST:event_btncerrarActionPerformed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        char caracter=evt.getKeyChar();
        if ((caracter<'a'| caracter>'z')&(caracter<'A'| caracter>'Z')&(caracter!=32)|(txtnombre.getText().length()>=25)) {
//            Validar();
            evt.consume();
        }
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtdescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescripcionKeyTyped
       char caracter=evt.getKeyChar();
        if ((caracter<'0'| caracter>'9')) {
//            Validar();
            evt.consume();
        }
    }//GEN-LAST:event_txtdescripcionKeyTyped
    
    private void txtidKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidKeyTyped
//        char caracter=evt.getKeyChar();
//        if ((caracter<'0'| caracter>'9')) {
//            Validar();
//            evt.consume();
//        }
    }//GEN-LAST:event_txtidKeyTyped

    private void txtprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecioKeyTyped

    private void txtexistenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtexistenciaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtexistenciaKeyTyped

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
            java.util.logging.Logger.getLogger(DatosProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DatosProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DatosProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DatosProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DatosProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncerrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lb_OBcedula;
    private javax.swing.JLabel lb_OBcedula1;
    private javax.swing.JLabel lb_OBcedula2;
    private javax.swing.JLabel lb_OBcedula3;
    private javax.swing.JLabel lb_OBcedula4;
    private javax.swing.JLabel lb_OBcedula5;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtexistencia;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables

    public void Recibir(String nombre, String des, String existencia, String precio, String id) {
        
        txtnombre.setText(nombre);
        txtdescripcion.setText(des);
        txtexistencia.setText(existencia);
        txtprecio.setText(precio);
        txtid.setText(id);
        
    }
}
