package CaseStudyModule2.Furama.Controllers;

import CaseStudyModule2.Furama.Models.House;
import CaseStudyModule2.Furama.Models.Room;
import CaseStudyModule2.Furama.Models.Villa;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    private static Scanner scanner = new Scanner(System.in);
    private static List<Villa> villaList = new ArrayList<>();
    private static List<House> houseList = new ArrayList<>();
    private static List<Room> roomList = new ArrayList<>();

    public static void displayMainMenu() {
        int choice = -1;
        do {
            System.out.printf("1. Add New Services\n" +
                    "2. Show Services\n" +
                    "3. Add New Customer\n" +
                    "4. Show Information of Customer\n" +
                    "5. Add New Booking\n" +
                    "6. Show Information of Employee\n" +
                    "7. Exit\n"
            );
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addNewServices();
                    break;
                case 2:
                    showServices();
                    break;
                case 3:
//                    addNewCustomer();
                    break;
                case 4:
//                    showInfomatioOfCustomer();
                    break;
                case 5:
//                    addNewBooking();
                    break;
                case 6:
//                    showInformationOfEmployee();
                    break;
                case 7:
                    System.exit(0);
            }

        } while (true);
    }

    public static void addNewServices() {
        do {
            int choice = -1;
            System.out.printf("1. Add New Villa\n" +
                    "2. Add New House\n" +
                    "3. Add New Room\n" +
                    "4. Back to menu\n" +
                    "5. Exit\n"
            );

            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addNewVilla();
                    break;
                case 2:
                    addNewHouse();
                    break;
                case 3:
                    addNewRoom();
                    break;
                case 4:
                    displayMainMenu();
                    break;
                case 5:
                    System.exit(0);
            }
        } while (true);
    }

    public static void addNewVilla() {
        Villa villa = new Villa();
        System.out.print("Nhập tên dịch vụ Villa: ");
        String a = scanner.nextLine();
        villa.setServiceName(scanner.nextLine());
        System.out.print("Diện tích sử dụng của Villa: ");
        villa.setUnableArea(Integer.parseInt(scanner.nextLine()));
        System.out.print("Chi phí thuê của Villa: ");
        villa.setRentalCosts(Integer.parseInt(scanner.nextLine()));
        System.out.print("Số lượng người tối đa của Villa: ");
        villa.setMaxNumberOfMembers(Integer.parseInt(scanner.nextLine()));
        System.out.print("Kiểu thuê của Villa (năm, tháng, ngày, giờ): ");
        villa.setRentalsType(scanner.nextLine());
        System.out.print("Tiêu chuẩn phòng của Villa: ");
        villa.setTypeOfRoomVilla(scanner.nextLine());
        System.out.print("Tiện nghi khác của Villa: ");
        villa.setOtherFacilitiesInVilla(scanner.nextLine());
        System.out.print("Diện tích hồ bơi của villa: ");
        villa.setSquareOfVillaPool(Integer.parseInt(scanner.nextLine()));
        System.out.print("Số tầng của Villa : ");
        villa.setNumberOfFloorsInVilla(Integer.parseInt(scanner.nextLine()));
        try {
            FileWriter fileVilla = new FileWriter("Villa.csv");
            fileVilla.write(villa.toString());
            fileVilla.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

    }

    public static void addNewHouse() {
        House house = new House();
        System.out.print("Nhập tên dịch vụ House: ");
        String a = scanner.nextLine();
        house.setServiceName(scanner.nextLine());
        System.out.print("Diện tích sử dụng của House: ");
        house.setUnableArea(Integer.parseInt(scanner.nextLine()));
        System.out.print("Chi phí thuê của House: ");
        house.setRentalCosts(Integer.parseInt(scanner.nextLine()));
        System.out.print("Số lượng người tối đa của House: ");
        house.setMaxNumberOfMembers(Integer.parseInt(scanner.nextLine()));
        System.out.print("Kiểu thuê của House (năm, tháng, ngày, giờ): ");
        house.setRentalsType(scanner.nextLine());
        System.out.print("Tiêu chuẩn phòng của House: ");
        house.setTypeOfRoomHouse(scanner.nextLine());
        System.out.print("Tiện nghi khác của House: ");
        house.setOtherFacilitiesInHouse(scanner.nextLine());
        System.out.print("Số tầng của House : ");
        house.setNumberOfFloorsInHouse(Integer.parseInt(scanner.nextLine()));
        try {
            FileWriter fileHouse = new FileWriter("House.csv");
            fileHouse.write(house.toString());
            fileHouse.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void addNewRoom() {
        Room room = new Room();
        System.out.print("Nhập tên dịch vụ Room: ");
        String a = scanner.nextLine();
        room.setServiceName(scanner.nextLine());
        System.out.print("Diện tích sử dụng của Room: ");
        room.setUnableArea(Integer.parseInt(scanner.nextLine()));
        System.out.print("Chi phí thuê của Room: ");
        room.setRentalCosts(Integer.parseInt(scanner.nextLine()));
        System.out.print("Số lượng người tối đa của Room: ");
        room.setMaxNumberOfMembers(Integer.parseInt(scanner.nextLine()));
        System.out.print("Kiểu thuê của Room (năm, tháng, ngày, giờ): ");
        room.setRentalsType(scanner.nextLine());
        System.out.print("Dịch vụ miễn phí đi kèm của Room: ");
        room.setFreeServiceBonus(scanner.nextLine());
        try {
            FileWriter fileRoom = new FileWriter("Room.csv");
            BufferedWriter bufferedWriter = new BufferedWriter(fileRoom);
            bufferedWriter.write(room.toString());
            bufferedWriter.close();
            fileRoom.close();
        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void showServices() {
        int choice = -1;
        do {
            System.out.printf("1. Show all Villa\n" +
                    "2. Show all House\n" +
                    "3. Show all Room\n" +
                    "4. Show All Name Villa Not Duplicate\n" +
                    "5. Show All Name House Not Duplicate\n" +
                    "6. Show All Name Name Not Duplicate\n" +
                    "7. Back to Menu\n" +
                    "8. Exit\n"
            );
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    try {
                        File myObj = new File("Villa.csv");
                        Scanner myReader = new Scanner(myObj);
                        while (myReader.hasNextLine()) {
                            String data = myReader.nextLine();
                            System.out.println(data);
                        }
                        myReader.close();
                    } catch (FileNotFoundException e) {
                        System.out.println("An error occurred.");
                        e.printStackTrace();
                    }
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    break;
                case 7:
                    displayMainMenu();
                    break;
                case 8:
                    System.exit(0);
            }
        } while (true);
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
