public class AnimalRunner {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Elephant", Animal.AnimalType.MAMMAL, 6000, true);
        Animal animal2 = new Animal("Crocodile", Animal.AnimalType.REPTILE, 450, false);
        Animal animal3 = new Animal("Eagle", Animal.AnimalType.BIRD, 3, false);
        Animal animal4 = new Animal("Shark", Animal.AnimalType.FISH, 300, false);
        Animal animal5 = new Animal("Frog", Animal.AnimalType.AMPHIBIAN, 0.5, false);

        animal1.printDetails();
        animal2.printDetails();
        animal3.printDetails();
        animal4.printDetails();
        animal5.printDetails();
    }
}
