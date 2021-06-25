package bai4_lopvadoituongtrongjava.bai_tap;

import sun.font.TrueTypeFont;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

public class Fan {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    int speed = this.SLOW;
    boolean status = false;
    private double radius = 5;
    private String color = "blue";

    private Fan(){

    }

    public void getSpeed(int speed){
        this.speed =speed;
    }
    int setSpeed(){
        return this.speed;
    }
    public void getStatus(boolean status){
        this.status = status;
    }
    boolean setStatus(){
        return this.status;
    }
    public void getRadius(double radius){
        this.radius = radius;
    }
    double setRadius(){
        return this.radius;
    }
    public void getColor(String color){
        this.color = color;
    }
    String setColor(){
        return this.color;
    }
    public String toString(){
        if(this.status == TRUE)
        {
            System.out.println("Fan is on, speed is  " + setSpeed() + ", color is " + setColor() + " and radius is " + setRadius());
        }else System.out.println("Fan is off, color is " + setColor() +" and radius is "+ setRadius());
        return null;
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();
        fan1.getSpeed(3);
        fan1.getRadius(10);
        fan1.getColor("Yellow");
        fan1.getStatus(TRUE);
        fan1.toString();

        Fan fan2 = new Fan();
        fan2.getSpeed(2);
        fan2.getRadius(5);
        fan2.getColor("Blue");
        fan2.getStatus(FALSE);
        fan2.toString();
    }

}
