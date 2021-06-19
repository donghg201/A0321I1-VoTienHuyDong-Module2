package bai1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class Exchange {
    public static void main(String[] args) {
        double tygia = 231212000;

        Scanner USD = new Scanner(System.in);

        System.out.print("USD: ");
        double a = USD.nextDouble();

        double b = a * tygia;

        System.out.print("VND: " + b);
    }
}

