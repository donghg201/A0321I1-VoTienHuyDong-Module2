package bai1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class SayHello {
    public static void main(String[] args) {
        Scanner Name = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = Name.nextLine();
        System.out.println("Hello: " + name);
    }
}
