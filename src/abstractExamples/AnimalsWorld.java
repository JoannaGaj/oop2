package abstractExamples;

import Animals.Animal;
import Animals.Cat;

public class AnimalsWorld {
    public static void main(String[] args) {
//        Animal animal = new Animal();
//        System.out.println(animal.getName());
//        Animal animal2 = new Animal("coś", 10);
//        animal.useVoice();

        System.out.println("\nCZESC KOCIA");
        Cat c1 = new Cat("Mruczek");
        System.out.println("Imię kota " + c1.getName() + " wiek kota " + c1.getAge());
        c1.useVoice();

    }
}
