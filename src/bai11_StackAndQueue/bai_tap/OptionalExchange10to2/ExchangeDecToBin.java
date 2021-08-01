package bai11_StackAndQueue.bai_tap.OptionalExchange10to2;

import java.util.Iterator;
import java.util.Stack;

public class ExchangeDecToBin {
    public static void exchangeDecimal(int num) {
        Stack<Integer> st = new Stack<>();
        int index = 0;
        while (num >= 1) {
            index = num % 2;
            st.push(index);
            num = num / 2;
        }
        System.out.print("Chuyen sang he nhi phan la: ");
        for(int i = 0; i < st.size(); i++){
            System.out.print(st.pop());
        }
    }
}
