package ec.edu.espe.Bookify.model;

/**
 *
 * @author Raul Silva, DCCO-ESPE, CODEX++
 */
public class Staff {
    private String name;
    private int id;
    private int age;
    private int phone;
    private String address;
    private int password;

    public Staff(String name, int id, int age, int phone, String address, int password) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.password = password;
    }

    
    
    public Staff() {
        
    }
    
    @Override
    public String toString() {
        return getName() + "," + getId() + "," + getAge() + "," + getPhone() + "," + getAddress() + "," + getPassword();
    }
    
    public String[] atributeNames() {
        String[] Names={"Name","Id","Email","Phone","Address","Age", "Password"};
        return Names;
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
     * @return the phone
     */
    public int getPhone() {
        return phone;
    }

    /**
     * @param phone the phone to set
     */
    public void setPhone(int phone) {
        this.phone = phone;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the password
     */
    public int getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(int password) {
        this.password = password;
    }
    
    
        
    
    
    
    
}
