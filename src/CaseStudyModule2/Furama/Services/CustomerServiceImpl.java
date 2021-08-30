package CaseStudyModule2.Furama.Services;

import CaseStudyModule2.Furama.Models.Customer;
import CaseStudyModule2.Furama.Utils.ReadAndWriteFile;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    static LinkedList<Customer> customerLinkedList = new LinkedList<>();
    static Scanner scanner = new Scanner(System.in);

    public static Customer findbyID(int customerID) {
        for (Customer customer : customerLinkedList) {
            if (customer.getCustomerID() == customerID) {
                return customer;
            }
        }
        return null;
    }

    public void displayCustomerList() {
        try {
            customerLinkedList = (LinkedList<Customer>) ReadAndWriteFile.read
                    ("C:\\A0321I1_VoTienHuyDong\\Module 2\\src\\CaseStudyModule2\\Furama\\Data\\customer.csv");
            if (customerLinkedList.isEmpty() == false) {
                for (Customer customer : customerLinkedList) {
                    System.out.println(customer.toString());
                }
            }
        } catch (NullPointerException e) {
            System.err.print("List is empty!\n");
        }
        System.out.println();
    }

    public void addNewCustomer() {
        int customerID;
        try {
            do {
                System.out.print("Please enter ID: ");
                customerID = scanner.nextInt();
            } while (findbyID(customerID) != null);
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
            System.out.print("Please enter customer type: ");
            String customerType = scanner.nextLine();
            System.out.print("Please enter address: ");
            String address = scanner.nextLine();
            customerLinkedList.add(new Customer(customerID, name, dathOfBirth, sex,
                    CMND, phoneNumber, email, customerType, address));
            ReadAndWriteFile.write(customerLinkedList,
                    "C:\\A0321I1_VoTienHuyDong\\Module 2\\src\\CaseStudyModule2\\Furama\\Data\\customer.csv");
        } catch (NumberFormatException e) {
            System.err.print("You entered wrong format!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void editCustomer() {
        System.out.print("Please enter ID: ");
        try {
            int customerID = scanner.nextInt();
            System.out.println();
            Customer customer = findbyID(customerID);
            if (customer == null) {
                System.out.println("Id not found!");
                displayCustomerList();
            } else {
                System.out.printf("-----Customer Edit List Option-----\n" +
                        "1. Edit name\n" +
                        "2. Edit date of birth\n" +
                        "3. Edit sex\n" +
                        "4. Edit CMND\n" +
                        "5. Edit phone number\n" +
                        "6. Edit Email\n" +
                        "7. Edit customer type\n" +
                        "8. Edit address\n" +
                        "9. Back to menu\n" +
                        "------------<>------------\n"
                );
                System.out.print("Enter your option: ");
                int choice = scanner.nextInt();
                System.out.println();
                String a = scanner.nextLine();
                switch (choice) {
                    case 1:
                        System.out.print("Enter new name: ");
                        String name = scanner.nextLine();
                        System.out.println();
                        customer.setName(name);
                        displayCustomerList();
                        break;
                    case 2:
                        System.out.print("Enter new date of birth: ");
                        String dateOfBirth = scanner.nextLine();
                        System.out.println();
                        customer.setDathOfBirth(dateOfBirth);
                        displayCustomerList();
                        break;
                    case 3:
                        System.out.print("Enter new sex: ");
                        String sex = scanner.nextLine();
                        System.out.println();
                        customer.setSex(sex);
                        displayCustomerList();
                        break;
                    case 4:
                        System.out.print("Enter new CMND: ");
                        String CMND = scanner.nextLine();
                        System.out.println();
                        customer.setCMND(CMND);
                        displayCustomerList();
                        break;
                    case 5:
                        System.out.print("Enter new phone number: ");
                        String phoneNumber = scanner.nextLine();
                        System.out.println();
                        customer.setPhoneNumber(phoneNumber);
                        displayCustomerList();
                        break;
                    case 6:
                        System.out.print("Enter new email: ");
                        String email = scanner.nextLine();
                        System.out.println();
                        customer.setEmail(email);
                        displayCustomerList();
                        break;
                    case 7:
                        System.out.print("Enter new customer type: ");
                        String level = scanner.nextLine();
                        System.out.println();
                        customer.setCustomerType(level);
                        displayCustomerList();
                        break;
                    case 8:
                        System.out.print("Enter new address: ");
                        String position = scanner.nextLine();
                        System.out.println();
                        customer.setAddress(position);
                        displayCustomerList();
                        break;
                    case 9:
                        displayCustomerList();
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
