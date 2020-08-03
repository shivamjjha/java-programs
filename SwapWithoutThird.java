import java.util.Scanner;

/**
 * Program to swap two numbers input by the user without using third variable
 * 
 * Author: Shivam Jha
 */
public class SwapWithoutThird {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean tryAgain = true;

        while (tryAgain) {
            try {
                System.out.println("Enter two numbers:");

                int a = scanner.nextInt();
                int b = scanner.nextInt();

                System.out.println("a: " + a + " b: " + b);

                a = a + b;
                b = a - b;
                a = a - b;

                System.out.println("a: " + a + " b: " + b);
                tryAgain = false;
            } catch (Exception e) {
                e.printStackTrace();
                System.err.println("\n---Looks like you have entered invalid numbers---\n");
                System.out.println("Do you want to try all over again?(y/n) :");
                scanner.next();
                char ch = scanner.next(".").charAt(0);
                tryAgain = (ch == 'y' || ch == 'Y');
            } finally {
                scanner.close();
            }
        }

    }
}