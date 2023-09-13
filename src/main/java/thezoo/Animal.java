package thezoo;

public class Animal {
    public String species;
    public boolean isInZoo;
    public int[] speciesCode;


// needed a constructor to initialize the array
    public Animal(){
        speciesCode = new int[1];
    }
    public void printAnimalSound(Animal a){



    if(a.species == "dog" || a.species == "Dog" || a.species == "DOG"){
        System.out.println("woof woof");
    }
    if(a.species == "cat" || a.species == "Cat" || a.species == "CAT"){
        System.out.println("meow meow");
    }
    if(a.species == "parrot" || a.species == "Parrot" || a.species == "PARROT"){
        System.out.println("Im a parrot fr");
    }
}

public void printInfo(Animal a){
    System.out.println("Species: " + a.species);
    System.out.println("Located in zoo?: " + a.isInZoo);

    for(int i = 0; i < a.speciesCode.length; i++){
        System.out.println("Species Code[" + i + "]: " + a.speciesCode[i]);
    }
}

}
