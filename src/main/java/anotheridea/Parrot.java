package anotheridea;

public class Parrot extends Animal{
    public Parrot(String name, String[] family, int age, boolean hasEaten) {
        super(name, family, age, hasEaten);
    }

    @Override
    public void makeSound() {
        System.out.println("Im a parrot YO! Give me a cracker YO!");
    }

    @Override
    public void printInfo(Animal a) {
        System.out.println("This bird's name is: " + a.name);
        System.out.println("This bird's age is: " + a.age);
        System.out.println("This bird has eaten: " + a.hasEaten);

        for(int i = 0; i < family.length; i++){
            System.out.println("Here are the owners of this bird: [" + i + "] " + a.family[i]);
        }
    }
}
