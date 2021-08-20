package CaseStudyModule2.Furama.Models;

public class Room extends Facility{
    private String freeServiceBonus;



    public Room(String nameServices, String unableSquare, String rentalCosts, String maxNumber, String rentalType, String freeServiceBonus) {
        super(nameServices,unableSquare,rentalCosts,maxNumber,rentalType);
        this.freeServiceBonus = freeServiceBonus;
    }

    public String getFreeServiceBonus() {
        return freeServiceBonus;
    }

    public void setFreeServiceBonus(String freeServiceBonus) {
        this.freeServiceBonus = freeServiceBonus;
    }
}
