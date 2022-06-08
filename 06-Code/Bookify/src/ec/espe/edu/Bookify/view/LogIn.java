/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.Bookify.view;




import ec.espe.edu.Bookify.Model.Book;
import ec.espe.edu.Bookify.Model.Staff;
import ec.espe.edu.Bookify.Model.User;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author QUILUMBAQUIN JAIRO,QUIMBIULCO JUAN,RAUL SILVA,CARLOS RIVERA, DCC0-ESPE: CODEX++
 * 
 */

public class LogIn {
     

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
           Staff staff;
           User user;
           Catalogue catalogue;
           
           staff = new Staff();
           user = new User();
           catalogue = new Catalogue();
  
            int option;
            option=0;
           
           
           
           
        
        
        printMenu();
        
        System.out.println("Select the operation--->[1|2|3|4|5|6|7|8|9|10], 0 to exit: ");
        option = keyboard.nextInt();
        
        if (option == 1) {
            user.readData();
            
        }else if (option == 2) {
            staff.addUser();
        
        }else if (option == 4)
            catalogue.showCatalogue();
        
        
 }

    private static void printMenu() {
        System.out.println("========================================================");
        System.out.println("=========================BOOKIFY========================");
        System.out.println("========================================================");
        
        System.out.println("1.-Log In");
        System.out.println("2.-Add New User");
        System.out.println("3.-Add Product");
        System.out.println("4.-Show Catalogue");
        System.out.println("5.-Manage Product");
        System.out.println("6.-Borrow Product");
        System.out.println("7.-Return Product");
        System.out.println("8.-Product Information");
        System.out.println("9.-Pay Fines");
        System.out.println("10.-Donate");
    }
    
}
  
          
    

