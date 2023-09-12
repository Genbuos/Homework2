package thezoo;

public class Main {
    public static void main(String[] args) {
        Animal fido = new Animal();
        Animal garfield = new Animal();
        Animal daParrot = new Animal();

        fido.species = "dog";
        fido.isInZoo = false;
        fido.speciesCode[0] = 1;


        garfield.species = "CAT";
        garfield.isInZoo = false;
        garfield.speciesCode[0] = 1;


        daParrot.species = "Parrot";
        daParrot.isInZoo = true;
        daParrot.speciesCode[0] = 1;



        fido.printAnimalSound(fido);
        System.out.println("\n");

        garfield.printAnimalSound(garfield);
        System.out.println("\n");

        daParrot.printAnimalSound(daParrot);
        System.out.println("\n");

        fido.printInfo(fido);
        System.out.println("\n");

        garfield.printInfo(garfield);
        System.out.println("\n");

        daParrot.printInfo(daParrot);
        System.out.println("\n");
    }
}
