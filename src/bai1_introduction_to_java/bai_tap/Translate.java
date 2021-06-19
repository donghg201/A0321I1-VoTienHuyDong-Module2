package bai1_introduction_to_java.bai_tap;

public class Translate {
    public static void main(String[] args) {
        int[] x = {3,5,6,9};
        int a = 0, b = 0;
        for(int y : x){
            if(y % 2 != 0)
            {
                a+=y;
                b++;
            }
        }
        System.out.println("a: " + a + " b: " + b);
    }
}
