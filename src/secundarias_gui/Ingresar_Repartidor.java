/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secundarias_gui;

import javax.swing.JOptionPane;
import reportes_gui.Reporte_Repartidor;

/**
 *
 * @author Usuario
 */
public class Ingresar_Repartidor extends javax.swing.JFrame {

    /**
     * Creates new form Ingresar_Repartidor
     */
    public Ingresar_Repartidor() {
        initComponents();
    }

    
    public boolean Validar(){
    
        if (  txtcedula.getText().isEmpty()) {
            lb_OBcedula.setText("*Campo Obligatorio");
            return false;
        } else {
            lb_OBcedula.setText("");
            
        }if(txtnombre.getText().isEmpty()){
            lb_OBnombre.setText("*Campo Obligatorio");
             return false;
        }else{
            lb_OBnombre.setText("");
            
        } if(txtapellido.getText().isEmpty()){
            lb_OBapellido.setText("*Campo Obligatorio");
             return false;
        }else {
        lb_OBapellido.setText("");
        
        }if(txtdireccion.getText().isEmpty()){
            lb_OBdireccion.setText("*Campo Obligatorio");
            return false; 
        }else {
        lb_OBdireccion.setText("");
        
        }if(txttelefono.getText().isEmpty()){
            lb_OBtelefono.setText("*Campo Obligatorio");
           return false;  
        }else {
         lb_OBtelefono.setText("");
        }if(txtplaca.getText().isEmpty()){
            lb_OBplaca.setText("*Campo Obligatorio");
           return false;  
        }else {
         lb_OBplaca.setText("");
        }
        return true;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtcedula = new javax.swing.JTextField();
        txtnombre = new javax.swing.JTextField();
        txtapellido = new javax.swing.JTextField();
        txtdireccion = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        lb_OBcedula = new javax.swing.JLabel();
        lb_OBnombre = new javax.swing.JLabel();
        lb_OBapellido = new javax.swing.JLabel();
        lb_OBdireccion = new javax.swing.JLabel();
        lb_OBtelefono = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtplaca = new javax.swing.JTextField();
        lb_OBplaca = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        btnregistrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("REGISTRO REPARTIDOR");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 200, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("ID");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Cédula:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Apellido:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Dirección:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Teléfono:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 60, 193, -1));

        txtcedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcedulaActionPerformed(evt);
            }
        });
        txtcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcedulaKeyTyped(evt);
            }
        });
        getContentPane().add(txtcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 193, -1));

        txtnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreActionPerformed(evt);
            }
        });
        txtnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombreKeyTyped(evt);
            }
        });
        getContentPane().add(txtnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 193, -1));

        txtapellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidoActionPerformed(evt);
            }
        });
        txtapellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidoKeyTyped(evt);
            }
        });
        getContentPane().add(txtapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 193, -1));

        txtdireccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtdireccionKeyTyped(evt);
            }
        });
        getContentPane().add(txtdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, 193, -1));

        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });
        getContentPane().add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 193, -1));

        lb_OBcedula.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_OBcedula.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lb_OBcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 90, 131, 20));

        lb_OBnombre.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_OBnombre.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lb_OBnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 131, 20));

        lb_OBapellido.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_OBapellido.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lb_OBapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 131, 20));

        lb_OBdireccion.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_OBdireccion.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lb_OBdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 131, 20));

        lb_OBtelefono.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_OBtelefono.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lb_OBtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 210, 131, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setText("N° Placa:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, -1, -1));

        txtplaca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtplacaKeyTyped(evt);
            }
        });
        getContentPane().add(txtplaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 193, -1));

        lb_OBplaca.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_OBplaca.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lb_OBplaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 131, 20));

        jButton1.setText("CANCELAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, -1));

        btnregistrar.setText("REGISTRAR");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("G:\\PROYECTO FINAL\\imagenes para la interfaz\\fondo_brocoli.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 530, 370));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcedulaActionPerformed

    private void txtcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcedulaKeyTyped
        char caracter=evt.getKeyChar();
        if ((caracter<'0'| caracter>'9')|(txtcedula.getText().length()==10)) {
            Validar();
            evt.consume();
        }else{
            lb_OBcedula.setText("*Cédula Invalido");
        }
    }//GEN-LAST:event_txtcedulaKeyTyped

    private void txtnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreActionPerformed

    private void txtnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreKeyTyped
        char caracter=evt.getKeyChar();
        if ((caracter<'a'| caracter>'z')&(caracter<'A'| caracter>'Z')&(caracter!=32)|(txtnombre.getText().length()>=25)) {
            Validar();
            evt.consume();
        }
    }//GEN-LAST:event_txtnombreKeyTyped

    private void txtapellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtapellidoActionPerformed

    private void txtapellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidoKeyTyped
        char caracter=evt.getKeyChar();
        if ((caracter<'a'| caracter>'z')&(caracter<'A'| caracter>'Z')&(caracter!=32)|(txtapellido.getText().length()>=25)) {
            Validar();
            evt.consume();
        }
    }//GEN-LAST:event_txtapellidoKeyTyped

    private void txtdireccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtdireccionKeyTyped
        if (txtdireccion.getText().length() >= 50) {

            JOptionPane.showMessageDialog(rootPane, "Limite excedido");
            Validar();

            evt.consume();
        }
    }//GEN-LAST:event_txtdireccionKeyTyped

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
        char caracter=evt.getKeyChar();
        if ((caracter<'0'| caracter>'9')|(txttelefono.getText().length()>=10)) {
            Validar();
            evt.consume();
        }else{
            lb_OBtelefono.setText("*Teléfono Invalido");
        }
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void txtplacaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtplacaKeyTyped
        char caracter=evt.getKeyChar();
        if ((caracter<'A'| caracter>'Z')& (caracter<'0'| caracter>'9')&(caracter==32)|(txtplaca.getText().length()>=9)) {
            Validar();
            evt.consume();
        }
    }//GEN-LAST:event_txtplacaKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Reporte_Repartidor reporte = new Reporte_Repartidor();
        reporte.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed

        if(Validar()==true){
            if ( txtcedula.getText().length()>=10){
                if(txttelefono.getText().length()>=10 | (txttelefono.getText().length()>=9)){

                    Reporte_Repartidor reporte=new Reporte_Repartidor();
                    reporte.recibir(txtid.getText(),txtcedula.getText(),txtnombre.getText(),txtapellido.getText(),txtdireccion.getText(),txttelefono.getText(),txtplaca.getText());
                    reporte.setVisible(true);
                    this.setVisible(false);

                }else{JOptionPane.showMessageDialog(this, "El número telefonico no es correcto");}
            }else{JOptionPane.showMessageDialog(this, "El número de cédula no es correcto");}

        }else{
            JOptionPane.showMessageDialog(this, "Debe estar lleno todos los campos");
        }

    }//GEN-LAST:event_btnregistrarActionPerformed

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
            java.util.logging.Logger.getLogger(Ingresar_Repartidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Repartidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Repartidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Repartidor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresar_Repartidor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnregistrar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lb_OBapellido;
    private javax.swing.JLabel lb_OBcedula;
    private javax.swing.JLabel lb_OBdireccion;
    private javax.swing.JLabel lb_OBnombre;
    private javax.swing.JLabel lb_OBplaca;
    private javax.swing.JLabel lb_OBtelefono;
    private javax.swing.JTextField txtapellido;
    private javax.swing.JTextField txtcedula;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtnombre;
    private javax.swing.JTextField txtplaca;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
