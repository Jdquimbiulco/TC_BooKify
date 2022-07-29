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
    int Pasuwu;
    int Password = 1945;

    @Override
    public String toString() {
        return "User{" + "name=" + name + ", id=" + id + ", email=" + email + ", phone=" + phone + ", address=" + address + ", age=" + age + ", password=" + password + ", Pasuwu=" + Pasuwu + ", Password=" + Password + '}';
    }
    
    
   
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

    
    public String UserData() {
        return "User:" + "name=" + getName() + ", id=" + getId() + ", userEmail=" + getEmail() + ", userPhone=" + getPhone() + ", userAddress=" + getAddress() + ", age=" + getAge() + ", password=" + getPassword() + '\n';
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
        
}
