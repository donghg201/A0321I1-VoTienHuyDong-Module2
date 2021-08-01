package bai11_StackAndQueue.bai_tap.CheckBracket;

import java.util.Stack;

public class CheckBracket {
    public static boolean checkBracket(String inputString) {
        Stack<Character> lStack = new Stack<>();
        for (int i = 0; i < inputString.length(); i++) {
            Character a = inputString.charAt(i);
            if (a.equals('(')) {
                lStack.add(a);
            } else if (a.equals(')')) {
                if (lStack.isEmpty()) {
                    return false;
                } else lStack.pop();
            }
        }
//        System.out.println(lStack.size());
        if (lStack.size() == 0) {
            return true;
        }
        return false;
    }
}
