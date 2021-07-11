package bai7_AbstractAndInterface.thuc_hanh.AnimalAndEdible.fruit;
import bai7_AbstractAndInterface.thuc_hanh.AnimalAndEdible.fruit.Fruit;
import bai7_AbstractAndInterface.thuc_hanh.AnimalAndEdible.fruit.Orange;
import bai7_AbstractAndInterface.thuc_hanh.AnimalAndEdible.fruit.Apple;

public class FruitTest {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for(Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
