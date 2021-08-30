package CaseStudyModule2.Furama.Services;

import CaseStudyModule2.Furama.Models.Booking;
import CaseStudyModule2.Furama.Models.Contract;
import CaseStudyModule2.Furama.Models.Customer;
import CaseStudyModule2.Furama.Utils.ReadAndWriteFile;

import java.util.*;

public class ContractServiceImpl implements ContractService {
    static List<Contract> contractList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static List<Customer> customerList = CustomerServiceImpl.customerLinkedList;

    @Override
    public void creatNewContract() {
        try {
            Queue<Booking> bookingQueue = new LinkedList<>();
            Set<Booking> bookingSet = new BookingServiceImpl().sendBooking();
            for (Booking booking : bookingSet) {
                bookingQueue.add(booking);
            }
            while (!bookingQueue.isEmpty()) {
                Booking booking = bookingQueue.poll();
                int customer = booking.getCustomerID();

                System.out.println("Creating a new contract for booking with infomation with: " + booking.toString());
                System.out.println("Creating a new contract for customer with infomation with: " + findbyID(customer));
                System.out.print("Enter id contract: ");
                String id = scanner.nextLine();
                System.out.print("Enter previous pay: ");
                String pre = scanner.nextLine();
                System.out.print("Enter cost: ");
                String pay = scanner.nextLine();

                Contract contract = new Contract(id, String.valueOf(booking.getBookingID()), pre, pay, customer);
                contractList.add(contract);
                System.out.println("Creat contract successfully! " + contract.toString());
                ReadAndWriteFile.write(contractList,
                        "C:\\A0321I1_VoTienHuyDong\\Module 2\\src\\CaseStudyModule2\\Furama\\Data\\contract.csv");
            }
        } catch (NumberFormatException e) {
            System.err.print("You entered wrong format!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void displayContract() {
        contractList = (List<Contract>) ReadAndWriteFile.read
                ("C:\\A0321I1_VoTienHuyDong\\Module 2\\src\\CaseStudyModule2\\Furama\\Data\\contract.csv");
        for (Contract contract : contractList) {
            System.out.println(contract.toString());
        }
    }

    @Override
    public void editContract() {

    }

    public static Customer findbyID(int customerID) {
        for (Customer customer : customerList) {
            if (customer.getCustomerID() == customerID) {
                return customer;
            }
        }
        return null;
    }
}
