package CaseStudyModule2.Furama.Models;

public class Villa extends Services {
    private String typeOfRoomVilla;
    private String otherFacilitiesInVilla;
    private int squareOfVillaPool;
    private int numberOfFloorsInVilla;

    public Villa() {

    }

    public Villa(String typeOfRoomVilla, String otherFacilitiesInVilla, int squareOfVillaPool, int numberOfFloorsInVilla) {
        this.typeOfRoomVilla = typeOfRoomVilla;
        this.otherFacilitiesInVilla = otherFacilitiesInVilla;
        this.squareOfVillaPool = squareOfVillaPool;
        this.numberOfFloorsInVilla = numberOfFloorsInVilla;
    }


    public Villa(String serviceName, int unableArea, int rentalCosts, int numberOfFloorsInVilla, double rentalCosts1, String typeOfRoomVilla, String otherFacilitiesInVilla, double squareOfVillaPool, int numberOfFloorsInVilla1) {
        super();
    }

    public String getTypeOfRoomVilla() {
        return typeOfRoomVilla;
    }

    public void setTypeOfRoomVilla(String typeOfRoomVilla) {
        this.typeOfRoomVilla = typeOfRoomVilla;
    }

    public String getOtherFacilitiesInVilla() {
        return otherFacilitiesInVilla;
    }

    public void setOtherFacilitiesInVilla(String otherFacilitiesInVilla) {
        this.otherFacilitiesInVilla = otherFacilitiesInVilla;
    }

    public int getSquareOfVillaPool() {
        return squareOfVillaPool;
    }

    public void setSquareOfVillaPool(int squareOfVillaPool) {
        this.squareOfVillaPool = squareOfVillaPool;
    }

    public int getNumberOfFloorsInVilla() {
        return numberOfFloorsInVilla;
    }

    public void setNumberOfFloorsInVilla(int numberOfFloorsInVilla) {
        this.numberOfFloorsInVilla = numberOfFloorsInVilla;
    }

    public String toString() {
        Villa villa = new Villa();
        return villa.getServiceName() + ',' + villa.getUnableArea() + ',' + villa.getRentalCosts() + ',' +
                villa.getMaxNumberOfMembers() + ',' + villa.getRentalsType() + ',' + villa.getTypeOfRoomVilla() + ',' +
                villa.getOtherFacilitiesInVilla() + ',' + villa.getSquareOfVillaPool() + ',' +
                villa.getNumberOfFloorsInVilla();

    }

    @Override
    public void showInfo() {
        Villa villa = new Villa();
        System.out.println("Tên dịch vụ của Villa: " + villa.getServiceName());
        System.out.println("Diện tích sử dụng của Villa: " + villa.getUnableArea());
        System.out.println("Chi phí thuê của Villa: " + villa.getRentalCosts());
        System.out.println("Số lượng người tối đa của Villa: " + villa.getMaxNumberOfMembers());
        System.out.println("Kiểu thuê của Villa (năm, tháng, ngày, giờ): " + villa.getRentalsType());
        System.out.println("Tiêu chuẩn phòng của Villa: " + villa.getTypeOfRoomVilla());
        System.out.println("Tiện nghi khác của Villa: " + villa.getOtherFacilitiesInVilla());
        System.out.println("Diện tích hồ bơi của villa: " + villa.getSquareOfVillaPool());
        System.out.println("Số tầng của Villa : " + villa.getNumberOfFloorsInVilla());
    }


}
