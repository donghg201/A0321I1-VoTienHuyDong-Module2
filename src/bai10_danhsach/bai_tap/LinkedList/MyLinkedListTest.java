package bai10_danhsach.bai_tap.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedListTest {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(0, 3);
        list.add(1, 4);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
