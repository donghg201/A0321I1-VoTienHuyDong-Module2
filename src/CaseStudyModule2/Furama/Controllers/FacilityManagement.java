package CaseStudyModule2.Furama.Controllers;

import CaseStudyModule2.Furama.Models.Facility;
import CaseStudyModule2.Furama.Services.FacilityServiceImpl;

import java.util.Scanner;

public class FacilityManagement {

    public static void facilityManagement() {
        int choice = -1;
        do {
            System.out.printf("1. Display list facility\n" +
                    "2. Add new facility\n" +
                    "3. Display list facility maintenance\n" +
                    "4. Return main menu\n"
            );
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    FacilityServiceImpl.displayListFacility();
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
