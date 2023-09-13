package anotheridea;

public class Main {
    public static void main(String[] args) {
        String[] garfieldsFamily = {"John", "ODEE", "Liz"};
        Animal garfield = new Cat("Garfield", garfieldsFamily, 12, true);

        String[] bambiisFamily = {"Jordy", "Jaida", "Sonja"};
        Animal bambii = new Dog("Bambii", bambiisFamily, 2, true);

        String[] pollysFamily = {"Johnny Depp", "That one jawn from pirates of the carribean", "A pirate"};
        Animal polly = new Parrot("Polly", pollysFamily, 4, false);

        garfield.makeSound();
        garfield.printInfo(garfield);
        System.out.println("\n");

        bambii.makeSound();
        bambii.printInfo(bambii);
        System.out.println("\n");

        polly.makeSound();
        polly.printInfo(polly);
    }
}
