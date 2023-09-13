package anotheridea;

public abstract class Animal {
    public String name;

    public String[] family;

    public int age;

    public boolean hasEaten;


    public Animal(String name, String[] family, int age, boolean hasEaten){
        this.name = name;
        this.family = family;
        this.age = age;
        this.hasEaten = hasEaten;
    }

    public abstract void makeSound();

    public abstract void printInfo(Animal a);




}
