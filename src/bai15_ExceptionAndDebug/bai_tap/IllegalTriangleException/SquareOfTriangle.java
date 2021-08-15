package bai15_ExceptionAndDebug.bai_tap.IllegalTriangleException;

public class SquareOfTriangle {
    private int size1;
    private int size2;
    private int size3;

    public SquareOfTriangle(int size1, int size2, int size3) throws IllegalTriangleException {
        if(size1 <= 0 || size2 <= 0 || size3 <= 0 || size1+size2 <= size3 ||size1+size3 <= size2 ||size3+size2 <= size1){
            throw new IllegalTriangleException("False");
        }

        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public static void main(String[] args) {
        try {
            new SquareOfTriangle(6,8,10);
        }catch (IllegalTriangleException e){
            System.out.println(e.getMessage());
        }
    }
}
