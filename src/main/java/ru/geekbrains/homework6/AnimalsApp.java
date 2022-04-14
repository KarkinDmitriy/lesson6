package ru.geekbrains.homework6;

public class AnimalsApp {
    public static void main(String[] args) {

        Cat cat = new Cat("Pusok", 50, 10);
        Dog dog = new Dog("Jam", 150, 11);
        cat.animalInfo();
        dog.animalInfo();
        cat.animalRun();
        dog.animalRun();
        cat.animalSwimm();
        dog.animalSwimm();
    }
}
