package ec.edu.espe.Bookify.model;

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
    
    public String StaffData() {
        
        return "Staff:" + "StaffName=" + StaffName + ", Staffid=" + StaffId + ", Staffage=" + StaffAge + ", StaffPhone=" + StaffPhone + ", StaffAddress=" + StaffAddress + ", StaffPasword=" + StaffPasword + ", StaffBlackList=" + StaffBlackList + '\n';
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
