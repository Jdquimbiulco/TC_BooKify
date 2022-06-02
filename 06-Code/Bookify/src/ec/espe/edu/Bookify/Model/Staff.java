/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.Bookify.Model;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author QUILUMBAQUIN JAIRO,QUIMBIULCO JUAN,RAUL SILVA,CARLOS RIVERA, DCC0-ESPE: CODEX++
 */
public class Staff {
    
    private String name;
    private int id;
    private int age;
    private int staffPhone;
    private String staffAddress;
    private int pasword;
    private boolean blackList;

    public Staff() {
    }
    
    
    
    public Staff(String name, int id, int age, int staffPhone, String staffAddress, int pasword, boolean blackList) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.staffPhone = staffPhone;
        this.staffAddress = staffAddress;
        this.pasword = pasword;
        this.blackList = blackList;
    }

    public User addUser(){
    
        ArrayList<User> users;
        User user;
        String staffOption;
        Scanner input;
        
        user= new User();
        users= new ArrayList<>();
        input= new Scanner(System.in);
            
               
        System.out.println("Ingresar un nuevo usuario?(Y/N)");
        staffOption=input.next().toLowerCase();
        
        if(staffOption.equals("y")){
        
            System.out.println("Ingrese los datos");
            
            user.setAge(age=input.nextInt());
            user.setId(id=input.nextInt());
            user.setName(name=input.next());
            user.setPassword(pasword=input.nextInt());
            user.setUserAddress(staffAddress=input.next());
            user.setUserEmail(name=input.next());
            user.setUserPhone(staffPhone=input.nextInt());
                                   
            users.add(user);
            
            System.out.println(users);
            
            return user;
            
        }
        
        
        
        
        return null;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * @return the staffPhone
     */
    public int getStaffPhone() {
        return staffPhone;
    }

    /**
     * @param staffPhone the staffPhone to set
     */
    public void setStaffPhone(int staffPhone) {
        this.staffPhone = staffPhone;
    }

    /**
     * @return the pasword
     */
    public int getPasword() {
        return pasword;
    }

    /**
     * @param pasword the pasword to set
     */
    public void setPasword(int pasword) {
        this.pasword = pasword;
    }

    /**
     * @return the blackList
     */
    public boolean isBlackList() {
        return blackList;
    }

    /**
     * @param blackList the blackList to set
     */
    public void setBlackList(boolean blackList) {
        this.blackList = blackList;
    }

    /**
     * @return the staffAddress
     */
    public String getStaffAddress() {
        return staffAddress;
    }

    /**
     * @param staffAddress the staffAddress to set
     */
    public void setStaffAddress(String staffAddress) {
        this.staffAddress = staffAddress;
    }

    
    public void mostrar() {
        System.out.println("Staff: " + "name:" + name + ", id=" + id + ", age=" + age + ", staffPhone=" + staffPhone + ", staffAddress=" + staffAddress + ", pasword=" + pasword + ", blackList=" + blackList + '\n');
    }
    
    
    
    
         
}
