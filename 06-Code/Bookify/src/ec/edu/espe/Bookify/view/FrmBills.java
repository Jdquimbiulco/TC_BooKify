/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ec.edu.espe.Bookify.view;

<<<<<<< HEAD:06-Code/Bookify/src/ec/edu/espe/Bookify/view/FrmBills.java
import ec.edu.espe.Bookify.controller.FormsHandler;
import ec.edu.espe.Bookify.controller.MongoDBManager;
import ec.edu.espe.Bookify.model.User;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
=======
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JTable;
>>>>>>> ab5d09c52c94bf418fd65091ff53ca63ca774a9e:06-Code/Bookify/src/ec/edu/espe/Bookify/view/FrmPayBills.java

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class FrmBills extends javax.swing.JFrame {

    /**
     * Creates new form FrmBills
     */
    User user;
    MongoDBManager billsDB;


    public FrmBills() {
        initComponents();
<<<<<<< HEAD:06-Code/Bookify/src/ec/edu/espe/Bookify/view/FrmBills.java
        user = new User();
        ChargeData();
=======
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Image miIcono = miPantalla.getImage("src/Images/Icon02.png");
        setIconImage(miIcono);
        
        
>>>>>>> ab5d09c52c94bf418fd65091ff53ca63ca774a9e:06-Code/Bookify/src/ec/edu/espe/Bookify/view/FrmPayBills.java
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBills = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("PayBills");

        tblBills.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Id", "Book", "Bill"
            }
        ));
        jScrollPane1.setViewportView(tblBills);

        jButton2.setText("Return");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(214, 214, 214)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(jButton2)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        FormsHandler.goToMainScreen(this);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(FrmBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBills.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBills().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBills;
    // End of variables declaration//GEN-END:variables

    public void ChargeData() {

        DefaultTableModel table = (DefaultTableModel) tblBills.getModel();
        
        
        Object[] userRow = new Object[]{"jairo", "1714564","Algebra de baldor","5"};
        table.addRow(userRow);
        userRow = new Object[]{"Luis", "1231231","Fundamentos de Circuitos Electricos","5"};
        table.addRow(userRow);
        userRow = new Object[]{"Carlos", "1231231","Principios de electronica","5"};
        table.addRow(userRow);
        userRow = new Object[]{"Ricardo", "1231231","La divina comedia","5"};
        table.addRow(userRow);
        
        
    }

}
