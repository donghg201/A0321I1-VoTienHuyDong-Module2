package bai7_AbstractAndInterface.thuc_hanh.AnimalAndEdible.animal;
import bai7_AbstractAndInterface.thuc_hanh.AnimalAndEdible.animal.Animal;
import bai7_AbstractAndInterface.thuc_hanh.AnimalAndEdible.animal.Chicken;
import bai7_AbstractAndInterface.thuc_hanh.AnimalAndEdible.animal.Tiger;
public class AnimalTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            animal.makesound();
        }
    }
}
