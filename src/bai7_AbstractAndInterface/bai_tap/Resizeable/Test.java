package bai7_AbstractAndInterface.bai_tap.Resizeable;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();

        for (Shape shape: shapes) {
            System.out.println(((Circle)shape).getArea());
            shape.resize(Math.random());
            System.out.println(shape.toString());
        }

    }
}
