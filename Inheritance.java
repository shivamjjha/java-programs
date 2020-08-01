/**
 * Program to demonstrate the concept of inheritance.
 */ 
class Grandpa {
    void display() {
        System.out.println("Grandpa Class");
    }
}

class Parent extends Grandpa {
    @Override
    void display() {
        System.out.println("Parent class");
    }
}

public class Inheritance extends Parent{
    @Override
    void display() {
        System.out.println("This class");
    }

    public static void main(String[] args) {
        /* See the in-built polymorphism. The magic! */
        Grandpa grandpa = new Grandpa(); // Initialized grandpa 'reference' with Grandpa object
        Grandpa parent = new Parent(); // Initialized with Parent object
        Grandpa thisClass = new Inheritance(); // Initialized with Inheritance object

        grandpa.display();
        parent.display();
        thisClass.display();
    }
}