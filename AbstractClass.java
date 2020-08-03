/**
 * Program to create an abstract class.
 * 
 * Author: Shivam Jha
 */
abstract class foo2 {
    // Abstract method, therefore must be implemented (by Overriding) in derived
    // class
    abstract void fun();

    void fun2() {
        System.out.println("Non abstract method");
    }

    final void fun3() {
        System.out.println("Method that cannot be Overriden");
    }
}

public class AbstractClass extends foo2 {
    public static void main(String[] args) {
        // Only objects of non-Abstract classes can be created
        AbstractClass a = new AbstractClass();
        a.fun();
        a.fun2();
        a.fun3();
    }

    @Override
    void fun() {
        System.out.println("Overriden function");

    }
}
