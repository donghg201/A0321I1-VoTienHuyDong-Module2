package bai1_introduction_to_java.thuc_hanh;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        float width, height;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width: ");
        width = scanner.nextFloat();

        System.out.print("Enter height: ");
        height = scanner.nextFloat();

        float area = width * height;

        System.out.println("Area is: " + area);
    }
}
