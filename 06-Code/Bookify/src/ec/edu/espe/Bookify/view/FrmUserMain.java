/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.Bookify.view;

import ec.edu.espe.Bookify.controller.FormsHandler;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE, CODEX++
 */
public class FrmUserMain extends javax.swing.JFrame {

    /**
     * Creates new form FrmUserMain
     */
    public FrmUserMain() {
        initComponents();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Image miIcono = miPantalla.getImage("src/Images/Icon02.png");
        setIconImage(miIcono);
        btnReturn.setOpaque(false);
        btnReturn.setContentAreaFilled(false);
        btnReturn.setBorderPainted(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BookReturn.png"))); // NOI18N
        jButton1.setText("Return Book");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 300, -1));

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Donate.png"))); // NOI18N
        jButton2.setText("Donate");
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, 300, -1));

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RetrunMovie.png"))); // NOI18N
        jButton3.setText("Return Movie");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, -1, -1));

        jButton4.setBackground(new java.awt.Color(255, 102, 102));
        jButton4.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PayFine.png"))); // NOI18N
        jButton4.setText("Pay Fines");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 310, -1));

        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Return.png"))); // NOI18N
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        getContentPane().add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, -1, -1));

        jButton5.setBackground(new java.awt.Color(255, 102, 102));
        jButton5.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BookBorrow (1).png"))); // NOI18N
        jButton5.setText("Borrow Book");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 310, -1));

        jButton6.setBackground(new java.awt.Color(255, 102, 102));
        jButton6.setFont(new java.awt.Font("Bookman Old Style", 1, 24)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/BorrowMovie_1.png"))); // NOI18N
        jButton6.setText("Borrow Movie");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UserMain.gif"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        FormsHandler.goToMainScreen(this);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        FrmBills frmBills = new FrmBills();
        frmBills.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        FrmReturnMovie frmReturnMovie = new FrmReturnMovie();
        frmReturnMovie.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        FrmRentMovie frmRentMovie = new FrmRentMovie();
        frmRentMovie.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmUserMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUserMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUserMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUserMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUserMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
