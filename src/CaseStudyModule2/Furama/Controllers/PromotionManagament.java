package CaseStudyModule2.Furama.Controllers;

import java.util.Scanner;

public class PromotionManagament {

    public static void promotionManagement() {
        int choice = -1;
        do {
            System.out.printf("1. Display list customers use service\n" +
                    "2. Display list customers get voucher\n" +
                    "3. Return main menu\n"
            );
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
//                    addNewServices();
                    break;
                case 2:
//                    showServices();
                    break;
                case 3:
                    FuramaController.displayMenu();
                    break;
            }
        } while (true);
    }
}
