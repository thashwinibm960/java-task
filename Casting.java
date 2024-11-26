public class Casting {
    public static void main(String[] args) {
       
        Dog dog = new Dog();
        
       
        Object obj = dog;

        
        if (obj instanceof Dog) {
           
            Dog downcastedDog = (Dog) obj;
            downcastedDog.sound();  
            downcastedDog.bark();  
        } else {
            System.out.println("The object is not of type Dog");
        }
        
        
        if (obj instanceof Animal2) {
          
            Animal2 downcastedAnimal = (Animal2) obj;
            downcastedAnimal.sound(); 
        }
    }
}
