package bai14_thuattoansapxep.bai_tap.MinhHoaThuatToanSapXepChen;

public class InsertionSort {
    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            System.out.print("Mảng trước khi sắp xếp là: ");
            for (int l = 0; l <= i; l++) {
                System.out.print(arr[l] + " ");
            }
            System.out.println();


            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            System.out.print("Mảng sau khi sắp xếp là: ");
            for (int h = 0; h <= i; h++) {
                System.out.print(arr[h] + " ");
            }
            System.out.println("\n");
        }
    }

    public static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {16, 5, 9, 4, 7, 1};
        sort(arr);
    }

}
