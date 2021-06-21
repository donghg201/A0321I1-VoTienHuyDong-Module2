package bai2_vonglaptrongjava.bai_tap;

import sun.awt.Symbol;

import java.util.Scanner;

public class HienThiCacLoaiHinh {
    public static void main(String[] args) {
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.print("Input your selection: ");
        Scanner input = new Scanner(System.in);
        int choose = input.nextInt();
        switch (choose) {
            case 1: {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 10; j++) {
                        System.out.print('*');
                    }
                    System.out.println();
                }
            }
            break;
            case 2: {
                System.out.println("1. Top-left");
                System.out.println("2. Top-right");
                System.out.println("3. Bottom-left");
                System.out.println("4. Bottom-right");
                System.out.print("Input your selection: ");
                int choose1 = input.nextInt();
                switch (choose1) {
                    case 1: {
                        for (int i = 0; i < 5; i++) {
                            for (int j = 0; j < 5 - i; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                    }
                    break;
                    case 2: {
                        for (int i = 0; i < 5; i++) {
                            for (int j = 0; j < i + 1; j++) {
                                System.out.print(" ");
                            }
                            for (int k = 0; k < 5 - i; k++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                    }
                    break;
                    case 3: {
                        for (int i = 0; i < 5; i++) {
                            for (int j = 0; j < i + 1; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                    }
                    break;
                    case 4: {
                        for (int i = 0; i < 5; i++) {
                            for (int j = 0; j < 5 - i; j++) {
                                System.out.print(" ");
                            }
                            for (int k = 0; k < i + 1; k++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                    }
                    break;
                }
            }break;
            case 3: {
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 4 - i; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k < (2 * i) + 1; k++) {
                        System.out.print("*");
                    }
                    for (int j = 0; j < 4 - i; j++) {
                        System.out.print(" ");
                    }
                    System.out.println();
                }
                break;
            }
            case 4:
                System.exit(0);
            default:
                System.out.println("No choice!");

                while (choose != 0) {
                }
        }
    }
}
