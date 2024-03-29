package ec.edu.espe.Bookify.view;




import ec.edu.espe.Bookify.controller.FormsHandler;
import ec.edu.espe.Bookify.controller.InputValidation;
import ec.edu.espe.Bookify.controller.MongoDBManager;
import ec.edu.espe.Bookify.model.Book;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

import javax.swing.JOptionPane;

/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE, CODEX++
 */
public class FrmAddBook extends javax.swing.JFrame {

    InputValidation input;
    /**
     * Creates new form FrmAddBook
     */
    public FrmAddBook() {
        initComponents();
        StartComponents();
    }

    public void StartComponents() {
        input = new InputValidation();
        this.setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
        Image miIcono = miPantalla.getImage("src/Images/BookIco.png");
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTitle = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAuthor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPublisher = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtIsbn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnReturn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cmboBool = new javax.swing.JComboBox<>();
        lbIsbn = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel1.setText("Añadir Libro");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(164, 6, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Titulo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 64, -1, -1));

        txtTitle.setToolTipText("Enter the title of the book");
        getContentPane().add(txtTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 64, 252, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Autor");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 98, -1, -1));
        getContentPane().add(txtAuthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 98, 252, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Editorial");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 132, -1, -1));

        txtPublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPublisherActionPerformed(evt);
            }
        });
        getContentPane().add(txtPublisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 132, 252, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("ISBN:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 166, -1, -1));

        txtIsbn.setToolTipText("Only 13 digits of the product");
        txtIsbn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIsbnActionPerformed(evt);
            }
        });
        txtIsbn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIsbnKeyPressed(evt);
            }
        });
        getContentPane().add(txtIsbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(98, 166, 252, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Disponible");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        btnReturn.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Return.png"))); // NOI18N
        btnReturn.setToolTipText("Return to main menu");
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        getContentPane().add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jButton2.setText("Añadir Libro");
        jButton2.setToolTipText("Click to add product");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, -1, -1));

        cmboBool.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Si", "No", " " }));
        getContentPane().add(cmboBool, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        lbIsbn.setForeground(new java.awt.Color(0, 204, 0));
        lbIsbn.setText("-");
        getContentPane().add(lbIsbn, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 250, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Fondo 03.jpg"))); // NOI18N
        jLabel3.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel3AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPublisherActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPublisherActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        FrmStaffMain frmStaffMain = new FrmStaffMain();
        frmStaffMain.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_btnReturnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        Book book;
        MongoDBManager saveBook;
        
        book = new Book();
        saveBook = new MongoDBManager();
        
        book.setTitle(txtTitle.getText());
        book.setAuthor(txtAuthor.getText());
        book.setPublisher(txtPublisher.getText());
        book.setISBN(txtIsbn.getText());
        book.setAvailable(AvailableBook(cmboBool.getSelectedItem().toString()));
        
        saveBook.CreateBook(book);
               
       JOptionPane.showMessageDialog(null, "Book added succesfull");
       CleanTxtFields();
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtIsbnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIsbnActionPerformed

    }//GEN-LAST:event_txtIsbnActionPerformed

    private void txtIsbnKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIsbnKeyPressed
        input.NumberValidation(txtIsbn, evt, lbIsbn, 13);
    }//GEN-LAST:event_txtIsbnKeyPressed

    private void jLabel3AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel3AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel3AncestorAdded

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
            java.util.logging.Logger.getLogger(FrmAddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAddBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAddBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn;
    private javax.swing.JComboBox<String> cmboBool;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lbIsbn;
    private javax.swing.JTextField txtAuthor;
    private javax.swing.JTextField txtIsbn;
    private javax.swing.JTextField txtPublisher;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables

public boolean AvailableBook(String option){

        return option.toLowerCase().equals("yes");


}
 public void CleanTxtFields(){
    
        txtAuthor.setText("");
        txtIsbn.setText("");
        txtPublisher.setText("");
        txtTitle.setText("");
        
    }


}
