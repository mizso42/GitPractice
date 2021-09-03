package main;

import main.model.animals.Cat;
import main.model.animals.Dog;
import main.model.animals.Fish;
import main.model.humanoids.Human;
import main.model.humanoids.Humanoid;

public class Main {

    public static void main(String[] args) {
        Human baby = new Human();
        Cat kitten = new Cat();
        Dog puppy = new Dog();
        Fish babyFish = new Fish();

        baby.getNewPet(kitten);
        baby.getNewPet(puppy);
        baby.getNewPet(puppy);
    }
}
