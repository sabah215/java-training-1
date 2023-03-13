package com.dependencyinjection.animal;

public class AnimalSpeaks {
    private Animal animal;


    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void makeSound(){
        animal.makeSound();
    }
}
