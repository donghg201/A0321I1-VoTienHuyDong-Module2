package CaseStudyModule2.Furama.Models;

public class Customer extends Person {
    private int customerID;
    private String name;
    private String dathOfBirth;
    private String sex;
    private String CMND;
    private String phoneNumber;
    private String email;
    private String customerType;
    private String address;

    public Customer(int customerID, String name, String dathOfBirth, String sex, String CMND, String phoneNumber, String email, String customerType, String address) {
        this.customerID = customerID;
        this.name = name;
        this.dathOfBirth = dathOfBirth;
        this.sex = sex;
        this.CMND = CMND;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerType = customerType;
        this.address = address;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDathOfBirth() {
        return dathOfBirth;
    }

    public void setDathOfBirth(String dathOfBirth) {
        this.dathOfBirth = dathOfBirth;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCMND() {
        return CMND;
    }

    public void setCMND(String CMND) {
        this.CMND = CMND;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String toString() {
        return getCustomerID() + ","
                + getName() + ","
                + getDathOfBirth() + ","
                + getSex() + ","
                + getCMND() + ","
                + getPhoneNumber() + ","
                + getEmail() + ","
                + getCustomerType() + ","
                + getAddress();
    }
}
