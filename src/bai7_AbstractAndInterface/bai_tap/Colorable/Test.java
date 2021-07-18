package bai7_AbstractAndInterface.bai_tap.Colorable;

import bai7_AbstractAndInterface.bai_tap.Resizeable.Circle;
import bai7_AbstractAndInterface.bai_tap.Resizeable.Rectangle;
import bai7_AbstractAndInterface.bai_tap.Resizeable.Shape;
import bai7_AbstractAndInterface.bai_tap.Resizeable.Square;

public class Test {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        shapes[2] = new Square();

        System.out.println(((Circle)shapes[0]).getArea());
        System.out.println(((Rectangle)shapes[1]).getArea());
        System.out.println(((Square)shapes[2]).getArea());

        for (Shape shape: shapes) {
            if(shape instanceof Shape)
            {
                shape.howtocolor();
            }
        }
    }
}
