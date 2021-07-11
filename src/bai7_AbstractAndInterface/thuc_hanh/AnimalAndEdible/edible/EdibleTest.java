package bai7_AbstractAndInterface.thuc_hanh.AnimalAndEdible.edible;
import bai7_AbstractAndInterface.thuc_hanh.AnimalAndEdible.animal.Animal;
import bai7_AbstractAndInterface.thuc_hanh.AnimalAndEdible.animal.Tiger;
import bai7_AbstractAndInterface.thuc_hanh.AnimalAndEdible.edible.Edible;

public class EdibleTest {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makesound());

            if (animal instanceof Chicken) {
                Edible edibler = (Edible) animal;
                System.out.println(edibler.howToEat());
            }
        }
    }
}
