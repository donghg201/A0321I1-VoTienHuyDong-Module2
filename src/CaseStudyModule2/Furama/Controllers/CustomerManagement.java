package CaseStudyModule2.Furama.Controllers;

import CaseStudyModule2.Furama.Services.CustomerServiceImpl;

import java.util.Scanner;

public class CustomerManagement {

    public static void customerManagement() {
        int choice = -1;
        do {
            System.out.printf("-----Customer List Option-----\n" +
                    "1. Display list customers\n" +
                    "2. Add new customers\n" +
                    "3. Edit customers\n" +
                    "4. Return main menu\n" +
                    "------------<>------------\n"
            );
            System.out.print("Enter your option: ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            System.out.println();
            CustomerServiceImpl customerService = new CustomerServiceImpl();
            switch (choice) {
                case 1:
                    customerService.displayCustomerList();
                    break;
                case 2:
                    customerService.addNewCustomer();
                    break;
                case 3:
                    customerService.editCustomer();
                    break;
                case 4:
                    FuramaController.displayMenu();
                    break;
            }
        } while (true);
    }
}
