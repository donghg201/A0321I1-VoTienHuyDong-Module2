package bai10_danhsach.bai_tap.ArrayList;

public class MyListTest {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>(); ban đầu em dùng arraylisst. Cái này là của java hỗ trợ rồi. Em viết class tự tạo làm gì nữa. à à :v e hiểu rồi, cám ơn a :v  o//done nhé v// ok a :v
//        list.add();

//
        MyList<String> list = new MyList<>(); //Chỗ này em phải khai báo class em tự định nghĩa chớ. Lúc nãy em đang dùng class của java rồi
        list.add("Võ", 0);
        list.add("Tiến", 0);
        list.add("Huy", 0);

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
