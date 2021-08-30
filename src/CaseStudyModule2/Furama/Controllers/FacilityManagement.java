package CaseStudyModule2.Furama.Controllers;

import CaseStudyModule2.Furama.Services.FacilityServiceImpl;

import java.util.Scanner;

public class FacilityManagement {

    public static void facilityManagement() {
        int choice = -1;
        do {
            System.out.printf("-----Facilty List Option-----\n" +
                    "1. Display list facility\n" +
                    "2. Add new facility\n" +
                    "3. Display list facility maintenance\n" +
                    "4. Return main menu\n" +
                    "------------<>------------\n"
            );
            System.out.print("Enter your option: ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            System.out.println();
            switch (choice) {
                case 1:
                    FacilityServiceImpl facilityService = new FacilityServiceImpl();
                    facilityService.display();
                    break;
                case 2:
                    FacilityServiceImpl.addNewFacility();
                    break;
                case 3:
                    break;
                case 4:
                    FuramaController.displayMenu();
                    break;
            }
        } while (true);
    }
}
