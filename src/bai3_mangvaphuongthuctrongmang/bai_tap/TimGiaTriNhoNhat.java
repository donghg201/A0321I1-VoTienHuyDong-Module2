package bai3_mangvaphuongthuctrongmang.bai_tap;

import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap do dai cua mang: ");
        int dodai = scanner.nextInt();
        int[] arr = new int[dodai];
        for (int i = 0; i < dodai; i++) {
            System.out.print("Nhap gia tri cua phan tu thu " + (i + 1) + " là: ");
            arr[i] = scanner.nextInt();
        }
        int min = arr[0];
        for (int j = 0; j < dodai; j++) {
            if (arr[j] < min) {
                min = arr[j];
            }
        }
        System.out.print("Gia tri nho nhat trong mang la: " + min);
    }
}
