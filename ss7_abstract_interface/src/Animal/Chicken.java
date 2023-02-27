package Animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return super.makeSound();
    }

    @Override
    public String howToEat() {
        return super.howToEat();
    }
}
