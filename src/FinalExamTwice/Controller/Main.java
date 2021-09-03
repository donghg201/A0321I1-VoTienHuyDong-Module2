package FinalExamTwice.Controller;

import FinalExamTwice.Service.Function;
import FinalExamTwice.Service.NotFoundProductException;

import java.util.Scanner;

public class Main {
    public static void displayMenu() throws NotFoundProductException {
        int choice = -1;
        do {
            System.out.printf("--CHUONG TRINH QUAN LY SAN PHAM-–\n" +
                    "Chon chuc nang theo so (de tiep tuc): \n" +
                    "1. Them moi\n" +
                    "2. Xoa\n" +
                    "3. Xem danh sach cac san pham\n" +
                    "4. Tim kiem\n" +
                    "5. Thoat\n" +
                    "------------<>------------\n"
            );
            System.out.print("Chon chuc nang: ");
            Scanner scanner = new Scanner(System.in);
            choice = scanner.nextInt();
            System.out.println();
            Function function = new Function();
            switch (choice) {
                case 1:
                    function.themMoi();
                    break;
                case 2:
                    function.xoa();
                    break;
                case 3:
                    function.hienThi();
                    break;
                case 4:

                    break;
                case 5:
                    System.exit(0);
            }

        } while (true);
    }

    public static void main(String[] args) throws NotFoundProductException {
        displayMenu();
    }
}
