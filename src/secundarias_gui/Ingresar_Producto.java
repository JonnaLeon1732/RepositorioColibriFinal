/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secundarias_gui;

import Base.ConexionProducto;
import com.db4o.ObjectContainer;
import java.io.FileNotFoundException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import reportes_gui.Reporte_Productos;

/**
 *
 * @author Productos
 */
public class Ingresar_Producto extends javax.swing.JFrame {

    /**
     * Creates new form Ingresar_Producto
     */
    public static int valor=1;
    public Ingresar_Producto() {
        initComponents();
        setResizable(false);
        setTitle("COLIBRÍ");
        setIconImage(new ImageIcon(getClass().getResource("/iconos/colibri2.png")).getImage());
        CB_proveedor.setModel(new ConexionProducto().Proveedor());
    }

public boolean Validar(){
    if (txtnombreproducto.getText().isEmpty()) {
             lb_OBnombre.setText("*Campo Obligatorio");
             
             if(txtexistencia.getText().isEmpty()){
            lb_OBexistencias.setText("*Campo Obligatorio");
            
            if(txtprecio.getText().isEmpty()){
            lb_OBprecio.setText("*Campo Obligatorio");
            
            if(CB_proveedor.getSelectedIndex()==0){
            lb_OBproveedor.setText("*Campo Obligatorio");
            
            if(cbDescripcion.getSelectedIndex()==0){
            lb_OBdescripcion.setText("*Campo Obligatorio");
            
            
            return false;
            
         }
       }     
      }
     }
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
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        txtnombreproducto = new javax.swing.JTextField();
        txtexistencia = new javax.swing.JTextField();
        CB_proveedor = new javax.swing.JComboBox<>();
        txtprecio = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        lb_OBnombre = new javax.swing.JLabel();
        lb_OBdescripcion = new javax.swing.JLabel();
        lb_OBexistencias = new javax.swing.JLabel();
        lb_OBproveedor = new javax.swing.JLabel();
        lb_OBprecio = new javax.swing.JLabel();
        cbDescripcion = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        lb_OBcedula.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_OBcedula.setForeground(new java.awt.Color(204, 0, 0));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("REGISTRAR PRODUCTOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Descripcion:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Existencia:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("ID_Proveedor");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        jButton1.setText("Cancelar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, -1, -1));

        txtnombreproducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreproductoKeyTyped(evt);
            }
        });
        getContentPane().add(txtnombreproducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 204, -1));

        txtexistencia.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtexistenciaKeyTyped(evt);
            }
        });
        getContentPane().add(txtexistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 204, -1));

        CB_proveedor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<Seleccione>>" }));
        getContentPane().add(CB_proveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 200, -1));

        txtprecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtprecioKeyTyped(evt);
            }
        });
        getContentPane().add(txtprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 200, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Precio");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        lb_OBnombre.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_OBnombre.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lb_OBnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 131, 20));

        lb_OBdescripcion.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_OBdescripcion.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lb_OBdescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 131, 20));

        lb_OBexistencias.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_OBexistencias.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lb_OBexistencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 150, 131, 20));

        lb_OBproveedor.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_OBproveedor.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lb_OBproveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, 131, 20));

        lb_OBprecio.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_OBprecio.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lb_OBprecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 131, 20));

        cbDescripcion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<<Seleccione>>", "Verduras", "Lacteos", "Frutas", "Granos", "Hierbas", "Otros" }));
        getContentPane().add(cbDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 200, -1));

        jLabel5.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://i.pinimg.com/564x/0e/50/e7/0e50e7fae4fce585f56ec48aaa488b99.jpg")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jLabel5.setText("  ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Reporte_Productos prod = new Reporte_Productos();
        prod.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
if (Validar()==true) {
    
        String codigo;
        ConexionProducto conexion=new ConexionProducto();
        ObjectContainer base=conexion.BaseProducto();
        codigo=conexion.Codigo(base);
        conexion.CrearProducto(base,codigo, txtnombreproducto.getText(), (String) cbDescripcion.getSelectedItem(),Integer.parseInt(txtexistencia.getText()),Double.parseDouble(txtprecio.getText()),(String) CB_proveedor.getSelectedItem().toString()); 
        conexion.Cerrarbd(base);
        this.setVisible(false);
        new Reporte_Productos().setVisible(true);
        new Reporte_Productos().tabla();
        
      }else{JOptionPane.showMessageDialog(null, "Debe llenar todos los campos");}  

    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtnombreproductoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreproductoKeyTyped
        char caracter=evt.getKeyChar();
        if ((caracter<'a'| caracter>'z')&(caracter!=32)|(txtnombreproducto.getText().length()>=25)) {
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
        if ((caracter<'0'| caracter>'9')& txtprecio.getText().contains(".")) {
            Validar();
            evt.consume();
       }
    }//GEN-LAST:event_txtprecioKeyTyped

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
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbDescripcion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lb_OBcedula;
    private javax.swing.JLabel lb_OBdescripcion;
    private javax.swing.JLabel lb_OBexistencias;
    private javax.swing.JLabel lb_OBnombre;
    private javax.swing.JLabel lb_OBprecio;
    private javax.swing.JLabel lb_OBproveedor;
    private javax.swing.JTextField txtexistencia;
    private javax.swing.JTextField txtnombreproducto;
    private javax.swing.JTextField txtprecio;
    // End of variables declaration//GEN-END:variables
}
