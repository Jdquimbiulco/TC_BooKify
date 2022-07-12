package ec.edu.espe.Bookify.controller;



import ec.edu.espe.Bookify.view.FrmBookify;
//import ec.espe.edu.Bookify.view.FrmBookiFi;
import javax.swing.JFrame;

/**
 *
 * @author Raul Silva, DCCO-ESPE, CODEX++
 */
public class FormsHandler {

        public static void goToMainScreen(JFrame jFrameToClose){
        FrmBookify frmBookiFi  = new FrmBookify ();
        jFrameToClose.setVisible(false);
        frmBookiFi .setVisible(true);
        }
//        public static void goToMainScreen(JFrame jFrameToClose){
//        FrmBookiFi frmBookiFi  = new FrmBookiFi ();
//        jFrameToClose.setVisible(false);
//        frmBookiFi .setVisible(true);
//        }
    
}
