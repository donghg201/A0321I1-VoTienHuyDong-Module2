package bai6_kethua.bai_tap.CircleAndCylinder;

public class Circle {
    private double radius = 1.0;
    private String color = "noir";

    public Circle(){

    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public Circle(double radius) {
    }

    public Circle(double radius, String color, boolean filled) {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public java.lang.String toString() {
        return "Hinh tron co ban kinh = " + radius + " va mau " + color;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }
}
