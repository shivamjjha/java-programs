/**
 * Program to illustrate the use ‘super’ keyword in inheritance.
 */
class foo {
    int x = 10;

    foo() {
        System.out.println("Base class ctor");
    }

    void fun() {
        System.out.println("Function in Base Class");
    }

    
}

class Child extends foo {
    int x = 20;
    Child() {
        super(); // Calling ctor of base class.
        System.out.println("Derived class ctor");
    }

    @Override
    void fun() {
        System.out.println("Now, in the derived class");
    }

    void display() {
        super.fun(); // Calling base class method
        fun();

        System.out.println("Value of x in derived class: " + x);
        System.out.println("Value of x in base class: " + super.x);
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}