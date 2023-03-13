package com;
import com.dependencyinjection.animal.Animal;
import com.dependencyinjection.animal.AnimalSpeaks;
import com.dependencyinjection.animal.Cat;
import com.dependencyinjection.animal.Dog;

public class AnimalBehavior {
    public static void main(String[] args) {
        AnimalSpeaks obj1 = new AnimalSpeaks();
        Animal animal = new Dog();
        obj1.setAnimal(animal);
        obj1.makeSound();
    }
}
