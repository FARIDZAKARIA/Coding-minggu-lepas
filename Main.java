import java.util.Scanner;

class Animal {   //superclass
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {         //method
        System.out.println(name + " makes a sound.");
    }
}

class Dog extends Animal {   //subclass
    public Dog(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println("Dog barks: Woof woof!");
    }
}

public class Main {  
    static String Error;
    public Main(){
        System.out.println("Welcome to the Animal Sound Program!");
    } //constructor
    public static void main(String[] args) {      
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Animal Sound Program!");

        try {                   //try and catch
            System.out.print("Enter Sound animal: ");
            String input = scanner.nextLine();

            if (input.equals("dog")) {
                Dog myDog = new Dog("Buddy");
                myDog.makeSound();
            } else {
                throw new Exception("Invalid input.");
            }
        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        } finally {
            System.out.println("The program is finished.");
        }
    }
}
