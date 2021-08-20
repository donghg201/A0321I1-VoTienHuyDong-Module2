package CaseStudyModule2.Furama.Models;

public class Employee extends Person {
    private int employeeID;
    private String name;
    private String dathOfBirth;
    private String sex;
    private String CMND;
    private String phoneNumber;
    private String email;
    private String level;
    private String position;
    private String wage;

    public Employee(int employeeID, String name, String dathOfBirth, String sex, String CMND, String phoneNumber,
                    String email, String level, String position, String wage) {
        this.employeeID = employeeID;
        this.name = name;
        this.dathOfBirth = dathOfBirth;
        this.sex = sex;
        this.CMND = CMND;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.level = level;
        this.position = position;
        this.wage = wage;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getWage() {
        return wage;
    }

    public void setWage(String wage) {
        this.wage = wage;
    }

    public String toString() {
        return getEmployeeID() + ","
                + getName() + ","
                + getDathOfBirth() + ","
                + getSex() + ","
                + getCMND() + ","
                + getPhoneNumber() + ","
                + getEmail() + ","
                + getLevel() + ","
                + getPosition() + ","
                + getWage();
    }
}
