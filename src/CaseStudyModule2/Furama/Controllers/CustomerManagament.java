package CaseStudyModule2.Furama.Controllers;

import CaseStudyModule2.Furama.Services.CustomerServiceImpl;

import java.util.Scanner;

public class CustomerManagament {

    public static void customerManagement() {
        int choice = -1;
        do {
            System.out.printf("1. Display list customers\n" +
                    "2. Add new customers\n" +
                    "3. Edit customers\n" +
                    "4. Return main menu\n"
            );
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    CustomerServiceImpl.displayCustomerList();
                    break;
                case 2:
                    CustomerServiceImpl.addNewCustomer();
                    break;
                case 3:
                    CustomerServiceImpl.editCustomer();
                    break;
                case 4:
                    FuramaController.displayMenu();
                    break;
            }
        } while (true);
    }
}
