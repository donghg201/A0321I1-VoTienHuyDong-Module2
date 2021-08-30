package CaseStudyModule2.Furama.Controllers;

import CaseStudyModule2.Furama.Services.PromotionServiceImpl;

import java.util.Scanner;

public class PromotionManagement {

    public static void promotionManagement() {
        int choice = -1;
        do {
            System.out.printf("-----Promotion List Option-----\n" +
                    "1. Display list customers use service\n" +
                    "2. Display list customers get voucher\n" +
                    "3. Return main menu\n" +
                    "------------<>------------\n"
            );
            System.out.print("Enter your option: ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            System.out.println();
            switch (choice) {
                case 1:
                    PromotionServiceImpl.displayListCustomersUseService();
                    break;
                case 2:
                    PromotionServiceImpl.displayListCustomersGetVoucher();
                    break;
                case 3:
                    FuramaController.displayMenu();
                    break;
            }
        } while (true);
    }
}
