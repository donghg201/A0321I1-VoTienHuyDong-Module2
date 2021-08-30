package CaseStudyModule2.Furama.Controllers;

import CaseStudyModule2.Furama.Services.EmployeeServiceImpl;

import java.util.Scanner;

public class EmployeeManagement {

    public static void employeeManagement() {
        int choice = -1;
        do {
            System.out.printf("-----Employee List Option-----\n" +
                    "1. Display list employees\n" +
                    "2. Add new employee\n" +
                    "3. Edit employee\n" +
                    "4. Return main menu\n" +
                    "------------<>------------\n"
            );
            System.out.print("Enter your option: ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            System.out.println();
            EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
            switch (choice) {
                case 1:
                    employeeService.displayEmployeeList();
                    break;
                case 2:
                    employeeService.addNewEmployee();
                    break;
                case 3:
                    employeeService.editEmployee();
                    break;
                case 4:
                    FuramaController.displayMenu();
                    break;
            }
        } while (true);
    }
}

