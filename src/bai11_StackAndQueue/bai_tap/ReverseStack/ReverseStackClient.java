package bai11_StackAndQueue.bai_tap.ReverseStack;

public class ReverseStackClient {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        ReverseStack.reverse(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
