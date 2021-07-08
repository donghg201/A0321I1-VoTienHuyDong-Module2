package bai6_kethua.bai_tap.PointAndMoveablePoint;

public class testMovablePoint {
    public static void main(String[] args) {
        MovablePoint point1 = new MovablePoint();
        point1.setXY(2.0f,3.0f);
        point1.setSpeed(1.0f,2.0f);
        System.out.println(point1.toString());
    }
}
