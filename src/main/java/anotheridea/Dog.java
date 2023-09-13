package anotheridea;

public class Dog  extends Animal{
    public Dog(String name, String[] family, int age, boolean hasEaten) {
        super(name, family, age, hasEaten);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }

    @Override
    public void printInfo(Animal a) {
        System.out.println("This dog's name is: " + a.name);
        System.out.println("This dog's age is: " + a.age);
        System.out.println("This dog has eaten: " + a.hasEaten);

        for(int i = 0; i < family.length; i++){
            System.out.println("Here are the owners of this dog: [" + i + "] " + a.family[i]);
        }
    }


}
