package bai6_kethua.bai_tap.CircleAndCylinder;

public class Cylinder extends Circle{
    private double height = 5.0;

    public Cylinder(){

    }

    public Cylinder(double radius, String color, double height){
        super(radius, color);
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){
        return super.getArea() * this.height;
    }

    public String toString(){
        return "Khoi tru co mau " + getColor() + ", ban kinh bang " + getRadius() + ", the tich bang " + getVolume();
    }
}
