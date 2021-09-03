package FinalExamTwice.Controller;

import java.util.Scanner;

public class Main {
    public static void displayMenu()  {
        int choice = -1;
        do {
            System.out.printf("--CHUONG TRINH QUAN LY SAN PHAM-–\n" +
                    "Chon chuc nang theo so (de tiep tuc): \n" +
                    "1. Them moi\n" +
                    "2. Xoa\n" +
                    "3. Xem danh sach cac benh an\n" +
                    "4. Tim kiem" +
                    "5. Thoat\n" +
                    "------------<>------------\n"
            );
            System.out.print("Chon chuc nang: ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            System.out.println();
            switch (choice) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    System.exit(0);
            }

        } while (true);
    }
}
