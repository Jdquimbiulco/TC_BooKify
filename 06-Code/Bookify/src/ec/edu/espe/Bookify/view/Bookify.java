/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.Bookify.view;

import com.google.gson.Gson;
import ec.edu.espe.Bookify.controller.FormsHandler;
import ec.edu.espe.Bookify.controller.MongoDBManager;
import ec.edu.espe.Bookify.model.User;
import java.util.ArrayList;

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class Bookify {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MongoDBManager db= new MongoDBManager();
        User user= new User();
        ArrayList<User> userlist;
        FormsHandler frms;
        frms= new FormsHandler();
        
        
        
        userlist =db.ReadBookifyDB(user,"Users");
               
        
        frms.SetDatatoTables(userlist.get(0).atributeNames(),userlist);
        
        
        
        
    }
    
}
