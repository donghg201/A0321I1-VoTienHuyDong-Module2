package bai10_danhsach.bai_tap.ArrayList;

import java.util.*;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY]; // Khởi tạo mặc định em phải khởi tạo mảng cho hắn chứ
    }

    public MyList(int size) { // hàm khởi tạo với sze mình truyền vào,
        elements = new Object[size];
    }

    public void ensureCapacity(int minCapacity) {
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    public void add(E element, int index) {
        if (size == elements.length) {
            ensureCapacity(DEFAULT_CAPACITY);
        }
        for (int i = size - 1; i >= index; i--) { // Thuật toanns của em sai. Anh sửa lại đó. EM nên vẽ ra vở rồi chạy từng vòng lặp em sẽ thấy thuật toán em sai.
            elements[i + 1] = elements[i];
        }
        elements[index] = element;
        this.size++;
    }

    public int size() { // Hàm lấy ra số lượng phần tử hiện tại
        return this.size;
    }

    public boolean add(E e) {
        if (size == elements.length) {
            ensureCapacity(DEFAULT_CAPACITY);
        }
        elements[size] = e;
        size++;
        return true;
    }

    public E remove(int index) {
        E temp = (E) elements[index];
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        return temp;
    }

    //
    public E get(int i) {
        if (i >= size || i < 0) { // Chỗ này phải nhỏ hơn 0 chứ. sao lại nhỏ hơn 10
            throw new IndexOutOfBoundsException("Index: " + i + ", size: " + i);
        }
        return (E) elements[i];
    }

    public int indexOf(E o) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (o == elements[i]) {
                index = i;
                break;
            }
        }
        return index;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
    }

    public boolean contains(E o) {
        for (int i = 0; i < size; i++) {
            if (o == elements[i]) {
                return true;
            }
        }
        return false;
    }

    public MyList<E> clone() {
        MyList<E> myList = new MyList<>();
        for (int i = 0; i < size; i++) {
            myList.elements[i] = this.elements[i];
        }
        return myList;
    }


    //haizz. Code sai nhiều quá đó nghe.Anh sửa cho em hết rồi đó. anh comment lại hết rồi đó. Em xem rồi ko hiểu thì hỏi nhé. Nãy giờ coi e hiểu đó a :v mà khúc ni là a sửa gì so với ban đầu z
    //
    //ok rồi đó. ANh đã sửa hết lỗi. chưa a :v đ.ê R Còn chỗ mô nữa. để e thử cho nó đỏ le. ok? ủa :v phải theo thứ tự hả a :v e tưởng e quất elements[1] thì cái ele[0] nó mặc định bằng null chớ :))
}

