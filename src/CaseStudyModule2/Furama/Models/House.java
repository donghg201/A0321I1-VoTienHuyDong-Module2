package CaseStudyModule2.Furama.Models;

public class House extends Facility {
    private String roomStandard;
    private String floors;

    public House(String nameServices, String unableSquare, String rentalCosts, String maxNumber, String rentalType, String roomStandard, String floors) {
        super(nameServices, unableSquare, rentalCosts, maxNumber, rentalType);
        this.roomStandard = roomStandard;
        this.floors = floors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getFloors() {
        return floors;
    }

    public void setFloors(String floors) {
        this.floors = floors;
    }
}
