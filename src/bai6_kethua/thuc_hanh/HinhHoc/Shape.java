package bai6_kethua.thuc_hanh.HinhHoc;

public class Shape {
    private String color = "red";
    private boolean filled = true;

    public Shape(){

    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }

    public void setColor(){
        this.color = color;
    }

    public boolean getFilled(){
        return filled;
    }

    public void setFilled(){
        this.filled = filled;
    }

    public String toString(){
        return "A shape with color of" + getColor() + " and " + (getFilled() ? "filled" : "not filled");
    }

}
