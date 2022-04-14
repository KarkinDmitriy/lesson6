package ru.geekbrains.homework6;

public class Animals {

    String name;
    int runMeters;
    int swamMeters;

    public Animals(String name, int runMeters, int swamMeters) {
        this.name = name;
        this.runMeters= runMeters;
        this.swamMeters= swamMeters;
    }
    public void animalInfo() {
        System.out.println("ANIMAL:" + name);
    }
    public void animalRun(){
        System.out.println("ANIMAL run:" + runMeters );
    }
    public void animalSwimm(){
        System.out.println("ANIMAL swam by:" + swamMeters);
    }
}
