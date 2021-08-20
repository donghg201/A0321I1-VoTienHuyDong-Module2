package CaseStudyModule2.Furama.Models;

public class Booking {
    private String bookingID;
    private String dayStart;
    private String dayEnd;
    private String customerID;
    private String serviceName;
    private String serviceType;

    public Booking(String bookingID, String dayStart, String dayEnd, String customerID, String serviceName, String serviceType) {
        this.bookingID = bookingID;
        this.dayStart = dayStart;
        this.dayEnd = dayEnd;
        this.customerID = customerID;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
    }

    public String getBookingID() {
        return bookingID;
    }

    public void setBookingID(String bookingID) {
        this.bookingID = bookingID;
    }

    public String getDayStart() {
        return dayStart;
    }

    public void setDayStart(String dayStart) {
        this.dayStart = dayStart;
    }

    public String getDayEnd() {
        return dayEnd;
    }

    public void setDayEnd(String dayEnd) {
        this.dayEnd = dayEnd;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String toString() {
        return getBookingID() + ","
                + getDayStart() + ","
                + getDayEnd() + ","
                + getCustomerID() + ","
                + getServiceName() + ","
                + getServiceType();
    }
}
