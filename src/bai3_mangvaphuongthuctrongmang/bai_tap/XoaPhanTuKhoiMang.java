package bai3_mangvaphuongthuctrongmang.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int num = scanner.nextInt();
        int[] aRray1 = new int[num];
        for (int i = 0; i < num; i++) {
            System.out.print("Nhap phan tu thu " + (i + 1) + " cua mang: ");
            aRray1[i] = scanner.nextInt();
        }
        System.out.print("Cac phan tu cua mang la: ");
        for (int j = 0; j < num; j++) {
            System.out.print(aRray1[j] + " ");
        }
        System.out.println();
        System.out.print("Nhap phan tu muon xoa: ");
        int a = scanner.nextInt();
        int count = 0;
        int c = 0;
        for (int k = 0; k < num; k++) {
            if (a == aRray1[k]) {
                System.out.println("Phan tu " + a + " o vi tri thu " + (k + 1) + " cua mang");
                count = count + 1;
                c = k;
                break;
            }
        }
        int[] aRray2 = new int[num - count];
        for (int l = 0; l < c; l++) {
            aRray2[l] = aRray1[l];
        }
        for (int m = c + 1; m <= (num - count); m++) {
            aRray2[m - 1] = aRray1[m];
        }
        System.out.print("Mảng mới sau khi xóa là: ");
        for (int n = 0; n < aRray2.length; n++) {
            System.out.print(aRray2[n] + " ");
        }
    }
}
