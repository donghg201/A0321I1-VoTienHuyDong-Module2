package bai3_mangvaphuongthuctrongmang.bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập phần tử cần thêm: ");
        int add = scanner.nextInt();
        System.out.print("Nhập vị trí cần thêm: ");
        int loca = scanner.nextInt();
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < loca; i++) {
            arr1[i] = arr[i];
        }
        arr1[loca] = add;
        for (int j = loca; j < arr1.length - 1; j++) {
            arr1[j + 1] = arr[j];
        }
        System.out.print("Mảng mới sau khi thêm phần tử " + add + " vào vị trí thứ " + loca + " là: ");
        for (int l = 0; l < arr1.length; l++) {
            System.out.print(arr1[l] + " ");
        }
    }
}
