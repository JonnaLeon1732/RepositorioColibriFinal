/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secundarias_gui;

import clases.Producto;
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import principales_gui.Principal;

/**
 *
 * @author Grupo 2
 */
public class Vendedor1 extends javax.swing.JFrame {

 
    FondoPanel fondo=new FondoPanel();
    public Vendedor1() {
        this.setContentPane(fondo);
        initComponents();
        setResizable(false);
        setTitle("COLIBRÍ");
        setIconImage(new ImageIcon(getClass().getResource("/iconos/colibri2.png")).getImage());
    }

   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel_desCedron = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        Preciocedron = new javax.swing.JLabel();
        cedron = new javax.swing.JSpinner();
        nabo = new javax.swing.JSpinner();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        rabano = new javax.swing.JSpinner();
        cilantro = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(733, 454));
        setPreferredSize(new java.awt.Dimension(695, 540));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("VENDEDOR 1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 11, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Nombre:Guada Muñoz\nEdad: 67 años\nDireccion:La Libertad\nperteneciente a la parroquia \nde Sayausi\nMotivo por el que vende:\nEsta persona desde hace \nalgunos años vive sola por lo\ncual a visto como un sustento\nvender verduras y hortalizas\nque ella mismo puede cosechar\nen un huertito que posee en \nsu domicilio lo cual le \nayuda en su subsistencia.\n");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 64, 240, 390));

        jButton2.setText("Product1");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 89, 100, 70));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Productos Extra");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 27, -1, -1));

        jButton3.setText("Product2");
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 89, 100, 70));

        jButton5.setText("Product4");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 232, 100, 70));

        jButton6.setText("Product5");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 242, 100, 70));

        jLabel_desCedron.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_desCedron.setText("Cedron");
        getContentPane().add(jLabel_desCedron, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 92, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nabo");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 93, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Rabano");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cilantro");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 247, -1, -1));

        jButton8.setText("Agregar");
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 191, -1, -1));

        jButton9.setText("Agregar");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 191, -1, -1));

        jButton10.setText("Agregar");
        getContentPane().add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 350, -1, -1));

        jButton11.setText("Agregar");
        getContentPane().add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 350, -1, -1));

        jButton13.setText("Regresar");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, -1, -1));

        jButton14.setText("Agregar al carrito");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, -1, -1));

        Preciocedron.setForeground(new java.awt.Color(255, 255, 255));
        Preciocedron.setText("0.50 ");
        getContentPane().add(Preciocedron, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 165, -1, -1));

        cedron.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        getContentPane().add(cedron, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 114, -1, -1));
        getContentPane().add(nabo, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 118, -1, -1));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("$0.40 c/u");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 165, -1, -1));

        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("$0.50 porcion");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 318, -1, -1));

        rabano.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        getContentPane().add(rabano, new org.netbeans.lib.awtextra.AbsoluteConstraints(397, 257, -1, -1));

        cilantro.setModel(new javax.swing.SpinnerNumberModel(0, 0, 10, 1));
        getContentPane().add(cilantro, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 267, -1, -1));

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("$0.25 porcion");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 318, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        Vendedores vend = new Vendedores();
        vend.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
      
        
    }//GEN-LAST:event_jButton9ActionPerformed

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
            java.util.logging.Logger.getLogger(Vendedor1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vendedor1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vendedor1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vendedor1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vendedor1().setVisible(true);
            }
        });
    }
    class FondoPanel extends JPanel{
        private Image imagen;
        
        @Override
        public void paint(Graphics g){
            imagen = new ImageIcon(getClass().getResource("/imagenes/fondo_Vend.jpg")).getImage();
            
            g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Preciocedron;
    private javax.swing.JSpinner cedron;
    private javax.swing.JSpinner cilantro;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_desCedron;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JSpinner nabo;
    private javax.swing.JSpinner rabano;
    // End of variables declaration//GEN-END:variables
}
