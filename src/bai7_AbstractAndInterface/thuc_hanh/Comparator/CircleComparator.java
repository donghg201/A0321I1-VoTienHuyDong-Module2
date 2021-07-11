package bai7_AbstractAndInterface.thuc_hanh.Comparator;
import java.util.Comparator;
import bai6_kethua.bai_tap.CircleAndCylinder.Circle;

public class CircleComparator implements Comparator<Circle> {
    @Override
    public int compare(Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
