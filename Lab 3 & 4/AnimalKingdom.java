/*Animal Kingdom:
 Create classes for different animals (e.g., Dog, Cat, Bird) inheriting from an Animal class.
 Implement specific sounds for each animal.
 Create an array of Animal objects and demonstrate polymorphism by calling the makeSound()
method on each object. */


class Animal{
    int legs, weight;
    String type;

    public Animal(int legs, int weight, String type){
        this.legs = legs;
        this.weight = weight;
        this.type = type;
    }

    public void displayInfo(){
        System.out.println("Type: " + type);
        System.out.println("Legs: " + legs);
        System.out.println("Weight: " + weight + " kg");
    }

    public void makeSound() {
        System.out.println();
    }
       
}

class Dog extends Animal{
    String breed;
    int speed;

    public Dog(int legs, int weight, String type,String breed, int speed){
        super(legs, weight, type);
        this.breed = breed;
        this.speed = speed;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Breed: "+ breed);
        System.out.println("Speed: "+ speed);
    }

    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat extends Animal{
    String colour;
    boolean indoor;

    public Cat(int legs, int weight, String type, String colour, boolean indoor){
        super(legs, weight, type);
        this.colour = colour;
        this.indoor = indoor;
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Colour: "+ colour);
        System.out.println("Indoor: "+ indoor);
    }

    public void makeSound() {
        System.out.println("Meow!");
    }
}
class Bird extends Animal {
    int wingSpan;
    boolean canFly;

    public Bird(int legs, int weight, String type, int wingSpan, boolean canFly) {
        super(legs, weight, type);
        this.wingSpan = wingSpan;
        this.canFly = canFly;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Wingspan: " + wingSpan + " cm");
        System.out.println("Can Fly: " + (canFly ? "Yes" : "No"));
    }

    public void makeSound() {
        System.out.println("pak pak pakak!");
    }
}

public class AnimalKingdom {
    
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];
        animals[0] = new Dog(4, 5, "wild", "Russian", 60);
        animals[1] = new Cat(4, 4, "Domestic", "Grey", true);
        animals[2] = new Bird(2, 1, "Domestic", 2, false);

        for (Animal animal : animals) {
            animal.displayInfo();
            animal.makeSound();
            System.out.println();
        }
    }

        
}
