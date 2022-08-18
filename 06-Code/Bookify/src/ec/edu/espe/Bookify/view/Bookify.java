package ec.edu.espe.Bookify.view;

import ec.edu.espe.Bookify.controller.FormsHandler;
import ec.edu.espe.Bookify.controller.MongoDBManager;
import ec.edu.espe.Bookify.model.Staff;
import ec.edu.espe.Bookify.model.User;
import java.util.ArrayList;


/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class Bookify {

    public static void main(String[] args) {
        
        MongoDBManager db= new MongoDBManager();
        FormsHandler frms= new FormsHandler();
        User user = new User();
        Staff staff;
        ArrayList<User> users;
        
        staff = (Staff) frms.findBookifyObject(new Staff(), "Staffs", "name", "Angela Castro");
        
        System.out.println(staff.toString());
        
               
        //db.UpdateBookifyObject("Users", "id", 1727751420, "name", "Jairo");
        
        
        
    }
    
}
