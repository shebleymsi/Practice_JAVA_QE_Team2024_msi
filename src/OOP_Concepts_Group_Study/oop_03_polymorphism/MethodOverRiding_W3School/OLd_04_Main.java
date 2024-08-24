package OOP_Concepts_Group_Study.oop_03_polymorphism.MethodOverRiding_W3School;

public class OLd_04_Main {
    public static void main(String[] args) {
        Old_01_Animal myAnimal = new Old_01_Animal();  // Create a Animal object
        myAnimal.animalSound();

        Old_01_Animal myPig = new Old_02_Pig();  // Create a Pig object
        myPig.animalSound();

        Old_01_Animal myDog = new Old_03_Dog();  // Create a Dog object
        myDog.animalSound();
    }
}
