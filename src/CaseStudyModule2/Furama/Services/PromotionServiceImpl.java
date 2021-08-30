package CaseStudyModule2.Furama.Services;

import CaseStudyModule2.Furama.Models.Booking;
import CaseStudyModule2.Furama.Utils.UserByYear;

import java.util.*;

public class PromotionServiceImpl {
    static Set<Booking> set = BookingServiceImpl.bookingSet;
    static Scanner scanner = new Scanner(System.in);

    public static void displayListCustomersUseService() {
        try {
            System.out.print("Enter year: ");
            int year = scanner.nextInt();
            System.out.println("-----List Customers in year " + year + "-----");
            UserByYear userByYear = new UserByYear();
            for (Booking booking : set) {
                userByYear.getYearInStartDAy(booking);
                int yearCheck = userByYear.getYearInStartDAy(booking);
                if (year == yearCheck) {
                    System.out.println(booking);
                }
            }
            System.out.println();
        } catch (NumberFormatException e) {
            System.err.print("You entered wrong format!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void displayListCustomersGetVoucher() {
        try {
            Queue<Booking> bookingQueue = new LinkedList<>();
            for (Booking booking : set) {
                bookingQueue.add(booking);
            }
            System.out.print("Enter number of voucher 50%: ");
            int v50 = scanner.nextInt();
            System.out.print("Enter number of voucher 20%: ");
            int v20 = scanner.nextInt();
            System.out.print("Enter number of voucher 10%: ");
            int v10 = scanner.nextInt();

            for (int i = 0; i < v50; i++) {
                if (bookingQueue.isEmpty()) {
                    System.out.println("No booking to use voucher!");
                } else {
                    System.out.println(bookingQueue.peek() + " get voucher 50%.");
                    bookingQueue.remove(bookingQueue.peek());
                }
            }
            for (int i = 0; i < v20; i++) {
                if (bookingQueue.isEmpty()) {
                    System.out.println("No booking to use voucher!");
                } else {
                    System.out.println(bookingQueue.peek() + " get voucher 20%.");
                    bookingQueue.remove(bookingQueue.peek());
                }
            }
            for (int i = 0; i < v10; i++) {
                if (bookingQueue.isEmpty()) {
                    System.out.println("No booking to use voucher!");
                } else {
                    System.out.println(bookingQueue.peek() + " get voucher 50%.");
                    bookingQueue.remove(bookingQueue.peek());
                }
            }
        } catch (NumberFormatException e) {
            System.err.print("You entered wrong format!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
