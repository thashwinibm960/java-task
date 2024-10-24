public class Animal {
    public enum AnimalType {
        MAMMAL, REPTILE, BIRD, FISH, AMPHIBIAN
    }

    static String habitat;
    static int averageLifespan; 
    static String diet;

    String name;
    AnimalType type;
    double weight; 
    boolean isEndangered;

    static {
        habitat = "Various"; 
        averageLifespan = 10; 
        diet = "Omnivore"; 
    }

    public Animal(String name, AnimalType type, double weight, boolean isEndangered) {
        this.name = name;
        this.type = type;
        this.weight = weight;
        this.isEndangered = isEndangered;
    }

    public void printDetails() {
        System.out.println("Habitat: " + habitat);
        System.out.println("Average Lifespan: " + averageLifespan + " years");
        System.out.println("Diet: " + diet);
        System.out.println("Name: " + name);
        System.out.println("Animal Type: " + type);
        System.out.println("Weight: " + weight + " kg");
        System.out.println("Is Endangered: " + isEndangered);
        System.out.println(); 
    }
}

