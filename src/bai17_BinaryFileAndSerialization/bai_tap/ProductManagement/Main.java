package bai17_BinaryFileAndSerialization.bai_tap.ProductManagement;


import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void showFunction() {
        System.out.printf("What do you want?" +
                "1. Add new product." +
                "2. Show all product." +
                "3. Search product's infomation." +
                "4. Exit.");
        int choice = -1;
        System.out.print("Choose your option: ");
        choice = scanner.nextInt();
        String a = scanner.nextLine();
        switch (choice) {
            case 1:
                Function.addNewProduct();
                break;
            case 2:
                Function.showAllProduct();
                break;
            case 3:
                Function.showInfo();
                break;
            case 4:
                System.exit(0);
        }
    }

}
