package CaseStudyModule2.Furama.Models;

public class Room extends Services {
    private String freeServiceBonus;

    public Room() {

    }

    public Room(String freeServiceBonus) {
        this.freeServiceBonus = freeServiceBonus;
    }

    public Room(String serviceName, int unableArea, int rentalCosts, int maxNumberOfMembers, String rentalsType, String freeServiceBonus) {
        super();
    }

    public String getFreeServiceBonus() {
        return freeServiceBonus;
    }

    public void setFreeServiceBonus(String freeServiceBonus) {
        this.freeServiceBonus = freeServiceBonus;
    }

    public String toString() {
        Room room = new Room();
        return room.getServiceName() + ',' + room.getUnableArea() + ',' + room.getRentalCosts() + ',' +
                room.getMaxNumberOfMembers() + ',' + room.getRentalsType() + ',' + room.getFreeServiceBonus();
    }

    @Override
    public void showInfo() {
        Room room = new Room();
        System.out.println("Tên dịch vụ của Room: " + room.getServiceName());
        System.out.println("Diện tích sử dụng của Room: " + room.getUnableArea());
        System.out.println("Chi phí thuê của Room: " + room.getRentalCosts());
        System.out.println("Số lượng người tối đa của Room: " + room.getMaxNumberOfMembers());
        System.out.println("Kiểu thuê của Room (năm, tháng, ngày, giờ): " + room.getRentalsType());
        System.out.println("Dịch vụ miễn phí đi kèm của Room: " + room.getFreeServiceBonus());
    }
}
