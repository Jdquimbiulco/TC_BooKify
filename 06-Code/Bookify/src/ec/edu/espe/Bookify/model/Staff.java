package ec.edu.espe.Bookify.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Raul Silva, DCCO-ESPE, CODEX++
 */
public class Staff {
    private String StaffName;
    private int StaffId;
    private int StaffAge;
    private int StaffPhone;
    private String StaffAddress;
    private int StaffPasword;
    private boolean StaffBlackList;

    
    public Staff(String StaffName, int StaffId, int StaffAge, int StaffPhone, String StaffAddress, int StaffPasword, boolean StaffBlackList) {
        this.StaffName = StaffName;
        this.StaffId = StaffId;
        this.StaffAge = StaffAge;
        this.StaffPhone = StaffPhone;
        this.StaffAddress = StaffAddress;
        this.StaffPasword = StaffPasword;
        this.StaffBlackList = StaffBlackList;
    }

    public Staff() {
        
    }
    public User addUser(){
    
        String userName;
        String UserEmail;
        String UserAddress;
        int UserAge;
        int UserId;
        int UserPasword; 
        int UserPhone;
        
        Scanner input;
        User user1;
        
        user1= new User();
        input= new Scanner(System.in);
            
    
            System.out.println("Ingrese el Nombre:\n");
            userName=input.nextLine();
            System.out.println("Ingrese la edad:\n");
            UserAge=input.nextInt();
            System.out.println("Ingrese el Id:\n");
            UserId=input.nextInt();
            System.out.println("Ingrese la contrasenia:\n");
            UserPasword=input.nextInt();
            System.out.println("Ingrese la direccion:\n");
            UserAddress=input.next();
            System.out.println("Ingrese el email:\n");
            UserEmail=input.next();
            System.out.println("Ingrese el numero de telefono\n");
            UserPhone=input.nextInt();
                       
            user1.setUserName(userName);
            user1.setUserAge(UserAge);
            user1.setUserId(UserId);
            user1.setUserPassword(UserPasword);
            user1.setUserAddress(UserAddress);
            user1.setUserEmail(UserEmail);
            user1.setUserPhone(UserPhone);
            
            System.out.println("Ingresado Exitosamente");      
            System.out.println(user1.UserData());
                    
        
        return user1;
    }

    
    public String StaffData() {
        
        return "Staff:" + "StaffName=" + StaffName + ", Staffid=" + StaffId + ", Staffage=" + StaffAge + ", StaffPhone=" + StaffPhone + ", StaffAddress=" + StaffAddress + ", StaffPasword=" + StaffPasword + ", StaffBlackList=" + StaffBlackList + '\n';
    }
    
    
    public void RecordUser() throws IOException{
    
        String StaffOption;
        User UserRecord;
        Scanner input;
        FileWriter RecordUserData;
        BufferedWriter WriteUserData;
        
        input=new Scanner(System.in);
        
        
        do{
            
            
            System.out.println("Ingresar un Nuevo Usuario?(Y/N)\n ");
            StaffOption=input.next().toLowerCase();
            
            if(StaffOption.equals("y")){
                VerifyDataBase();
                
                RecordUserData=new FileWriter("UserDataBase.csv",true);
                WriteUserData= new BufferedWriter(RecordUserData);
                
                UserRecord=addUser();
                WriteUserData.write(UserRecord.RecordUserData());
                WriteUserData.flush();
                RecordUserData.close(); 
            }
           
                
            
        }while(StaffOption.equalsIgnoreCase("y"));
        
    }
    
    public void VerifyDataBase() throws IOException{
        
        File VerifyFile;
        VerifyFile=new File("UserDataBase.csv");
        
        if(!VerifyFile.exists()){
            try{
                VerifyFile.createNewFile();
            }catch(IOException ex){}
        }
    }
    
    public void ShowUsers() throws FileNotFoundException, IOException{
    
        File dataBase;
        Scanner readDataBase;
        
        dataBase=new File("UserDataBase.csv");
        readDataBase= new Scanner(dataBase);
        
        VerifyDataBase();
        while(readDataBase.hasNextLine()){
            System.out.println(readDataBase.nextLine());
        }
    
    }

    @Override
    public String toString() {
        return "Staff{" + "StaffName=" + StaffName + ", StaffId=" + StaffId + ", StaffAge=" + StaffAge + ", StaffPhone=" + StaffPhone + ", StaffAddress=" + StaffAddress + ", StaffPasword=" + StaffPasword + ", StaffBlackList=" + StaffBlackList + '}';
    }

    /**
     * @return the StaffName
     */
    public String getStaffName() {
        return StaffName;
    }

    /**
     * @param StaffName the StaffName to set
     */
    public void setStaffName(String StaffName) {
        this.StaffName = StaffName;
    }

    /**
     * @return the StaffId
     */
    public int getStaffId() {
        return StaffId;
    }

    /**
     * @param StaffId the StaffId to set
     */
    public void setStaffId(int StaffId) {
        this.StaffId = StaffId;
    }

    /**
     * @return the StaffAge
     */
    public int getStaffAge() {
        return StaffAge;
    }

    /**
     * @param StaffAge the StaffAge to set
     */
    public void setStaffAge(int StaffAge) {
        this.StaffAge = StaffAge;
    }

    /**
     * @return the StaffPhone
     */
    public int getStaffPhone() {
        return StaffPhone;
    }

    /**
     * @param StaffPhone the StaffPhone to set
     */
    public void setStaffPhone(int StaffPhone) {
        this.StaffPhone = StaffPhone;
    }

    /**
     * @return the StaffAddress
     */
    public String getStaffAddress() {
        return StaffAddress;
    }

    /**
     * @param StaffAddress the StaffAddress to set
     */
    public void setStaffAddress(String StaffAddress) {
        this.StaffAddress = StaffAddress;
    }

    /**
     * @return the StaffPasword
     */
    public int getStaffPasword() {
        return StaffPasword;
    }

    /**
     * @param StaffPasword the StaffPasword to set
     */
    public void setStaffPasword(int StaffPasword) {
        this.StaffPasword = StaffPasword;
    }

    /**
     * @return the StaffBlackList
     */
    public boolean isStaffBlackList() {
        return StaffBlackList;
    }

    /**
     * @param StaffBlackList the StaffBlackList to set
     */
    public void setStaffBlackList(boolean StaffBlackList) {
        this.StaffBlackList = StaffBlackList;
    }

}
