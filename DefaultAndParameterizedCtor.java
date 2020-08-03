/**
 * Program to illustrate the concept of default and parameterized constructors.
 * 
 * Author: Shivam Jha
 */
public class DefaultAndParameterizedCtor {
    int x, y;

    DefaultAndParameterizedCtor() {
        x = y = 2;
    }

    DefaultAndParameterizedCtor(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void getData() {
        System.out.println("x: " + x + ", y: " + y);
    }

    public static void main(String[] args) {
        DefaultAndParameterizedCtor obj1 = new DefaultAndParameterizedCtor();
        DefaultAndParameterizedCtor obj2 = new DefaultAndParameterizedCtor(4, 9);

        obj1.getData();
        obj2.getData();
    }
}