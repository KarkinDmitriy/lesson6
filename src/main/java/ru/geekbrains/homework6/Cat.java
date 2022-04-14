package ru.geekbrains.homework6;

public class Cat extends Animals {
    public Cat(String name, int runMeters, int swamMeters) {
        super(name, runMeters, swamMeters);
    }
    @Override
    public void animalRun() {
        super.animalRun();
        if (runMeters >200) System.out.println("The cat " +name+ " will not be able to run");
        else System.out.println("The cat " + name+ "  run: " + runMeters+" meters");
    }

    @Override
    public void animalSwimm() {
        super.animalSwimm();
        System.out.println("The cat " + name + " can't swim");
    }
}
