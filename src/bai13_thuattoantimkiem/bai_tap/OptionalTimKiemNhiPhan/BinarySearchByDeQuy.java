package bai13_thuattoantimkiem.bai_tap.OptionalTimKiemNhiPhan;

public class BinarySearchByDeQuy {
    public static int binarySearch(int[] arr, int value, int left, int right) {
        if (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == value) {
                return mid;
            } else if (arr[mid] > value) {
                return binarySearch(arr, value, left, mid - 1);
            } else {
                return binarySearch(arr, value, mid + 1, right);
            }
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(binarySearch(arr, 3, 0,arr.length));
    }
}
