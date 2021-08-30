package CaseStudyModule2.Furama.Services;

import CaseStudyModule2.Furama.Models.*;
import CaseStudyModule2.Furama.Utils.BookingComparator;
import CaseStudyModule2.Furama.Utils.ReadAndWriteFile;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static List<Customer> customerList = CustomerServiceImpl.customerLinkedList;
    static Map<Facility, Integer> facilityIntegerMap = FacilityServiceImpl.linkedHashMap;
    static Scanner scanner = new Scanner(System.in);

    static {
        customerList.add(new Customer(1, "1", "1", "1", "1", "1",
                "1", "1", "1"));
        customerList.add(new Customer(2, "2", "2", "2", "2", "2",
                "2", "2", "2"));
        facilityIntegerMap.put(new Villa("3", "3", "3", "3", "3",
                "3", "3", "3", "3"), 0);
        facilityIntegerMap.put(new House("4", "4", "4", "4", "4",
                "4", "4", "4"), 0);
        facilityIntegerMap.put(new Room("5", "5", "5", "5", "5",
                "5", "5"), 0);
    }

    @Override
    public void addNewBooking() {
        try {
            int id = 1;
            if (!bookingSet.isEmpty()) {
                id = bookingSet.size() + 1;
            }
            Customer customer = chooseCustomer();
            Facility facility = chooseFacility();
            System.out.print("Enter start day: ");
            String startDay = scanner.nextLine();
            System.out.print("Enter end day: ");
            String endDay = scanner.nextLine();
            System.out.print("Enter service type: ");
            String serviceType = scanner.nextLine();
            Booking booking = new Booking(id, startDay, endDay, customer.getCustomerID(),
                    facility.getNameServices(), serviceType);
            bookingSet.add(booking);
            System.out.println("Succesfully!");
            System.out.println();
            ReadAndWriteFile.write(bookingSet,
                    "C:\\A0321I1_VoTienHuyDong\\Module 2\\src\\CaseStudyModule2\\Furama\\Data\\booking.csv");
        } catch (NumberFormatException e) {
            System.err.print("You entered wrong format!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public Set<Booking> sendBooking() {
        return bookingSet;
    }

    @Override
    public void displayListBooking() {
        bookingSet = (Set<Booking>) ReadAndWriteFile.read
                ("C:\\A0321I1_VoTienHuyDong\\Module 2\\src\\CaseStudyModule2\\Furama\\Data\\booking.csv");
        for (Booking booking : bookingSet) {
            System.out.println(booking);
        }
        System.out.println();
    }

    public static Customer chooseCustomer() {
        try {
            System.out.println("-----Customer List------ ");
            for (Customer customer : customerList) {
                System.out.println(customer.toString());
            }
            System.out.println();
            System.out.print("Enter customer id: ");
            int id = Integer.parseInt(scanner.nextLine());
            boolean check = true;
            while (check) {
                for (Customer customer : customerList) {
                    if (id == customer.getCustomerID()) {
                        check = false;
                        return customer;
                    }
                }
                if (check) {
                    System.out.println("Wrong customer id, please enter customer id again!");
                    System.out.print("Enter customer id: ");
                    id = Integer.parseInt(scanner.nextLine());
                    System.out.println();
                }
            }
        } catch (NumberFormatException e) {
            System.err.print("You entered wrong format!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static Facility chooseFacility() {
        try {
            System.out.println("-----Facility List------ ");
            for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                System.out.println(entry.getKey().toString());
            }
            System.out.println();
            boolean check = true;
            System.out.print("Enter facility id: ");
            String id = scanner.nextLine();
            while (check) {
                for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                    if (id.equals(entry.getKey().getIdFacility())) {
                        check = false;
                        return entry.getKey();
                    }
                }
                if (check) {
                    System.out.println("Wrong facility id, please enter facility id again!");
                    System.out.print("Enter facility id: ");
                    id = scanner.nextLine();
                    System.out.println();
                }
            }
        } catch (NumberFormatException e) {
            System.err.print("You entered wrong format!");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
