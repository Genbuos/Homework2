package anotheridea;

public class Cat extends Animal {
    public Cat(String name, String[] family, int age, boolean hasEaten) {
        super(name, family, age, hasEaten);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }

    @Override
    public void printInfo(Animal a) {
        System.out.println("This cat's name is: " + a.name);
        System.out.println("This cat's age is: " + a.age);
        System.out.println("This cat has eaten: " + a.hasEaten);

        for(int i = 0; i < family.length; i++){
            System.out.println("Here are the owners of this cat: [" + i + "] " + a.family[i]);
        }
    }


}
