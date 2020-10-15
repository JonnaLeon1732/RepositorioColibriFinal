/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secundarias_gui;

import Base.ConexionCliente;
import Base.ConexionRepartidor;
import clases.Carro;
import clases.Envio;
import clases.Repartidor;
import com.db4o.ObjectContainer;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import reportes_gui.Reporte_Repartidor;


/**
 *
 * @author Grupo 2
 */
public class Envios extends javax.swing.JFrame {

    /**
     * Creates new form Envios
     */
    public Envios() {
        initComponents();
        setResizable(false);
        setTitle("REPARTIDOR ASIGNADO");
        setIconImage(new ImageIcon(getClass().getResource("/iconos/colibri2.png")).getImage());
        
    }
    
    public static ArrayList<Envio> lista = new ArrayList<>();
    
    public void recibe(String cedula, String direccion, String nombre, String placa){
    
        Envio en=new Envio();
        en.setDireccion_cli(direccion);
        en.setCedula_repartidor(cedula);
        en.setNombre_rep(nombre);
        en.setNum_placa_moto(placa);
        lista.add(en);
        mostrar();
    }
      public void mostrar() {
        String matris[][] = new String[lista.size()][4];
        for (int i = 0; i < lista.size(); i++) {
            matris[i][0] = lista.get(i).getCedula_repartidor();
            matris[i][1] = lista.get(i).getDireccion_cli();
            matris[i][2] = lista.get(i).getNombre_rep();
            matris[i][3] = lista.get(i).getNum_placa_moto();
           
            direccion_cli.setText(matris[i][1]);
            nom_repartidor.setText(matris[i][2]);
            num_placa.setText(matris[i][3]);
        }
        

    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        direccion_cli = new javax.swing.JTextField();
        num_placa = new javax.swing.JTextField();
        nom_repartidor = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("REFERENCIA DE ENTREGA");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 196, -1));

        jLabel1.setText("Nombre del repartidor:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel3.setText("Direccion Cliente:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, -1, -1));

        jLabel4.setText("N° Placa:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, -1, -1));

        direccion_cli.setEditable(false);
        getContentPane().add(direccion_cli, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 113, -1));

        num_placa.setEditable(false);
        getContentPane().add(num_placa, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 113, -1));

        nom_repartidor.setEditable(false);
        getContentPane().add(nom_repartidor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, 113, -1));

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 50, 20));

        jLabel6.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://i.pinimg.com/564x/59/82/a4/5982a4f98c2e7db9632dfa58257f402e.jpg")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 350, 200));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Envios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Envios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Envios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Envios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Envios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField direccion_cli;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nom_repartidor;
    private javax.swing.JTextField num_placa;
    // End of variables declaration//GEN-END:variables
}
