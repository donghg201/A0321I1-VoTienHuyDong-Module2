package bai3_mangvaphuongthuctrongmang.bai_tap;

import java.util.Scanner;

public class MaxTrongMang2Chieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu ngang cua ma tran: ");
        int ngang = scanner.nextInt();
        System.out.print("Nhap chieu doc cua ma tran: ");
        int doc = scanner.nextInt();
        int[][] arr = new int[doc][ngang];
        for (int i = 0; i < doc; i++) {
            for (int j = 0; j < ngang; j++) {
                System.out.print("Nhap gia tri cua phan tu thu [" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        int max = arr[0][0];
        for (int m = 0; m < doc; m++) {
            for (int n = 0; n < ngang; n++) {
                if (arr[m][n] > max) {
                    max = arr[m][n];
                }
            }
        }
        System.out.print("Gia tri lon nhat trong mang la: " + max);

    }
}
