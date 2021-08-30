package CaseStudyModule2.Furama.Models;

public class Contract {
    private String contractNumber;
    private String bookindID;
    private String prePay;
    private String payFull;
    private int customerID;

    public Contract(String contractNumber, String bookindID, String prePay, String payFull, int customerID) {
        this.contractNumber = contractNumber;
        this.bookindID = bookindID;
        this.prePay = prePay;
        this.payFull = payFull;
        this.customerID = customerID;
    }
    public Contract(){

    }

    public String getContractNumber() {
        return contractNumber;
    }

    public void setContractNumber(String contractNumber) {
        this.contractNumber = contractNumber;
    }

    public String getBookindID() {
        return bookindID;
    }

    public void setBookindID(String bookindID) {
        this.bookindID = bookindID;
    }

    public String getPrePay() {
        return prePay;
    }

    public void setPrePay(String prePay) {
        this.prePay = prePay;
    }

    public String getPayFull() {
        return payFull;
    }

    public void setPayFull(String payFull) {
        this.payFull = payFull;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractNumber='" + contractNumber + '\'' +
                ", bookindID='" + bookindID + '\'' +
                ", prePay='" + prePay + '\'' +
                ", payFull='" + payFull + '\'' +
                ", customerID=" + customerID +
                '}';
    }
}
