package ec.espe.edu.Bookify.Model;

import java.util.Scanner;

/**
 *
 * @author Raul Silva, DCCO-ESPE, CODEX++
 */
public class Staff {
    
    private String Staffname;
    private int Staffid;
    private int Staffage;
    private int StaffPhone;
    private String StaffAddress;
    private int StaffPasword;
    private boolean StaffBlackList;

    public Staff() {
    }

    public Staff(String Staffname, int Staffid, int Staffage, int StaffPhone, String StaffAddress, int StaffPasword, boolean StaffBlackList) {
        this.Staffname = Staffname;
        this.Staffid = Staffid;
        this.Staffage = Staffage;
        this.StaffPhone = StaffPhone;
        this.StaffAddress = StaffAddress;
        this.StaffPasword = StaffPasword;
        this.StaffBlackList = StaffBlackList;
    }
    
    
    
    

    public User addUser(){
    
        
        
        String staffOption;
        String UserName;
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
            
        do{
        
        System.out.println("Ingresar un nuevo usuario?(Y/N)\n");
        staffOption=input.nextLine();
        
        if(staffOption.equalsIgnoreCase("y")){
        
            System.out.println("Ingrese el Nombre:\n");
            UserName=input.nextLine();
            System.out.println("Ingrese la edad:\n");
            UserAge=input.nextInt();
            System.out.println("Ingrese el Id:\n");
            UserId=input.nextInt();
            System.out.println("Ingrese la contraseña:\n");
            UserPasword=input.nextInt();
            System.out.println("Ingrese la direccion:\n");
            UserAddress=input.nextLine();
            System.out.println("Ingrese el email:\n");
            UserEmail=input.nextLine();
            System.out.println("Ingrese el numero de telefono\n");
            UserPhone=input.nextInt();
                       
            user1.setUserName(UserName);
            user1.setUserAge(UserAge);
            user1.setUserId(UserId);
            user1.setUserPassword(UserPasword);
            user1.setUserAddress(UserAddress);
            user1.setUserEmail(UserEmail);
            user1.setUserPhone(UserPhone);
            
            System.out.println("Ingresado Exitosamente");      
            System.out.println(user1.UserData());
                    
            
        }
        
        }while(staffOption.equals("y"));
        
        
        return user1;
    }

    /**
     * @return the Staffname
     */
    public String getStaffname() {
        return Staffname;
    }

    /**
     * @param Staffname the Staffname to set
     */
    public void setStaffname(String Staffname) {
        this.Staffname = Staffname;
    }

    /**
     * @return the Staffid
     */
    public int getStaffid() {
        return Staffid;
    }

    /**
     * @param Staffid the Staffid to set
     */
    public void setStaffid(int Staffid) {
        this.Staffid = Staffid;
    }

    /**
     * @return the Staffage
     */
    public int getStaffage() {
        return Staffage;
    }

    /**
     * @param Staffage the Staffage to set
     */
    public void setStaffage(int Staffage) {
        this.Staffage = Staffage;
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

    
    public String StaffData() {
        
        return "Staff:" + "StaffName=" + Staffname + ", Staffid=" + Staffid + ", Staffage=" + Staffage + ", StaffPhone=" + StaffPhone + ", StaffAddress=" + StaffAddress + ", StaffPasword=" + StaffPasword + ", StaffBlackList=" + StaffBlackList + '\n';
    }

    

    
    
    
}
