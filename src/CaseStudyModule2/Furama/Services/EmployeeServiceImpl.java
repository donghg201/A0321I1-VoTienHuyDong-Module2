package CaseStudyModule2.Furama.Services;

import CaseStudyModule2.Furama.Models.Employee;
import CaseStudyModule2.Furama.Utils.ReadAndWriteFile;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public void displayEmployeeList() {
        try {
            employeeList = (List<Employee>) ReadAndWriteFile.read
                    ("C:\\A0321I1_VoTienHuyDong\\Module 2\\src\\CaseStudyModule2\\Furama\\Data\\employee.csv");
            if (employeeList.isEmpty() == false) {
                for (Employee employee : employeeList) {
                    System.out.println(employee.toString());
                }
            }
        } catch (NullPointerException e) {
            System.err.print("List is empty!\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println();
    }

    public Employee findByID(int employeeID) {
        for (Employee employee : employeeList) {
            if (employee.getEmployeeID() == employeeID) {
                return employee;
            }
        }
        return null;
    }

    public void addNewEmployee() {
        int employeeID;
        try {
            do {
                System.out.print("Please enter ID: ");
                employeeID = scanner.nextInt();
            } while (findByID(employeeID) != null);
            String a = scanner.nextLine();
            System.out.print("Please enter name: ");
            String name = scanner.nextLine();
            System.out.print("Please enter date of birth: ");
            String dathOfBirth = scanner.nextLine();
            System.out.print("Please enter sex: ");
            String sex = scanner.nextLine();
            System.out.print("Please enter CMND: ");
            String CMND = scanner.nextLine();
            System.out.print("Please enter phone number: ");
            String phoneNumber = scanner.nextLine();
            System.out.print("Please enter email: ");
            String email = scanner.nextLine();
            System.out.print("Please enter level: ");
            String level = scanner.nextLine();
            System.out.print("Please enter position: ");
            String position = scanner.nextLine();
            System.out.print("Please enter wage: ");
            String wage = scanner.nextLine();
            System.out.println();
            employeeList.add(new Employee(employeeID, name, dathOfBirth, sex,
                    CMND, phoneNumber, email, level, position, wage));
            ReadAndWriteFile.write(employeeList,
                    "C:\\A0321I1_VoTienHuyDong\\Module 2\\src\\CaseStudyModule2\\Furama\\Data\\employee.csv");
        } catch (NumberFormatException e) {
            System.err.print("You entered wrong format!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editEmployee() {
        try {
            System.out.print("Please enter ID: ");
            int employeeID = scanner.nextInt();
            System.out.println();
            Employee employee = findByID(employeeID);
            if (employee == null) {
                System.out.println("Id not found!");
                displayEmployeeList();
            } else {
                System.out.printf("-----Choose your option-----\n" +
                        "1. Edit name\n" +
                        "2. Edit date of birth\n" +
                        "3. Edit sex\n" +
                        "4. Edit CMND\n" +
                        "5. Edit phone number\n" +
                        "6. Edit Email\n" +
                        "7. Edit level\n" +
                        "8. Edit position\n" +
                        "9. Edit wage\n" +
                        "10. Back to menu\n" +
                        "------------<>------------\n"
                );
                System.out.print("Enter your option: ");
                int choice = scanner.nextInt();
                String a = scanner.nextLine();
                System.out.println();
                switch (choice) {
                    case 1:
                        System.out.print("Enter new name: ");
                        String name = scanner.nextLine();
                        System.out.println();
                        employee.setName(name);
                        displayEmployeeList();
                        break;
                    case 2:
                        System.out.print("Enter new date of birth: ");
                        String dateOfBirth = scanner.nextLine();
                        System.out.println();
                        employee.setDathOfBirth(dateOfBirth);
                        displayEmployeeList();
                        break;
                    case 3:
                        System.out.print("Enter new sex: ");
                        String sex = scanner.nextLine();
                        System.out.println();
                        employee.setSex(sex);
                        displayEmployeeList();
                        break;
                    case 4:
                        System.out.print("Enter new CMND: ");
                        String CMND = scanner.nextLine();
                        System.out.println();
                        employee.setCMND(CMND);
                        displayEmployeeList();
                        break;
                    case 5:
                        System.out.print("Enter new phone number: ");
                        String phoneNumber = scanner.nextLine();
                        System.out.println();
                        employee.setPhoneNumber(phoneNumber);
                        displayEmployeeList();
                        break;
                    case 6:
                        System.out.print("Enter new email: ");
                        String email = scanner.nextLine();
                        System.out.println();
                        employee.setEmail(email);
                        displayEmployeeList();
                        break;
                    case 7:
                        System.out.print("Enter new level: ");
                        String level = scanner.nextLine();
                        System.out.println();
                        employee.setLevel(level);
                        displayEmployeeList();
                        break;
                    case 8:
                        System.out.print("Enter new position: ");
                        String position = scanner.nextLine();
                        System.out.println();
                        employee.setPosition(position);
                        displayEmployeeList();
                        break;
                    case 9:
                        System.out.print("Enter new wage: ");
                        String wage = scanner.nextLine();
                        System.out.println();
                        employee.setWage(wage);
                        displayEmployeeList();
                        break;
                    case 10:
                        displayEmployeeList();
                        break;
                    default:
                        displayEmployeeList();
                        break;
                }
            }
        } catch (NumberFormatException e) {
            System.err.print("You entered wrong format!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
