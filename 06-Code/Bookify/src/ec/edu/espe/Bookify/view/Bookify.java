package ec.edu.espe.Bookify.view;

import ec.edu.espe.Bookify.controller.FormsHandler;
import ec.edu.espe.Bookify.controller.MongoDBManager;
import ec.edu.espe.Bookify.model.User;
import java.util.ArrayList;
import java.util.Iterator;


/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class Bookify {

    public static void main(String[] args) {
        
        MongoDBManager db= new MongoDBManager();
        FormsHandler frms= new FormsHandler();
        User user;
        ArrayList<User> users;
        
        user = new User();
        db.DelteBookifyObject("Users","Name", "sdfasd");
        
        users=db.ReadBookifyDB(user,"Users");
        for(User user1:users){
            System.out.println(user1.toString());
        }
        
        //db.UpdateBookifyObject("Users", "id", 1727751420, "name", "Jairo");
        
        
        
    }
    
}
