package CaseStudyModule2.Furama.Controllers;

import java.util.Scanner;

public class FuramaController {

    public static void displayMenu() {
        int choice = -1;
        do {
            System.out.printf("-----Furama List Option-----\n" +
                    "1. Employee Management\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management\n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit\n" +
                    "------------<>------------\n"
            );
            System.out.print("Enter your option: ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            System.out.println();
            switch (choice) {
                case 1:
                    EmployeeManagement.employeeManagement();
                    break;
                case 2:
                    CustomerManagement.customerManagement();
                    break;
                case 3:
                    FacilityManagement.facilityManagement();
                    break;
                case 4:
                    BookingManagement.bookingManagement();
                    break;
                case 5:
                    PromotionManagement.promotionManagement();
                    break;
                case 6:
                    System.exit(0);
            }

        } while (true);
    }

    public static void main(String[] args) {
        displayMenu();
    }
}
