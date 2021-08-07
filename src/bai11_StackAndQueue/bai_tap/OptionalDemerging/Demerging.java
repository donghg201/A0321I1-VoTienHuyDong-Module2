package bai11_StackAndQueue.bai_tap.OptionalDemerging;

import java.util.LinkedList;
import java.util.Queue;

public class Demerging {
    private String name;
    private String birthday;
    private String sex;

    public Demerging() {

    }

    public Demerging(String name, String birthday, String sex) {
        super();
        this.name = name;
        this.birthday = birthday;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Demerging{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                ", address='" + sex + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Queue<Demerging> NU = new LinkedList<>();
        Queue<Demerging> NAM = new LinkedList<>();

        Demerging nhanvien1 = new Demerging("Nguyen Van A", "01/02/1995", "NAM");
        Demerging nhanvien2 = new Demerging("Nguyen Thi B", "02/02/1995", "NU");
        Demerging nhanvien3 = new Demerging("Nguyen Thi C", "03/02/1995", "NU");
        Demerging nhanvien4 = new Demerging("Nguyen Van D", "04/02/1995", "NAM");
        Demerging nhanvien5 = new Demerging("Nguyen Thi E", "05/02/1995", "NU");

        Queue<Demerging> queue = new LinkedList<Demerging>();
        queue.add(nhanvien1);
        queue.add(nhanvien2);
        queue.add(nhanvien3);
        queue.add(nhanvien4);
        queue.add(nhanvien5);

        for (Demerging nhanvien : queue) {
            if (nhanvien.sex == "NU") {
                NU.add(nhanvien);
            } else NAM.add(nhanvien);
        }

        System.out.println(NU.toString());
        System.out.println(NAM.toString());
    }
}
