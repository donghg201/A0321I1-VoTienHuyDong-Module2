package CaseStudyModule2.Furama.Controllers;

import CaseStudyModule2.Furama.Services.BookingServiceImpl;
import CaseStudyModule2.Furama.Services.ContractServiceImpl;

import java.util.Scanner;

public class BookingManagement {

    public static void bookingManagement() {
        int choice = -1;
        do {
            System.out.printf("-----Booking list Option-----\n" +
                    "1. Add new booking\n" +
                    "2. Display list booking\n" +
                    "3. Create new contracts\n" +
                    "4. Display list contracts\n" +
                    "5. Edit contracts\n" +
                    "6. Return main menu\n" +
                    "------------<>------------\n"
            );
            System.out.print("Enter your option: ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            System.out.println();
            BookingServiceImpl bookingService = new BookingServiceImpl();
            ContractServiceImpl contractService = new ContractServiceImpl();
            switch (choice) {
                case 1:
                    bookingService.addNewBooking();
                    break;
                case 2:
                    bookingService.displayListBooking();
                    break;
                case 3:
                    contractService.creatNewContract();
                    break;
                case 4:
                    contractService.displayContract();
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
