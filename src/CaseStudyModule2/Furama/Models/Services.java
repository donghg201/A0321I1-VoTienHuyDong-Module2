package CaseStudyModule2.Furama.Models;

public abstract class Services {
    private String serviceName;
    private int unableArea;
    private int rentalCosts;
    private int maxNumberOfMembers;
    private String rentalsType;
    private String id;


    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public int getUnableArea() {
        return unableArea;
    }

    public void setUnableArea(int unableArea) {
        this.unableArea = unableArea;
    }

    public int getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(int rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public int getMaxNumberOfMembers() {
        return maxNumberOfMembers;
    }

    public void setMaxNumberOfMembers(int maxNumberOfMembers) {
        this.maxNumberOfMembers = maxNumberOfMembers;
    }

    public String getRentalsType() {
        return rentalsType;
    }

    public void setRentalsType(String rentalsType) {
        this.rentalsType = rentalsType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public abstract void showInfo();
}
