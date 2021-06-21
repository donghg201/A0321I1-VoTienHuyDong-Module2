package bai3_mangvaphuongthuctrongmang.bai_tap;

import java.util.Scanner;

public class DemSoLanXuatHien {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String a = scanner.next();
        System.out.print("Nhap phan tu can dem: ");
        char b = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            if (b == c) {
                count++;
            }
        }
        System.out.print("So luan xuat hien cua phan tu " + b + " la: " + count);
    }
}
