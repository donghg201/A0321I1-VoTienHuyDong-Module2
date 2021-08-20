package CaseStudyModule2.Furama.Controllers;

import java.util.Scanner;

public class BookingManagament {

    public static void bookingManagement() {
        int choice = -1;
        do {
            System.out.printf("1. Add new booking\n" +
                    "2. Display list booking\n" +
                    "3. Create new constracts\n" +
                    "4. Display list contracts\n" +
                    "5. Edit contracts\n" +
                    "6. Return main menu\n"
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
//                    addNewCustomer();
                    break;
                case 4:
//                    showInfomatioOfCustomer();
                    break;
                case 5:
                    break;
                case 6:
                    FuramaController.displayMenu();
                    break;
            }
        } while (true);
    }
}
