/**
 * Program to illustrate the concept of 'this' keyword
 */
public class ThisKeyword {
    int a = 0, b = 0, c = 0;

    // An object cannot be initialized by default ctor(without any initial arguments), if it is shadowed by parameterized ones.
    ThisKeyword() {}

    // same local variable name as data members
    // local ones will be preffered if initialized without using 'this'
    ThisKeyword(int a, int b){
        this.a = 5; // Initialized data member (correctly), not the local parameter variable
        b = 10; // Used without 'this' : unchanged data member
    }
    
    ThisKeyword(int a, int b, int c) {
        this(a, b); // Calling respective constructor using 'this'
        this.c = 7;
    }

    ThisKeyword getCurrentObject() {
        return this; // Returns the reference to the current (calling) class instance.
    }

    int getSum() {
        return a + b + c;
    }    

    void printSum() {
        // using 'this' to call member function (Can be called without using this)
        System.out.println("The sum of data members for current object is: " + this.getSum());
    }    

    void printCurrentState() {
        System.out.println("a: " + a + ", b: " + b + ", c: " + c);
    }

    public static void main(String[] args) {
        ThisKeyword obj2 = new ThisKeyword(11, 8, 13);

        obj2.printCurrentState();
        obj2.printSum();

    }
}