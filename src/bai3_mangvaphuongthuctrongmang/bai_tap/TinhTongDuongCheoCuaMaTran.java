package bai3_mangvaphuongthuctrongmang.bai_tap;

import java.util.Scanner;

public class TinhTongDuongCheoCuaMaTran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chieu ngang va doc cua ma tran: ");
        int dodai = scanner.nextInt();
        int[][] arr = new int[dodai][dodai];
        for (int i = 0; i < dodai; i++) {
            for (int j = 0; j < dodai; j++) {
                System.out.print("Nhap gia tri cua phan tu thu [" + i + "][" + j + "]: ");
                arr[i][j] = scanner.nextInt();
            }
        }
        int tong = 0;
        for (int l = 0; l < dodai; l++) {
            tong += arr[l][l];
        }
        System.out.print("Tong cac so o duong cheo chinh cua ma tran vuong la: " + tong);
    }
}
