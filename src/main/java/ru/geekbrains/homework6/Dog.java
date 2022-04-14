package ru.geekbrains.homework6;

public class Dog extends Animals {

    public Dog(String name, int runMeters, int swamMeters) {
        super(name, runMeters, swamMeters);
    }

    @Override
    public void animalRun() {
        super.animalRun();
        if (runMeters>500) System.out.println("The dog " + name + " will not be able to run");
        else System.out.println("The dog " +name+ " run: "+runMeters +" meters");
    }

    @Override
    public void animalSwimm() {
        super.animalSwimm();
        if (swamMeters>10) System.out.println("The dog " + name + " will not be able to swam");
        else System.out.println("Tne dog " + name+ " swam by: "+ swamMeters +" meters");
    }
}
