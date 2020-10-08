/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secundarias_gui;

import Base.Conexion;
import clases.Cliente;
import com.db4o.ObjectContainer;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import principales_gui.Principal;
import reportes_gui.Reporte_Clientes;
import static reportes_gui.Reporte_Clientes.lista;

/**
 *
 * @author Usuario
 */
public class Ingreso_Clientes extends javax.swing.JFrame {

    /**
     * Creates new form Ingreso_Clientes
     */
    public Ingreso_Clientes() {
        initComponents();
        setResizable(false);
        setTitle("COLIBRÍ");
        setIconImage(new ImageIcon(getClass().getResource("/iconos/colibri2.png")).getImage());
        lbid.setText(generarid());
    }

     public String generarid(){
          String id=null;
         int incrementado=1;
       if(id==null){
           
       }else{
           incrementado=Integer.parseInt(id);
           incrementado=incrementado+1;
           
       }
        return "00000"+incrementado;
    }
     public boolean Validar(){
    
        if (  txt_cedula.getText().isEmpty()) {
            lb_OBcedula.setText("*Campo Obligatorio");
            return false;
        } else {
            lb_OBcedula.setText("");
            
        }if(txt_nombre.getText().isEmpty()){
            lb_OBnombre.setText("*Campo Obligatorio");
             return false;
        }else{
            lb_OBnombre.setText("");
            
        } if(txt_apellido.getText().isEmpty()){
            lb_OBapellido.setText("*Campo Obligatorio");
             return false;
        }else {
        lb_OBapellido.setText("");
        
        }if(txt_direccion.getText().isEmpty()){
            lb_OBdireccion.setText("*Campo Obligatorio");
            return false; 
        }else {
        lb_OBdireccion.setText("");
        
        }if(txt_telefono.getText().isEmpty()){
            lb_OBtelefono.setText("*Campo Obligatorio");
           return false;  
        }else {
         lb_OBtelefono.setText("");
        }if(txt_correo.getText().isEmpty()){
            lb_OBcorreo.setText("*Campo Obligatorio");
           return false; 
        }else{
        lb_OBcorreo.setText("");
        }
        return true;
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BTT_cancelar = new javax.swing.JButton();
        btt_registrar = new javax.swing.JButton();
        txt_cedula = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_telefono = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lb_OBcedula = new javax.swing.JLabel();
        lb_OBapellido = new javax.swing.JLabel();
        lb_OBnombre = new javax.swing.JLabel();
        lb_OBdireccion = new javax.swing.JLabel();
        lb_OBtelefono = new javax.swing.JLabel();
        lb_OBcorreo = new javax.swing.JLabel();
        lbid = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DEL CLIENTE");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 165, -1));

        BTT_cancelar.setText("CANCELAR");
        BTT_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTT_cancelarActionPerformed(evt);
            }
        });
        getContentPane().add(BTT_cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, -1, -1));

        btt_registrar.setText("REGISTRAR");
        btt_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btt_registrarActionPerformed(evt);
            }
        });
        getContentPane().add(btt_registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, -1));

        txt_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cedulaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cedulaKeyTyped(evt);
            }
        });
        getContentPane().add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 215, -1));

        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_nombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 215, -1));

        txt_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_apellidoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellidoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 170, 215, -1));

        txt_correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_correoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_correoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 215, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Correo:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        txt_direccion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_direccionKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_direccionKeyTyped(evt);
            }
        });
        getContentPane().add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 215, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Cédula:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 215, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Nombre:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Apellido:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Dirección:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("N° Celular:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, 20));

        lb_OBcedula.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_OBcedula.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lb_OBcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 57, 131, 20));

        lb_OBapellido.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_OBapellido.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lb_OBapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 135, 131, 20));

        lb_OBnombre.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_OBnombre.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lb_OBnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 95, 131, 20));

        lb_OBdireccion.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_OBdireccion.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lb_OBdireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(324, 166, 131, 20));

        lb_OBtelefono.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_OBtelefono.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lb_OBtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 131, 20));

        lb_OBcorreo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        lb_OBcorreo.setForeground(new java.awt.Color(204, 0, 0));
        getContentPane().add(lb_OBcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 131, 20));
        getContentPane().add(lbid, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 70, -1));
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTT_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTT_cancelarActionPerformed
        Carrito c = new Carrito ();
        c.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_BTT_cancelarActionPerformed

    private void btt_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btt_registrarActionPerformed
       
        if(Validar()==true){
            if ( txt_cedula.getText().length()>=10){
             if(txt_telefono.getText().length()>=10 ){
               if (txt_correo.getText().contains("@")& txt_correo.getText().contains(".")) {
                 
                   Factura f=new Factura();
                   f.recibir(txt_cedula.getText(), txt_nombre.getText(), txt_apellido.getText(), txt_direccion.getText(), txt_telefono.getText(), txt_correo.getText());
                   
                   Reporte_Clientes rc=new Reporte_Clientes();
                   rc.recibir(txt_cedula.getText(), txt_nombre.getText(), txt_apellido.getText(), txt_direccion.getText(), txt_telefono.getText(), txt_correo.getText());
                   f.setVisible(true);
                    this.setVisible(false);
                 
               }else{JOptionPane.showMessageDialog(this, "El correo electrónico no es correcto");} 
             }else{JOptionPane.showMessageDialog(this, "El número celular no es correcto");}
            }else{JOptionPane.showMessageDialog(this, "El número de cédula no es correcto");}
            
        }else{
            JOptionPane.showMessageDialog(this, "Debe estar lleno todos los campos");
        }
         Conexion conexion=new Conexion();
        ObjectContainer basep=conexion.BaseCliente();
        conexion.CrearCLiente(basep,lbid.getText(),txt_correo.getText(),txt_cedula.getText(),txt_nombre.getText(),txt_apellido.getText(),txt_direccion.getText(),txt_telefono.getText());
        conexion.Cerrarbd(basep);
       
       
     
    }//GEN-LAST:event_btt_registrarActionPerformed

    private void txt_cedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaKeyReleased

    }//GEN-LAST:event_txt_cedulaKeyReleased

    private void txt_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaKeyTyped
        char caracter=evt.getKeyChar();
        if ((caracter<'0'| caracter>'9')|(txt_cedula.getText().length()==10)) {
            Validar();
            evt.consume();
        }else{
            lb_OBcedula.setText("*Cédula Invalido");
        }
    }//GEN-LAST:event_txt_cedulaKeyTyped

    private void txt_nombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyReleased

    }//GEN-LAST:event_txt_nombreKeyReleased

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        char caracter=evt.getKeyChar();
        if ((caracter<'a'| caracter>'z')&(caracter<'A'| caracter>'Z')&(caracter!=32)|(txt_nombre.getText().length()>=25)) {
            Validar();
            evt.consume();
        }
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_apellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidoKeyReleased

    }//GEN-LAST:event_txt_apellidoKeyReleased

    private void txt_apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidoKeyTyped
        char caracter=evt.getKeyChar();
        if ((caracter<'a'| caracter>'z')&(caracter<'A'| caracter>'Z')&(caracter!=32)|(txt_apellido.getText().length()>=25)) {
            Validar();
            evt.consume();
        }
    }//GEN-LAST:event_txt_apellidoKeyTyped

    private void txt_correoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_correoKeyReleased

        if (txt_correo.getText().contains("@")& txt_correo.getText().contains(".")) {
            Validar();
            evt.consume();
        }else{
            lb_OBcorreo.setText("*Correo Invalido");
        }

    }//GEN-LAST:event_txt_correoKeyReleased

    private void txt_correoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_correoKeyTyped

    }//GEN-LAST:event_txt_correoKeyTyped

    private void txt_direccionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_direccionKeyReleased
        if (txt_direccion.getText().length() >= 50) {
            JOptionPane.showMessageDialog(rootPane, "Limite excedido");
        Validar();
        evt.consume();
        }
        
    }//GEN-LAST:event_txt_direccionKeyReleased

    private void txt_direccionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_direccionKeyTyped

    }//GEN-LAST:event_txt_direccionKeyTyped

    private void txt_telefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyReleased

    }//GEN-LAST:event_txt_telefonoKeyReleased

    private void txt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyTyped
        char caracter=evt.getKeyChar();
        if ((caracter<'0'| caracter>'9')|(txt_telefono.getText().length()>=10)) {
            Validar();
            evt.consume();
        }else{
            lb_OBtelefono.setText("*Teléfono Invalido");
        }
    }//GEN-LAST:event_txt_telefonoKeyTyped

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
            java.util.logging.Logger.getLogger(Ingreso_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso_Clientes().setVisible(true);
            }
        });
        
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTT_cancelar;
    private javax.swing.JButton btt_registrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lb_OBapellido;
    private javax.swing.JLabel lb_OBcedula;
    private javax.swing.JLabel lb_OBcorreo;
    private javax.swing.JLabel lb_OBdireccion;
    private javax.swing.JLabel lb_OBnombre;
    private javax.swing.JLabel lb_OBtelefono;
    private javax.swing.JLabel lbid;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
 public void mostrar(){

        String matris[][]=new String[lista.size()][6];
        for (int i = 0; i < lista.size(); i++) {
            matris[i][0]=lista.get(i).getID();
            matris[i][1]=lista.get(i).getNombre();
            matris[i][2]=lista.get(i).getApellido();
            matris[i][3]=lista.get(i).getDireccion();
            matris[i][4]=lista.get(i).getTelefono();
            matris[i][5]=lista.get(i).getCorreo();
        }
       
 }
}
