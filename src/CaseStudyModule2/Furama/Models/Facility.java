package CaseStudyModule2.Furama.Models;

import java.util.Objects;

public abstract class Facility {
    private String idFacility;
    private String nameServices;
    private String unableSquare;
    private String rentalCosts;
    private String maxNumber;
    private String rentalType;

    public Facility(String idFacility, String nameServices, String unableSquare, String rentalCosts, String maxNumber, String rentalType) {
        this.idFacility = idFacility;
        this.nameServices = nameServices;
        this.unableSquare = unableSquare;
        this.rentalCosts = rentalCosts;
        this.maxNumber = maxNumber;
        this.rentalType = rentalType;
    }

    public String getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(String idFacility) {
        this.idFacility = idFacility;
    }

    public String getNameServices() {
        return nameServices;
    }

    public void setNameServices(String nameServices) {
        this.nameServices = nameServices;
    }

    public String getUnableSquare() {
        return unableSquare;
    }

    public void setUnableSquare(String unableSquare) {
        this.unableSquare = unableSquare;
    }

    public String getRentalCosts() {
        return rentalCosts;
    }

    public void setRentalCosts(String rentalCosts) {
        this.rentalCosts = rentalCosts;
    }

    public String getMaxNumber() {
        return maxNumber;
    }

    public void setMaxNumber(String maxNumber) {
        this.maxNumber = maxNumber;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    public String toString() {
        return getNameServices() + ","
                + getUnableSquare() + ","
                + getRentalCosts() + ","
                + getMaxNumber() + ","
                + getRentalType();
    }
}
