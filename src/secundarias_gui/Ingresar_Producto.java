/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secundarias_gui;

import javax.swing.ImageIcon;
import reportes_gui.Reporte_Productos;

/**
 *
 * @author Usuario
 */
public class Ingresar_Producto extends javax.swing.JFrame {

    /**
     * Creates new form Ingresar_Producto
     */
    public Ingresar_Producto() {
        initComponents();
        setResizable(false);
        setTitle("COLIBRÍ");
        setIconImage(new ImageIcon(getClass().getResource("/iconos/colibri2.png")).getImage());
    }

    public boolean Validar(){
    
        if (  txtnombreproducto.getText().isEmpty()) {
            txtnombreproducto.setText("*Campo Obligatorio");
            return false;
        } else {
            txtnombreproducto.setText("");
            
        }if(txtdescripcion.getText().isEmpty()){
            txtdescripcion.setText("*Campo Obligatorio");
             return false;
        }else{
            txtdescripcion.setText("");
            
        } if(txtexistencia.getText().isEmpty()){
            txtexistencia.setText("*Campo Obligatorio");
             return false;
        }else {
        txtexistencia.setText("");
        
        }
        return true;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb_OBcedula = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtcodigo = new javax.swing.JTextField();
        txtnombreproducto = new javax.swing.JTextField();
        txtdescripcion = new javax.swing.JTextField();
        txtexistencia = new javax.swing.JTextField();
        CB_proveedor = new javax.swing.JComboBox<>();
        txtprecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lb_OBcedula1 = new javax.swing.JLabel();
        lb_OBcedula2 = new javax.swing.JLabel();
        lb_OBcedula3 = new javax.swing.JLabel();
        lb_OBcedula5 = new javax.swing.JLabel();
        lb_OBcedula4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        lb_OBcedula.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_OBcedula.setForeground(new java.awt.Color(204, 0, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("REGISTRAR PRODUCTOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 11, -1, -1));

        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 96, -1, -1));

        jLabel3.setText("Descripcion:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 142, -1, -1));

        jLabel4.setText("Existencia:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 231, -1, -1));

        jLabel5.setText("Codigo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 58, -1, -1));

        jLabel6.setText("ID_Proveedor");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 304, -1, -1));

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(72, 339, -1, -1));

        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 339, -1, -1));
        getContentPane().add(txtcodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 55, 204, -1));

        txtnombreproducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreproductoKeyTyped(evt);
            }
        });
        getContentPane().add(txtnombreproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 93, 204, -1));

        txtdescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdescripcionKeyTyped(evt);
            }
        });
        getContentPane().add(txtdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 139, 204, 69));

        txtexistencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtexistenciaKeyTyped(evt);
            }
        });
        getContentPane().add(txtexistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 228, 204, -1));

        CB_proveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        getContentPane().add(CB_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 300, 200, -1));

        txtprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprecioKeyTyped(evt);
            }
        });
        getContentPane().add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(119, 266, 200, -1));

        jLabel7.setText("Precio");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 266, -1, -1));

        lb_OBcedula1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_OBcedula1.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lb_OBcedula1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 131, 20));

        lb_OBcedula2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_OBcedula2.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lb_OBcedula2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 131, 20));

        lb_OBcedula3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_OBcedula3.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lb_OBcedula3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 131, 20));

        lb_OBcedula5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_OBcedula5.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lb_OBcedula5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 300, 131, 20));

        lb_OBcedula4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_OBcedula4.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lb_OBcedula4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, 131, 20));

        jLabel8.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://i.pinimg.com/564x/e4/32/22/e4322203782673d57e8af7d44718daa8.jpg")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, -10, 600, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Reporte_Productos prod = new Reporte_Productos();
        prod.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Reporte_Productos producto=new Reporte_Productos();
        producto.recibir(txtcodigo.getText(),txtnombreproducto.getText(),txtdescripcion.getText(),txtexistencia.getText(),txtprecio.getText(),CB_proveedor.getSelectedItem().toString());
        producto.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtnombreproductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreproductoKeyTyped
        char caracter=evt.getKeyChar();
        if ((caracter<'a'| caracter>'z')&(caracter<'A'| caracter>'Z')&(caracter!=32)|(txtnombreproducto.getText().length()>=25)) {
            Validar();
            evt.consume();
        }
    }//GEN-LAST:event_txtnombreproductoKeyTyped

    private void txtexistenciaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtexistenciaKeyTyped
       char caracter=evt.getKeyChar();
        if ((caracter<'0'| caracter>'9')) {
            Validar();
            evt.consume();
        }
    }//GEN-LAST:event_txtexistenciaKeyTyped

    private void txtprecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtprecioKeyTyped
        char caracter=evt.getKeyChar();
        if ((caracter<'0'| caracter>'9')) {
            Validar();
            evt.consume();
        }
    }//GEN-LAST:event_txtprecioKeyTyped

    private void txtdescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdescripcionKeyTyped
        char caracter=evt.getKeyChar();
        if ((caracter<'a'| caracter>'z')&(caracter<'A'| caracter>'Z')&(caracter!=32)) {
            Validar();
            evt.consume();
        }
    }//GEN-LAST:event_txtdescripcionKeyTyped

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
            java.util.logging.Logger.getLogger(Ingresar_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Producto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresar_Producto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CB_proveedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lb_OBcedula;
    private javax.swing.JLabel lb_OBcedula1;
    private javax.swing.JLabel lb_OBcedula2;
    private javax.swing.JLabel lb_OBcedula3;
    private javax.swing.JLabel lb_OBcedula4;
    private javax.swing.JLabel lb_OBcedula5;
    private javax.swing.JTextField txtcodigo;
    private javax.swing.JTextField txtdescripcion;
    private javax.swing.JTextField txtexistencia;
    private javax.swing.JTextField txtnombreproducto;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
