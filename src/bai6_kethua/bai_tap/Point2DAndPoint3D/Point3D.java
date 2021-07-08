package bai6_kethua.bai_tap.Point2DAndPoint3D;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(){

    }

    public Point3D(float x, float y, float z){
        super(x,y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        super.setX(x);
        super.setY(y);
        this.z = z;
    }

    public float[] getXYZ(){
        float[] arr1 = new float[3];
        arr1[0] = super.getX();
        arr1[1] = super.getY();
        arr1[2] = this.z;
        return arr1;
    }

    public String toString(){
        return "(" + getX() + "," + getY() + "," + z + ")";
    }
}
