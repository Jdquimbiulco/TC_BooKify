package ec.edu.espe.Bookify.view;




import ec.edu.espe.Bookify.controller.MongoDBManager;
import ec.edu.espe.Bookify.model.Movie;
import java.lang.module.ModuleDescriptor;

import ec.edu.espe.Bookify.controller.FormsHandler;

import javax.swing.JOptionPane;

import ec.edu.espe.Bookify.controller.MongoDBManager;
import ec.edu.espe.Bookify.model.Movie;
import ec.edu.espe.Bookify.controller.FormsHandler;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;



/**
 *
 * @author Carlos Rivera, DCCO-ESPE, CODEX++
 */
public class FrmAddMovie extends javax.swing.JFrame {

    /**
     * Creates new form FrmAddMovie
     */
    public FrmAddMovie() {
        initComponents();
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

        jCheckBox1 = new javax.swing.JCheckBox();
        lblAddMovie = new javax.swing.JLabel();
        lblTitle = new javax.swing.JLabel();
        txtMovieTitle = new javax.swing.JTextField();
        lblGender = new javax.swing.JLabel();
        txtMovieGender = new javax.swing.JTextField();
        lblIdiom = new javax.swing.JLabel();
        txtMovieIdiom = new javax.swing.JTextField();
        lblAvailable = new javax.swing.JLabel();
        cmbAvailable = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnReturn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAddMovie.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        lblAddMovie.setForeground(new java.awt.Color(255, 255, 255));
        lblAddMovie.setText("Añadir Pelicula");
        getContentPane().add(lblAddMovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        lblTitle.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(204, 204, 204));
        lblTitle.setText("Título:");
        getContentPane().add(lblTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        txtMovieTitle.setToolTipText("Ingrese el titulo de la pelicula");
        txtMovieTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMovieTitleActionPerformed(evt);
            }
        });
        txtMovieTitle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMovieTitleKeyTyped(evt);
            }
        });
        getContentPane().add(txtMovieTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 230, -1));

        lblGender.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        lblGender.setForeground(new java.awt.Color(204, 204, 204));
        lblGender.setText("Genero:");
        getContentPane().add(lblGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        txtMovieGender.setToolTipText("Ingrese el genero de la pelicula.");
        txtMovieGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMovieGenderActionPerformed(evt);
            }
        });
        txtMovieGender.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMovieGenderKeyTyped(evt);
            }
        });
        getContentPane().add(txtMovieGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 230, -1));

        lblIdiom.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        lblIdiom.setForeground(new java.awt.Color(204, 204, 204));
        lblIdiom.setText("Idioma:");
        getContentPane().add(lblIdiom, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        txtMovieIdiom.setToolTipText("Ingrese el idioma de la pelicula.");
        txtMovieIdiom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMovieIdiomActionPerformed(evt);
            }
        });
        txtMovieIdiom.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMovieIdiomKeyTyped(evt);
            }
        });
        getContentPane().add(txtMovieIdiom, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 230, -1));

        lblAvailable.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        lblAvailable.setForeground(new java.awt.Color(204, 204, 204));
        lblAvailable.setText("Disponible:");
        getContentPane().add(lblAvailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        cmbAvailable.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "YES", "NO" }));
        cmbAvailable.setToolTipText("");
        getContentPane().add(cmbAvailable, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, -1, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AddMovieImage.png"))); // NOI18N
        jButton2.setText("Añadir");
        jButton2.setToolTipText("");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/DeleteImage.png"))); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));

        btnReturn.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        btnReturn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Return.png"))); // NOI18N
        btnReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnActionPerformed(evt);
            }
        });
        getContentPane().add(btnReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 260, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addMovieFondo.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMovieTitleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMovieTitleActionPerformed

    }//GEN-LAST:event_txtMovieTitleActionPerformed

    private void txtMovieTitleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMovieTitleKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMovieTitleKeyTyped

    private void txtMovieGenderKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMovieGenderKeyTyped
        char validar = evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();

            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras \n Enter only letters");

        }
    }//GEN-LAST:event_txtMovieGenderKeyTyped

    private void txtMovieIdiomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMovieIdiomActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMovieIdiomActionPerformed

    private void txtMovieIdiomKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMovieIdiomKeyTyped
        // TODO add your handling code here:
        char validar = evt.getKeyChar();
        if(Character.isDigit(validar)){
            getToolkit().beep();

            evt.consume();
            JOptionPane.showMessageDialog(rootPane, "Ingresar solo letras \n Enter only letters");
        }
    }//GEN-LAST:event_txtMovieIdiomKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Movie movie;
        MongoDBManager addMovie;

        addMovie = new MongoDBManager();
        movie = new Movie();
        movie.setTitle(txtMovieTitle.getText());
        movie.setGenre(txtMovieGender.getText());
        movie.setIdiom(txtMovieIdiom.getText());
        movie.setAvailable(AvailableMovie(cmbAvailable.getSelectedItem().toString()));

        addMovie.CreateMovie(movie);
        JOptionPane.showMessageDialog(null, " Movie added succesfull \n La pelicula ha sido añadida exitosamente");
        CleanTxtFields();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int i = JOptionPane.showConfirmDialog(this," Are you sure you want to delete the movie? \n ¿Esta segur@ que quiere eliminar esta pelicula?");
        if (i == 0){
            JOptionPane.showMessageDialog(this," The movie was deleted successfully \nLa pelicula ha sido eliminada exitosamente");
        } else if (i == 1){
            JOptionPane.showMessageDialog(this," The movie was not removed \n La pelicula no fue removida");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void btnReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnActionPerformed
        FrmStaffMain frmStaffMain = new FrmStaffMain();
        frmStaffMain.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnReturnActionPerformed

    private void txtMovieGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMovieGenderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMovieGenderActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(FrmAddMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAddMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAddMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAddMovie.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAddMovie().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReturn;
    private javax.swing.JComboBox<String> cmbAvailable;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblAddMovie;
    private javax.swing.JLabel lblAvailable;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblIdiom;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtMovieGender;
    private javax.swing.JTextField txtMovieIdiom;
    private javax.swing.JTextField txtMovieTitle;
    // End of variables declaration//GEN-END:variables

public boolean AvailableMovie(String option){

        return option.toLowerCase().equals("yes");


}

public void CleanTxtFields(){
    
        txtMovieGender.setText("");
        txtMovieIdiom.setText("");
        txtMovieTitle.setText("");
                
    }


}
