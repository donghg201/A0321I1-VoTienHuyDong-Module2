package bai2_vonglaptrongjava.bai_tap;

import java.util.Scanner;

public class HienThiSNT {
    public static void main(String[] args) {
        int n;
        int status = 1;
        Scanner input = new Scanner(System.in);
        int num = 3;
        do {
            System.out.print("Nhap so luong so nguyen to can in ra: ");
            n = input.nextInt();
        } while (n < 0);
        if (n >= 1) {
            System.out.println(n + " Số nguyên tố đầu tiên là:");
            System.out.println(2);
        }
        for (int i = 2; i <= n; ) {
            for (int j = 2; j <= Math.sqrt(num); j++) {
                if (num % j == 0) {
                    status = 0;
                    break;
                }
            }
            if (status != 0) {
                System.out.println(num);
                i++;
            }
            status = 1;
            num++;
        }
    }
}

