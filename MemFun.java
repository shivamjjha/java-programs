/**
 * Program to create a class and call member functions.
 * 
 * Author: Shivam Jha
 */
public class MemFun {
    void foo() {
        System.out.println("Hey, I am a good old member function");
    }

    void printAuthor() {
        System.out.println("Author: Shivam Jha\nDate: July 27, 2020");
    }

    public static void main(String[] args) {
        MemFun fun = new MemFun();
        fun.foo();
        fun.printAuthor();
    }
}