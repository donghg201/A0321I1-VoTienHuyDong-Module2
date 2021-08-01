package bai11_StackAndQueue.bai_tap.ReverseStack;

import java.util.Stack;

public class ReverseStack {
    public static void reverse(int arr[]) {
        Stack<Integer> mWord = new Stack<>();
        for (int i = 0; i < arr.length; i++){
            mWord.push(arr[i]);
        }
        for (int j = 0 ;j < arr.length; j++){
            arr[j] = mWord.pop();
        }
    }
}
