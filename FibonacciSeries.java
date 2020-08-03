/**
 * Program to print Fibonacci series up to first ten terms.
 * 
 * Author: Shivam Jha
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        int limit = 10;
        int a = 0, b = 1;

        System.out.println("List generated: ");

        System.out.print(0 + " ");
        while (limit - 1 > 0) {
            b += a;
            a = b - a;
            System.out.print(a + " ");
            limit--;
        }
    }
}