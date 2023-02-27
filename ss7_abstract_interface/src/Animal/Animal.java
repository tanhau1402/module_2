package Animal;

import edible.Edible;

public class Animal implements Edible {
    public String makeSound() {
        return "zz";
    }

    @Override
    public String howToEat() {
        return null;
    }
}
