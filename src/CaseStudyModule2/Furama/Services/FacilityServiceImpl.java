package CaseStudyModule2.Furama.Services;

import CaseStudyModule2.Furama.Controllers.FacilityManagement;
import CaseStudyModule2.Furama.Models.*;
import CaseStudyModule2.Furama.Utils.ReadAndWriteFile;
import CaseStudyModule2.Furama.Utils.RegexData;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {

    public static final String REGEX_ID_VILLA = "(SVVL)[-][\\d]{4}";
    public static final String REGEX_ID_HOUSE = "(SVHO)[-][\\d]{4}";
    public static final String REGEX_ID_ROOM = "(SVRO)[-][\\d]{4}";
    public static final String REGEX_STR = "[A-Z][a-z]+";
    public static final String REGEX_AREA = "^([3-9]\\d|[1-9]\\d{2,})$";
    public static final String REGEX_COST = "^^\\d*[1-9]\\d*$";
    public static final String REGEX_MAX = "^[1-9]|([1][0-9])|(20)$";

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
            String idFacility = inputIdVilla();
            String nameServicesVilla = inputName();
            String unableSquareVilla = inputArea();
            String rentalCostsVilla = inputCost();
            String maxNumberVilla = inputMaxNumber();
            String rentalTypeVilla = inputType();
            String roomStandardVilla = inputStandard();
            String poolSquareVilla = inputSquare();
            String floorsVilla = inputFloor();
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
            String idFacility = inputIdHouse();
            String nameServicesHouse = inputName();
            String unableSquareHouse = inputArea();
            String rentalCostsHouse = inputCost();
            String maxNumberHouse = inputMaxNumber();
            String rentalTypeHouse = inputType();
            String roomStandardHouse = inputStandard();
            String floorsHouse = inputFloor();
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
            String idFacility = inputIdRoom();
            String nameServicesRoom = inputName();
            String unableSquareRoom = inputArea();
            String rentalCostsRoom = inputCost();
            String maxNumberRoom = inputMaxNumber();
            String rentalTypeRoom = inputType();
            String freeServiceBonusRoom = inputStandard();
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

    private String inputIdVilla() {
        System.out.print("Please enter id facility: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID_VILLA, "You entered wrong format! The format is SVVL-XXXX.");
    }

    private String inputIdHouse() {
        System.out.print("Please enter id facility: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID_HOUSE, "You entered wrong format! The format is SVHO-XXXX.");
    }

    private String inputIdRoom() {
        System.out.print("Please enter id facility: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_ID_ROOM, "You entered wrong format! The format is SVRO-XXXX.");
    }

    private String inputName() {
        System.out.print("Please enter service name: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_STR, "You entered wrong format! The format is to be capitalized first letter.");
    }

    private String inputArea() {
        System.out.print("Please enter unable square: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_AREA, "You entered wrong format! The format is more than 30.");
    }

    private String inputCost() {
        System.out.print("Please enter rental costs: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_COST, "You entered wrong format! The format is more than 0.");
    }

    private String inputMaxNumber() {
        System.out.print("Please enter max number: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_MAX, "You entered wrong format! The format is more than 0 and less than 20.");
    }

    private String inputType() {
        System.out.print("Please enter rental type: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_STR, "You entered wrong format! The format is to be capitalized first letter.");
    }

    private String inputStandard() {
        System.out.print("Please enter room standard: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_STR, "You entered wrong format! The format is to be capitalized first letter.");
    }

    private String inputSquare() {
        System.out.print("Please enter pool square: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_AREA, "You entered wrong format! The format is more than 0.");
    }

    private String inputFloor() {
        System.out.print("Please enter floors: ");
        return RegexData.regexStr(scanner.nextLine(), REGEX_COST, "You entered wrong format! The format is more than 0.");
    }
}
