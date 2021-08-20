package CaseStudyModule2.Furama.Services;

import CaseStudyModule2.Furama.Controllers.FuramaController;
import CaseStudyModule2.Furama.Models.*;

import java.util.LinkedHashMap;
import java.util.Set;
import java.util.Scanner;

public class FacilityServiceImpl {
    private static LinkedHashMap<Facility, Integer> linkedHashMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void displayListFacility() {
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
    }

    public void tangValue(Facility facility) {
        int value = 1;
        if (linkedHashMap.get(facility) != null) {
            value = linkedHashMap.get(facility);
            value = value + 1;

        }
        linkedHashMap.put(facility, value);
    }

    public static void addNewFacility() {
        int choice = -1;
        do {
            System.out.printf("1. Add new villa\n" +
                    "2. Add new house\n" +
                    "3. Add new room\n" +
                    "4. Return main menu\n"
            );
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            String a = scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Please enter service name");
                    String nameServicesVilla = scanner.nextLine();
                    System.out.println("Please enter unable square");
                    String unableSquareVilla = scanner.nextLine();
                    System.out.println("Please enter rental costs");
                    String rentalCostsVilla = scanner.nextLine();
                    System.out.println("Please enter max number");
                    String maxNumberVilla = scanner.nextLine();
                    System.out.println("Please enter rental type");
                    String rentalTypeVilla = scanner.nextLine();
                    System.out.println("Please enter room standard");
                    String roomStandardVilla = scanner.nextLine();
                    System.out.println("Please enter pool square");
                    String poolSquareVilla = scanner.nextLine();
                    System.out.println("Please enter floors");
                    String floorsVilla = scanner.nextLine();
                    linkedHashMap.put(new Villa(nameServicesVilla, unableSquareVilla, rentalCostsVilla, maxNumberVilla, rentalTypeVilla, roomStandardVilla, poolSquareVilla, floorsVilla),0);
                    break;
                case 2:
                    System.out.println("Please enter service name");
                    String nameServicesHouse = scanner.nextLine();
                    System.out.println("Please enter unable square");
                    String unableSquareHouse = scanner.nextLine();
                    System.out.println("Please enter rental costs");
                    String rentalCostsHouse = scanner.nextLine();
                    System.out.println("Please enter max number");
                    String maxNumberHouse = scanner.nextLine();
                    System.out.println("Please enter rental type");
                    String rentalTypeHouse = scanner.nextLine();
                    System.out.println("Please enter room standard");
                    String roomStandardHouse = scanner.nextLine();
                    System.out.println("Please enter floors");
                    String floorsHouse = scanner.nextLine();
                    linkedHashMap.put(new House(nameServicesHouse, unableSquareHouse, rentalCostsHouse, maxNumberHouse, rentalTypeHouse, roomStandardHouse, floorsHouse),0);
                    break;
                case 3:
                    System.out.println("Please enter service name");
                    String nameServicesRoom = scanner.nextLine();
                    System.out.println("Please enter unable square");
                    String unableSquareRoom = scanner.nextLine();
                    System.out.println("Please enter rental costs");
                    String rentalCostsRoom = scanner.nextLine();
                    System.out.println("Please enter max number");
                    String maxNumberRoom = scanner.nextLine();
                    System.out.println("Please enter rental type");
                    String rentalTypeRoom = scanner.nextLine();
                    System.out.println("Please enter room standard");
                    String freeServiceBonusRoom = scanner.nextLine();
                    linkedHashMap.put(new Room(nameServicesRoom, unableSquareRoom, rentalCostsRoom, maxNumberRoom, rentalTypeRoom, freeServiceBonusRoom),0);
                    break;
                case 4:
                    FuramaController.displayMenu();
                    break;
            }
        } while (true);
    }
}
