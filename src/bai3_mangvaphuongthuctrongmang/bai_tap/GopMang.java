package bai3_mangvaphuongthuctrongmang.bai_tap;

public class GopMang {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {6, 7, 8, 9, 10};
        int[] arr3 = new int[arr1.length + arr2.length - 1];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int j = 0; j < arr2.length; j++) {
            arr3[arr1.length - 1 + j] = arr2[j];
        }
        System.out.print("Chuỗi sau khi gộp là: ");
        for (int l = 0; l < arr3.length; l++) {
            System.out.print(arr3[l] + " ");
        }
    }
}
