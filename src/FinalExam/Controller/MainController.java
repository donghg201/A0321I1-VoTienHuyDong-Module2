package FinalExam.Controller;

import FinalExam.Services.Functions;
import FinalExam.Services.NotFoundMedicalRecordException;

import java.util.Scanner;

public class MainController {
    public static void displayMenu() throws NotFoundMedicalRecordException {
        int choice = -1;
        do {
            System.out.printf("--CHUONG TRINH QUAN LY BENH AN-–\n" +
                    "Chon chuc nang theo so (de tiep tuc): \n" +
                    "1. Them moi\n" +
                    "2. Xoa\n" +
                    "3. Xem danh sach cac benh an\n" +
                    "4. Thoat\n" +
                    "------------<>------------\n"
            );
            System.out.print("Chon chuc nang: ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            System.out.println();
            Functions functions = new Functions();
            switch (choice) {
                case 1:
                    functions.themMoi();
                    break;
                case 2:
                    functions.xoa();
                    break;
                case 3:
                    functions.displayList();
                    break;
                case 4:
                    System.exit(0);
            }

        } while (true);
    }

    public static void main(String[] args) throws NotFoundMedicalRecordException {
        displayMenu();
    }
}

