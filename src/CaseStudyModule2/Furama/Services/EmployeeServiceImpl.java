package CaseStudyModule2.Furama.Services;

import CaseStudyModule2.Furama.Models.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void displayEmployeeList() {
        try {
            if (employeeList.isEmpty() == false) {
                for (Employee employee : employeeList) {
                    System.out.println(employee.toString());
                }
            }
        } catch (NullPointerException e) {
            System.err.print("List is empty!\n");
        }
    }

    public static Employee findByID(int employeeID) {
        for (Employee employee : employeeList) {
            if (employee.getEmployeeID() == employeeID) {
                return employee;
            }
        }
        return null;
    }

    public static void addNewEmployee() {
        int employeeID;
        do {
            System.out.println("Please enter ID");
            employeeID = scanner.nextInt();
        } while (findByID(employeeID) != null);
        String a = scanner.nextLine();
        System.out.println("\tPlease enter name");
        String name = scanner.nextLine();
        System.out.println("\tPlease enter date of birth");
        String dathOfBirth = scanner.nextLine();
        System.out.println("Please enter sex");
        String sex = scanner.nextLine();
        System.out.println("Please enter CMND");
        String CMND = scanner.nextLine();
        System.out.println("Please enter phone number");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please enter email");
        String email = scanner.nextLine();
        System.out.println("Please enter level");
        String level = scanner.nextLine();
        System.out.println("Please enter position");
        String position = scanner.nextLine();
        System.out.println("Please enter wage");
        String wage = scanner.nextLine();
        employeeList.add(new Employee(employeeID, name, dathOfBirth, sex,
                CMND, phoneNumber, email, level, position, wage));

    }

    public static void editEmployee() {
        System.out.println("Please enter ID");
        int employeeID = scanner.nextInt();
        Employee employee = findByID(employeeID);
        if (employee == null) {
            System.out.println("Id not found!");
            displayEmployeeList();
        } else {
            System.out.printf("1. Edit name\n" +
                    "2. Edit date of birth\n" +
                    "3. Edit sex\n" +
                    "4. Edit CMND\n" +
                    "5. Edit phone number\n" +
                    "6. Edit Email\n" +
                    "7. Edit level\n" +
                    "8. Edit position\n" +
                    "9. Edit wage\n" +
                    "10. Back to menu\n");
            int choice = scanner.nextInt();
            String a = scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter new name");
                    String name = scanner.nextLine();
                    employee.setName(name);
                    displayEmployeeList();
                    break;
                case 2:
                    System.out.println("Enter new date of birth");
                    String dateOfBirth = scanner.nextLine();
                    employee.setDathOfBirth(dateOfBirth);
                    displayEmployeeList();
                    break;
                case 3:
                    System.out.println("Enter new sex");
                    String sex = scanner.nextLine();
                    employee.setSex(sex);
                    displayEmployeeList();
                    break;
                case 4:
                    System.out.println("Enter new CMND");
                    String CMND = scanner.nextLine();
                    employee.setCMND(CMND);
                    displayEmployeeList();
                    break;
                case 5:
                    System.out.println("Enter new phone number");
                    String phoneNumber = scanner.nextLine();
                    employee.setPhoneNumber(phoneNumber);
                    displayEmployeeList();
                    break;
                case 6:
                    System.out.println("Enter new email");
                    String email = scanner.nextLine();
                    employee.setEmail(email);
                    displayEmployeeList();
                    break;
                case 7:
                    System.out.println("Enter new level");
                    String level = scanner.nextLine();
                    employee.setLevel(level);
                    displayEmployeeList();
                    break;
                case 8:
                    System.out.println("Enter new position");
                    String position = scanner.nextLine();
                    employee.setPosition(position);
                    displayEmployeeList();
                    break;
                case 9:
                    System.out.println("Enter new wage");
                    String wage = scanner.nextLine();
                    employee.setWage(wage);
                    displayEmployeeList();
                    break;
                case 10:
                    displayEmployeeList();
                    break;
            }
        }
    }
}
