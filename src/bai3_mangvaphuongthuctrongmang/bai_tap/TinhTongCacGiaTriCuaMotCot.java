package bai3_mangvaphuongthuctrongmang.bai_tap;

import java.util.Scanner;

public class TinhTongCacGiaTriCuaMotCot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu ngang cua ma tran: ");
        int ngang = scanner.nextInt();
        System.out.print("Nhap chieu doc cua ma tran: ");
        int doc = scanner.nextInt();
        long[][] arr = new long[doc][ngang];
        for (int i = 0; i < doc; i++) {
            for (int j = 0; j < ngang; j++) {
                System.out.print("Nhap gia tri cua phan tu thu [" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextLong();
            }
        }
        System.out.print("Nhap cot ma ban muon tinh tong: ");
        int a = scanner.nextInt();
        int tong = 0;
        for (int l = 0; l < doc; l++) {
            tong += arr[l][a];
        }
        System.out.print("Tong cua cot " + a + " la: " + tong);
    }
}
