/**
 * Program to demonstrate the concept of method overloading.
 */
public class MethodOverloading {
    float area(float side) {
        return side * side;
    }

    float area(float length, float breadth) {
        return length * breadth;
    }

    public static void main(String[] args) {
        MethodOverloading m = new MethodOverloading();
        System.out.println("Area of rectangle: " + m.area(3, 5));
        System.out.println("Area of square: " + m.area(7));
    }
}