package ec.edu.espe.Bookify.model;
/**
 *
 * @author QUILUMBAQUIN JAIRO,QUIMBIULCO JUAN,RAUL SILVA,CARLOS RIVERA, DCC0-ESPE: CODEX++
 */
public class User {
    private String name;
    private int id;
    private String email;
    private int phone;
    private String address; 
    private int age;
    private int password;
    
   
    
    
   
    public User() {
        
    }

    public User(String name, int id, String userEmail, int userPhone, String userAddress, int age, int password) {
        this.name = name;
        this.id = id;
        this.email = userEmail;
        this.phone = userPhone;
        this.address = userAddress;
        this.age = age;
        this.password = password;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }
    
    public String[] atributeNames() {
        String[] Names={"Name","Id","Email","Phone","Address","Age", "Password"};
        return Names;
    }

    
    
    @Override
    public String toString() {
        return getName()+","+getId()+","+getEmail()+","+ getPhone() + "," + getAddress() + "," + getAge() + "," + getPassword();
    }
    
    
    
    
    
        
}
