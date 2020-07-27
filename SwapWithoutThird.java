import java.util.Scanner;

/**
 * Program to swap two numbers input by the user without using third variable
 */
public class SwapWithoutThird {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter two numbers:");

            int a = scanner.nextInt();
            int b = scanner.nextInt();

            System.out.println("a: " + a + " b: " + b);

            a = a + b;
            b = a - b;
            a = a - b;

            System.out.println("a: " + a + " b: " + b);
        } catch (Exception e) {
            e.printStackTrace();
            System.err.println("\n---Please enter valid numbers---\n");
        } finally {
            scanner.close();
        }
    }
}