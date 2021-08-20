package CaseStudyModule2.Furama.Models;

public class Villa extends Facility{
    private String roomStandard;
    private String poolSquare;
    private String floors;


    public Villa(String nameServices, String unableSquare, String rentalCosts, String maxNumber, String rentalType, String roomStandard, String poolSquare, String floors ) {
        super(nameServices,unableSquare,rentalCosts,maxNumber,rentalType);
        this.roomStandard = roomStandard;
        this.poolSquare = poolSquare;
        this.floors = floors;
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public void setRoomStandard(String roomStandard) {
        this.roomStandard = roomStandard;
    }

    public String getPoolSquare() {
        return poolSquare;
    }

    public void setPoolSquare(String poolSquare) {
        this.poolSquare = poolSquare;
    }

    public String getFloors() {
        return floors;
    }

    public void setFloors(String floors) {
        this.floors = floors;
    }
}
