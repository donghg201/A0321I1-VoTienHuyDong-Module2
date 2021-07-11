package bai7_AbstractAndInterface.thuc_hanh.AnimalAndEdible.edible;

import bai7_AbstractAndInterface.thuc_hanh.AnimalAndEdible.animal.Animal;

public class Chicken extends Animal implements Edible {
    @Override
    public String howToEat() {
        return "could be fried";
    }

    @Override
    public String makesound() {
        return "Chicken: cluck-cluck!";
    }
}
