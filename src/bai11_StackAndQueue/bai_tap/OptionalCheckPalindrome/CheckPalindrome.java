package bai11_StackAndQueue.bai_tap.OptionalCheckPalindrome;

import java.util.LinkedList;
import java.util.Queue;

public class CheckPalindrome {
    public static void kiemTraDoiXung(String inputString) {
        inputString = inputString.toLowerCase();
        Queue queue = new LinkedList();
        for (int i = inputString.length() - 1; i >= 0; i--) {
            queue.add(inputString.charAt(i));
        }
        String reverseString = "";
        while (!queue.isEmpty()) {
            reverseString = reverseString + queue.remove();
        }
        if (inputString.equals(reverseString)) {
            System.out.println("Đây là chuỗi đối xứng.");
        } else {
            System.out.println("Đây không phải là chuỗi đối xứng.");
        }
    }
}



