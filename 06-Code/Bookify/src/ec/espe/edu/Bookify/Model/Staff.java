/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.espe.edu.Bookify.Model;

/**
 *
 * @author QUILUMBAQUIN JAIRO, DCC0-ESPE: CODEX++
 */
public class Staff {
    private String name;
    private int id;
    private int age;
    private int staffPhone;
    private String staffAdres;
    private int pasword;
    private boolean blackList;

    public Staff(String name, int id, int age, int staffPhone, String staffAdres, int pasword, boolean blackList) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.staffPhone = staffPhone;
        this.staffAdres = staffAdres;
        this.pasword = pasword;
        this.blackList = blackList;
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
     * @return the staffAdres
     */
    public String getStaffAdres() {
        return staffAdres;
    }

    /**
     * @param staffAdres the staffAdres to set
     */
    public void setStaffAdres(String staffAdres) {
        this.staffAdres = staffAdres;
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
    
    
    
    
         
}
