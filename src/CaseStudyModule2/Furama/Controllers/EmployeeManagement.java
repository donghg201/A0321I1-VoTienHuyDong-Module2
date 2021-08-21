package CaseStudyModule2.Furama.Controllers;

import CaseStudyModule2.Furama.Services.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeManagement {

    public static void employeeManagement() {
        int choice = -1;
        do {
            System.out.printf("1. Display list employees\n" +
                    "2. Add new employee\n" +
                    "3. Edit employee\n" +
                    "4. Return main menu\n"
            );
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    EmployeeServiceImpl.displayEmployeeList();
                    break;
                case 2:
                    EmployeeServiceImpl.addNewEmployee();
                    break;
                case 3:
                    EmployeeServiceImpl.editEmployee();
                    break;
                case 4:
                    FuramaController.displayMenu();
                    break;
            }
        } while (true);
    }
}

