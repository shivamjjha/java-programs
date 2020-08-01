/**
 * Program to demonstrate the use of static variables and static methods.
 */
public class StaticVariablesAndMethods {
    // Static variable, therefore global scope
    static int count = 0;

    // Static method. Only static methods can access static variables
    static int getNumber() {
        count++;
        return count;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Count: " + getNumber());
        }

        System.out.println("Total count: " + count);
    }
}