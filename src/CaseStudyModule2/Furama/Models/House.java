package CaseStudyModule2.Furama.Models;

public class House extends Services {
    private String typeOfRoomHouse;
    private String otherFacilitiesInHouse;
    private int numberOfFloorsInHouse;

    public House(String typeOfRoomHouse, String otherFacilitiesInHouse, int numberOfFloorsInHouse) {
        this.typeOfRoomHouse = typeOfRoomHouse;
        this.otherFacilitiesInHouse = otherFacilitiesInHouse;
        this.numberOfFloorsInHouse = numberOfFloorsInHouse;
    }

    public House() {

    }

    public House(String serviceName, int unableArea, int rentalCosts, int maxNumberOfMembers, String rentalsType, String typeOfRoomHouse, String otherFacilitiesInHouse, int numberOfFloorsInHouse) {
        super();
    }

    public String getTypeOfRoomHouse() {
        return typeOfRoomHouse;
    }

    public void setTypeOfRoomHouse(String typeOfRoomHouse) {
        this.typeOfRoomHouse = typeOfRoomHouse;
    }

    public String getOtherFacilitiesInHouse() {
        return otherFacilitiesInHouse;
    }

    public void setOtherFacilitiesInHouse(String otherFacilitiesInHouse) {
        this.otherFacilitiesInHouse = otherFacilitiesInHouse;
    }

    public int getNumberOfFloorsInHouse() {
        return numberOfFloorsInHouse;
    }

    public void setNumberOfFloorsInHouse(int numberOfFloorsInHouse) {
        this.numberOfFloorsInHouse = numberOfFloorsInHouse;
    }

    public String toString() {
        House house = new House();

        return house.getServiceName() + ',' + house.getServiceName() + ',' + house.getServiceName() + ',' +
                house.getServiceName() + ',' + house.getServiceName() + ',' + house.getTypeOfRoomHouse() + ',' +
                house.getOtherFacilitiesInHouse() + ',' + house.getNumberOfFloorsInHouse();
    }

    @Override
    public void showInfo() {
        House house = new House();
        System.out.println("Tên dịch vụ của House: " + house.getServiceName());
        System.out.println("Diện tích sử dụng của House: " + house.getServiceName());
        System.out.println("Chi phí thuê của House: " + house.getServiceName());
        System.out.println("Số lượng người tối đa của House: " + house.getServiceName());
        System.out.println("Kiểu thuê của House (năm, tháng, ngày, giờ): " + house.getServiceName());
        System.out.println("Tiêu chuẩn phòng của House: " + house.getTypeOfRoomHouse());
        System.out.println("Tiện nghi khác của House: " + house.getOtherFacilitiesInHouse());
        System.out.println("Số tầng của House: " + house.getNumberOfFloorsInHouse());
    }
}
