/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.Bookify.view;

import ec.edu.espe.Bookify.controller.InputValidation;
import ec.edu.espe.Bookify.controller.MongoDBManager;
import ec.edu.espe.Bookify.model.User;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class FrmUser1 extends javax.swing.JFrame {

    /**
     * Creates new form FrmUser1
     */
    
    InputValidation input;
    User user;
            
    public FrmUser1() {
        initComponents();
        input= new InputValidation();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Image miIcono = miPantalla.getImage("src/Images/Icon02.png");
        setIconImage(miIcono);
        
        
        
        
        
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        TFuserId = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        TFuserName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        TFemail = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        TFphone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        TFAddres = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TFage = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        TFpassword = new javax.swing.JTextField();
        btnAddUser = new javax.swing.JButton();
        cmbxEmails = new javax.swing.JComboBox<>();
        jToggleButton1 = new javax.swing.JToggleButton();
        lblErrorName = new javax.swing.JLabel();
        lblErrorId = new javax.swing.JLabel();
        lblErrorPhone = new javax.swing.JLabel();
        lblErrorAddres = new javax.swing.JLabel();
        lblErrorPassword = new javax.swing.JLabel();
        lblErrorAge = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        jInternalFrame1.setVisible(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UserIdWhitelbl (1).png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 60, 30));

        TFuserId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFuserIdKeyPressed(evt);
            }
        });
        jPanel1.add(TFuserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 190, -1));

        jLabel1.setFont(new java.awt.Font("Wide Latin", 0, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Publicación gráfica cuadrada 800x800 px (2).png"))); // NOI18N
        jLabel1.setText("New User");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 180, 70));

        TFuserName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFuserNameKeyPressed(evt);
            }
        });
        jPanel1.add(TFuserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 316, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UserNameWhitelbl (1).png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 80, 80, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UserEmailWhitelbl (1).png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 80, 30));
        jPanel1.add(TFemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 190, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UserPhoneWhite (1).png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 70, 30));

        TFphone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFphoneKeyPressed(evt);
            }
        });
        jPanel1.add(TFphone, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 190, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UserAddressWhitelbl (1).png"))); // NOI18N
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 90, 40));

        TFAddres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFAddresKeyPressed(evt);
            }
        });
        jPanel1.add(TFAddres, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 190, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UserAgeWhitelbl (1).png"))); // NOI18N
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, 60, 30));

        TFage.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFageKeyPressed(evt);
            }
        });
        jPanel1.add(TFage, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 190, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/UserPasswordWhitelbl (1).png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 100, 30));

        TFpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TFpasswordKeyPressed(evt);
            }
        });
        jPanel1.add(TFpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 320, 190, -1));

        btnAddUser.setText("Add User");
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, 20));

        cmbxEmails.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "@gmail.com", "@yahoo.com", "@hotmail.com", "@outlook.com" }));
        cmbxEmails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbxEmailsActionPerformed(evt);
            }
        });
        jPanel1.add(cmbxEmails, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 160, 108, -1));

        jToggleButton1.setText("Return");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 380, -1, -1));

        lblErrorName.setText("_");
        jPanel1.add(lblErrorName, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 80, -1, -1));

        lblErrorId.setText("_");
        jPanel1.add(lblErrorId, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        lblErrorPhone.setText("_");
        jPanel1.add(lblErrorPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 187, -1, -1));

        lblErrorAddres.setText("-");
        jPanel1.add(lblErrorAddres, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 227, -1, -1));

        lblErrorPassword.setText("-");
        jPanel1.add(lblErrorPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 267, -1, -1));

        lblErrorAge.setText("_");
        jPanel1.add(lblErrorAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 300, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/FondoUser.jpg"))); // NOI18N
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 430));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        FrmStaffMain frmStaffMain = new FrmStaffMain();
        frmStaffMain.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void TFuserNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFuserNameKeyPressed
        input.StringValidation(TFuserName, evt, lblErrorName,30);
    }//GEN-LAST:event_TFuserNameKeyPressed

    private void TFuserIdKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFuserIdKeyPressed
        
        input.NumberValidation(TFuserId, evt, lblErrorId, 9);
        
    }//GEN-LAST:event_TFuserIdKeyPressed

    private void TFphoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFphoneKeyPressed
        
        input.NumberValidation(TFphone, evt, lblErrorPhone, 9);
        
    }//GEN-LAST:event_TFphoneKeyPressed

    private void TFageKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFageKeyPressed
        
        input.NumberValidation(TFage, evt, lblErrorAge, 1);
        
    }//GEN-LAST:event_TFageKeyPressed

    private void cmbxEmailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbxEmailsActionPerformed
       
    }//GEN-LAST:event_cmbxEmailsActionPerformed

    private void TFAddresKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFAddresKeyPressed
         
        input.StringValidation(TFAddres, evt, lblErrorAddres, 10);
         
    }//GEN-LAST:event_TFAddresKeyPressed

    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        
        if(!TFuserName.getText().isBlank()&&!TFuserId.getText().isBlank()&&!TFemail.getText().isBlank()&&!TFphone.getText().isBlank()&&!TFAddres.getText().isBlank()&&!TFage.getText().isBlank()&&!TFpassword.getText().isBlank()){
            
            AddUserData();
            JOptionPane.showMessageDialog(this, "successfully added");
            CleanTxtFields();
            
        }else{
            
            JOptionPane.showMessageDialog(this, "Some TextField is empty, please enter valid data and try again");
        }
        
        
    }//GEN-LAST:event_btnAddUserActionPerformed

    private void TFpasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFpasswordKeyPressed
        input.NumberValidation(TFpassword, evt, lblErrorPassword, 9);
    }//GEN-LAST:event_TFpasswordKeyPressed

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
            java.util.logging.Logger.getLogger(FrmUser1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmUser1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmUser1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmUser1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmUser1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TFAddres;
    private javax.swing.JTextField TFage;
    private javax.swing.JTextField TFemail;
    private javax.swing.JTextField TFpassword;
    private javax.swing.JTextField TFphone;
    private javax.swing.JTextField TFuserId;
    private javax.swing.JTextField TFuserName;
    private javax.swing.JButton btnAddUser;
    private javax.swing.JComboBox<String> cmbxEmails;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblErrorAddres;
    private javax.swing.JLabel lblErrorAge;
    private javax.swing.JLabel lblErrorId;
    private javax.swing.JLabel lblErrorName;
    private javax.swing.JLabel lblErrorPassword;
    private javax.swing.JLabel lblErrorPhone;
    // End of variables declaration//GEN-END:variables

    public void AddUserData(){
    
        user= new User();
        MongoDBManager saveUserdata;
        saveUserdata = new MongoDBManager();
        
        user.setUserName(TFuserName.getText());
        user.setUserId(Integer.parseInt(TFuserId.getText()));
        user.setUserEmail(TFemail.getText()+ cmbxEmails.getSelectedItem());
        user.setUserAddress(TFAddres.getText());
        user.setUserPhone(Integer.parseInt(TFphone.getText()));
        user.setUserAge(Integer.parseInt(TFage.getText()));
        user.setUserPassword(Integer.parseInt(TFpassword.getText()));
        
        saveUserdata.CreateUser(user);
    
    }
    
    public void CleanTxtFields(){
    
        TFuserName.setText("");
        TFuserId.setText("");
        TFemail.setText("");
        TFphone.setText("");
        TFAddres.setText("");
        TFage.setText("");
        TFpassword.setText("");
    
    }
    
    
}
