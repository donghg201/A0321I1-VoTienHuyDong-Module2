package CaseStudyModule2.Furama.Controllers;

import java.util.Scanner;

public class FuramaController {

    public static void displayMenu() {
        int choice = -1;
        do {
            System.out.printf("1. Employee Managament\n" +
                    "2. Customer Management\n" +
                    "3. Facility Management\n" +
                    "4. Booking Management\n" +
                    "5. Promotion Management\n" +
                    "6. Exit\n"
            );
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    EmployeeManagament.employeeManagament();
                    break;
                case 2:
                    CustomerManagament.customerManagement();
                    break;
                case 3:
                    FacilityManagament.facilityManagement();
                    break;
                case 4:
                    BookingManagament.bookingManagement();
                    break;
                case 5:
                    PromotionManagament.promotionManagement();
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
