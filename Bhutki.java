/**
 * Program to create an interface and implement it using class.
 * 
 * Author: Shivam Jha
 */
interface Cat {
    // 'name' is Static, final and public by default
    String name = "kitty";

    // Default implementation of method 'sound()'
    default String sound() {
        return "Meowwww";
    }

    default void favoriteFood() {
        System.out.println("Loves fish");
    }

    // A method without default implementation
    int getAge();
}

public class Bhutki implements Cat {

    // implements unimplemented methods
    // Can Override defaultly implemented methods too
    @Override
    public int getAge() {
        return 3;
    }

    @Override
    public String sound() {
        return "Meawwaw";
    }

    public static void main(String[] args) {
        Bhutki b = new Bhutki();
        System.out.println("Age of Bhutki is: " + b.getAge());
        System.out.println("She loves to say: " + b.sound());
        b.favoriteFood(); // non-overriden method
    }
}