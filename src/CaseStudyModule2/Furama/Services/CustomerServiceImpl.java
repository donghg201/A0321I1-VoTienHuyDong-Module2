package CaseStudyModule2.Furama.Services;

import CaseStudyModule2.Furama.Models.Customer;
import CaseStudyModule2.Furama.Models.Employee;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServiceImpl {
    private static LinkedList<Customer> customerLinkedList = new LinkedList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static Customer findbyID(int customerID) {
        for (Customer customer : customerLinkedList) {
            if (customer.getCustomerID() == customerID) {
                return customer;
            }
        }
        return null;
    }

    public static void displayCustomerList() {
        try {
            if (customerLinkedList.isEmpty() == false) {
                for (Customer customer : customerLinkedList) {
                    System.out.println(customer.toString());
                }
            }
        } catch (NullPointerException e) {
            System.err.print("List is empty!\n");
        }
    }

    public static void addNewCustomer() {
        int customerID;
        do {
            System.out.println("Please enter ID");
            customerID = scanner.nextInt();
        } while (findbyID(customerID) != null);
        String a = scanner.nextLine();
        System.out.println("Please enter name");
        String name = scanner.nextLine();
        System.out.println("Please enter date of birth");
        String dathOfBirth = scanner.nextLine();
        System.out.println("Please enter sex");
        String sex = scanner.nextLine();
        System.out.println("Please enter CMND");
        String CMND = scanner.nextLine();
        System.out.println("Please enter phone number");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please enter email");
        String email = scanner.nextLine();
        System.out.println("Please enter customer type");
        String customerType = scanner.nextLine();
        System.out.println("Please enter address");
        String address = scanner.nextLine();
        customerLinkedList.add(new Customer(customerID, name, dathOfBirth, sex,
                CMND, phoneNumber, email, customerType, address));

    }

    public static void editCustomer() {
        System.out.println("Please enter ID");
        int customerID = scanner.nextInt();
        Customer customer = findbyID(customerID);
        if (customer == null) {
            System.out.println("Id not found!");
            displayCustomerList();
        } else {
            System.out.printf("1. Edit name\n" +
                    "2. Edit date of birth\n" +
                    "3. Edit sex\n" +
                    "4. Edit CMND\n" +
                    "5. Edit phone number\n" +
                    "6. Edit Email\n" +
                    "7. Edit customer type\n" +
                    "8. Edit address\n" +
                    "9. Back to menu\n");
            int choice = scanner.nextInt();
            String a = scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter new name");
                    String name = scanner.nextLine();
                    customer.setName(name);
                    displayCustomerList();
                    break;
                case 2:
                    System.out.println("Enter new date of birth");
                    String dateOfBirth = scanner.nextLine();
                    customer.setDathOfBirth(dateOfBirth);
                    displayCustomerList();
                    break;
                case 3:
                    System.out.println("Enter new sex");
                    String sex = scanner.nextLine();
                    customer.setSex(sex);
                    displayCustomerList();
                    break;
                case 4:
                    System.out.println("Enter new CMND");
                    String CMND = scanner.nextLine();
                    customer.setCMND(CMND);
                    displayCustomerList();
                    break;
                case 5:
                    System.out.println("Enter new phone number");
                    String phoneNumber = scanner.nextLine();
                    customer.setPhoneNumber(phoneNumber);
                    displayCustomerList();
                    break;
                case 6:
                    System.out.println("Enter new email");
                    String email = scanner.nextLine();
                    customer.setEmail(email);
                    displayCustomerList();
                    break;
                case 7:
                    System.out.println("Enter new customer type");
                    String level = scanner.nextLine();
                    customer.setCustomerType(level);
                    displayCustomerList();
                    break;
                case 8:
                    System.out.println("Enter new address");
                    String position = scanner.nextLine();
                    customer.setAddress(position);
                    displayCustomerList();
                    break;
                case 9:
                    displayCustomerList();
                    break;
            }
        }
    }
}
