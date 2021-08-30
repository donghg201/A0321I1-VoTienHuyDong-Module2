package CaseStudyModule2.Furama.Services;

import CaseStudyModule2.Furama.Controllers.FacilityManagement;
import CaseStudyModule2.Furama.Controllers.FuramaController;
import CaseStudyModule2.Furama.Models.*;
import CaseStudyModule2.Furama.Utils.ReadAndWriteFile;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    static LinkedHashMap<Facility, Integer> linkedHashMap = new LinkedHashMap<>();
    static Scanner scanner = new Scanner(System.in);


    public static void upValue(Facility facility) {
        int value = 1;
        if (linkedHashMap.get(facility) != null) {
            value = linkedHashMap.get(facility);
            value = value + 1;
        }
        linkedHashMap.put(facility, value);
    }

    public static void addNewFacility() {
        try {
            int choice = -1;
            do {
                System.out.printf("-----Add Facility List Option-----\n" +
                        "1. Add new villa\n" +
                        "2. Add new house\n" +
                        "3. Add new room\n" +
                        "4. Return main menu\n" +
                        "------------<>------------\n"
                );
                System.out.print("Enter your option: ");
                Scanner scanner = new Scanner(System.in);
                choice = scanner.nextInt();
                System.out.println();
                String a = scanner.nextLine();
                FacilityServiceImpl facilityService = new FacilityServiceImpl();
                switch (choice) {
                    case 1:
                        facilityService.addVilla();
                        break;
                    case 2:
                        facilityService.addHouse();
                        break;
                    case 3:
                        facilityService.addRoom();
                        break;
                    case 4:
                        FacilityManagement.facilityManagement();
                        break;
                }
            } while (true);
        } catch (NumberFormatException e) {
            System.err.print("You entered wrong format!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void display() {
        try {
            if (linkedHashMap.isEmpty() == false) {
                Set<Facility> keySet = linkedHashMap.keySet();
                for (Facility key : keySet) {
                    System.out.println(key);
                }
            }
        } catch (NullPointerException e) {
            System.err.print("List is empty!\n");
        }
        System.out.println();
    }

    @Override
    public void displayMaintain() {

    }

    @Override
    public void addVilla() {
        try {
            System.out.print("Please enter id facility: ");
            String idFacility = scanner.nextLine();
            System.out.print("Please enter service name: ");
            String nameServicesVilla = scanner.nextLine();
            System.out.print("Please enter unable square: ");
            String unableSquareVilla = scanner.nextLine();
            System.out.print("Please enter rental costs: ");
            String rentalCostsVilla = scanner.nextLine();
            System.out.print("Please enter max number: ");
            String maxNumberVilla = scanner.nextLine();
            System.out.print("Please enter rental type: ");
            String rentalTypeVilla = scanner.nextLine();
            System.out.print("Please enter room standard: ");
            String roomStandardVilla = scanner.nextLine();
            System.out.print("Please enter pool square: ");
            String poolSquareVilla = scanner.nextLine();
            System.out.print("Please enter floors: ");
            String floorsVilla = scanner.nextLine();
            System.out.println();
            Villa villa = new Villa(idFacility, nameServicesVilla, unableSquareVilla, rentalCostsVilla, maxNumberVilla,
                    rentalTypeVilla, roomStandardVilla, poolSquareVilla, floorsVilla);
            linkedHashMap.put(villa, 0);
            ReadAndWriteFile.write((Collection) linkedHashMap,
                    "C:\\A0321I1_VoTienHuyDong\\Module 2\\src\\CaseStudyModule2\\Furama\\Data\\villa.csv");
            upValue(villa);
        } catch (NumberFormatException e) {
            System.err.print("You entered wrong format!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addHouse() {
        try {
            System.out.print("Please enter id facility: ");
            String idFacility = scanner.nextLine();
            System.out.print("Please enter service name: ");
            String nameServicesHouse = scanner.nextLine();
            System.out.print("Please enter unable square: ");
            String unableSquareHouse = scanner.nextLine();
            System.out.print("Please enter rental costs: ");
            String rentalCostsHouse = scanner.nextLine();
            System.out.print("Please enter max number: ");
            String maxNumberHouse = scanner.nextLine();
            System.out.print("Please enter rental type: ");
            String rentalTypeHouse = scanner.nextLine();
            System.out.print("Please enter room standard: ");
            String roomStandardHouse = scanner.nextLine();
            System.out.print("Please enter floors: ");
            String floorsHouse = scanner.nextLine();
            System.out.println();
            House house = new House(idFacility, nameServicesHouse, unableSquareHouse, rentalCostsHouse, maxNumberHouse,
                    rentalTypeHouse, roomStandardHouse, floorsHouse);
            linkedHashMap.put(house, 0);
            ReadAndWriteFile.write((Collection) linkedHashMap,
                    "C:\\A0321I1_VoTienHuyDong\\Module 2\\src\\CaseStudyModule2\\Furama\\Data\\house.csv");
            upValue(house);
        } catch (NumberFormatException e) {
            System.err.print("You entered wrong format!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addRoom() {
        try {
            System.out.print("Please enter id facility: ");
            String idFacility = scanner.nextLine();
            System.out.print("Please enter service name: ");
            String nameServicesRoom = scanner.nextLine();
            System.out.print("Please enter unable square: ");
            String unableSquareRoom = scanner.nextLine();
            System.out.print("Please enter rental costs: ");
            String rentalCostsRoom = scanner.nextLine();
            System.out.print("Please enter max number: ");
            String maxNumberRoom = scanner.nextLine();
            System.out.print("Please enter rental type: ");
            String rentalTypeRoom = scanner.nextLine();
            System.out.print("Please enter room standard: ");
            String freeServiceBonusRoom = scanner.nextLine();
            System.out.println();
            Room room = new Room(idFacility, nameServicesRoom, unableSquareRoom, rentalCostsRoom, maxNumberRoom,
                    rentalTypeRoom, freeServiceBonusRoom);
            linkedHashMap.put(room, 0);
            ReadAndWriteFile.write((Collection) linkedHashMap,
                    "C:\\A0321I1_VoTienHuyDong\\Module 2\\src\\CaseStudyModule2\\Furama\\Data\\room.csv");
            upValue(room);
        } catch (NumberFormatException e) {
            System.err.print("You entered wrong format!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
