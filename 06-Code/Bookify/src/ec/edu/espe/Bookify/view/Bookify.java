/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ec.edu.espe.Bookify.view;

import com.google.gson.Gson;
import ec.edu.espe.Bookify.controller.MongoDBManager;
import ec.edu.espe.Bookify.model.User;

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class Bookify {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        User user= new User();
        MongoDBManager db= new MongoDBManager();
        user.setName("Jairo");
        user.setUserAge(21);
        user.setUserId(1727789);
        user.setUserPhone(912231);
        user.setUserAddress("Calderon");
        user.setUserEmail("jairo@gmail");
        user.setUserPassword(12345);
        
        db.Create20(user, "Users");
               
        
        
        
        
        
    }
    
}
