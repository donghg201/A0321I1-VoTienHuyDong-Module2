package bai4_lopvadoituongtrongjava.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private static double a;
    private static double b;
    private static double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private static double getDiscriminant() {
        double discriminant = (b * b) - (4 * a * c);
        return discriminant;
    }

    static double getRoot1() {
        double root1 = (-b + Math.sqrt(getDiscriminant())) / 2 * a;
        return root1;
    }

    static double getRoot2() {
        double root2 = (-b - Math.sqrt(getDiscriminant())) / 2 * a;
        return root2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap a, b, c: ");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        double discriminant = getDiscriminant();

        if (discriminant < 0) {
            System.out.print("The equation has no roots");
        } else if (discriminant == 0) {
            System.out.print("1 nghiem la: " + getRoot1());
        } else {
            System.out.println("Nghiem 1 la: " + getRoot1());
            System.out.print("Nghiem 2 la: " + getRoot2());
        }
    }
}